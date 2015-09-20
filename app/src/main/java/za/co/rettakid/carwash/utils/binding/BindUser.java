package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindUser {

    public static UserVo bindUser(UserDto userDto) {
        UserVo userVo = null;
        if (userDto != null)    {
            userVo = new UserVo();
            userVo.setRealUserId(userDto.getUserId());
            userVo.setRealUserEmail(userDto.getUserEmail());
            userVo.setRealUserPassword(userDto.getUserPassword());
            userVo.setRealUserName(userDto.getUserName());
            userVo.setRealUserSurname(userDto.getUserSurname());
            userVo.setRealUserNumber(userDto.getUserNumber());
            userVo.setRealUserGender(userDto.getUserGender());
            userVo.setRealUserAge(userDto.getUserAge());
            userVo.setRealUserAllowPush(userDto.getUserAllowPush());
        }
        return userVo;
    }

    public static UserDto bindUser(UserVo userVo) {
        UserDto userDto = null;
        if (userVo != null)    {
            userDto = new UserDto();
            userDto.setUserId(userVo.getRealUserId());
            userDto.setUserEmail(userVo.getRealUserEmail());
            userDto.setUserPassword(userVo.getRealUserPassword());
            userDto.setUserName(userVo.getRealUserName());
            userDto.setUserSurname(userVo.getRealUserSurname());
            userDto.setUserNumber(userVo.getRealUserNumber());
            userDto.setUserGender(userVo.getRealUserGender());
            userDto.setUserAge(userVo.getRealUserAge());
            userDto.setUserAllowPush(userVo.getRealUserAllowPush());
        }
        return userDto;
    }

}
