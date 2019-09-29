package org.thlws.payment.alipay.trade.model.result;

import com.alipay.api.response.AlipayTradePrecreateResponse;
import org.thlws.payment.alipay.trade.model.TradeStatus;

/**
 *
 * @author liuyangkly
 * @date 15/8/27
 */
public class AlipayF2FPrecreateResult implements Result {

    private TradeStatus tradeStatus;
    private AlipayTradePrecreateResponse response;

    /**
     * Instantiates a new Alipay f 2 f precreate result.
     *
     * @param response the response
     */
    public AlipayF2FPrecreateResult(AlipayTradePrecreateResponse response) {
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
    public void setResponse(AlipayTradePrecreateResponse response) {
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
    public AlipayTradePrecreateResponse getResponse() {
        return response;
    }

    @Override
    public boolean isTradeSuccess() {
        return response != null &&
                TradeStatus.SUCCESS.equals(tradeStatus);
    }
}
