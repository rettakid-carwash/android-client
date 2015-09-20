package za.co.rettakid.carwash.network;

import android.content.Context;
import za.co.rettakid.carwash.models.dto.*;

public class LoyaltyRewardsClient extends BaseClient   {

    public LoyaltyRewardsClient(Context context) {
        super("/loyaltyrewardss",context);
    }

    public LoyaltyRewardsListDto getLoyaltyRewardss()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, LoyaltyRewardsListDto.class);
    }

    public LoyaltyRewardsDto getLoyaltyRewardss(Long rewardsId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, LoyaltyRewardsDto.class,rewardsId);
    }

    public LoyaltyRewardsDto postLoyaltyRewards(LoyaltyRewardsDto loyaltyRewardsDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, loyaltyRewardsDto, LoyaltyRewardsDto.class);
    }

    public LoyaltyRewardsListDto postLoyaltyRewards(LoyaltyRewardsListDto loyaltyRewardsListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, loyaltyRewardsListDto, LoyaltyRewardsListDto.class);
    }

    public void putLoyaltyRewards(LoyaltyRewardsDto loyaltyRewardsDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, loyaltyRewardsDto, LoyaltyRewardsDto.class,loyaltyRewardsDto.getRewardsId());
    }

    public void deleteLoyaltyRewards(Long rewardsId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,rewardsId);
    }

}