package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMobilePublicAccountAddResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.mobile.public.account.add request
 *
 * @author auto create
 * @since 1.0, 2017-04-14 15:25:33
 */
public class AlipayMobilePublicAccountAddRequest implements AlipayRequest<AlipayMobilePublicAccountAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 协议号
	 */
	private String agreementId;

	/** 
	* 绑定账户
	 */
	private String bindAccountNo;

	/** 
	* json
	 */
	private String bizContent;

	/** 
	* 绑定账户的名
	 */
	private String displayName;

	/** 
	* 关注者标识
	 */
	private String fromUserId;

	/** 
	* 绑定账户的用户名
	 */
	private String realName;

    /**
     * Sets agreement id.
     *
     * @param agreementId the agreement id
     */
    public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

    /**
     * Gets agreement id.
     *
     * @return the agreement id
     */
    public String getAgreementId() {
		return this.agreementId;
	}

    /**
     * Sets bind account no.
     *
     * @param bindAccountNo the bind account no
     */
    public void setBindAccountNo(String bindAccountNo) {
		this.bindAccountNo = bindAccountNo;
	}

    /**
     * Gets bind account no.
     *
     * @return the bind account no
     */
    public String getBindAccountNo() {
		return this.bindAccountNo;
	}

    /**
     * Sets biz content.
     *
     * @param bizContent the biz content
     */
    public void setBizContent(String bizContent) {
		this.bizContent = bizContent;
	}

    /**
     * Gets biz content.
     *
     * @return the biz content
     */
    public String getBizContent() {
		return this.bizContent;
	}

    /**
     * Sets display name.
     *
     * @param displayName the display name
     */
    public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

    /**
     * Gets display name.
     *
     * @return the display name
     */
    public String getDisplayName() {
		return this.displayName;
	}

    /**
     * Sets from user id.
     *
     * @param fromUserId the from user id
     */
    public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

    /**
     * Gets from user id.
     *
     * @return the from user id
     */
    public String getFromUserId() {
		return this.fromUserId;
	}

    /**
     * Sets real name.
     *
     * @param realName the real name
     */
    public void setRealName(String realName) {
		this.realName = realName;
	}

    /**
     * Gets real name.
     *
     * @return the real name
     */
    public String getRealName() {
		return this.realName;
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
		return "alipay.mobile.public.account.add";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("agreement_id", this.agreementId);
		txtParams.put("bind_account_no", this.bindAccountNo);
		txtParams.put("biz_content", this.bizContent);
		txtParams.put("display_name", this.displayName);
		txtParams.put("from_user_id", this.fromUserId);
		txtParams.put("real_name", this.realName);
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

	public Class<AlipayMobilePublicAccountAddResponse> getResponseClass() {
		return AlipayMobilePublicAccountAddResponse.class;
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
