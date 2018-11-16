package org.thlws.payment.alipay.entity.request;

import org.thlws.utils.JsonUtil;

/**
 * 支付宝手机网页支付
 * @author hanley@thlws.com
 * @date 2018/11/16
 */
public class AlipayMobileSiteRequest {

    /**业务参数*/
    private BizContent bizContent   ;

    /**同步返回地址*/
    private String returnUrl       ;

    /**异步通知地址*/
    private String notifyUrl       ;

    public BizContent getBizContent() {
        return bizContent;
    }

    public void setBizContent(BizContent bizContent) {
        this.bizContent = bizContent;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public static class BizContent{

        private String outTradeNo  ;
        private String totalAmount  ;
        private String subject       ;
        private String sellerId     ;
        private String productCode  ;


        public String getOutTradeNo() {
            return outTradeNo;
        }

        public void setOutTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
        }

        public String getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getSellerId() {
            return sellerId;
        }

        public void setSellerId(String sellerId) {
            this.sellerId = sellerId;
        }

        public String getProductCode() {
            return productCode;
        }

        public void setProductCode(String productCode) {
            this.productCode = productCode;
        }
    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
