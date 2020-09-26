package com.luban.mall.domain;

import com.luban.mall.model.SmsFlashPromotion;
import com.luban.mall.model.SmsFlashPromotionProductRelation;
import lombok.Data;
import java.util.List;

/**
 *  @Author: 伯乐
 * @Date: 2019/5/20
 **/
@Data
public class FlashPromotionParam extends SmsFlashPromotion {
    //一个产品只能与该秒杀活动的一个活动场次关联，比如参加了10点场，就不能再参加12点场
    private List<SmsFlashPromotionProductRelation> relation;
}
