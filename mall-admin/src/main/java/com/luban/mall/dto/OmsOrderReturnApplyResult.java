package com.luban.mall.dto;

import com.luban.mall.model.OmsCompanyAddress;
import com.luban.mall.model.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 * @Author: 伯乐
 * @Date: 2019/5/17
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
