package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class ServiceClient extends BaseClient   {

    public ServiceClient(Context context) {
        super("/services",context);
    }

    public ServiceListDto getServices()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, ServiceListDto.class);
    }

    public ServiceDto getServices(Long serviceId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, ServiceDto.class,serviceId);
    }

    public ServiceDto postService(ServiceDto serviceDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, serviceDto, ServiceDto.class);
    }

    public ServiceListDto postService(ServiceListDto serviceListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, serviceListDto, ServiceListDto.class);
    }

    public void putService(ServiceDto serviceDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, serviceDto, ServiceDto.class,serviceDto.getServiceId());
    }

    public void deleteService(Long serviceId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,serviceId);
    }

}