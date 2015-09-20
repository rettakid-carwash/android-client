package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SessionServiceVo extends BaseObservable   {

    private Long sessionServiceId;
    private SessionVo session;
    private ServiceVo service;

    @Bindable
    public String getSessionServiceId()   {
        return String.valueOf(this.sessionServiceId);
    }

    public void setSessionServiceId(String sessionServiceId)   {
        this.sessionServiceId = Long.parseLong(sessionServiceId);
        notifyPropertyChanged(BR.sessionServiceId);
    }
    @Bindable
    public SessionVo getSession()   {
        return this.session;
    }

    public void setSession(SessionVo session)   {
        this.session = session;
        notifyPropertyChanged(BR.session);
    }
    @Bindable
    public ServiceVo getService()   {
        return this.service;
    }

    public void setService(ServiceVo service)   {
        this.service = service;
        notifyPropertyChanged(BR.service);
    }

/* real getters and setters */

    public Long getRealSessionServiceId()   {
        return this.sessionServiceId;
    }

    public void setRealSessionServiceId(Long sessionServiceId)   {
        this.sessionServiceId = sessionServiceId;
    }
    public SessionVo getRealSession()   {
        return this.session;
    }

    public void setRealSession(SessionVo session)   {
        this.session = session;
    }
    public ServiceVo getRealService()   {
        return this.service;
    }

    public void setRealService(ServiceVo service)   {
        this.service = service;
    }

}