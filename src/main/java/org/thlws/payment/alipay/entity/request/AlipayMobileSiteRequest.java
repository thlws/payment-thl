package org.thlws.payment.alipay.entity.request;

import com.google.gson.annotations.SerializedName;
import org.thlws.utils.JsonUtil;

/**
 * 支付宝手机网页支付
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
public class AlipayMobileSiteRequest {

    /**业务参数*/
    private BizContent bizContent   ;

    /**同步返回地址*/
    private String returnUrl       ;

    /**异步通知地址*/
    private String notifyUrl       ;

    /**
     * Gets biz content.
     *
     * @return the biz content
     */
    public BizContent getBizContent() {
        return bizContent;
    }

    /**
     * Sets biz content.
     *
     * @param bizContent the biz content
     */
    public void setBizContent(BizContent bizContent) {
        this.bizContent = bizContent;
    }

    /**
     * Gets return url.
     *
     * @return the return url
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Sets return url.
     *
     * @param returnUrl the return url
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * Gets notify url.
     *
     * @return the notify url
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Sets notify url.
     *
     * @param notifyUrl the notify url
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * The type Biz content.
     */
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


        /**
         * Gets out trade no.
         *
         * @return the out trade no
         */
        public String getOutTradeNo() {
            return outTradeNo;
        }

        /**
         * Sets out trade no.
         *
         * @param outTradeNo the out trade no
         */
        public void setOutTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
        }

        /**
         * Gets total amount.
         *
         * @return the total amount
         */
        public String getTotalAmount() {
            return totalAmount;
        }

        /**
         * Sets total amount.
         *
         * @param totalAmount the total amount
         */
        public void setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
        }

        /**
         * Gets subject.
         *
         * @return the subject
         */
        public String getSubject() {
            return subject;
        }

        /**
         * Sets subject.
         *
         * @param subject the subject
         */
        public void setSubject(String subject) {
            this.subject = subject;
        }

        /**
         * Gets seller id.
         *
         * @return the seller id
         */
        public String getSellerId() {
            return sellerId;
        }

        /**
         * Sets seller id.
         *
         * @param sellerId the seller id
         */
        public void setSellerId(String sellerId) {
            this.sellerId = sellerId;
        }

        /**
         * Gets product code.
         *
         * @return the product code
         */
        public String getProductCode() {
            return productCode;
        }

    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
