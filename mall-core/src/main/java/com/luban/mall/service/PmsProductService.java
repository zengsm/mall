package com.luban.mall.service;

import com.luban.mall.domain.FlashPromotionProduct;
import com.luban.mall.domain.PmsProductParam;

import java.util.List;

/**
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface PmsProductService {
    /**
     * add by bole
     * 获取商品详情信息
     * @param id 产品ID
     */
    PmsProductParam getProductInfo(Long id,Long flashPromotionId,Long flashPromotionSessionId);

    /**
     * 获取秒杀商品
     * @param pageSize 页大小
     * @param pageNum 页号
     * @param flashPromotionId 秒杀活动ID，关联秒杀活动设置
     * @param sessionId 场次活动ID，for example：13:00-14:00场等
     */
    List<FlashPromotionProduct> getFlashProductList(Integer pageSize, Integer pageNum, Long flashPromotionId, Long sessionId);
}
