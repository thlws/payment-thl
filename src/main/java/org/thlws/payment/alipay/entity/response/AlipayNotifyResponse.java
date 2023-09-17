package org.thlws.payment.alipay.entity.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 支付异步通知,核心返回参数
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlipayNotifyResponse {


    /**验证是否成功 true 成功,false 失败*/
    private boolean verifyFlg;

    /**商户订单号*/
    private String outTradeNo;

    /**支付宝交易号*/
    private String tradeNo;

    /***
     * WAIT_BUYER_PAY	交易创建，等待买家付款
     * TRADE_CLOSED	    未付款交易超时关闭，或支付完成后全额退款
     * TRADESUCCESS	    交易支付成功
     * TRADEFINISHED	交易结束，不可退款
     */
    private String tradeStatus;

}
