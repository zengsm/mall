package com.luban.mall.service;

import com.luban.mall.domain.OmsOrderReturnApplyParam;

/**
 * 订单退货管理Service
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
