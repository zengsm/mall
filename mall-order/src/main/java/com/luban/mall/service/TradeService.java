package com.luban.mall.service;

import com.luban.mall.common.exception.BusinessException;
import com.luban.mall.domain.OrderDetail;

public interface TradeService {

    /**
     * 根据订单生成支付二维码，本质就是去alipay下订单
     * @param orderDetail
     */
    String tradeQrCode(OrderDetail orderDetail) throws BusinessException;

    /**
     * 查询订单支付状态
     * @param orderSn
     * @return
     */
    String alipayTradeQuery(String orderSn) throws Exception;
}
