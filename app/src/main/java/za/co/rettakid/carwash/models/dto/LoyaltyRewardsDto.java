package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;

import java.util.Date;

@Root(name = "loyaltyrewardsdto")
public class LoyaltyRewardsDto implements Serializable    {


    @Element(name = "rewardsid" , required = false)
    private Long rewardsId;

    @Element(name = "rewardsname")
    private String rewardsName;

    @Element(name = "rewardsdescr")
    private String rewardsDescr;

    @Element(name = "rewardsamount")
    private Long rewardsAmount;

    @Element(name = "efffrom")
    private Date effFrom;

    @Element(name = "effto")
    private Date effTo;


    public Long getRewardsId()   {
        return this.rewardsId;
    }

    public void setRewardsId(Long rewardsId)   {
        this.rewardsId = rewardsId;
    }

    public String getRewardsName()   {
        return this.rewardsName;
    }

    public void setRewardsName(String rewardsName)   {
        this.rewardsName = rewardsName;
    }

    public String getRewardsDescr()   {
        return this.rewardsDescr;
    }

    public void setRewardsDescr(String rewardsDescr)   {
        this.rewardsDescr = rewardsDescr;
    }

    public Long getRewardsAmount()   {
        return this.rewardsAmount;
    }

    public void setRewardsAmount(Long rewardsAmount)   {
        this.rewardsAmount = rewardsAmount;
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