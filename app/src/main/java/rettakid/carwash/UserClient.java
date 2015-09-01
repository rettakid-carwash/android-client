package rettakid.carwash;

public class UserClient extends BaseClient   {

    public UserClient() {
        super("/users");
    }

    public UserDto getUser(Integer userId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, UserDto.class,userId);
    }

    public void postUser(UserDto userDto)  {
        String url = createUrl();
        getRestTemplate().postForObject(url, userDto, UserDto.class);
    }

    public void putUser(UserDto userDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, userDto, UserDto.class,userDto.getUserId());
    }

    public void deleteUser(Integer userId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,userId);
    }

}