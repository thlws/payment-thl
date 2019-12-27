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

/**
 * 新增收款个人用户资料 Req POJO
 * 服务商调用该接口将收款个人用户资料提交给微信侧,微信根据提交的 资料情况,判断收款用户资料正确性,返回收款识别码;
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
public class MicroMchRequest {

	@XmlElement(name="appid")
	private String appid                 ;

	@XmlElement(name="mch_id")
	private String mchId                 ;

	@XmlElement(name="sign")
	private String sign                  ;

	@XmlElement(name="merchant_name")
	private String merchantName          ;

	@XmlElement(name="merchant_shortname")
	private String merchantShortname     ;

	@XmlElement(name="recipient_name")
	private String recipientName         ;

	@XmlElement(name="recipient_idcardno")
	private String recipientIdcardno     ;

	@XmlElement(name="business")
	private String business               ;

	@XmlElement(name="merchant_remark")
	private String merchantRemark        ;

	@XmlElement(name="service_phone")
	private String servicePhone          ;

	@XmlElement(name="merchant_gbaddress")
	private String merchantGbaddress     ;

	@XmlElement(name="merchant_detailaddress")
	private String merchantDetailaddress ;

	@XmlElement(name="contact")
	private String contact                ;

	@XmlElement(name="contact_phone")
	private String contactPhone          ;

	@XmlElement(name="contact_email")
	private String contactEmail          ;
	
	/**查询收款个人用户资料 [收款识别码 收款人微信号] 二选一*/
	@XmlElement(name="recipient_wechatid")
	private String recipientWechatid     ;

	/**
	 * 收款识别码
	 */
	@XmlElement(name="micro_mch_id")
	private String microMchId;

	@XmlElement(name="device_info")
	private String deviceInfo;

	@XmlElement(name="body")
	private String body;

	@XmlElement(name="nonce_str")
	private String nonceStr = ThlwsBeanUtil.getRandomString(32);

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}

}
