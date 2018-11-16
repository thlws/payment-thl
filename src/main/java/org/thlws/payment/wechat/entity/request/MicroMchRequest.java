package org.thlws.payment.wechat.entity.request;

import org.thlws.utils.JsonUtil;
import org.thlws.utils.ThlwsBeanUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 新增收款个人用户资料 Req POJO
 * 服务商调用该接口将收款个人用户资料提交给微信侧,微信根据提交的 资料情况,判断收款用户资料正确性,返回收款识别码;
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
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


	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getMchId() {
		return mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantShortname() {
		return merchantShortname;
	}

	public void setMerchantShortname(String merchantShortname) {
		this.merchantShortname = merchantShortname;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getRecipientIdcardno() {
		return recipientIdcardno;
	}

	public void setRecipientIdcardno(String recipientIdcardno) {
		this.recipientIdcardno = recipientIdcardno;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getMerchantRemark() {
		return merchantRemark;
	}

	public void setMerchantRemark(String merchantRemark) {
		this.merchantRemark = merchantRemark;
	}

	public String getServicePhone() {
		return servicePhone;
	}

	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getMerchantGbaddress() {
		return merchantGbaddress;
	}

	public void setMerchantGbaddress(String merchantGbaddress) {
		this.merchantGbaddress = merchantGbaddress;
	}

	public String getMerchantDetailaddress() {
		return merchantDetailaddress;
	}

	public void setMerchantDetailaddress(String merchantDetailaddress) {
		this.merchantDetailaddress = merchantDetailaddress;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getRecipientWechatid() {
		return recipientWechatid;
	}

	public void setRecipientWechatid(String recipientWechatid) {
		this.recipientWechatid = recipientWechatid;
	}

	public String getMicroMchId() {
		return microMchId;
	}

	public void setMicroMchId(String microMchId) {
		this.microMchId = microMchId;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getNonceStr() {
		return nonceStr;
	}

	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}
}
