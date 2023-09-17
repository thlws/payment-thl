package org.thlws.payment.alipay.entity.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;


/**
 * 支付宝网站支付参数对象
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlipayWebSiteRequest {

    /**业务数据填充,json格式*/
    private BizContent bizContent   ;

    /**同步处理地址*/
    private String returnUrl       ;

    /**异步处理地址*/
    private String notifyUrl       ;


    /**
     * The type Biz content.
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BizContent{

        @SerializedName(value = "out_trade_no")
        private String outTradeNo  ;

        @SerializedName(value = "total_amount")
        private String totalAmount  ;
        private String subject       ;
        private String body          ;

        /***
         * 电脑网站支付应该是常量值'FAST_INSTANT_TRADE_PAY'
         * @see <a href="https://docs.open.alipay.com/api_1/alipay.trade.page.pay">https://docs.open.alipay.com/api_1/alipay.trade.page.pay</a>
         */
        @SerializedName(value = "product_code")
        private String productCode = "FAST_INSTANT_TRADE_PAY"  ;

    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
