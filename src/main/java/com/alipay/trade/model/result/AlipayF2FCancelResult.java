package com.alipay.trade.model.result;

import com.alipay.api.response.AlipayTradeCancelResponse;
import com.alipay.trade.model.TradeStatus;

/**
 * Created by HanleyTang on 2017/3/7.
 */
public class AlipayF2FCancelResult implements Result {

    private TradeStatus tradeStatus;
    private AlipayTradeCancelResponse response;

    /**
     * Instantiates a new Alipay f 2 f cancel result.
     *
     * @param response the response
     */
    public AlipayF2FCancelResult(AlipayTradeCancelResponse response) {
        this.response = response;
    }

    /**
     * Gets trade status.
     *
     * @return the trade status
     */
    public TradeStatus getTradeStatus() {
        return tradeStatus;
    }

    /**
     * Sets trade status.
     *
     * @param tradeStatus the trade status
     */
    public void setTradeStatus(TradeStatus tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    /**
     * Gets response.
     *
     * @return the response
     */
    public AlipayTradeCancelResponse getResponse() {
        return response;
    }

    /**
     * Sets response.
     *
     * @param response the response
     */
    public void setResponse(AlipayTradeCancelResponse response) {
        this.response = response;
    }


    @Override
    public boolean isTradeSuccess() {
        return response != null &&
                TradeStatus.SUCCESS.equals(tradeStatus);
    }
}
