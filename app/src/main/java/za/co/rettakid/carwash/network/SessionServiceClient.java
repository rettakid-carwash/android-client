package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class SessionServiceClient extends BaseClient   {

    public SessionServiceClient(Context context) {
        super("/sessionservices",context);
    }

    public SessionServiceListDto getSessionServices()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, SessionServiceListDto.class);
    }

    public SessionServiceDto getSessionServices(Long sessionServiceId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, SessionServiceDto.class,sessionServiceId);
    }

    public SessionServiceDto postSessionService(SessionServiceDto sessionServiceDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, sessionServiceDto, SessionServiceDto.class);
    }

    public SessionServiceListDto postSessionService(SessionServiceListDto sessionServiceListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, sessionServiceListDto, SessionServiceListDto.class);
    }

    public void putSessionService(SessionServiceDto sessionServiceDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, sessionServiceDto, SessionServiceDto.class,sessionServiceDto.getSessionServiceId());
    }

    public void deleteSessionService(Long sessionServiceId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,sessionServiceId);
    }

}