package org.thlws.payment.alipay.trade.model.result;

import com.alipay.api.response.AlipayTradeRefundResponse;
import org.thlws.payment.alipay.trade.model.TradeStatus;

/**
 *
 * @author liuyangkly
 * date15/8/27
 */
public class AlipayF2FRefundResult implements Result {

    private TradeStatus tradeStatus;
    private AlipayTradeRefundResponse response;

    /**
     * Instantiates a new Alipay f 2 f refund result.
     *
     * @param response the response
     */
    public AlipayF2FRefundResult(AlipayTradeRefundResponse response) {
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
    public void setResponse(AlipayTradeRefundResponse response) {
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
    public AlipayTradeRefundResponse getResponse() {
        return response;
    }

    @Override
    public boolean isTradeSuccess() {
        return response != null &&
                TradeStatus.SUCCESS.equals(tradeStatus);
    }
}
