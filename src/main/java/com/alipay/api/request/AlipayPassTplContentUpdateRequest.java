package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayPassTplContentUpdateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.pass.tpl.content.update request
 *
 * @author auto create
 * @since 1.0, 2017-12-07 16:33:36
 */
public class AlipayPassTplContentUpdateRequest implements AlipayRequest<AlipayPassTplContentUpdateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 代理商代替商户发放卡券后，再代替商户更新卡券时，此值为商户的pid/appid
	 */
	private String channelId;

	/** 
	* 支付宝pass唯一标识
	 */
	private String serialNumber;

	/** 
	* 券状态,支持更新为USED,CLOSED两种状态
	 */
	private String status;

	/** 
	* 模版动态参数信息【支付宝pass模版参数键值对JSON字符串】
	 */
	private String tplParams;

	/** 
	* 核销码串值【当状态变更为USED时，建议传入】
	 */
	private String verifyCode;

	/** 
	* 核销方式，目前支持：wave（声波方式）、qrcode（二维码方式）、barcode（条码方式）、input（文本方式，即手工输入方式）。pass和verify_type不能同时为空
	 */
	private String verifyType;

    /**
     * Sets channel id.
     *
     * @param channelId the channel id
     */
    public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

    /**
     * Gets channel id.
     *
     * @return the channel id
     */
    public String getChannelId() {
		return this.channelId;
	}

    /**
     * Sets serial number.
     *
     * @param serialNumber the serial number
     */
    public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

    /**
     * Gets serial number.
     *
     * @return the serial number
     */
    public String getSerialNumber() {
		return this.serialNumber;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets tpl params.
     *
     * @param tplParams the tpl params
     */
    public void setTplParams(String tplParams) {
		this.tplParams = tplParams;
	}

    /**
     * Gets tpl params.
     *
     * @return the tpl params
     */
    public String getTplParams() {
		return this.tplParams;
	}

    /**
     * Sets verify code.
     *
     * @param verifyCode the verify code
     */
    public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

    /**
     * Gets verify code.
     *
     * @return the verify code
     */
    public String getVerifyCode() {
		return this.verifyCode;
	}

    /**
     * Sets verify type.
     *
     * @param verifyType the verify type
     */
    public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

    /**
     * Gets verify type.
     *
     * @return the verify type
     */
    public String getVerifyType() {
		return this.verifyType;
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
		return "alipay.pass.tpl.content.update";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("channel_id", this.channelId);
		txtParams.put("serial_number", this.serialNumber);
		txtParams.put("status", this.status);
		txtParams.put("tpl_params", this.tplParams);
		txtParams.put("verify_code", this.verifyCode);
		txtParams.put("verify_type", this.verifyType);
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

	public Class<AlipayPassTplContentUpdateResponse> getResponseClass() {
		return AlipayPassTplContentUpdateResponse.class;
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
