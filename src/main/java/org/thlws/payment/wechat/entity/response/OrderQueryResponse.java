package org.thlws.payment.wechat.entity.response;

import org.thlws.payment.wechat.entity.WechatResponse;
import org.thlws.utils.JsonUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 微信订单查询结果对象
 *
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderQueryResponse extends WechatResponse {

    /**公众账号ID*/
    @XmlElement(name="appid")
    private String appId;

    /**商户号*/
    @XmlElement(name="mch_id")
    private String mchId;

    /**随机字符串	*/
    @XmlElement(name="nonce_str")
    private String nonceStr;

    /**签名*/
    @XmlElement(name="sign")
    private String sign;

    /**设备号,微信支付分配的终端设备号*/
    @XmlElement(name="device_info")
    private String deviceInfo;

    /**用户在商户appid下的唯一标识*/
    @XmlElement(name="openid")
    private String openId;

    /**是否关注公众账号*/
    @XmlElement(name="is_subscribe")
    private String isSubscribe;

    /**交易类型 JSAPI--公众号支付、NATIVE--原生扫码支付、APP--app支付、MWEB--H5支付、MICROPAY--刷卡支付<br>
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/micropay_sl.php?chapter=4_2">https://pay.weixin.qq.com/wiki/doc/api/micropay_sl.php?chapter=4_2</a>
     * */
    @XmlElement(name="trade_type")
    private String tradeType;

    /**交易状态 <br>
     * <ol>
     *    <li>SUCCESS—支付成功</li>
     *    <li>REFUND—转入退款</li>
     *    <li>NOTPAY—未支付</li>
     *    <li>CLOSED—已关闭</li>
     *    <li>REVOKED—已撤销(刷卡支付)</li>
     *    <li>USERPAYING--用户支付中</li>
     *    <li>PAYERROR--支付失败(其他原因，如银行返回失败)</li>
     * </ol>
     * */
    @XmlElement(name="trade_state")
    private String tradeState;

    /**付款银行 <br>
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/micropay_sl.php?chapter=4_2#8">https://pay.weixin.qq.com/wiki/doc/api/micropay_sl.php?chapter=4_2#8</a>
     * */
    @XmlElement(name="bank_type")
    private String bankType;

    /**订单总金额，单位为分*/
    @XmlElement(name="total_fee")
    private String totalFee;

    /***/
    @XmlElement(name="settlement_total_fee")
    private String settlementTotalFee;

    /**货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY<br>
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/micropay_sl.php?chapter=4_2#4">https://pay.weixin.qq.com/wiki/doc/api/micropay_sl.php?chapter=4_2#4</a>
     * */
    @XmlElement(name="fee_type")
    private String feeType;

    /**订单现金支付金额*/
    @XmlElement(name="cash_fee")
    private String cashFee;

    /**现金支付货币类型,默认人民币：CNY*/
    @XmlElement(name="cash_fee_type")
    private String cashFeeType;

    /**代金券金额	,“代金券或立减优惠”金额<=订单总金额，订单总金额-“代金券或立减优惠”金额=现金支付金额*/
    @XmlElement(name="coupon_fee")
    private String couponFee;

    /**代金券或立减优惠使用数量*/
    @XmlElement(name="coupon_count")
    private String couponCount;

    /**微信支付订单号*/
    @XmlElement(name="transaction_id")
    private String transactionTd;

    /**
     * 商户订单号
     */
    @XmlElement(name = "out_trade_no")
    private String outTradeNo;

    /**商家数据包，原样返回*/
    @XmlElement(name = "attach")
    private String attach;

    /**支付完成时间*/
    @XmlElement(name = "time_end")
    private String timeEnd;

    /**交易状态描述*/
    @XmlElement(name = "trade_state_desc")
    private String tradeStateDesc;

    /**子商户公众账号ID*/
    @XmlElement(name = "sub_appid")
    private String subAppId;

    /**子商户号*/
    @XmlElement(name = "sub_mch_id")
    private String subMchId;

//    private String coupon_batch_id_$n;
//    private String coupon_type_$n;
//    private String coupon_id_$n;
//    private String coupon_fee_$n;

    /**代金券类型-0*/
    @XmlElement(name = "coupon_type_0")
    private String couponType0;

    /**代金券类型-1*/
    @XmlElement(name = "coupon_type_1")
    private String couponType1;

    /**代金券类型-2*/
    @XmlElement(name = "coupon_type_2")
    private String couponType2;

    /**代金券ID-0*/
    @XmlElement(name = "coupon_id_0")
    private String couponId0;

    /**代金券ID-1*/
    @XmlElement(name = "coupon_id_1")
    private String couponId1;

    /**代金券ID-2*/
    @XmlElement(name = "coupon_id_2")
    private String couponId2;

    /**单个代金券金额-0*/
    @XmlElement(name = "coupon_fee_0")
    private String couponFee0;

    /**单个代金券金额-1*/
    @XmlElement(name = "coupon_fee_1")
    private String couponFee1;

    /**单个代金券金额-2*/
    @XmlElement(name = "coupon_fee_2")
    private String couponFee2;

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }

    /**
     * Instantiates a new Order query response.
     */
    public OrderQueryResponse() {
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeState() {
        return tradeState;
    }

    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getSettlementTotalFee() {
        return settlementTotalFee;
    }

    public void setSettlementTotalFee(String settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getCashFee() {
        return cashFee;
    }

    public void setCashFee(String cashFee) {
        this.cashFee = cashFee;
    }

    public String getCashFeeType() {
        return cashFeeType;
    }

    public void setCashFeeType(String cashFeeType) {
        this.cashFeeType = cashFeeType;
    }

    public String getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(String couponFee) {
        this.couponFee = couponFee;
    }

    public String getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(String couponCount) {
        this.couponCount = couponCount;
    }

    public String getTransactionTd() {
        return transactionTd;
    }

    public void setTransactionTd(String transactionTd) {
        this.transactionTd = transactionTd;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getTradeStateDesc() {
        return tradeStateDesc;
    }

    public void setTradeStateDesc(String tradeStateDesc) {
        this.tradeStateDesc = tradeStateDesc;
    }

    public String getSubAppId() {
        return subAppId;
    }

    public void setSubAppId(String subAppId) {
        this.subAppId = subAppId;
    }

    public String getSubMchId() {
        return subMchId;
    }

    public void setSubMchId(String subMchId) {
        this.subMchId = subMchId;
    }

    public String getCouponType0() {
        return couponType0;
    }

    public void setCouponType0(String couponType0) {
        this.couponType0 = couponType0;
    }

    public String getCouponType1() {
        return couponType1;
    }

    public void setCouponType1(String couponType1) {
        this.couponType1 = couponType1;
    }

    public String getCouponType2() {
        return couponType2;
    }

    public void setCouponType2(String couponType2) {
        this.couponType2 = couponType2;
    }

    public String getCouponId0() {
        return couponId0;
    }

    public void setCouponId0(String couponId0) {
        this.couponId0 = couponId0;
    }

    public String getCouponId1() {
        return couponId1;
    }

    public void setCouponId1(String couponId1) {
        this.couponId1 = couponId1;
    }

    public String getCouponId2() {
        return couponId2;
    }

    public void setCouponId2(String couponId2) {
        this.couponId2 = couponId2;
    }

    public String getCouponFee0() {
        return couponFee0;
    }

    public void setCouponFee0(String couponFee0) {
        this.couponFee0 = couponFee0;
    }

    public String getCouponFee1() {
        return couponFee1;
    }

    public void setCouponFee1(String couponFee1) {
        this.couponFee1 = couponFee1;
    }

    public String getCouponFee2() {
        return couponFee2;
    }

    public void setCouponFee2(String couponFee2) {
        this.couponFee2 = couponFee2;
    }
}
