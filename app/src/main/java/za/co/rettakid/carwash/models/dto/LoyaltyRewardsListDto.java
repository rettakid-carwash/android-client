package za.co.rettakid.carwash.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;

import java.util.Date;

@Root(name = "loyaltyrewardslistdto")
public class LoyaltyRewardsListDto   {

    @ElementList(name = "loyaltyrewardss",type = LoyaltyRewardsDto.class)
    private List<LoyaltyRewardsDto> loyaltyRewardss;

    public List<LoyaltyRewardsDto> getLoyaltyRewardsList()   {
        return this.loyaltyRewardss;
    }

    public void setLoyaltyRewardsList(List<LoyaltyRewardsDto> loyaltyRewardss)   {
        this.loyaltyRewardss = loyaltyRewardss;
    }
}