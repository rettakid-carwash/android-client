package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "userlistdto")
public class UserListDto   {

    @ElementList(name = "users",type = UserDto.class)
    private List<UserDto> users;

    public List<UserDto> getUserList()   {
        return this.users;
    }

    public void setUserList(List<UserDto> users)   {
        this.users = users;
    }
}