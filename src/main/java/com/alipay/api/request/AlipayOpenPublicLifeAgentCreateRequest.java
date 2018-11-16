package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenPublicLifeAgentCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.public.life.agent.create request
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:21:32
 */
public class AlipayOpenPublicLifeAgentCreateRequest implements AlipayUploadRequest<AlipayOpenPublicLifeAgentCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* isv代开通生活号的商户支付宝账号或者商户支付宝账号pid（2088开头16位长度的字符串），账号需通过实名认证
	 */
	private String account;

	/** 
	* 生活号背景图片
	 */
	private FileItem backgroundPic;

	/** 
	* 营业执照授权函图片，个体工商户如果使用总公司或其他公司的营业执照认证需上传该授权函图片
	 */
	private FileItem businessLicenseAuthPic;

	/** 
	* 营业执照号码。被代创建商户运营主体为个人账户必填，企业账户无需填写
	 */
	private String businessLicenseNo;

	/** 
	* 营业执照图片。被代创建商户运营主体为个人账户必填，企业账户无需填写
	 */
	private FileItem businessLicensePic;

	/** 
	* 联系人邮箱
	 */
	private String contactEmail;

	/** 
	* 联系人手机号
	 */
	private String contactMobile;

	/** 
	* 联系人名称
	 */
	private String contactName;

	/** 
	* 生活号头像
	 */
	private FileItem logoPic;

	/** 
	* 所属MCCCode，详情可参考
<a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.INIZWb&articleId=105364&docType=1">商家经营类目</a> 中的“经营类目编码”
	 */
	private String mccCode;

	/** 
	* 外部入驻申请单据号，由开发者生成，并需保证在开发者端不重复。另，如果代创建被驳回，需更换新的申请号，原申请号不能再次使用
	 */
	private String outBizNo;

	/** 
	* 自有知识产权证书图片
	 */
	private FileItem ownIntellectualPic;

	/** 
	* 生活号简介
	 */
	private String publicDesc;

	/** 
	* 生活号名称
	 */
	private String publicName;

	/** 
	* 店铺内景图片，被代创建商户运营主体为个人账户必填，企业账户选填
	 */
	private FileItem shopScenePic;

	/** 
	* 店铺门头照图片，被代创建商户运营主体为个人账户必填，企业账户选填
	 */
	private FileItem shopSignBoardPic;

	/** 
	* 企业特殊资质图片，可参考 <a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.INIZWb&articleId=105364&docType=1">商家经营类目</a> 中的 “需要的特殊资质证书”
	 */
	private FileItem specialLicensePic;

    /**
     * Sets account.
     *
     * @param account the account
     */
    public void setAccount(String account) {
		this.account = account;
	}

    /**
     * Gets account.
     *
     * @return the account
     */
    public String getAccount() {
		return this.account;
	}

    /**
     * Sets background pic.
     *
     * @param backgroundPic the background pic
     */
    public void setBackgroundPic(FileItem backgroundPic) {
		this.backgroundPic = backgroundPic;
	}

    /**
     * Gets background pic.
     *
     * @return the background pic
     */
    public FileItem getBackgroundPic() {
		return this.backgroundPic;
	}

    /**
     * Sets business license auth pic.
     *
     * @param businessLicenseAuthPic the business license auth pic
     */
    public void setBusinessLicenseAuthPic(FileItem businessLicenseAuthPic) {
		this.businessLicenseAuthPic = businessLicenseAuthPic;
	}

    /**
     * Gets business license auth pic.
     *
     * @return the business license auth pic
     */
    public FileItem getBusinessLicenseAuthPic() {
		return this.businessLicenseAuthPic;
	}

    /**
     * Sets business license no.
     *
     * @param businessLicenseNo the business license no
     */
    public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

    /**
     * Gets business license no.
     *
     * @return the business license no
     */
    public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}

    /**
     * Sets business license pic.
     *
     * @param businessLicensePic the business license pic
     */
    public void setBusinessLicensePic(FileItem businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}

    /**
     * Gets business license pic.
     *
     * @return the business license pic
     */
    public FileItem getBusinessLicensePic() {
		return this.businessLicensePic;
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
     * Gets contact email.
     *
     * @return the contact email
     */
    public String getContactEmail() {
		return this.contactEmail;
	}

    /**
     * Sets contact mobile.
     *
     * @param contactMobile the contact mobile
     */
    public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

    /**
     * Gets contact mobile.
     *
     * @return the contact mobile
     */
    public String getContactMobile() {
		return this.contactMobile;
	}

    /**
     * Sets contact name.
     *
     * @param contactName the contact name
     */
    public void setContactName(String contactName) {
		this.contactName = contactName;
	}

    /**
     * Gets contact name.
     *
     * @return the contact name
     */
    public String getContactName() {
		return this.contactName;
	}

    /**
     * Sets logo pic.
     *
     * @param logoPic the logo pic
     */
    public void setLogoPic(FileItem logoPic) {
		this.logoPic = logoPic;
	}

    /**
     * Gets logo pic.
     *
     * @return the logo pic
     */
    public FileItem getLogoPic() {
		return this.logoPic;
	}

    /**
     * Sets mcc code.
     *
     * @param mccCode the mcc code
     */
    public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

    /**
     * Gets mcc code.
     *
     * @return the mcc code
     */
    public String getMccCode() {
		return this.mccCode;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets own intellectual pic.
     *
     * @param ownIntellectualPic the own intellectual pic
     */
    public void setOwnIntellectualPic(FileItem ownIntellectualPic) {
		this.ownIntellectualPic = ownIntellectualPic;
	}

    /**
     * Gets own intellectual pic.
     *
     * @return the own intellectual pic
     */
    public FileItem getOwnIntellectualPic() {
		return this.ownIntellectualPic;
	}

    /**
     * Sets public desc.
     *
     * @param publicDesc the public desc
     */
    public void setPublicDesc(String publicDesc) {
		this.publicDesc = publicDesc;
	}

    /**
     * Gets public desc.
     *
     * @return the public desc
     */
    public String getPublicDesc() {
		return this.publicDesc;
	}

    /**
     * Sets public name.
     *
     * @param publicName the public name
     */
    public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

    /**
     * Gets public name.
     *
     * @return the public name
     */
    public String getPublicName() {
		return this.publicName;
	}

    /**
     * Sets shop scene pic.
     *
     * @param shopScenePic the shop scene pic
     */
    public void setShopScenePic(FileItem shopScenePic) {
		this.shopScenePic = shopScenePic;
	}

    /**
     * Gets shop scene pic.
     *
     * @return the shop scene pic
     */
    public FileItem getShopScenePic() {
		return this.shopScenePic;
	}

    /**
     * Sets shop sign board pic.
     *
     * @param shopSignBoardPic the shop sign board pic
     */
    public void setShopSignBoardPic(FileItem shopSignBoardPic) {
		this.shopSignBoardPic = shopSignBoardPic;
	}

    /**
     * Gets shop sign board pic.
     *
     * @return the shop sign board pic
     */
    public FileItem getShopSignBoardPic() {
		return this.shopSignBoardPic;
	}

    /**
     * Sets special license pic.
     *
     * @param specialLicensePic the special license pic
     */
    public void setSpecialLicensePic(FileItem specialLicensePic) {
		this.specialLicensePic = specialLicensePic;
	}

    /**
     * Gets special license pic.
     *
     * @return the special license pic
     */
    public FileItem getSpecialLicensePic() {
		return this.specialLicensePic;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
    private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.open.public.life.agent.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("account", this.account);
		txtParams.put("business_license_no", this.businessLicenseNo);
		txtParams.put("contact_email", this.contactEmail);
		txtParams.put("contact_mobile", this.contactMobile);
		txtParams.put("contact_name", this.contactName);
		txtParams.put("mcc_code", this.mccCode);
		txtParams.put("out_biz_no", this.outBizNo);
		txtParams.put("public_desc", this.publicDesc);
		txtParams.put("public_name", this.publicName);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

    /**
     * Put other text param.
     *
     * @param key   the key
     * @param value the value
     */
    public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("background_pic", this.backgroundPic);
		params.put("business_license_auth_pic", this.businessLicenseAuthPic);
		params.put("business_license_pic", this.businessLicensePic);
		params.put("logo_pic", this.logoPic);
		params.put("own_intellectual_pic", this.ownIntellectualPic);
		params.put("shop_scene_pic", this.shopScenePic);
		params.put("shop_sign_board_pic", this.shopSignBoardPic);
		params.put("special_license_pic", this.specialLicensePic);
		return params;
	}

	public Class<AlipayOpenPublicLifeAgentCreateResponse> getResponseClass() {
		return AlipayOpenPublicLifeAgentCreateResponse.class;
	}
	
	 public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
