package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserDevicesVo extends BaseObservable   {

    private Long userDevicesId;
    private UserVo user;
    private DevicesTypeVo devicesType;
    private String deviceName;
    private String deviceId;

    @Bindable
    public String getUserDevicesId()   {
        return String.valueOf(this.userDevicesId);
    }

    public void setUserDevicesId(String userDevicesId)   {
        this.userDevicesId = Long.parseLong(userDevicesId);
        notifyPropertyChanged(BR.userDevicesId);
    }
    @Bindable
    public UserVo getUser()   {
        return this.user;
    }

    public void setUser(UserVo user)   {
        this.user = user;
        notifyPropertyChanged(BR.user);
    }
    @Bindable
    public DevicesTypeVo getDevicesType()   {
        return this.devicesType;
    }

    public void setDevicesType(DevicesTypeVo devicesType)   {
        this.devicesType = devicesType;
        notifyPropertyChanged(BR.devicesType);
    }
    @Bindable
    public String getDeviceName()   {
        return String.valueOf(this.deviceName);
    }

    public void setDeviceName(String deviceName)   {
        this.deviceName = deviceName;
        notifyPropertyChanged(BR.deviceName);
    }
    @Bindable
    public String getDeviceId()   {
        return String.valueOf(this.deviceId);
    }

    public void setDeviceId(String deviceId)   {
        this.deviceId = deviceId;
        notifyPropertyChanged(BR.deviceId);
    }

/* real getters and setters */

    public Long getRealUserDevicesId()   {
        return this.userDevicesId;
    }

    public void setRealUserDevicesId(Long userDevicesId)   {
        this.userDevicesId = userDevicesId;
    }
    public UserVo getRealUser()   {
        return this.user;
    }

    public void setRealUser(UserVo user)   {
        this.user = user;
    }
    public DevicesTypeVo getRealDevicesType()   {
        return this.devicesType;
    }

    public void setRealDevicesType(DevicesTypeVo devicesType)   {
        this.devicesType = devicesType;
    }
    public String getRealDeviceName()   {
        return this.deviceName;
    }

    public void setRealDeviceName(String deviceName)   {
        this.deviceName = deviceName;
    }
    public String getRealDeviceId()   {
        return this.deviceId;
    }

    public void setRealDeviceId(String deviceId)   {
        this.deviceId = deviceId;
    }

}