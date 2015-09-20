package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class DevicesTypeClient extends BaseClient   {

    public DevicesTypeClient(Context context) {
        super("/devicestypes",context);
    }

    public DevicesTypeListDto getDevicesTypes()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, DevicesTypeListDto.class);
    }

    public DevicesTypeDto getDevicesTypes(Long devicesTypeId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, DevicesTypeDto.class,devicesTypeId);
    }

    public DevicesTypeDto postDevicesType(DevicesTypeDto devicesTypeDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, devicesTypeDto, DevicesTypeDto.class);
    }

    public DevicesTypeListDto postDevicesType(DevicesTypeListDto devicesTypeListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, devicesTypeListDto, DevicesTypeListDto.class);
    }

    public void putDevicesType(DevicesTypeDto devicesTypeDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, devicesTypeDto, DevicesTypeDto.class,devicesTypeDto.getDevicesTypeId());
    }

    public void deleteDevicesType(Long devicesTypeId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,devicesTypeId);
    }

}