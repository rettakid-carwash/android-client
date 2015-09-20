package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;

import java.util.Date;

@Root(name = "sessiondto")
public class SessionDto implements Serializable    {


    @Element(name = "sessionid" , required = false)
    private Long sessionId;

    @Element(name = "userdto")
    private UserDto user;

    @Element(name = "sessionlocation" , required = false)
    private String sessionLocation;

    @Element(name = "efffrom")
    private Date effFrom;

    @Element(name = "effto")
    private Date effTo;


    public Long getSessionId()   {
        return this.sessionId;
    }

    public void setSessionId(Long sessionId)   {
        this.sessionId = sessionId;
    }

    public UserDto getUser()   {
        return this.user;
    }

    public void setUser(UserDto user)   {
        this.user = user;
    }

    public String getSessionLocation()   {
        return this.sessionLocation;
    }

    public void setSessionLocation(String sessionLocation)   {
        this.sessionLocation = sessionLocation;
    }

    public Date getEffFrom()   {
        return this.effFrom;
    }

    public void setEffFrom(Date effFrom)   {
        this.effFrom = effFrom;
    }

    public Date getEffTo()   {
        return this.effTo;
    }

    public void setEffTo(Date effTo)   {
        this.effTo = effTo;
    }

}