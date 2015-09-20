package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class IconClient extends BaseClient   {

    public IconClient(Context context) {
        super("/icons",context);
    }

    public IconListDto getIcons()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, IconListDto.class);
    }

    public IconDto getIcons(Long iconId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, IconDto.class,iconId);
    }

    public IconDto postIcon(IconDto iconDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, iconDto, IconDto.class);
    }

    public IconListDto postIcon(IconListDto iconListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, iconListDto, IconListDto.class);
    }

    public void putIcon(IconDto iconDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, iconDto, IconDto.class,iconDto.getIconId());
    }

    public void deleteIcon(Long iconId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,iconId);
    }

}