package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SessionVo extends BaseObservable   {

    private Long sessionId;
    private UserVo user;
    private String sessionLocation;
    private Date effFrom;
    private Date effTo;

    @Bindable
    public String getSessionId()   {
        return String.valueOf(this.sessionId);
    }

    public void setSessionId(String sessionId)   {
        this.sessionId = Long.parseLong(sessionId);
        notifyPropertyChanged(BR.sessionId);
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
    public String getSessionLocation()   {
        return String.valueOf(this.sessionLocation);
    }

    public void setSessionLocation(String sessionLocation)   {
        this.sessionLocation = sessionLocation;
        notifyPropertyChanged(BR.sessionLocation);
    }
    @Bindable
    public String getEffFrom()   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(this.effFrom);
    }

    public void setEffFrom(String effFrom)   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        try {
            this.effFrom = simpleDateFormat.parse(effFrom);
        } catch (ParseException e) {
            Log.e("SessionVo","Date Parse Error");
        }
        notifyPropertyChanged(BR.effFrom);
    }
    @Bindable
    public String getEffTo()   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(this.effTo);
    }

    public void setEffTo(String effTo)   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        try {
            this.effTo = simpleDateFormat.parse(effTo);
        } catch (ParseException e) {
            Log.e("SessionVo","Date Parse Error");
        }
        notifyPropertyChanged(BR.effTo);
    }

/* real getters and setters */

    public Long getRealSessionId()   {
        return this.sessionId;
    }

    public void setRealSessionId(Long sessionId)   {
        this.sessionId = sessionId;
    }
    public UserVo getRealUser()   {
        return this.user;
    }

    public void setRealUser(UserVo user)   {
        this.user = user;
    }
    public String getRealSessionLocation()   {
        return this.sessionLocation;
    }

    public void setRealSessionLocation(String sessionLocation)   {
        this.sessionLocation = sessionLocation;
    }
    public Date getRealEffFrom()   {
        return this.effFrom;
    }

    public void setRealEffFrom(Date effFrom)   {
        this.effFrom = effFrom;
    }
    public Date getRealEffTo()   {
        return this.effTo;
    }

    public void setRealEffTo(Date effTo)   {
        this.effTo = effTo;
    }

}