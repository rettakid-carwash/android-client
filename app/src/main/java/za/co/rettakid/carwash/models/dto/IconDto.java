package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "icondto")
public class IconDto implements Serializable    {


    @Element(name = "iconid" , required = false)
    private Long iconId;

    @Element(name = "iconname")
    private String iconName;

    @Element(name = "iconcolor")
    private String iconColor;

    @Element(name = "iconsize")
    private Integer iconSize;

    @Element(name = "iconfilename")
    private String iconFileName;


    public Long getIconId()   {
        return this.iconId;
    }

    public void setIconId(Long iconId)   {
        this.iconId = iconId;
    }

    public String getIconName()   {
        return this.iconName;
    }

    public void setIconName(String iconName)   {
        this.iconName = iconName;
    }

    public String getIconColor()   {
        return this.iconColor;
    }

    public void setIconColor(String iconColor)   {
        this.iconColor = iconColor;
    }

    public Integer getIconSize()   {
        return this.iconSize;
    }

    public void setIconSize(Integer iconSize)   {
        this.iconSize = iconSize;
    }

    public String getIconFileName()   {
        return this.iconFileName;
    }

    public void setIconFileName(String iconFileName)   {
        this.iconFileName = iconFileName;
    }

}