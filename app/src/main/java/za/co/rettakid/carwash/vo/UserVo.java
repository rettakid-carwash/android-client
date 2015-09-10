package za.co.rettakid.carwash.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import za.co.rettakid.carwash.BR;

public class UserVo extends BaseObservable {

    private Integer userId;
    private String userEmail;
    private String userPassword;
    private String userName;
    private String userSurname;
    private String userNumber;
    private String userGender;
    private Integer userAge;
    private Boolean userAllowPush;


    @Bindable
    public Integer getUserId()   {
        return this.userId;
    }

    public void setUserId(Integer userId)   {
        this.userId = userId;
        notifyPropertyChanged(BR.userId);
    }

    @Bindable
    public String getUserEmail()   {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail)   {
        this.userEmail = userEmail;
        notifyPropertyChanged(BR.userEmail);
    }

    @Bindable
    public String getUserPassword()   {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword)   {
        this.userPassword = userPassword;
        notifyPropertyChanged(BR.userPassword);
    }

    @Bindable
    public String getUserName()   {
        return this.userName;
    }

    public void setUserName(String userName)   {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public String getUserSurname()   {
        return this.userSurname;
    }

    public void setUserSurname(String userSurname)   {
        this.userSurname = userSurname;
        notifyPropertyChanged(BR.userSurname);
    }

    @Bindable
    public String getUserNumber()   {
        return this.userNumber;
    }

    public void setUserNumber(String userNumber)   {
        this.userNumber = userNumber;
        notifyPropertyChanged(BR.userNumber);
    }

    @Bindable
    public String getUserGender()   {
        return this.userGender;
    }

    public void setUserGender(String userGender)   {
        this.userGender = userGender;
        notifyPropertyChanged(BR.userGender);
    }

    @Bindable
    public Integer getUserAge()   {
        return this.userAge;
    }

    public void setUserAge(Integer userAge)   {
        this.userAge = userAge;
        notifyPropertyChanged(BR.userAge);
    }

    @Bindable
    public Boolean getUserAllowPush()   {
        return this.userAllowPush;
    }

    public void setUserAllowPush(Boolean userAllowPush)   {
        this.userAllowPush = userAllowPush;
        notifyPropertyChanged(BR.userAllowPush);
    }

}