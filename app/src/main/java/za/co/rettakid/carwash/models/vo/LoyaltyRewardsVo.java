package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoyaltyRewardsVo extends BaseObservable   {

    private Long rewardsId;
    private String rewardsName;
    private String rewardsDescr;
    private Long rewardsAmount;
    private Date effFrom;
    private Date effTo;

    @Bindable
    public String getRewardsId()   {
        return String.valueOf(this.rewardsId);
    }

    public void setRewardsId(String rewardsId)   {
        this.rewardsId = Long.parseLong(rewardsId);
        notifyPropertyChanged(BR.rewardsId);
    }
    @Bindable
    public String getRewardsName()   {
        return String.valueOf(this.rewardsName);
    }

    public void setRewardsName(String rewardsName)   {
        this.rewardsName = rewardsName;
        notifyPropertyChanged(BR.rewardsName);
    }
    @Bindable
    public String getRewardsDescr()   {
        return String.valueOf(this.rewardsDescr);
    }

    public void setRewardsDescr(String rewardsDescr)   {
        this.rewardsDescr = rewardsDescr;
        notifyPropertyChanged(BR.rewardsDescr);
    }
    @Bindable
    public String getRewardsAmount()   {
        return String.valueOf(this.rewardsAmount);
    }

    public void setRewardsAmount(String rewardsAmount)   {
        this.rewardsAmount = Long.parseLong(rewardsAmount);
        notifyPropertyChanged(BR.rewardsAmount);
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
            Log.e("LoyaltyRewardsVo","Date Parse Error");
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
            Log.e("LoyaltyRewardsVo","Date Parse Error");
        }
        notifyPropertyChanged(BR.effTo);
    }

/* real getters and setters */

    public Long getRealRewardsId()   {
        return this.rewardsId;
    }

    public void setRealRewardsId(Long rewardsId)   {
        this.rewardsId = rewardsId;
    }
    public String getRealRewardsName()   {
        return this.rewardsName;
    }

    public void setRealRewardsName(String rewardsName)   {
        this.rewardsName = rewardsName;
    }
    public String getRealRewardsDescr()   {
        return this.rewardsDescr;
    }

    public void setRealRewardsDescr(String rewardsDescr)   {
        this.rewardsDescr = rewardsDescr;
    }
    public Long getRealRewardsAmount()   {
        return this.rewardsAmount;
    }

    public void setRealRewardsAmount(Long rewardsAmount)   {
        this.rewardsAmount = rewardsAmount;
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