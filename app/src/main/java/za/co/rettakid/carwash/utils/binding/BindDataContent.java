package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindDataContent {

    public static DataContentVo bindDataContent(DataContentDto dataContentDto) {
        DataContentVo dataContentVo = null;
        if (dataContentDto != null)    {
            dataContentVo = new DataContentVo();
            dataContentVo.setRealDataContentId(dataContentDto.getDataContentId());
            dataContentVo.setRealDataContentData(dataContentDto.getDataContentData());
        }
        return dataContentVo;
    }

    public static DataContentDto bindDataContent(DataContentVo dataContentVo) {
        DataContentDto dataContentDto = null;
        if (dataContentVo != null)    {
            dataContentDto = new DataContentDto();
            dataContentDto.setDataContentId(dataContentVo.getRealDataContentId());
            dataContentDto.setDataContentData(dataContentVo.getRealDataContentData());
        }
        return dataContentDto;
    }

}
