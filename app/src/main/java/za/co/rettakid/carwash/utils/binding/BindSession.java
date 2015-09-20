package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindSession {

    public static SessionVo bindSession(SessionDto sessionDto) {
        SessionVo sessionVo = null;
        if (sessionDto != null)    {
            sessionVo = new SessionVo();
            sessionVo.setRealSessionId(sessionDto.getSessionId());
            sessionVo.setRealUser(BindUser.bindUser(sessionDto.getUser()));
            sessionVo.setRealSessionLocation(sessionDto.getSessionLocation());
            sessionVo.setRealEffFrom(sessionDto.getEffFrom());
            sessionVo.setRealEffTo(sessionDto.getEffTo());
        }
        return sessionVo;
    }

    public static SessionDto bindSession(SessionVo sessionVo) {
        SessionDto sessionDto = null;
        if (sessionVo != null)    {
            sessionDto = new SessionDto();
            sessionDto.setSessionId(sessionVo.getRealSessionId());
            sessionDto.setUser(BindUser.bindUser(sessionVo.getRealUser()));
            sessionDto.setSessionLocation(sessionVo.getRealSessionLocation());
            sessionDto.setEffFrom(sessionVo.getRealEffFrom());
            sessionDto.setEffTo(sessionVo.getRealEffTo());
        }
        return sessionDto;
    }

}
