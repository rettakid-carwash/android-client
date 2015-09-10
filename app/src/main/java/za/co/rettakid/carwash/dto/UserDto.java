package za.co.rettakid.carwash.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


@Root
public class UserDto   {

    @Element(name = "userid")
    private Integer userId;
    @Element(name = "useremail")
    private String userEmail;
    @Element(name = "userpassword")
    private String userPassword;
    @Element(name = "username")
    private String userName;
    @Element(name = "usersurname")
    private String userSurname;
    @Element(name = "usernumber")
    private String userNumber;
    @Element(name = "usergender")
    private String userGender;
    @Element(name = "userage")
    private Integer userAge;
    @Element(name = "userallowpush")
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

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userNumber='" + userNumber + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userAge=" + userAge +
                ", userAllowPush=" + userAllowPush +
                '}';
    }
}