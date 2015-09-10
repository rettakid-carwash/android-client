package za.co.rettakid.carwash.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "userlistdto")
public class UserListDto   {

    @Element(name = "userlist")
    private List<UserDto> users;

    public List<UserDto> getUserList()   {
        return this.users;
    }

    public void setUserList(List<UserDto> users)   {
        this.users = users;
    }
}