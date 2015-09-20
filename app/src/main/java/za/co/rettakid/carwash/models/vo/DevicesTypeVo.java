package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DevicesTypeVo extends BaseObservable   {

    private Long devicesTypeId;
    private String deviceTypeName;
    private Boolean deviceCanPush;

    @Bindable
    public String getDevicesTypeId()   {
        return String.valueOf(this.devicesTypeId);
    }

    public void setDevicesTypeId(String devicesTypeId)   {
        this.devicesTypeId = Long.parseLong(devicesTypeId);
        notifyPropertyChanged(BR.devicesTypeId);
    }
    @Bindable
    public String getDeviceTypeName()   {
        return String.valueOf(this.deviceTypeName);
    }

    public void setDeviceTypeName(String deviceTypeName)   {
        this.deviceTypeName = deviceTypeName;
        notifyPropertyChanged(BR.deviceTypeName);
    }
    @Bindable
    public String getDeviceCanPush()   {
        return String.valueOf(this.deviceCanPush);
    }

    public void setDeviceCanPush(String deviceCanPush)   {
        this.deviceCanPush = Boolean.parseBoolean(deviceCanPush);
        notifyPropertyChanged(BR.deviceCanPush);
    }

/* real getters and setters */

    public Long getRealDevicesTypeId()   {
        return this.devicesTypeId;
    }

    public void setRealDevicesTypeId(Long devicesTypeId)   {
        this.devicesTypeId = devicesTypeId;
    }
    public String getRealDeviceTypeName()   {
        return this.deviceTypeName;
    }

    public void setRealDeviceTypeName(String deviceTypeName)   {
        this.deviceTypeName = deviceTypeName;
    }
    public Boolean getRealDeviceCanPush()   {
        return this.deviceCanPush;
    }

    public void setRealDeviceCanPush(Boolean deviceCanPush)   {
        this.deviceCanPush = deviceCanPush;
    }

}