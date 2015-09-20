package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "datacontentlistdto")
public class DataContentListDto   {

    @ElementList(name = "datacontents",type = DataContentDto.class)
    private List<DataContentDto> dataContents;

    public List<DataContentDto> getDataContentList()   {
        return this.dataContents;
    }

    public void setDataContentList(List<DataContentDto> dataContents)   {
        this.dataContents = dataContents;
    }
}