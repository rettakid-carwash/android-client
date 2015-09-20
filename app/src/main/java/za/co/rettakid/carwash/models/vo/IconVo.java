package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class IconVo extends BaseObservable   {

    private Long iconId;
    private String iconName;
    private String iconColor;
    private Integer iconSize;
    private String iconFileName;

    @Bindable
    public String getIconId()   {
        return String.valueOf(this.iconId);
    }

    public void setIconId(String iconId)   {
        this.iconId = Long.parseLong(iconId);
        notifyPropertyChanged(BR.iconId);
    }
    @Bindable
    public String getIconName()   {
        return String.valueOf(this.iconName);
    }

    public void setIconName(String iconName)   {
        this.iconName = iconName;
        notifyPropertyChanged(BR.iconName);
    }
    @Bindable
    public String getIconColor()   {
        return String.valueOf(this.iconColor);
    }

    public void setIconColor(String iconColor)   {
        this.iconColor = iconColor;
        notifyPropertyChanged(BR.iconColor);
    }
    @Bindable
    public String getIconSize()   {
        return String.valueOf(this.iconSize);
    }

    public void setIconSize(String iconSize)   {
        this.iconSize = Integer.parseInt(iconSize);
        notifyPropertyChanged(BR.iconSize);
    }
    @Bindable
    public String getIconFileName()   {
        return String.valueOf(this.iconFileName);
    }

    public void setIconFileName(String iconFileName)   {
        this.iconFileName = iconFileName;
        notifyPropertyChanged(BR.iconFileName);
    }

/* real getters and setters */

    public Long getRealIconId()   {
        return this.iconId;
    }

    public void setRealIconId(Long iconId)   {
        this.iconId = iconId;
    }
    public String getRealIconName()   {
        return this.iconName;
    }

    public void setRealIconName(String iconName)   {
        this.iconName = iconName;
    }
    public String getRealIconColor()   {
        return this.iconColor;
    }

    public void setRealIconColor(String iconColor)   {
        this.iconColor = iconColor;
    }
    public Integer getRealIconSize()   {
        return this.iconSize;
    }

    public void setRealIconSize(Integer iconSize)   {
        this.iconSize = iconSize;
    }
    public String getRealIconFileName()   {
        return this.iconFileName;
    }

    public void setRealIconFileName(String iconFileName)   {
        this.iconFileName = iconFileName;
    }

}