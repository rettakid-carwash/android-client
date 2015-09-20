package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "sessionservicedto")
public class SessionServiceDto implements Serializable    {


    @Element(name = "sessionserviceid" , required = false)
    private Long sessionServiceId;

    @Element(name = "sessiondto")
    private SessionDto session;

    @Element(name = "servicedto")
    private ServiceDto service;


    public Long getSessionServiceId()   {
        return this.sessionServiceId;
    }

    public void setSessionServiceId(Long sessionServiceId)   {
        this.sessionServiceId = sessionServiceId;
    }

    public SessionDto getSession()   {
        return this.session;
    }

    public void setSession(SessionDto session)   {
        this.session = session;
    }

    public ServiceDto getService()   {
        return this.service;
    }

    public void setService(ServiceDto service)   {
        this.service = service;
    }

}