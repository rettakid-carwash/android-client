package za.co.rettakid.carwash.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

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

import za.co.rettakid.carwash.utils.errorhandling.CarWashErrorCode;
import za.co.rettakid.carwash.utils.errorhandling.CarshWashRuntimeError;

public class BaseClient {

    protected String baseUrl = "http://41.185.28.23/server-php/xml.php";
    protected RestTemplate restTemplate = new RestTemplate();

    public BaseClient(String localUrl, Context context) {
        restTemplate.getMessageConverters().add(new SimpleXmlHttpMessageConverter());
        restTemplate.setErrorHandler(new ResponseErrorHandler() {
            @Override
            public boolean hasError(ClientHttpResponse response) throws IOException {
                return false;
            }

            @Override
            public void handleError(ClientHttpResponse response) throws IOException {
                Log.i("response - code", response.getStatusText());
                Log.i("response - stream", response.getBody().toString());
            }

        });

        ClientHttpRequestInterceptor ri = new LoggingRequestInterceptor();
        List<ClientHttpRequestInterceptor> ris = new ArrayList<>();
        ris.add(ri);
        restTemplate.setInterceptors(ris);
        restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
        this.baseUrl = this.baseUrl + localUrl;
    }

    protected String createUrl() {
        return baseUrl;
    }

    protected String createUrl(String url) {
        return baseUrl + url;
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

}
