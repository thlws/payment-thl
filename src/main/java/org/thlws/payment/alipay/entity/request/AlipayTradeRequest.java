package org.thlws.payment.alipay.entity.request;

import org.thlws.payment.alipay.trade.model.GoodsDetail;
import org.thlws.utils.JsonUtil;

import java.util.List;

/**
 * 支付宝当面付
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
public class AlipayTradeRequest {

    /**(必填) 商户网站订单系统中唯一订单号，64个字符以内，只能包含字母、数字、下划线*/
    private String outTradeNo;

    /**(必填) 订单标题，粗略描述用户的支付目的。如“xxx品牌xxx门店消费”*/
    private String subject;

    /** (必填) 订单总金额，单位为元，不能超过1亿元*/
    private String totalAmount;

    /**(必填) 付款条码，用户支付宝钱包手机app点击“付款”产生的付款条码*/
    private String authCode;

    /** (必填) 商户门店编号，通过门店号和商家后台可以配置精准到门店的折扣信息，详询支付宝技术支持*/
    private String storeId;


    /**
     *  (可选) 订单不可打折金额，可以配合商家平台配置折扣活动，如果酒水不参与打折，则将对应金额填写至此字段
     *  如果该值未传入,但传入了【订单总金额】,【打折金额】,则该值默认为【订单总金额】-【打折金额】
     */
    private String undiscountableAmount;

    /**(可选) 订单不可打折金额,与如上相反,与 undiscountableAmount 二选一*/
    private String discountableAmount;

    /***
     *  卖家支付宝账号ID，用于支持一个签约账号下支持打款到不同的收款账号，(打款到sellerId对应的支付宝账号)
     *  如果该字段为空，则默认为与支付宝签约的商户的PID，也就是appid对应的PID
     */
    private String sellerId;

    /** 商户操作员编号，添加此参数可以为商户操作员做销售统计*/
    private String operatorId;

    /**订单描述，可以对交易或商品进行一个详细地描述，比如填写"购买商品3件共20.00元"*/
    private String body;

    /**产品明细*/
    private List<GoodsDetail> goodsDetailList;

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
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * Sets store id.
     *
     * @param storeId the store id
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * Gets undiscountable amount.
     *
     * @return the undiscountable amount
     */
    public String getUndiscountableAmount() {
        return undiscountableAmount;
    }

    /**
     * Sets undiscountable amount.
     *
     * @param undiscountableAmount the undiscountable amount
     */
    public void setUndiscountableAmount(String undiscountableAmount) {
        this.undiscountableAmount = undiscountableAmount;
    }

    /**
     * Gets discountable amount.
     *
     * @return the discountable amount
     */
    public String getDiscountableAmount() {
        return discountableAmount;
    }

    /**
     * Sets discountable amount.
     *
     * @param discountableAmount the discountable amount
     */
    public void setDiscountableAmount(String discountableAmount) {
        this.discountableAmount = discountableAmount;
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
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets body.
     *
     * @param body the body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Gets goods detail list.
     *
     * @return the goods detail list
     */
    public List<GoodsDetail> getGoodsDetailList() {
        return goodsDetailList;
    }

    /**
     * Sets goods detail list.
     *
     * @param goodsDetailList the goods detail list
     */
    public void setGoodsDetailList(List<GoodsDetail> goodsDetailList) {
        this.goodsDetailList = goodsDetailList;
    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
