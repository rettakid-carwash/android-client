package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "datacontentdto")
public class DataContentDto implements Serializable    {


    @Element(name = "datacontentid" , required = false)
    private Long dataContentId;

    @Element(name = "datacontentdata")
    private String dataContentData;


    public Long getDataContentId()   {
        return this.dataContentId;
    }

    public void setDataContentId(Long dataContentId)   {
        this.dataContentId = dataContentId;
    }

    public String getDataContentData()   {
        return this.dataContentData;
    }

    public void setDataContentData(String dataContentData)   {
        this.dataContentData = dataContentData;
    }

}