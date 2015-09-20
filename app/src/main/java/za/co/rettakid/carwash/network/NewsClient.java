package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class NewsClient extends BaseClient   {

    public NewsClient(Context context) {
        super("/newss",context);
    }

    public NewsListDto getNewss()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, NewsListDto.class);
    }

    public NewsDto getNewss(Long newsId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, NewsDto.class,newsId);
    }

    public NewsDto postNews(NewsDto newsDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, newsDto, NewsDto.class);
    }

    public NewsListDto postNews(NewsListDto newsListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, newsListDto, NewsListDto.class);
    }

    public void putNews(NewsDto newsDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, newsDto, NewsDto.class,newsDto.getNewsId());
    }

    public void deleteNews(Long newsId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,newsId);
    }

}