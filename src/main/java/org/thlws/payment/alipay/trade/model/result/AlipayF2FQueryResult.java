package org.thlws.payment.alipay.trade.model.result;

import com.alipay.api.response.AlipayTradeQueryResponse;
import org.thlws.payment.alipay.trade.model.TradeStatus;

/**
 *
 * @author liuyangkly
 * @date 15/8/27
 */
public class AlipayF2FQueryResult implements Result {

    private TradeStatus tradeStatus;
    private AlipayTradeQueryResponse response;

    /**
     * Instantiates a new Alipay f 2 f query result.
     *
     * @param response the response
     */
    public AlipayF2FQueryResult(AlipayTradeQueryResponse response) {
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
    public void setResponse(AlipayTradeQueryResponse response) {
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
    public AlipayTradeQueryResponse getResponse() {
        return response;
    }

    @Override
    public boolean isTradeSuccess() {
        return response != null &&
                TradeStatus.SUCCESS.equals(tradeStatus);
    }
}
