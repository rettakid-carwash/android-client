package rettakid.carwash;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class UserDto   {

    @Element
    private Integer userId;
    @Element
    private String userEmail;
    @Element
    private String userPassword;
    @Element
    private String userName;
    @Element
    private String userSurname;
    @Element
    private String userNumber;
    @Element
    private String userGender;
    @Element
    private Integer userAge;
    @Element
    private Boolean userAllowPush;

    public Integer getUserId()   {
        return this.userId;
    }

    public void setUserId(Integer userId)   {
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