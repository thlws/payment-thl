package org.thlws.payment.bestpay.api;

/**
 * 天翼支付相关API
 *
 * Created by HanleyTang on 2018/1/5
 *
 * @author Hanley[hanley@thlws.com]
 * @version 1.0
 */
public interface BestpayApi {

    /***
     * 扫码支付
     */
    String barcode = "https://webpaywg.bestpay.com.cn/barcode/placeOrder";

    /***
     * 订单查询
     */
    String query = "https://webpaywg.bestpay.com.cn/query/queryOrder";

    /**
     * 订单退款
     */
    String refund = "https://webpaywg.bestpay.com.cn/refund/commonRefund";

    /**
     * 撤销订单
     */
    String reverse = "https://webpaywg.bestpay.com.cn/reverse/reverse";


}
