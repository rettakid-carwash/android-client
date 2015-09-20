package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "devicestypelistdto")
public class DevicesTypeListDto   {

    @ElementList(name = "devicestypes",type = DevicesTypeDto.class)
    private List<DevicesTypeDto> devicesTypes;

    public List<DevicesTypeDto> getDevicesTypeList()   {
        return this.devicesTypes;
    }

    public void setDevicesTypeList(List<DevicesTypeDto> devicesTypes)   {
        this.devicesTypes = devicesTypes;
    }
}