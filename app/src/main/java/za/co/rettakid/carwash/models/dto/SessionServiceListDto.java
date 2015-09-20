package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "sessionservicelistdto")
public class SessionServiceListDto   {

    @ElementList(name = "sessionservices",type = SessionServiceDto.class)
    private List<SessionServiceDto> sessionServices;

    public List<SessionServiceDto> getSessionServiceList()   {
        return this.sessionServices;
    }

    public void setSessionServiceList(List<SessionServiceDto> sessionServices)   {
        this.sessionServices = sessionServices;
    }
}