package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayGotoneMessageCourierSendResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.gotone.message.courier.send request
 *
 * @author auto create
 * @since 1.0, 2017-08-03 15:58:32
 */
public class AlipayGotoneMessageCourierSendRequest implements AlipayRequest<AlipayGotoneMessageCourierSendResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 模板参数,键值对，以竖线分割
	 */
	private String arguments;

	/** 
	* 扩展信息。IMEI表示钱包客户端IMEI号；CURRENT_STEP表示消息进度节点,必须为数字； IS_CORRECT表示当前节点是正常还是异常分支，必须为Y或者N; todoPublicId表示钱包公众号id。注意：上诉key值必须严格匹配，大小写敏感
	 */
	private String extInfo;

	/** 
	* 业务配置码serviceCode
	 */
	private String serviceCode;

	/** 
	* 用户的支付宝ID
	 */
	private String userId;

    /**
     * Sets arguments.
     *
     * @param arguments the arguments
     */
    public void setArguments(String arguments) {
		this.arguments = arguments;
	}

    /**
     * Gets arguments.
     *
     * @return the arguments
     */
    public String getArguments() {
		return this.arguments;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets service code.
     *
     * @param serviceCode the service code
     */
    public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

    /**
     * Gets service code.
     *
     * @return the service code
     */
    public String getServiceCode() {
		return this.serviceCode;
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

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.gotone.message.courier.send";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("arguments", this.arguments);
		txtParams.put("ext_info", this.extInfo);
		txtParams.put("service_code", this.serviceCode);
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

	public Class<AlipayGotoneMessageCourierSendResponse> getResponseClass() {
		return AlipayGotoneMessageCourierSendResponse.class;
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
