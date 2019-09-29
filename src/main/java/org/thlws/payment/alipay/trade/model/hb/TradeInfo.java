package org.thlws.payment.alipay.trade.model.hb;

/**
 * Created by liuyangkly on 15/9/28.
 */
public interface TradeInfo {
    /**
     * 获取交易状态
     *
     * @return the status
     */
     HbStatus getStatus();

    /**
     * 获取交易时间
     *
     * @return the time consume
     */
     double getTimeConsume();
}
