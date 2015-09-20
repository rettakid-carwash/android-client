package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;

import java.util.Date;

@Root(name = "servicedto")
public class ServiceDto implements Serializable    {


    @Element(name = "serviceid" , required = false)
    private Long serviceId;

    @Element(name = "serviceamount")
    private Float serviceAmount;

    @Element(name = "serviceloyaltypoints")
    private Integer serviceLoyaltyPoints;

    @Element(name = "servicename")
    private String serviceName;

    @Element(name = "servicedescr")
    private String serviceDescr;

    @Element(name = "icondto")
    private IconDto icon;

    @Element(name = "efffrom")
    private Date effFrom;

    @Element(name = "effto")
    private Date effTo;


    public Long getServiceId()   {
        return this.serviceId;
    }

    public void setServiceId(Long serviceId)   {
        this.serviceId = serviceId;
    }

    public Float getServiceAmount()   {
        return this.serviceAmount;
    }

    public void setServiceAmount(Float serviceAmount)   {
        this.serviceAmount = serviceAmount;
    }

    public Integer getServiceLoyaltyPoints()   {
        return this.serviceLoyaltyPoints;
    }

    public void setServiceLoyaltyPoints(Integer serviceLoyaltyPoints)   {
        this.serviceLoyaltyPoints = serviceLoyaltyPoints;
    }

    public String getServiceName()   {
        return this.serviceName;
    }

    public void setServiceName(String serviceName)   {
        this.serviceName = serviceName;
    }

    public String getServiceDescr()   {
        return this.serviceDescr;
    }

    public void setServiceDescr(String serviceDescr)   {
        this.serviceDescr = serviceDescr;
    }

    public IconDto getIcon()   {
        return this.icon;
    }

    public void setIcon(IconDto icon)   {
        this.icon = icon;
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