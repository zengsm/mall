package com.luban.mall.component.trade.alipay.model.hb;

/**
 * @Author: 伯乐
 * @Date: 2019/5/20
 */
public interface TradeInfo {
    // 获取交易状态
    public HbStatus getStatus();

    // 获取交易时间
    public double getTimeConsume();
}
