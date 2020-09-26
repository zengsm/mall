package com.luban.mall.service;

import com.luban.mall.domain.CartPromotionItem;
import com.luban.mall.model.OmsCartItem;

import java.util.List;

/**
 * 促销管理Service
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
