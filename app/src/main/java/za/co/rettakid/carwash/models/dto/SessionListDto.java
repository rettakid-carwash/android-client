package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;

import java.util.Date;

@Root(name = "sessionlistdto")
public class SessionListDto   {

    @ElementList(name = "sessions",type = SessionDto.class)
    private List<SessionDto> sessions;

    public List<SessionDto> getSessionList()   {
        return this.sessions;
    }

    public void setSessionList(List<SessionDto> sessions)   {
        this.sessions = sessions;
    }
}