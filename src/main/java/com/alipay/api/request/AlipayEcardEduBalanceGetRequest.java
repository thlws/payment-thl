package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEcardEduBalanceGetResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ecard.edu.balance.get request
 *
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:45
 */
public class AlipayEcardEduBalanceGetRequest implements AlipayRequest<AlipayEcardEduBalanceGetResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 校园一卡通机构代码
	 */
	private String agentCode;

	/** 
	* 支付宝userId
	 */
	private String alipayUserId;

	/** 
	* 校园一卡通姓名
	 */
	private String cardName;

	/** 
	* 校园一卡通卡号
	 */
	private String cardNo;

    /**
     * Sets agent code.
     *
     * @param agentCode the agent code
     */
    public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

    /**
     * Gets agent code.
     *
     * @return the agent code
     */
    public String getAgentCode() {
		return this.agentCode;
	}

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId() {
		return this.alipayUserId;
	}

    /**
     * Sets card name.
     *
     * @param cardName the card name
     */
    public void setCardName(String cardName) {
		this.cardName = cardName;
	}

    /**
     * Gets card name.
     *
     * @return the card name
     */
    public String getCardName() {
		return this.cardName;
	}

    /**
     * Sets card no.
     *
     * @param cardNo the card no
     */
    public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

    /**
     * Gets card no.
     *
     * @return the card no
     */
    public String getCardNo() {
		return this.cardNo;
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
		return "alipay.ecard.edu.balance.get";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("agent_code", this.agentCode);
		txtParams.put("alipay_user_id", this.alipayUserId);
		txtParams.put("card_name", this.cardName);
		txtParams.put("card_no", this.cardNo);
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

	public Class<AlipayEcardEduBalanceGetResponse> getResponseClass() {
		return AlipayEcardEduBalanceGetResponse.class;
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
