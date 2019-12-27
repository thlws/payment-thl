package org.thlws.payment.wechat.entity.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

    /**代金券金额	,“代金券或立减优惠”金额小于等于订单总金额，订单总金额-“代金券或立减优惠”金额等于现金支付金额*/
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

}
