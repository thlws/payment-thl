package org.thlws.payment.alipay.entity.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;

/**
 * 支付宝手机网页支付
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlipayMobileSiteRequest {

    /**业务参数*/
    private BizContent bizContent   ;

    /**同步返回地址*/
    private String returnUrl       ;

    /**异步通知地址*/
    private String notifyUrl       ;


    /**
     * The type Biz content.
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BizContent{

        @SerializedName("out_trade_no")
        private String outTradeNo  ;

        @SerializedName("total_amount")
        private String totalAmount  ;
        private String subject       ;
        @SerializedName("seller_id")
        private String sellerId     ;

        /***
         * 手机网站支付应该是固定 'QUICK_WAP_WAY'
         * @see <a href="https://docs.open.alipay.com/api_1/alipay.trade.wap.pay">https://docs.open.alipay.com/api_1/alipay.trade.wap.pay</a>
         */
        @SerializedName("product_code")
        private String productCode = "QUICK_WAP_WAY"  ;

    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
