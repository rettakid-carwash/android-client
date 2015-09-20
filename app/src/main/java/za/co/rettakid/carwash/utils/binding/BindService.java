package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindService {

    public static ServiceVo bindService(ServiceDto serviceDto) {
        ServiceVo serviceVo = null;
        if (serviceDto != null)    {
            serviceVo = new ServiceVo();
            serviceVo.setRealServiceId(serviceDto.getServiceId());
            serviceVo.setRealServiceAmount(serviceDto.getServiceAmount());
            serviceVo.setRealServiceLoyaltyPoints(serviceDto.getServiceLoyaltyPoints());
            serviceVo.setRealServiceName(serviceDto.getServiceName());
            serviceVo.setRealServiceDescr(serviceDto.getServiceDescr());
            serviceVo.setRealIcon(BindIcon.bindIcon(serviceDto.getIcon()));
            serviceVo.setRealEffFrom(serviceDto.getEffFrom());
            serviceVo.setRealEffTo(serviceDto.getEffTo());
        }
        return serviceVo;
    }

    public static ServiceDto bindService(ServiceVo serviceVo) {
        ServiceDto serviceDto = null;
        if (serviceVo != null)    {
            serviceDto = new ServiceDto();
            serviceDto.setServiceId(serviceVo.getRealServiceId());
            serviceDto.setServiceAmount(serviceVo.getRealServiceAmount());
            serviceDto.setServiceLoyaltyPoints(serviceVo.getRealServiceLoyaltyPoints());
            serviceDto.setServiceName(serviceVo.getRealServiceName());
            serviceDto.setServiceDescr(serviceVo.getRealServiceDescr());
            serviceDto.setIcon(BindIcon.bindIcon(serviceVo.getRealIcon()));
            serviceDto.setEffFrom(serviceVo.getRealEffFrom());
            serviceDto.setEffTo(serviceVo.getRealEffTo());
        }
        return serviceDto;
    }

}
