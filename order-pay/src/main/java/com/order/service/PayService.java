package com.order.service;

import com.order.domain.OrderDetail;

/**
 * @Description:订单支付接口
 * @Author: 伯乐
 * @Date: 2020/6/11 20:05
 */
public interface PayService {

    //生成支付二维码
    String genQrCode(OrderDetail orderDetail);
   //查询支付状态
    String payQuery(String orderNo);
}
