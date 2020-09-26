package com.luban.mall.dao;

import com.luban.mall.domain.CartProduct;
import com.luban.mall.domain.PmsProductParam;
import com.luban.mall.domain.PromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 前台系统自定义商品Dao
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface PortalProductDao {
    CartProduct getCartProduct(@Param("id") Long id);
    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);


    /**
     * add by bole
     * 获取商品详情信息
     * @param id 产品ID
     */
    PmsProductParam getProductInfo(@Param("id") Long id,@Param("flashPromotionId") Long flashPromotionId,@Param("flashPromotionSessionId") Long flashPromotionSessionId);
}
