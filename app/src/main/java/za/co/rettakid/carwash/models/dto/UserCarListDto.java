package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "usercarlistdto")
public class UserCarListDto   {

    @ElementList(name = "usercars",type = UserCarDto.class)
    private List<UserCarDto> userCars;

    public List<UserCarDto> getUserCarList()   {
        return this.userCars;
    }

    public void setUserCarList(List<UserCarDto> userCars)   {
        this.userCars = userCars;
    }
}