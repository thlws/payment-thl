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
 *
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


    /**
     * Gets appid.
     *
     * @return the appid
     */
    public String getAppid() {
		return appid;
	}

    /**
     * Sets appid.
     *
     * @param appid the appid
     */
    public void setAppid(String appid) {
		this.appid = appid;
	}

    /**
     * Gets mch id.
     *
     * @return the mch id
     */
    public String getMchId() {
		return mchId;
	}

    /**
     * Sets mch id.
     *
     * @param mchId the mch id
     */
    public void setMchId(String mchId) {
		this.mchId = mchId;
	}

    /**
     * Gets sign.
     *
     * @return the sign
     */
    public String getSign() {
		return sign;
	}

    /**
     * Sets sign.
     *
     * @param sign the sign
     */
    public void setSign(String sign) {
		this.sign = sign;
	}

    /**
     * Gets merchant name.
     *
     * @return the merchant name
     */
    public String getMerchantName() {
		return merchantName;
	}

    /**
     * Sets merchant name.
     *
     * @param merchantName the merchant name
     */
    public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

    /**
     * Gets merchant shortname.
     *
     * @return the merchant shortname
     */
    public String getMerchantShortname() {
		return merchantShortname;
	}

    /**
     * Sets merchant shortname.
     *
     * @param merchantShortname the merchant shortname
     */
    public void setMerchantShortname(String merchantShortname) {
		this.merchantShortname = merchantShortname;
	}

    /**
     * Gets recipient name.
     *
     * @return the recipient name
     */
    public String getRecipientName() {
		return recipientName;
	}

    /**
     * Sets recipient name.
     *
     * @param recipientName the recipient name
     */
    public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

    /**
     * Gets recipient idcardno.
     *
     * @return the recipient idcardno
     */
    public String getRecipientIdcardno() {
		return recipientIdcardno;
	}

    /**
     * Sets recipient idcardno.
     *
     * @param recipientIdcardno the recipient idcardno
     */
    public void setRecipientIdcardno(String recipientIdcardno) {
		this.recipientIdcardno = recipientIdcardno;
	}

    /**
     * Gets business.
     *
     * @return the business
     */
    public String getBusiness() {
		return business;
	}

    /**
     * Sets business.
     *
     * @param business the business
     */
    public void setBusiness(String business) {
		this.business = business;
	}

    /**
     * Gets merchant remark.
     *
     * @return the merchant remark
     */
    public String getMerchantRemark() {
		return merchantRemark;
	}

    /**
     * Sets merchant remark.
     *
     * @param merchantRemark the merchant remark
     */
    public void setMerchantRemark(String merchantRemark) {
		this.merchantRemark = merchantRemark;
	}

    /**
     * Gets service phone.
     *
     * @return the service phone
     */
    public String getServicePhone() {
		return servicePhone;
	}

    /**
     * Sets service phone.
     *
     * @param servicePhone the service phone
     */
    public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

    /**
     * Gets merchant gbaddress.
     *
     * @return the merchant gbaddress
     */
    public String getMerchantGbaddress() {
		return merchantGbaddress;
	}

    /**
     * Sets merchant gbaddress.
     *
     * @param merchantGbaddress the merchant gbaddress
     */
    public void setMerchantGbaddress(String merchantGbaddress) {
		this.merchantGbaddress = merchantGbaddress;
	}

    /**
     * Gets merchant detailaddress.
     *
     * @return the merchant detailaddress
     */
    public String getMerchantDetailaddress() {
		return merchantDetailaddress;
	}

    /**
     * Sets merchant detailaddress.
     *
     * @param merchantDetailaddress the merchant detailaddress
     */
    public void setMerchantDetailaddress(String merchantDetailaddress) {
		this.merchantDetailaddress = merchantDetailaddress;
	}

    /**
     * Gets contact.
     *
     * @return the contact
     */
    public String getContact() {
		return contact;
	}

    /**
     * Sets contact.
     *
     * @param contact the contact
     */
    public void setContact(String contact) {
		this.contact = contact;
	}

    /**
     * Gets contact phone.
     *
     * @return the contact phone
     */
    public String getContactPhone() {
		return contactPhone;
	}

    /**
     * Sets contact phone.
     *
     * @param contactPhone the contact phone
     */
    public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

    /**
     * Gets contact email.
     *
     * @return the contact email
     */
    public String getContactEmail() {
		return contactEmail;
	}

    /**
     * Sets contact email.
     *
     * @param contactEmail the contact email
     */
    public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

    /**
     * Gets recipient wechatid.
     *
     * @return the recipient wechatid
     */
    public String getRecipientWechatid() {
		return recipientWechatid;
	}

    /**
     * Sets recipient wechatid.
     *
     * @param recipientWechatid the recipient wechatid
     */
    public void setRecipientWechatid(String recipientWechatid) {
		this.recipientWechatid = recipientWechatid;
	}

    /**
     * Gets micro mch id.
     *
     * @return the micro mch id
     */
    public String getMicroMchId() {
		return microMchId;
	}

    /**
     * Sets micro mch id.
     *
     * @param microMchId the micro mch id
     */
    public void setMicroMchId(String microMchId) {
		this.microMchId = microMchId;
	}

    /**
     * Gets device info.
     *
     * @return the device info
     */
    public String getDeviceInfo() {
		return deviceInfo;
	}

    /**
     * Sets device info.
     *
     * @param deviceInfo the device info
     */
    public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
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
     * Gets nonce str.
     *
     * @return the nonce str
     */
    public String getNonceStr() {
		return nonceStr;
	}

    /**
     * Sets nonce str.
     *
     * @param nonceStr the nonce str
     */
    public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}
}
