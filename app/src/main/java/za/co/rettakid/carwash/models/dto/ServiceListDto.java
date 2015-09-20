package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;

import java.util.Date;

@Root(name = "servicelistdto")
public class ServiceListDto   {

    @ElementList(name = "services",type = ServiceDto.class)
    private List<ServiceDto> services;

    public List<ServiceDto> getServiceList()   {
        return this.services;
    }

    public void setServiceList(List<ServiceDto> services)   {
        this.services = services;
    }
}