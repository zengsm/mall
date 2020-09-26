package com.luban.mall.service;

import com.luban.mall.domain.CartPromotionItem;
import com.luban.mall.common.api.CommonResult;
import com.luban.mall.model.SmsCouponHistory;
import com.luban.mall.domain.SmsCouponHistoryDetail;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户优惠券管理Service
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface UmsMemberCouponService {
    /**
     * 会员添加优惠券
     */
    @Transactional
    CommonResult add(Long couponId);

    /**
     * 获取优惠券列表
     * @param useStatus 优惠券的使用状态
     */
    List<SmsCouponHistory> list(Integer useStatus);

    /**
     * 根据购物车信息获取可用优惠券
     */
    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type);
}
