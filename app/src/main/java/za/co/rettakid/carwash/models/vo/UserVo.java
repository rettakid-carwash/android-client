package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserVo extends BaseObservable   {

    private Long userId;
    private String userEmail;
    private String userPassword;
    private String userName;
    private String userSurname;
    private String userNumber;
    private String userGender;
    private Integer userAge;
    private Boolean userAllowPush;

    @Bindable
    public String getUserId()   {
        return String.valueOf(this.userId);
    }

    public void setUserId(String userId)   {
        this.userId = Long.parseLong(userId);
        notifyPropertyChanged(BR.userId);
    }
    @Bindable
    public String getUserEmail()   {
        return String.valueOf(this.userEmail);
    }

    public void setUserEmail(String userEmail)   {
        this.userEmail = userEmail;
        notifyPropertyChanged(BR.userEmail);
    }
    @Bindable
    public String getUserPassword()   {
        return String.valueOf(this.userPassword);
    }

    public void setUserPassword(String userPassword)   {
        this.userPassword = userPassword;
        notifyPropertyChanged(BR.userPassword);
    }
    @Bindable
    public String getUserName()   {
        return String.valueOf(this.userName);
    }

    public void setUserName(String userName)   {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }
    @Bindable
    public String getUserSurname()   {
        return String.valueOf(this.userSurname);
    }

    public void setUserSurname(String userSurname)   {
        this.userSurname = userSurname;
        notifyPropertyChanged(BR.userSurname);
    }
    @Bindable
    public String getUserNumber()   {
        return String.valueOf(this.userNumber);
    }

    public void setUserNumber(String userNumber)   {
        this.userNumber = userNumber;
        notifyPropertyChanged(BR.userNumber);
    }
    @Bindable
    public String getUserGender()   {
        return String.valueOf(this.userGender);
    }

    public void setUserGender(String userGender)   {
        this.userGender = userGender;
        notifyPropertyChanged(BR.userGender);
    }
    @Bindable
    public String getUserAge()   {
        return String.valueOf(this.userAge);
    }

    public void setUserAge(String userAge)   {
        this.userAge = Integer.parseInt(userAge);
        notifyPropertyChanged(BR.userAge);
    }
    @Bindable
    public String getUserAllowPush()   {
        return String.valueOf(this.userAllowPush);
    }

    public void setUserAllowPush(String userAllowPush)   {
        this.userAllowPush = Boolean.parseBoolean(userAllowPush);
        notifyPropertyChanged(BR.userAllowPush);
    }

/* real getters and setters */

    public Long getRealUserId()   {
        return this.userId;
    }

    public void setRealUserId(Long userId)   {
        this.userId = userId;
    }
    public String getRealUserEmail()   {
        return this.userEmail;
    }

    public void setRealUserEmail(String userEmail)   {
        this.userEmail = userEmail;
    }
    public String getRealUserPassword()   {
        return this.userPassword;
    }

    public void setRealUserPassword(String userPassword)   {
        this.userPassword = userPassword;
    }
    public String getRealUserName()   {
        return this.userName;
    }

    public void setRealUserName(String userName)   {
        this.userName = userName;
    }
    public String getRealUserSurname()   {
        return this.userSurname;
    }

    public void setRealUserSurname(String userSurname)   {
        this.userSurname = userSurname;
    }
    public String getRealUserNumber()   {
        return this.userNumber;
    }

    public void setRealUserNumber(String userNumber)   {
        this.userNumber = userNumber;
    }
    public String getRealUserGender()   {
        return this.userGender;
    }

    public void setRealUserGender(String userGender)   {
        this.userGender = userGender;
    }
    public Integer getRealUserAge()   {
        return this.userAge;
    }

    public void setRealUserAge(Integer userAge)   {
        this.userAge = userAge;
    }
    public Boolean getRealUserAllowPush()   {
        return this.userAllowPush;
    }

    public void setRealUserAllowPush(Boolean userAllowPush)   {
        this.userAllowPush = userAllowPush;
    }

}