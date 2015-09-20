package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "userdto")
public class UserDto implements Serializable    {


    @Element(name = "userid" , required = false)
    private Long userId;

    @Element(name = "useremail")
    private String userEmail;

    @Element(name = "userpassword")
    private String userPassword;

    @Element(name = "username" , required = false)
    private String userName;

    @Element(name = "usersurname" , required = false)
    private String userSurname;

    @Element(name = "usernumber" , required = false)
    private String userNumber;

    @Element(name = "usergender" , required = false)
    private String userGender;

    @Element(name = "userage" , required = false)
    private Integer userAge;

    @Element(name = "userallowpush")
    private Boolean userAllowPush;


    public Long getUserId()   {
        return this.userId;
    }

    public void setUserId(Long userId)   {
        this.userId = userId;
    }

    public String getUserEmail()   {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail)   {
        this.userEmail = userEmail;
    }

    public String getUserPassword()   {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword)   {
        this.userPassword = userPassword;
    }

    public String getUserName()   {
        return this.userName;
    }

    public void setUserName(String userName)   {
        this.userName = userName;
    }

    public String getUserSurname()   {
        return this.userSurname;
    }

    public void setUserSurname(String userSurname)   {
        this.userSurname = userSurname;
    }

    public String getUserNumber()   {
        return this.userNumber;
    }

    public void setUserNumber(String userNumber)   {
        this.userNumber = userNumber;
    }

    public String getUserGender()   {
        return this.userGender;
    }

    public void setUserGender(String userGender)   {
        this.userGender = userGender;
    }

    public Integer getUserAge()   {
        return this.userAge;
    }

    public void setUserAge(Integer userAge)   {
        this.userAge = userAge;
    }

    public Boolean getUserAllowPush()   {
        return this.userAllowPush;
    }

    public void setUserAllowPush(Boolean userAllowPush)   {
        this.userAllowPush = userAllowPush;
    }

}