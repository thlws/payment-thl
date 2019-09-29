package org.thlws.payment.alipay.trade.model.result;

import com.alipay.api.response.AlipayTradePayResponse;
import org.thlws.payment.alipay.trade.model.TradeStatus;

/**
 *
 * @author liuyangkly
 * @date 15/8/26
 */
public class AlipayF2FPayResult implements Result {

    private TradeStatus tradeStatus;
    private AlipayTradePayResponse response;

    /**
     * Instantiates a new Alipay f 2 f pay result.
     *
     * @param response the response
     */
    public AlipayF2FPayResult(AlipayTradePayResponse response) {
        this.response = response;
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
     * Sets response.
     *
     * @param response the response
     */
    public void setResponse(AlipayTradePayResponse response) {
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
     * Gets response.
     *
     * @return the response
     */
    public AlipayTradePayResponse getResponse() {
        return response;
    }

    @Override
    public boolean isTradeSuccess() {
        return response != null &&
                TradeStatus.SUCCESS.equals(tradeStatus);
    }
}
