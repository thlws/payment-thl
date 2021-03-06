package org.thlws.payment.wechat.entity.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;
import org.thlws.utils.ThlwsBeanUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/***
 * 微信退款参数对象
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class WechatRefundRequest {

	//如下为必须参数

	/**公众账号ID*/
	@XmlElement(name="appid")
	private String appId            ;

	/**商户号*/
	@XmlElement(name="mch_id")
	private String mchId           ;

	/**随机字符串*/
	@XmlElement(name="nonce_str")
	final private String nonceStr  = ThlwsBeanUtil.getRandomString(32);      ;

	/**商户退款单号*/
	@XmlElement(name="out_refund_no")
	private String outRefundNo     ;

	/**订单总金额*/
	@XmlElement(name="total_fee")
	private String totalFee        ;

	/**申请退款金额*/
	@XmlElement(name="refund_fee")
	private String refundFee       ;

	//transaction_id&out_trade_no二选一

	/**微信订单号*/
	@XmlElement(name="transaction_id")
	private String transactionId   ;

	/**商户订单号*/
	@XmlElement(name="out_trade_no")
	private String outTradeNo     ;
	
	//如下参数可选

	/**货币种类 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY*/
	@XmlElement(name="refund_fee_type")
	private String refundFeeType  ;

	/**退款原因*/
	@XmlElement(name="refund_desc")
	private String refundDesc;

	/**
	 * 退款资金来源
	 * <pre>
	 *     仅针对老资金流商户使用 REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款（默认使用未结算资金退款）
	 		REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款
	 * </pre>
	 * */
	@XmlElement(name="refund_account")
	private String refundAccount;

	/**子商户公众账号ID*/
	@XmlElement(name="sub_appid")
	private String subAppId;

	/**子商户号*/
	@XmlElement(name="sub_mch_id")
	private String subMchId;

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
}
