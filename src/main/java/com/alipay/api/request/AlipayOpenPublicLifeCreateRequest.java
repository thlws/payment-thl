package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenPublicLifeCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.public.life.create request
 *
 * @author auto create
 * @since 1.0, 2017-12-18 14:57:49
 */
public class AlipayOpenPublicLifeCreateRequest implements AlipayUploadRequest<AlipayOpenPublicLifeCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 背景图片，需上传图片原始二进制流，此图片显示在支付宝客户端生活号主页上方背景图位置，后缀是jpg或者jpeg，图片大小限制1mb
	 */
	private FileItem background;

	/** 
	* 联系人邮箱
	 */
	private String contactEmail;

	/** 
	* 联系人姓名
	 */
	private String contactName;

	/** 
	* 联系人电话
	 */
	private String contactTel;

	/** 
	* 客服电话，可以是电话号码，手机号码，400电话
	 */
	private String customerTel;

	/** 
	* 生活号简介，此内容显示在支付宝客户端生活号主页简介区块
	 */
	private String description;

	/** 
	* 扩展数据JSON串
	 */
	private String extendData;

	/** 
	* 生活号名称
	 */
	private String lifeName;

	/** 
	* logo图片，需上传图片原始二进制流，此图片显示在支付宝客户端生活号主页上方位置，后缀是jpg或者jpeg，图片大小限制1mb，图片最小150px ，图片建议为是正方形
	 */
	private FileItem logo;

	/** 
	* mcc code
	 */
	private String mccCode;

	/** 
	* 目前只支持 LIFE_APP：应用号
	 */
	private String publicBizType;

	/** 
	* 生活号前端展示类型
	 */
	private String showStyle;

	/** 
	* 支付宝用户id，由支付宝同学提供用户id，为该生活号对应pid
	 */
	private String userId;

    /**
     * Sets background.
     *
     * @param background the background
     */
    public void setBackground(FileItem background) {
		this.background = background;
	}

    /**
     * Gets background.
     *
     * @return the background
     */
    public FileItem getBackground() {
		return this.background;
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
     * Sets contact tel.
     *
     * @param contactTel the contact tel
     */
    public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

    /**
     * Gets contact tel.
     *
     * @return the contact tel
     */
    public String getContactTel() {
		return this.contactTel;
	}

    /**
     * Sets customer tel.
     *
     * @param customerTel the customer tel
     */
    public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}

    /**
     * Gets customer tel.
     *
     * @return the customer tel
     */
    public String getCustomerTel() {
		return this.customerTel;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
	}

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
		return this.description;
	}

    /**
     * Sets extend data.
     *
     * @param extendData the extend data
     */
    public void setExtendData(String extendData) {
		this.extendData = extendData;
	}

    /**
     * Gets extend data.
     *
     * @return the extend data
     */
    public String getExtendData() {
		return this.extendData;
	}

    /**
     * Sets life name.
     *
     * @param lifeName the life name
     */
    public void setLifeName(String lifeName) {
		this.lifeName = lifeName;
	}

    /**
     * Gets life name.
     *
     * @return the life name
     */
    public String getLifeName() {
		return this.lifeName;
	}

    /**
     * Sets logo.
     *
     * @param logo the logo
     */
    public void setLogo(FileItem logo) {
		this.logo = logo;
	}

    /**
     * Gets logo.
     *
     * @return the logo
     */
    public FileItem getLogo() {
		return this.logo;
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
     * Sets public biz type.
     *
     * @param publicBizType the public biz type
     */
    public void setPublicBizType(String publicBizType) {
		this.publicBizType = publicBizType;
	}

    /**
     * Gets public biz type.
     *
     * @return the public biz type
     */
    public String getPublicBizType() {
		return this.publicBizType;
	}

    /**
     * Sets show style.
     *
     * @param showStyle the show style
     */
    public void setShowStyle(String showStyle) {
		this.showStyle = showStyle;
	}

    /**
     * Gets show style.
     *
     * @return the show style
     */
    public String getShowStyle() {
		return this.showStyle;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
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
		return "alipay.open.public.life.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("contact_email", this.contactEmail);
		txtParams.put("contact_name", this.contactName);
		txtParams.put("contact_tel", this.contactTel);
		txtParams.put("customer_tel", this.customerTel);
		txtParams.put("description", this.description);
		txtParams.put("extend_data", this.extendData);
		txtParams.put("life_name", this.lifeName);
		txtParams.put("mcc_code", this.mccCode);
		txtParams.put("public_biz_type", this.publicBizType);
		txtParams.put("show_style", this.showStyle);
		txtParams.put("user_id", this.userId);
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
		params.put("background", this.background);
		params.put("logo", this.logo);
		return params;
	}

	public Class<AlipayOpenPublicLifeCreateResponse> getResponseClass() {
		return AlipayOpenPublicLifeCreateResponse.class;
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
