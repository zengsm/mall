package com.luban.mall.dao;

import com.luban.mall.dto.OmsOrderDeliveryParam;
import com.luban.mall.dto.OmsOrderDetail;
import com.luban.mall.dto.OmsOrderQueryParam;
import com.luban.mall.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单自定义查询Dao
 * @Author: 伯乐
 * @Date: 2019/5/17
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
