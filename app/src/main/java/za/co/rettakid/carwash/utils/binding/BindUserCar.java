package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindUserCar {

    public static UserCarVo bindUserCar(UserCarDto userCarDto) {
        UserCarVo userCarVo = null;
        if (userCarDto != null)    {
            userCarVo = new UserCarVo();
            userCarVo.setRealCarId(userCarDto.getCarId());
            userCarVo.setRealUser(BindUser.bindUser(userCarDto.getUser()));
            userCarVo.setRealCarName(userCarDto.getCarName());
            userCarVo.setRealCarNumPlate(userCarDto.getCarNumPlate());
            userCarVo.setRealCarMake(userCarDto.getCarMake());
            userCarVo.setRealCarModel(userCarDto.getCarModel());
            userCarVo.setRealCarYear(userCarDto.getCarYear());
            userCarVo.setRealCarColor(userCarDto.getCarColor());
        }
        return userCarVo;
    }

    public static UserCarDto bindUserCar(UserCarVo userCarVo) {
        UserCarDto userCarDto = null;
        if (userCarVo != null)    {
            userCarDto = new UserCarDto();
            userCarDto.setCarId(userCarVo.getRealCarId());
            userCarDto.setUser(BindUser.bindUser(userCarVo.getRealUser()));
            userCarDto.setCarName(userCarVo.getRealCarName());
            userCarDto.setCarNumPlate(userCarVo.getRealCarNumPlate());
            userCarDto.setCarMake(userCarVo.getRealCarMake());
            userCarDto.setCarModel(userCarVo.getRealCarModel());
            userCarDto.setCarYear(userCarVo.getRealCarYear());
            userCarDto.setCarColor(userCarVo.getRealCarColor());
        }
        return userCarDto;
    }

}
