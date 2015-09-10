package za.co.rettakid.carwash.binding;

import za.co.rettakid.carwash.dto.UserDto;
import za.co.rettakid.carwash.vo.UserVo;

/**
 * Created by Lwazi Prusent on 2015/09/09.
 */
public class BindUser {

    public static UserVo bindUser(UserDto userDto) {
        UserVo userVo = null;
        if (userDto != null)    {
            userVo = new UserVo();
            userVo.setUserAge(userDto.getUserAge());
            userVo.setUserAllowPush(userDto.getUserAllowPush());
            userVo.setUserEmail(userDto.getUserEmail());
            userVo.setUserGender(userDto.getUserGender());
            userVo.setUserId(userDto.getUserId());
            userVo.setUserName(userDto.getUserName());
            userVo.setUserNumber(userDto.getUserNumber());
            userVo.setUserPassword(userDto.getUserPassword());
            userVo.setUserSurname(userDto.getUserSurname());
        }
        return userVo;
    }

    public static UserDto bindUser(UserVo userVo) {
        UserDto userDto = null;
        if (userVo != null)    {
            userDto = new UserDto();
            userDto.setUserAge(userVo.getUserAge());
            userDto.setUserAllowPush(userVo.getUserAllowPush());
            userDto.setUserEmail(userVo.getUserEmail());
            userDto.setUserGender(userVo.getUserGender());
            userDto.setUserId(userVo.getUserId());
            userDto.setUserName(userVo.getUserName());
            userDto.setUserNumber(userVo.getUserNumber());
            userDto.setUserPassword(userVo.getUserPassword());
            userDto.setUserSurname(userVo.getUserSurname());
        }
        return userDto;
    }

}
