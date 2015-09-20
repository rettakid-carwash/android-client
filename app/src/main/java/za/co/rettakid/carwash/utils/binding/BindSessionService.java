package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindSessionService {

    public static SessionServiceVo bindSessionService(SessionServiceDto sessionServiceDto) {
        SessionServiceVo sessionServiceVo = null;
        if (sessionServiceDto != null)    {
            sessionServiceVo = new SessionServiceVo();
            sessionServiceVo.setRealSessionServiceId(sessionServiceDto.getSessionServiceId());
            sessionServiceVo.setRealSession(BindSession.bindSession(sessionServiceDto.getSession()));
            sessionServiceVo.setRealService(BindService.bindService(sessionServiceDto.getService()));
        }
        return sessionServiceVo;
    }

    public static SessionServiceDto bindSessionService(SessionServiceVo sessionServiceVo) {
        SessionServiceDto sessionServiceDto = null;
        if (sessionServiceVo != null)    {
            sessionServiceDto = new SessionServiceDto();
            sessionServiceDto.setSessionServiceId(sessionServiceVo.getRealSessionServiceId());
            sessionServiceDto.setSession(BindSession.bindSession(sessionServiceVo.getRealSession()));
            sessionServiceDto.setService(BindService.bindService(sessionServiceVo.getRealService()));
        }
        return sessionServiceDto;
    }

}
