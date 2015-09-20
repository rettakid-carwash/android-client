package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "iconlistdto")
public class IconListDto   {

    @ElementList(name = "icons",type = IconDto.class)
    private List<IconDto> icons;

    public List<IconDto> getIconList()   {
        return this.icons;
    }

    public void setIconList(List<IconDto> icons)   {
        this.icons = icons;
    }
}