package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "devicestypedto")
public class DevicesTypeDto implements Serializable    {


    @Element(name = "devicestypeid" , required = false)
    private Long devicesTypeId;

    @Element(name = "devicetypename")
    private String deviceTypeName;

    @Element(name = "devicecanpush")
    private Boolean deviceCanPush;


    public Long getDevicesTypeId()   {
        return this.devicesTypeId;
    }

    public void setDevicesTypeId(Long devicesTypeId)   {
        this.devicesTypeId = devicesTypeId;
    }

    public String getDeviceTypeName()   {
        return this.deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName)   {
        this.deviceTypeName = deviceTypeName;
    }

    public Boolean getDeviceCanPush()   {
        return this.deviceCanPush;
    }

    public void setDeviceCanPush(Boolean deviceCanPush)   {
        this.deviceCanPush = deviceCanPush;
    }

}