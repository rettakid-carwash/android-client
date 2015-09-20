package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindNews {

    public static NewsVo bindNews(NewsDto newsDto) {
        NewsVo newsVo = null;
        if (newsDto != null)    {
            newsVo = new NewsVo();
            newsVo.setRealNewsId(newsDto.getNewsId());
            newsVo.setRealNewsHeading(newsDto.getNewsHeading());
            newsVo.setRealDataContent(BindDataContent.bindDataContent(newsDto.getDataContent()));
            newsVo.setRealNewsDate(newsDto.getNewsDate());
        }
        return newsVo;
    }

    public static NewsDto bindNews(NewsVo newsVo) {
        NewsDto newsDto = null;
        if (newsVo != null)    {
            newsDto = new NewsDto();
            newsDto.setNewsId(newsVo.getRealNewsId());
            newsDto.setNewsHeading(newsVo.getRealNewsHeading());
            newsDto.setDataContent(BindDataContent.bindDataContent(newsVo.getRealDataContent()));
            newsDto.setNewsDate(newsVo.getRealNewsDate());
        }
        return newsDto;
    }

}
