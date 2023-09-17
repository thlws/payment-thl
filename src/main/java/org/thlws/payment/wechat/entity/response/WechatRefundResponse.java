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

/***
 * 微信退款返回对象
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class WechatRefundResponse extends WechatResponse {


	/**公众账号ID*/
	@XmlElement(name="appid")
	private String appId                ;

	/**商户号*/
	@XmlElement(name="mch_id")
	private String mchId               ;

	/***/
	@XmlElement(name="device_info")
	private String deviceInfo          ;

	/**随机字符串*/
	@XmlElement(name="nonce_str")
	private String nonceStr            ;

	/**签名*/
	@XmlElement(name="sign")
	private String sign                 ;

	/**微信订单号*/
	@XmlElement(name="transaction_id")
	private String transactionId       ;

	/**商户订单号*/
	@XmlElement(name="out_trade_no")
	private String outTradeNo         ;

	/**商户退款单号*/
	@XmlElement(name="out_refund_no")
	private String outRefundNo        ;

	/**微信退款单号*/
	@XmlElement(name="refund_id")
	private String refundId            ;

	/**文档返回参数列表中无该参数，但DEMO示例存在,暂时保留 FIXME*/
	@XmlElement(name="refund_channel")
	private String refundChannel       ;

	/**申请退款金额*/
	@XmlElement(name="refund_fee")
	private String refundFee           ;

	/**退款金额*/
	@XmlElement(name="settlement_refund_fee")
	private String settlementFefundFee;

	/**订单金额*/
	@XmlElement(name="total_fee")
	private String totalFee            ;

	/**
	 * 应结订单金额<br>
	 * <pre>
	 * 应结订单金额等于订单金额 减 免充值代金券金额，应结订单金额小于等于订单金额
	 * </pre>
	 * */
	@XmlElement(name="settlement_total_fee")
	private String settlementTotalFee ;

	/**订单金额货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY*/
	@XmlElement(name="fee_type")
	private String feeType             ;

	/**现金支付金额*/
	@XmlElement(name="cash_fee")
	private String cashFee             ;

	/**现金退款金额*/
	@XmlElement(name="cash_refund_fee")
	private String cashRefundFee      ;

	/**代金券退款总金额*/
	@XmlElement(name="coupon_refund_fee")
	private String couponFefundFee	;

	/**退款代金券使用数量*/
	@XmlElement(name="couponFefundCount")
	private String coupon_refund_count	;

	/**子商户公众账号ID*/
	@XmlElement(name="sub_appid")
	private String subAppId;

	/**子商户号*/
	@XmlElement(name="sub_mch_id")
	private String subMchId;

	/**代金券类型-0*/
	@XmlElement(name="coupon_type_0")
	private String couponType0;

	/**代金券类型-1*/
	@XmlElement(name="coupon_type_1")
	private String couponType1;

	/**代金券类型-2*/
	@XmlElement(name="coupon_type_2")
	private String couponType2;

	/**退款代金券ID-0*/
	@XmlElement(name="coupon_refund_id_0")
	private String couponRefundId0;

	/**退款代金券ID-1*/
	@XmlElement(name="coupon_refund_id_1")
	private String couponRefundId1;

	/**退款代金券ID-2*/
	@XmlElement(name="coupon_refund_id_2")
	private String couponRefundId2;

	/**单个代金券退款金额-0*/
	@XmlElement(name="coupon_refund_fee_0")
	private String couponRefundFee0;

	/**单个代金券退款金额-1*/
	@XmlElement(name="coupon_refund_fee_1")
	private String couponRefundFee1;

	/**单个代金券退款金额-2*/
	@XmlElement(name="coupon_refund_fee_2")
	private String couponRefundFee2;

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
}
