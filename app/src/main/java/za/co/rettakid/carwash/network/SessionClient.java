package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class SessionClient extends BaseClient   {

    public SessionClient(Context context) {
        super("/sessions",context);
    }

    public SessionListDto getSessions()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, SessionListDto.class);
    }

    public SessionDto getSessions(Long sessionId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, SessionDto.class,sessionId);
    }

    public SessionDto postSession(SessionDto sessionDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, sessionDto, SessionDto.class);
    }

    public SessionListDto postSession(SessionListDto sessionListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, sessionListDto, SessionListDto.class);
    }

    public void putSession(SessionDto sessionDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, sessionDto, SessionDto.class,sessionDto.getSessionId());
    }

    public void deleteSession(Long sessionId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,sessionId);
    }

}