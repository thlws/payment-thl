package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMobileUrlDeviceverifyAddResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.mobile.url.deviceverify.add request
 *
 * @author auto create
 * @since 1.0, 2014-08-14 19:40:00
 */
public class AlipayMobileUrlDeviceverifyAddRequest implements AlipayRequest<AlipayMobileUrlDeviceverifyAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 设备指纹id
	 */
	private String apdid;

	/** 
	* 应用版本号
	 */
	private String appVersion;

	/** 
	* 应用名
	 */
	private String appid;

	/** 
	* 集团统一id
	 */
	private String hid;

	/** 
	* 手机号码
	 */
	private String mobile;

	/** 
	* 统一sdk的版本
	 */
	private String sdkVersion;

	/** 
	* 手淘设备ID
	 */
	private String umid;

    /**
     * Sets apdid.
     *
     * @param apdid the apdid
     */
    public void setApdid(String apdid) {
		this.apdid = apdid;
	}

    /**
     * Gets apdid.
     *
     * @return the apdid
     */
    public String getApdid() {
		return this.apdid;
	}

    /**
     * Sets app version.
     *
     * @param appVersion the app version
     */
    public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

    /**
     * Gets app version.
     *
     * @return the app version
     */
    public String getAppVersion() {
		return this.appVersion;
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
     * Gets appid.
     *
     * @return the appid
     */
    public String getAppid() {
		return this.appid;
	}

    /**
     * Sets hid.
     *
     * @param hid the hid
     */
    public void setHid(String hid) {
		this.hid = hid;
	}

    /**
     * Gets hid.
     *
     * @return the hid
     */
    public String getHid() {
		return this.hid;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets sdk version.
     *
     * @param sdkVersion the sdk version
     */
    public void setSdkVersion(String sdkVersion) {
		this.sdkVersion = sdkVersion;
	}

    /**
     * Gets sdk version.
     *
     * @return the sdk version
     */
    public String getSdkVersion() {
		return this.sdkVersion;
	}

    /**
     * Sets umid.
     *
     * @param umid the umid
     */
    public void setUmid(String umid) {
		this.umid = umid;
	}

    /**
     * Gets umid.
     *
     * @return the umid
     */
    public String getUmid() {
		return this.umid;
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

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.mobile.url.deviceverify.add";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("apdid", this.apdid);
		txtParams.put("app_version", this.appVersion);
		txtParams.put("appid", this.appid);
		txtParams.put("hid", this.hid);
		txtParams.put("mobile", this.mobile);
		txtParams.put("sdk_version", this.sdkVersion);
		txtParams.put("umid", this.umid);
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

	public Class<AlipayMobileUrlDeviceverifyAddResponse> getResponseClass() {
		return AlipayMobileUrlDeviceverifyAddResponse.class;
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
