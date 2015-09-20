package za.co.rettakid.carwash.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import za.co.rettakid.carwash.BR;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserCarVo extends BaseObservable   {

    private Long carId;
    private UserVo user;
    private String carName;
    private String carNumPlate;
    private String carMake;
    private String carModel;
    private String carYear;
    private String carColor;

    @Bindable
    public String getCarId()   {
        return String.valueOf(this.carId);
    }

    public void setCarId(String carId)   {
        this.carId = Long.parseLong(carId);
        notifyPropertyChanged(BR.carId);
    }
    @Bindable
    public UserVo getUser()   {
        return this.user;
    }

    public void setUser(UserVo user)   {
        this.user = user;
        notifyPropertyChanged(BR.user);
    }
    @Bindable
    public String getCarName()   {
        return String.valueOf(this.carName);
    }

    public void setCarName(String carName)   {
        this.carName = carName;
        notifyPropertyChanged(BR.carName);
    }
    @Bindable
    public String getCarNumPlate()   {
        return String.valueOf(this.carNumPlate);
    }

    public void setCarNumPlate(String carNumPlate)   {
        this.carNumPlate = carNumPlate;
        notifyPropertyChanged(BR.carNumPlate);
    }
    @Bindable
    public String getCarMake()   {
        return String.valueOf(this.carMake);
    }

    public void setCarMake(String carMake)   {
        this.carMake = carMake;
        notifyPropertyChanged(BR.carMake);
    }
    @Bindable
    public String getCarModel()   {
        return String.valueOf(this.carModel);
    }

    public void setCarModel(String carModel)   {
        this.carModel = carModel;
        notifyPropertyChanged(BR.carModel);
    }
    @Bindable
    public String getCarYear()   {
        return String.valueOf(this.carYear);
    }

    public void setCarYear(String carYear)   {
        this.carYear = carYear;
        notifyPropertyChanged(BR.carYear);
    }
    @Bindable
    public String getCarColor()   {
        return String.valueOf(this.carColor);
    }

    public void setCarColor(String carColor)   {
        this.carColor = carColor;
        notifyPropertyChanged(BR.carColor);
    }

/* real getters and setters */

    public Long getRealCarId()   {
        return this.carId;
    }

    public void setRealCarId(Long carId)   {
        this.carId = carId;
    }
    public UserVo getRealUser()   {
        return this.user;
    }

    public void setRealUser(UserVo user)   {
        this.user = user;
    }
    public String getRealCarName()   {
        return this.carName;
    }

    public void setRealCarName(String carName)   {
        this.carName = carName;
    }
    public String getRealCarNumPlate()   {
        return this.carNumPlate;
    }

    public void setRealCarNumPlate(String carNumPlate)   {
        this.carNumPlate = carNumPlate;
    }
    public String getRealCarMake()   {
        return this.carMake;
    }

    public void setRealCarMake(String carMake)   {
        this.carMake = carMake;
    }
    public String getRealCarModel()   {
        return this.carModel;
    }

    public void setRealCarModel(String carModel)   {
        this.carModel = carModel;
    }
    public String getRealCarYear()   {
        return this.carYear;
    }

    public void setRealCarYear(String carYear)   {
        this.carYear = carYear;
    }
    public String getRealCarColor()   {
        return this.carColor;
    }

    public void setRealCarColor(String carColor)   {
        this.carColor = carColor;
    }

}