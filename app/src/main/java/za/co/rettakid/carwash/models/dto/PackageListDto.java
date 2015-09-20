package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;

import java.util.Date;

@Root(name = "packagelistdto")
public class PackageListDto   {

    @ElementList(name = "packages",type = PackageDto.class)
    private List<PackageDto> packages;

    public List<PackageDto> getPackageList()   {
        return this.packages;
    }

    public void setPackageList(List<PackageDto> packages)   {
        this.packages = packages;
    }
}