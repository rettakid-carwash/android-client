package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "usercardto")
public class UserCarDto implements Serializable    {


    @Element(name = "carid" , required = false)
    private Long carId;

    @Element(name = "userdto")
    private UserDto user;

    @Element(name = "carname")
    private String carName;

    @Element(name = "carnumplate" , required = false)
    private String carNumPlate;

    @Element(name = "carmake" , required = false)
    private String carMake;

    @Element(name = "carmodel" , required = false)
    private String carModel;

    @Element(name = "caryear" , required = false)
    private String carYear;

    @Element(name = "carcolor" , required = false)
    private String carColor;


    public Long getCarId()   {
        return this.carId;
    }

    public void setCarId(Long carId)   {
        this.carId = carId;
    }

    public UserDto getUser()   {
        return this.user;
    }

    public void setUser(UserDto user)   {
        this.user = user;
    }

    public String getCarName()   {
        return this.carName;
    }

    public void setCarName(String carName)   {
        this.carName = carName;
    }

    public String getCarNumPlate()   {
        return this.carNumPlate;
    }

    public void setCarNumPlate(String carNumPlate)   {
        this.carNumPlate = carNumPlate;
    }

    public String getCarMake()   {
        return this.carMake;
    }

    public void setCarMake(String carMake)   {
        this.carMake = carMake;
    }

    public String getCarModel()   {
        return this.carModel;
    }

    public void setCarModel(String carModel)   {
        this.carModel = carModel;
    }

    public String getCarYear()   {
        return this.carYear;
    }

    public void setCarYear(String carYear)   {
        this.carYear = carYear;
    }

    public String getCarColor()   {
        return this.carColor;
    }

    public void setCarColor(String carColor)   {
        this.carColor = carColor;
    }

}