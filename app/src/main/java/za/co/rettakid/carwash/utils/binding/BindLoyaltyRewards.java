package za.co.rettakid.carwash.utils.binding;

import za.co.rettakid.carwash.models.dto.*;
import za.co.rettakid.carwash.models.vo.*;

public class BindLoyaltyRewards {

    public static LoyaltyRewardsVo bindLoyaltyRewards(LoyaltyRewardsDto loyaltyRewardsDto) {
        LoyaltyRewardsVo loyaltyRewardsVo = null;
        if (loyaltyRewardsDto != null)    {
            loyaltyRewardsVo = new LoyaltyRewardsVo();
            loyaltyRewardsVo.setRealRewardsId(loyaltyRewardsDto.getRewardsId());
            loyaltyRewardsVo.setRealRewardsName(loyaltyRewardsDto.getRewardsName());
            loyaltyRewardsVo.setRealRewardsDescr(loyaltyRewardsDto.getRewardsDescr());
            loyaltyRewardsVo.setRealRewardsAmount(loyaltyRewardsDto.getRewardsAmount());
            loyaltyRewardsVo.setRealEffFrom(loyaltyRewardsDto.getEffFrom());
            loyaltyRewardsVo.setRealEffTo(loyaltyRewardsDto.getEffTo());
        }
        return loyaltyRewardsVo;
    }

    public static LoyaltyRewardsDto bindLoyaltyRewards(LoyaltyRewardsVo loyaltyRewardsVo) {
        LoyaltyRewardsDto loyaltyRewardsDto = null;
        if (loyaltyRewardsVo != null)    {
            loyaltyRewardsDto = new LoyaltyRewardsDto();
            loyaltyRewardsDto.setRewardsId(loyaltyRewardsVo.getRealRewardsId());
            loyaltyRewardsDto.setRewardsName(loyaltyRewardsVo.getRealRewardsName());
            loyaltyRewardsDto.setRewardsDescr(loyaltyRewardsVo.getRealRewardsDescr());
            loyaltyRewardsDto.setRewardsAmount(loyaltyRewardsVo.getRealRewardsAmount());
            loyaltyRewardsDto.setEffFrom(loyaltyRewardsVo.getRealEffFrom());
            loyaltyRewardsDto.setEffTo(loyaltyRewardsVo.getRealEffTo());
        }
        return loyaltyRewardsDto;
    }

}
