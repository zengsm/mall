package com.luban.mall.domain;

import com.luban.mall.model.OmsOrder;
import com.luban.mall.model.OmsOrderItem;

import java.util.List;

/**
 * 包含订单商品信息的订单详情
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public class OmsOrderDetail extends OmsOrder {
    private List<OmsOrderItem> orderItemList;

    public List<OmsOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
