package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;

import java.util.Date;

@Root(name = "packagedto")
public class PackageDto implements Serializable    {


    @Element(name = "packageid" , required = false)
    private Long packageId;

    @Element(name = "packagename")
    private String packageName;

    @Element(name = "packageamount")
    private Float packageAmount;

    @Element(name = "packagedescr")
    private String packageDescr;

    @Element(name = "efffrom")
    private Date effFrom;

    @Element(name = "effto")
    private Date effTo;


    public Long getPackageId()   {
        return this.packageId;
    }

    public void setPackageId(Long packageId)   {
        this.packageId = packageId;
    }

    public String getPackageName()   {
        return this.packageName;
    }

    public void setPackageName(String packageName)   {
        this.packageName = packageName;
    }

    public Float getPackageAmount()   {
        return this.packageAmount;
    }

    public void setPackageAmount(Float packageAmount)   {
        this.packageAmount = packageAmount;
    }

    public String getPackageDescr()   {
        return this.packageDescr;
    }

    public void setPackageDescr(String packageDescr)   {
        this.packageDescr = packageDescr;
    }

    public Date getEffFrom()   {
        return this.effFrom;
    }

    public void setEffFrom(Date effFrom)   {
        this.effFrom = effFrom;
    }

    public Date getEffTo()   {
        return this.effTo;
    }

    public void setEffTo(Date effTo)   {
        this.effTo = effTo;
    }

}