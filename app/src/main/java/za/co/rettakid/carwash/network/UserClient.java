package za.co.rettakid.carwash.network;

import android.util.Log;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

import za.co.rettakid.carwash.dto.UserDto;
import za.co.rettakid.carwash.dto.UserListDto;

public class UserClient extends BaseClient   {

    public UserClient() {
        super("/users");
    }

    public UserListDto getUsers()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, UserListDto.class);
    }

    public UserDto getUsers(Integer userId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, UserDto.class,userId);
    }

    public void postUser(UserDto userDto)  {
        String url = createUrl();
        userDto.setUserId(userDto.getUserId() + 1);
        UserDto userDto1 = getRestTemplate().postForObject(url, userDto, UserDto.class);
        Log.i("rest template", userDto1.toString());
    }

    public void putUser(UserDto userDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, userDto, UserDto.class, userDto.getUserId());

    }

    public void deleteUser(Integer userId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,userId);
    }

}