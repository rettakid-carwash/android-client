package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "userdevicesdto")
public class UserDevicesDto implements Serializable    {


    @Element(name = "userdevicesid" , required = false)
    private Long userDevicesId;

    @Element(name = "userdto")
    private UserDto user;

    @Element(name = "devicestypedto")
    private DevicesTypeDto devicesType;

    @Element(name = "devicename")
    private String deviceName;

    @Element(name = "deviceid")
    private String deviceId;


    public Long getUserDevicesId()   {
        return this.userDevicesId;
    }

    public void setUserDevicesId(Long userDevicesId)   {
        this.userDevicesId = userDevicesId;
    }

    public UserDto getUser()   {
        return this.user;
    }

    public void setUser(UserDto user)   {
        this.user = user;
    }

    public DevicesTypeDto getDevicesType()   {
        return this.devicesType;
    }

    public void setDevicesType(DevicesTypeDto devicesType)   {
        this.devicesType = devicesType;
    }

    public String getDeviceName()   {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName)   {
        this.deviceName = deviceName;
    }

    public String getDeviceId()   {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId)   {
        this.deviceId = deviceId;
    }

}