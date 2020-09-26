package com.luban.mall.service;

import com.luban.mall.domain.CartProduct;
import com.luban.mall.domain.CartPromotionItem;
import com.luban.mall.common.exception.BusinessException;
import com.luban.mall.model.OmsCartItem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 购物车管理Service
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface OmsCartItemService {
    /**
     * 查询购物车中是否包含该商品，有增加数量，无添加到购物车
     */
    @Transactional
    int add(OmsCartItem cartItem);

    /**
     * 购物车产品数量
     */
    Long cartItemCount();

    /**
     * 根据会员编号获取购物车列表
     */
    List<OmsCartItem> list(Long memberId);

    /**
     * 获取被选择的包含促销活动信息的购物车列表
     * add by bole
     * @param memberId
     * @param itemIds
     * @return
     */
    List<CartPromotionItem> listSelectedPromotion(Long memberId, List<Long> itemIds) throws BusinessException;

    /**
     * 获取包含促销活动信息的购物车列表
     */
    List<CartPromotionItem> listPromotion(Long memberId);

    /**
     * 修改某个购物车商品的数量
     */
    int updateQuantity(Long id, Long memberId, Integer quantity);

    /**
     * 批量删除购物车中的商品
     */
    int delete(Long memberId,List<Long> ids);

    /**
     *获取购物车中用于选择商品规格的商品信息
     */
    CartProduct getCartProduct(Long productId);

    /**
     * 修改购物车中商品的规格
     */
    @Transactional
    int updateAttr(OmsCartItem cartItem);

    /**
     * 清空购物车
     */
    int clear(Long memberId);
}
