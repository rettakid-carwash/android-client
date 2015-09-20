package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;

import java.util.Date;

@Root(name = "newsdto")
public class NewsDto implements Serializable    {


    @Element(name = "newsid" , required = false)
    private Long newsId;

    @Element(name = "newsheading")
    private String newsHeading;

    @Element(name = "datacontentdto")
    private DataContentDto dataContent;

    @Element(name = "newsdate")
    private Date newsDate;


    public Long getNewsId()   {
        return this.newsId;
    }

    public void setNewsId(Long newsId)   {
        this.newsId = newsId;
    }

    public String getNewsHeading()   {
        return this.newsHeading;
    }

    public void setNewsHeading(String newsHeading)   {
        this.newsHeading = newsHeading;
    }

    public DataContentDto getDataContent()   {
        return this.dataContent;
    }

    public void setDataContent(DataContentDto dataContent)   {
        this.dataContent = dataContent;
    }

    public Date getNewsDate()   {
        return this.newsDate;
    }

    public void setNewsDate(Date newsDate)   {
        this.newsDate = newsDate;
    }

}