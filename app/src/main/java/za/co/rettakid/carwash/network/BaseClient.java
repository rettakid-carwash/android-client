package za.co.rettakid.carwash.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;

import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.xml.SimpleXmlHttpMessageConverter;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import za.co.rettakid.carwash.utils.CarWashErrorCode;
import za.co.rettakid.carwash.utils.CarshWashRuntimeError;

public class BaseClient extends AsyncTask<Object, Void, Object> {

    protected String baseUrl = "http://192.168.1.37:80/pacs/xml.php";
    protected RestTemplate restTemplate = new RestTemplate();
    protected Context context;

    public BaseClient(String localUrl) {
        restTemplate.getMessageConverters().add(new SimpleXmlHttpMessageConverter());
        restTemplate.setErrorHandler(new ResponseErrorHandler() {
            @Override
            public boolean hasError(ClientHttpResponse response) throws IOException {
                return false;
            }

            @Override
            public void handleError(ClientHttpResponse response) throws IOException {
                Log.i("response - code",response.getStatusText());
                Log.i("response - stream",response.getBody().toString());
            }

        });

        ClientHttpRequestInterceptor ri = new LoggingRequestInterceptor();
        List<ClientHttpRequestInterceptor> ris = new ArrayList<>();
        ris.add(ri);
        restTemplate.setInterceptors(ris);
        restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));

        this.baseUrl = this.baseUrl + localUrl;
    }

    protected String createUrl()    {
        return baseUrl;
    }

    protected String createUrl(String url)    {
        return baseUrl + url;
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    protected void checkNetworkConnection() {
        ConnectivityManager connMgr = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {

        } else {
            throw new CarshWashRuntimeError(CarWashErrorCode.CANNOT_FIND_CONNECTION);
        }
    }

    @Override
    protected Object doInBackground(Object... params) {
        checkNetworkConnection();
        return null;
    }

}
