package org.thlws.payment.alipay.entity.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;

/**
 * 支付宝退款
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlipayRefundRequest {

    /**支付宝交易号,tradeNo| outTradeNo二选一*/
    private String tradeNo;

    /**(特殊 tradeNo| outTradeNo二选一) 商户网站订单系统中唯一订单号，64个字符以内，只能包含字母、数字、下划线*/
    private String outTradeNo;

    /**(必填)退款金额*/
    private String refundAmount;

    /**(选填) 商户门店编号，通过门店号和商家后台可以配置精准到门店的折扣信息，详询支付宝技术支持*/
    private String storeId;

    /**(选填) 退款理由*/
    private String refundReason;

    /**可选,部分退款时 必须*/
    private String outRequestNo;

    private String terminalId;

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
