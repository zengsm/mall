package com.luban.mall.dao;

import com.luban.mall.model.OmsOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单商品信息自定义Dao
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface PortalOrderItemDao {
    int insertList(@Param("list") List<OmsOrderItem> list);
}
