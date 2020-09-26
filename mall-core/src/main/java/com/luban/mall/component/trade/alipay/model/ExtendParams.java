package com.luban.mall.component.trade.alipay.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Author: 伯乐
 * @Date: 2019/5/20
 */
public class ExtendParams {
    // 系统商编号
    @SerializedName("sys_service_provider_id")
    private String sysServiceProviderId;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExtendParams{");
        sb.append("sysServiceProviderId='").append(sysServiceProviderId).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getSysServiceProviderId() {
        return sysServiceProviderId;
    }

    public ExtendParams setSysServiceProviderId(String sysServiceProviderId) {
        this.sysServiceProviderId = sysServiceProviderId;
        return this;
    }
}
