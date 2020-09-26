package com.luban.mall.service;

import com.luban.mall.common.api.CommonResult;

/**
 * @description: 交易服务
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface TradeService {

    /**
     * 根据订单生成支付二维码
     * @param orderId
     * @param payType
     * @return
     */
    CommonResult tradeQrCode(Long orderId, Integer payType);

    /**
     * 查询订单支付状态
     * @param orderId
     * @return
     */
    CommonResult tradeStatusQuery(Long orderId, Integer payType);
}
