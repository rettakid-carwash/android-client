package rettakid.carwash;

import org.springframework.http.converter.xml.SimpleXmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Lwazi Prusent on 2015/08/31.
 */
public class BaseClient {

    protected String baseUrl = "http://192.168.1.33:80/pacs/xml.php";
    protected RestTemplate restTemplate = new RestTemplate();

    public BaseClient(String localUrl) {
        restTemplate.getMessageConverters().add(new SimpleXmlHttpMessageConverter());
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
}