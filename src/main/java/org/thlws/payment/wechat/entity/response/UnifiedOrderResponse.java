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
 * 微信统一下单结果对象
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class UnifiedOrderResponse  extends WechatResponse {

	/**公众账号ID*/
	@XmlElement(name="appid")
	private String appId           ;

	/**商户号*/
	@XmlElement(name="mch_id")
	private String mchId          ;

	/**随机字符串*/
	@XmlElement(name="nonce_str")
	private String nonceStr       ;

	/**签名*/
	@XmlElement(name="sign")
	private String sign            ;

	/**预支付交易会话标识*/
	@XmlElement(name="prepay_id")
	private String prepayId       ;

	/**交易类型 JSAPI，NATIVE，APP*/
	@XmlElement(name="trade_type")
	private String tradeType      ;

	/**设备号	*/
	@XmlElement(name="device_info")
	private String deviceInfo;

	/**二维码链接,trade_type为NATIVE是有返回，可将该参数值生成二维码展示出来进行扫码支付*/
	@XmlElement(name="code_url")
    private String codeUrl;

	/**子商户公众账号ID*/
	@XmlElement(name="sub_appid")
	private String subAppId;

	/**子商户号	*/
	@XmlElement(name="sub_mch_id")
	private String subMchId ;

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}


}
