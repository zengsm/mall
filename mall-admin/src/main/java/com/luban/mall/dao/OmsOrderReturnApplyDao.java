package com.luban.mall.dao;

import com.luban.mall.dto.OmsOrderReturnApplyResult;
import com.luban.mall.dto.OmsReturnApplyQueryParam;
import com.luban.mall.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单退货申请自定义Dao
 * @Author: 伯乐
 * @Date: 2019/5/17
 */

public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}
