package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "userdeviceslistdto")
public class UserDevicesListDto   {

    @ElementList(name = "userdevicess",type = UserDevicesDto.class)
    private List<UserDevicesDto> userDevicess;

    public List<UserDevicesDto> getUserDevicesList()   {
        return this.userDevicess;
    }

    public void setUserDevicesList(List<UserDevicesDto> userDevicess)   {
        this.userDevicess = userDevicess;
    }
}