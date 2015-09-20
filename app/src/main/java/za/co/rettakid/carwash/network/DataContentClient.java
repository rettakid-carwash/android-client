package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class DataContentClient extends BaseClient   {

    public DataContentClient(Context context) {
        super("/datacontents",context);
    }

    public DataContentListDto getDataContents()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, DataContentListDto.class);
    }

    public DataContentDto getDataContents(Long dataContentId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, DataContentDto.class,dataContentId);
    }

    public DataContentDto postDataContent(DataContentDto dataContentDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, dataContentDto, DataContentDto.class);
    }

    public DataContentListDto postDataContent(DataContentListDto dataContentListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, dataContentListDto, DataContentListDto.class);
    }

    public void putDataContent(DataContentDto dataContentDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, dataContentDto, DataContentDto.class,dataContentDto.getDataContentId());
    }

    public void deleteDataContent(Long dataContentId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,dataContentId);
    }

}