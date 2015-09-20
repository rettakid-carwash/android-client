package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;

import java.util.Date;

@Root(name = "newslistdto")
public class NewsListDto   {

    @ElementList(name = "newss",type = NewsDto.class)
    private List<NewsDto> newss;

    public List<NewsDto> getNewsList()   {
        return this.newss;
    }

    public void setNewsList(List<NewsDto> newss)   {
        this.newss = newss;
    }
}