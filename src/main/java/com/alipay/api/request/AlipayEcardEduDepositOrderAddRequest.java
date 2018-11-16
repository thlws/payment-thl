package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEcardEduDepositOrderAddResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ecard.edu.deposit.order.add request
 *
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:44
 */
public class AlipayEcardEduDepositOrderAddRequest implements AlipayRequest<AlipayEcardEduDepositOrderAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 校园一卡通机构
	 */
	private String agentCode;

	/** 
	* 公众账号协议Id
	 */
	private String agreementId;

	/** 
	* 支付宝userId
	 */
	private String alipayUserId;

	/** 
	* 校园一卡通帐户姓名
	 */
	private String cardName;

	/** 
	* 校园一卡通号码
	 */
	private String cardNo;

	/** 
	* 校园一卡通充值金额
	 */
	private String depositAmount;

	/** 
	* 成功充值通知手机号码
	 */
	private String mobileNo;

	/** 
	* 公众平台ID
	 */
	private String publicId;

	/** 
	* 是否分享手机号码
	 */
	private String shareMobileNo;

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

    /**
     * Sets deposit amount.
     *
     * @param depositAmount the deposit amount
     */
    public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}

    /**
     * Gets deposit amount.
     *
     * @return the deposit amount
     */
    public String getDepositAmount() {
		return this.depositAmount;
	}

    /**
     * Sets mobile no.
     *
     * @param mobileNo the mobile no
     */
    public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

    /**
     * Gets mobile no.
     *
     * @return the mobile no
     */
    public String getMobileNo() {
		return this.mobileNo;
	}

    /**
     * Sets public id.
     *
     * @param publicId the public id
     */
    public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

    /**
     * Gets public id.
     *
     * @return the public id
     */
    public String getPublicId() {
		return this.publicId;
	}

    /**
     * Sets share mobile no.
     *
     * @param shareMobileNo the share mobile no
     */
    public void setShareMobileNo(String shareMobileNo) {
		this.shareMobileNo = shareMobileNo;
	}

    /**
     * Gets share mobile no.
     *
     * @return the share mobile no
     */
    public String getShareMobileNo() {
		return this.shareMobileNo;
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
		return "alipay.ecard.edu.deposit.order.add";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("agent_code", this.agentCode);
		txtParams.put("agreement_id", this.agreementId);
		txtParams.put("alipay_user_id", this.alipayUserId);
		txtParams.put("card_name", this.cardName);
		txtParams.put("card_no", this.cardNo);
		txtParams.put("deposit_amount", this.depositAmount);
		txtParams.put("mobile_no", this.mobileNo);
		txtParams.put("public_id", this.publicId);
		txtParams.put("share_mobile_no", this.shareMobileNo);
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

	public Class<AlipayEcardEduDepositOrderAddResponse> getResponseClass() {
		return AlipayEcardEduDepositOrderAddResponse.class;
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
