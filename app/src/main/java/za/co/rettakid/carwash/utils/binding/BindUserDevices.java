package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindUserDevices {

    public static UserDevicesVo bindUserDevices(UserDevicesDto userDevicesDto) {
        UserDevicesVo userDevicesVo = null;
        if (userDevicesDto != null)    {
            userDevicesVo = new UserDevicesVo();
            userDevicesVo.setRealUserDevicesId(userDevicesDto.getUserDevicesId());
            userDevicesVo.setRealUser(BindUser.bindUser(userDevicesDto.getUser()));
            userDevicesVo.setRealDevicesType(BindDevicesType.bindDevicesType(userDevicesDto.getDevicesType()));
            userDevicesVo.setRealDeviceName(userDevicesDto.getDeviceName());
            userDevicesVo.setRealDeviceId(userDevicesDto.getDeviceId());
        }
        return userDevicesVo;
    }

    public static UserDevicesDto bindUserDevices(UserDevicesVo userDevicesVo) {
        UserDevicesDto userDevicesDto = null;
        if (userDevicesVo != null)    {
            userDevicesDto = new UserDevicesDto();
            userDevicesDto.setUserDevicesId(userDevicesVo.getRealUserDevicesId());
            userDevicesDto.setUser(BindUser.bindUser(userDevicesVo.getRealUser()));
            userDevicesDto.setDevicesType(BindDevicesType.bindDevicesType(userDevicesVo.getRealDevicesType()));
            userDevicesDto.setDeviceName(userDevicesVo.getRealDeviceName());
            userDevicesDto.setDeviceId(userDevicesVo.getRealDeviceId());
        }
        return userDevicesDto;
    }

}
