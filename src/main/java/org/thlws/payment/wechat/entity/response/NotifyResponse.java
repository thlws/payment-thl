package org.thlws.payment.wechat.entity.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.payment.wechat.entity.WechatResponse;
import org.thlws.utils.JsonUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 微信支付异步通知返回POJO
 *
 * @author Hanley Tang | hanley@thlws.com
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class NotifyResponse  extends WechatResponse {

	private String appid           ;
	private String mch_id          ;
	private String nonce_str       ;
	private String sign            ;

	private String openid          ;
	private String trade_type      ;
	private String is_subscribe	   ;
	private String bank_type;
	private String total_fee;
	private String cash_fee;
	private String transaction_id;
	private String out_trade_no;
	private String time_end;


	private String device_info;

	private String sub_appid;
	private String sub_mch_id;
	private String sub_openid;
	private String sub_is_subscribe;
	private String fee_type;
	private String cash_fee_type;
	private String coupon_fee;
	private String coupon_count;
//	private String coupon_id_n;// spec
//	private String coupon_fee_n;//spec
	private String attach;

    private String coupon_fee_0;
	private String coupon_fee_1;
	private String coupon_fee_2;


	private String coupon_id_0;
	private String coupon_id_1;
	private String coupon_id_2;


	@Override
	public String toString() {
		return JsonUtil.format(this);
	}

}
