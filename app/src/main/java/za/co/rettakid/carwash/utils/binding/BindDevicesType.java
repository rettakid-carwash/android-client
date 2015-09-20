package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindDevicesType {

    public static DevicesTypeVo bindDevicesType(DevicesTypeDto devicesTypeDto) {
        DevicesTypeVo devicesTypeVo = null;
        if (devicesTypeDto != null)    {
            devicesTypeVo = new DevicesTypeVo();
            devicesTypeVo.setRealDevicesTypeId(devicesTypeDto.getDevicesTypeId());
            devicesTypeVo.setRealDeviceTypeName(devicesTypeDto.getDeviceTypeName());
            devicesTypeVo.setRealDeviceCanPush(devicesTypeDto.getDeviceCanPush());
        }
        return devicesTypeVo;
    }

    public static DevicesTypeDto bindDevicesType(DevicesTypeVo devicesTypeVo) {
        DevicesTypeDto devicesTypeDto = null;
        if (devicesTypeVo != null)    {
            devicesTypeDto = new DevicesTypeDto();
            devicesTypeDto.setDevicesTypeId(devicesTypeVo.getRealDevicesTypeId());
            devicesTypeDto.setDeviceTypeName(devicesTypeVo.getRealDeviceTypeName());
            devicesTypeDto.setDeviceCanPush(devicesTypeVo.getRealDeviceCanPush());
        }
        return devicesTypeDto;
    }

}
