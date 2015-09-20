package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceVo extends BaseObservable   {

    private Long serviceId;
    private Float serviceAmount;
    private Integer serviceLoyaltyPoints;
    private String serviceName;
    private String serviceDescr;
    private IconVo icon;
    private Date effFrom;
    private Date effTo;

    @Bindable
    public String getServiceId()   {
        return String.valueOf(this.serviceId);
    }

    public void setServiceId(String serviceId)   {
        this.serviceId = Long.parseLong(serviceId);
        notifyPropertyChanged(BR.serviceId);
    }
    @Bindable
    public String getServiceAmount()   {
        return String.valueOf(this.serviceAmount);
    }

    public void setServiceAmount(String serviceAmount)   {
        this.serviceAmount = Float.parseFloat(serviceAmount);
        notifyPropertyChanged(BR.serviceAmount);
    }
    @Bindable
    public String getServiceLoyaltyPoints()   {
        return String.valueOf(this.serviceLoyaltyPoints);
    }

    public void setServiceLoyaltyPoints(String serviceLoyaltyPoints)   {
        this.serviceLoyaltyPoints = Integer.parseInt(serviceLoyaltyPoints);
        notifyPropertyChanged(BR.serviceLoyaltyPoints);
    }
    @Bindable
    public String getServiceName()   {
        return String.valueOf(this.serviceName);
    }

    public void setServiceName(String serviceName)   {
        this.serviceName = serviceName;
        notifyPropertyChanged(BR.serviceName);
    }
    @Bindable
    public String getServiceDescr()   {
        return String.valueOf(this.serviceDescr);
    }

    public void setServiceDescr(String serviceDescr)   {
        this.serviceDescr = serviceDescr;
        notifyPropertyChanged(BR.serviceDescr);
    }
    @Bindable
    public IconVo getIcon()   {
        return this.icon;
    }

    public void setIcon(IconVo icon)   {
        this.icon = icon;
        notifyPropertyChanged(BR.icon);
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
            Log.e("ServiceVo","Date Parse Error");
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
            Log.e("ServiceVo","Date Parse Error");
        }
        notifyPropertyChanged(BR.effTo);
    }

/* real getters and setters */

    public Long getRealServiceId()   {
        return this.serviceId;
    }

    public void setRealServiceId(Long serviceId)   {
        this.serviceId = serviceId;
    }
    public Float getRealServiceAmount()   {
        return this.serviceAmount;
    }

    public void setRealServiceAmount(Float serviceAmount)   {
        this.serviceAmount = serviceAmount;
    }
    public Integer getRealServiceLoyaltyPoints()   {
        return this.serviceLoyaltyPoints;
    }

    public void setRealServiceLoyaltyPoints(Integer serviceLoyaltyPoints)   {
        this.serviceLoyaltyPoints = serviceLoyaltyPoints;
    }
    public String getRealServiceName()   {
        return this.serviceName;
    }

    public void setRealServiceName(String serviceName)   {
        this.serviceName = serviceName;
    }
    public String getRealServiceDescr()   {
        return this.serviceDescr;
    }

    public void setRealServiceDescr(String serviceDescr)   {
        this.serviceDescr = serviceDescr;
    }
    public IconVo getRealIcon()   {
        return this.icon;
    }

    public void setRealIcon(IconVo icon)   {
        this.icon = icon;
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