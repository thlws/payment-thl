package com.alipay.trade.model.hb;

/**
 * Created by liuyangkly on 15/9/28.
 */
public interface TradeInfo {
    /**
     * Gets status.
     *
     * @return the status
     */
// 获取交易状态
    public HbStatus getStatus();

    /**
     * Gets time consume.
     *
     * @return the time consume
     */
// 获取交易时间
    public double getTimeConsume();
}
