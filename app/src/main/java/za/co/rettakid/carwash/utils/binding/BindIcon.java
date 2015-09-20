package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindIcon {

    public static IconVo bindIcon(IconDto iconDto) {
        IconVo iconVo = null;
        if (iconDto != null)    {
            iconVo = new IconVo();
            iconVo.setRealIconId(iconDto.getIconId());
            iconVo.setRealIconName(iconDto.getIconName());
            iconVo.setRealIconColor(iconDto.getIconColor());
            iconVo.setRealIconSize(iconDto.getIconSize());
            iconVo.setRealIconFileName(iconDto.getIconFileName());
        }
        return iconVo;
    }

    public static IconDto bindIcon(IconVo iconVo) {
        IconDto iconDto = null;
        if (iconVo != null)    {
            iconDto = new IconDto();
            iconDto.setIconId(iconVo.getRealIconId());
            iconDto.setIconName(iconVo.getRealIconName());
            iconDto.setIconColor(iconVo.getRealIconColor());
            iconDto.setIconSize(iconVo.getRealIconSize());
            iconDto.setIconFileName(iconVo.getRealIconFileName());
        }
        return iconDto;
    }

}
