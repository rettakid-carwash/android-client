package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class UserClient extends BaseClient   {

    public UserClient(Context context) {
        super("/users",context);
    }

    public UserListDto getUsers()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, UserListDto.class);
    }

    public UserDto getUsers(Long userId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, UserDto.class,userId);
    }

    public UserDto postUser(UserDto userDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, userDto, UserDto.class);
    }

    public UserListDto postUser(UserListDto userListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, userListDto, UserListDto.class);
    }

    public void putUser(UserDto userDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, userDto, UserDto.class,userDto.getUserId());
    }

    public void deleteUser(Long userId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,userId);
    }

}