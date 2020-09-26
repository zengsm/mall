package com.luban.mall.dao;

import com.luban.mall.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

/**
 * 优惠券管理自定义查询Dao
 * @Author: 伯乐
 * @Date: 2019/5/17
 */
public interface SmsCouponDao {
    SmsCouponParam getItem(@Param("id") Long id);
}
