package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenAgentMiniCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.agent.mini.create request
 *
 * @author auto create
 * @since 1.0, 2018-07-12 18:50:00
 */
public class AlipayOpenAgentMiniCreateRequest implements AlipayUploadRequest<AlipayOpenAgentMiniCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 小程序应用类目，参数格式：一级类目_二级类目。
应用类目参考文档：https://docs.alipay.com/isv/10325
	 */
	private String appCategoryIds;

	/** 
	* 商家小程序描述信息，简要描述小程序主要功能（20-200个字），例：xx小程序提供了xx功能，主要解决了XX问题。
	 */
	private String appDesc;

	/** 
	* 小程序英文名称，长度3~20个字符
	 */
	private String appEnglishName;

	/** 
	* 商家小程序应用图标，最大256KB，LOGO不允许涉及政治敏感与色情；图片格式必须为：png、jpeg、jpg，建议上传像素为180*180，LOGO核心图形建议在白色160PX范围内
	 */
	private FileItem appLogo;

	/** 
	* 代商家创建的小程序应用名称。名称可以由中文、数字、英文及下划线组成，长度在3-20个字符之间，一个中文字等于2个字符，更多名称规则见：https://docs.alipay.com/mini/operation/name
	 */
	private String appName;

	/** 
	* 代商家创建的小程序的简介，请用一句话简要描述小程序提供的服务；应用上架后一个自然月可修改5次（10~32个字符）
	 */
	private String appSlogan;

	/** 
	* ISV 代商家操作事务编号，通过事务开启接口alipay.open.agent.create调用返回。
	 */
	private String batchNo;

	/** 
	* 商家小程序客服邮箱
商家小程序客服电话和邮箱，可以二选一填写，但不能同时为空
	 */
	private String serviceEmail;

	/** 
	* 商家小程序的客服电话，推荐填写
商家小程序客服电话和邮箱，可以二选一填写，但不能同时为空
	 */
	private String servicePhone;

    /**
     * Sets app category ids.
     *
     * @param appCategoryIds the app category ids
     */
    public void setAppCategoryIds(String appCategoryIds) {
		this.appCategoryIds = appCategoryIds;
	}

    /**
     * Gets app category ids.
     *
     * @return the app category ids
     */
    public String getAppCategoryIds() {
		return this.appCategoryIds;
	}

    /**
     * Sets app desc.
     *
     * @param appDesc the app desc
     */
    public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

    /**
     * Gets app desc.
     *
     * @return the app desc
     */
    public String getAppDesc() {
		return this.appDesc;
	}

    /**
     * Sets app english name.
     *
     * @param appEnglishName the app english name
     */
    public void setAppEnglishName(String appEnglishName) {
		this.appEnglishName = appEnglishName;
	}

    /**
     * Gets app english name.
     *
     * @return the app english name
     */
    public String getAppEnglishName() {
		return this.appEnglishName;
	}

    /**
     * Sets app logo.
     *
     * @param appLogo the app logo
     */
    public void setAppLogo(FileItem appLogo) {
		this.appLogo = appLogo;
	}

    /**
     * Gets app logo.
     *
     * @return the app logo
     */
    public FileItem getAppLogo() {
		return this.appLogo;
	}

    /**
     * Sets app name.
     *
     * @param appName the app name
     */
    public void setAppName(String appName) {
		this.appName = appName;
	}

    /**
     * Gets app name.
     *
     * @return the app name
     */
    public String getAppName() {
		return this.appName;
	}

    /**
     * Sets app slogan.
     *
     * @param appSlogan the app slogan
     */
    public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}

    /**
     * Gets app slogan.
     *
     * @return the app slogan
     */
    public String getAppSlogan() {
		return this.appSlogan;
	}

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo() {
		return this.batchNo;
	}

    /**
     * Sets service email.
     *
     * @param serviceEmail the service email
     */
    public void setServiceEmail(String serviceEmail) {
		this.serviceEmail = serviceEmail;
	}

    /**
     * Gets service email.
     *
     * @return the service email
     */
    public String getServiceEmail() {
		return this.serviceEmail;
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
     * Gets service phone.
     *
     * @return the service phone
     */
    public String getServicePhone() {
		return this.servicePhone;
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
		return "alipay.open.agent.mini.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("app_category_ids", this.appCategoryIds);
		txtParams.put("app_desc", this.appDesc);
		txtParams.put("app_english_name", this.appEnglishName);
		txtParams.put("app_name", this.appName);
		txtParams.put("app_slogan", this.appSlogan);
		txtParams.put("batch_no", this.batchNo);
		txtParams.put("service_email", this.serviceEmail);
		txtParams.put("service_phone", this.servicePhone);
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
		params.put("app_logo", this.appLogo);
		return params;
	}

	public Class<AlipayOpenAgentMiniCreateResponse> getResponseClass() {
		return AlipayOpenAgentMiniCreateResponse.class;
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
