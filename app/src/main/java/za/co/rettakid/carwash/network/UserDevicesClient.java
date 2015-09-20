package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class UserDevicesClient extends BaseClient   {

    public UserDevicesClient(Context context) {
        super("/userdevicess",context);
    }

    public UserDevicesListDto getUserDevicess()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, UserDevicesListDto.class);
    }

    public UserDevicesDto getUserDevicess(Long userDevicesId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, UserDevicesDto.class,userDevicesId);
    }

    public UserDevicesDto postUserDevices(UserDevicesDto userDevicesDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, userDevicesDto, UserDevicesDto.class);
    }

    public UserDevicesListDto postUserDevices(UserDevicesListDto userDevicesListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, userDevicesListDto, UserDevicesListDto.class);
    }

    public void putUserDevices(UserDevicesDto userDevicesDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, userDevicesDto, UserDevicesDto.class,userDevicesDto.getUserDevicesId());
    }

    public void deleteUserDevices(Long userDevicesId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,userDevicesId);
    }

}