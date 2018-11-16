package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEbppPdeductSignAddResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.add request
 *
 * @author auto create
 * @since 1.0, 2018-05-16 11:50:00
 */
public class AlipayEbppPdeductSignAddRequest implements AlipayRequest<AlipayEbppPdeductSignAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 机构签约代扣来源渠道
PUBLICPLATFORM：服务窗
	 */
	private String agentChannel;

	/** 
	* 从服务窗发起则为publicId的值
	 */
	private String agentCode;

	/** 
	* 户号，机构针对于每户的水、电都会有唯一的标识户号
	 */
	private String billKey;

	/** 
	* 业务类型。
JF：缴水、电、燃气、固话宽带、有线电视、交通罚款费用
WUYE：缴物业费
HK：信用卡还款
TX：手机充值
IND: 保险
	 */
	private String bizType;

	/** 
	* 支付宝缴费系统中的出账机构ID
	 */
	private String chargeInst;

	/** 
	* 代扣产品码, 由技术同学分配。 目前在缴费业务场景中，传入INST_DIRECT_DEDUCT; 在保险业务场景中, 传入INSURANCE_MERCHANT_DEDUCT
	 */
	private String deductProdCode;

	/** 
	* 签约类型可为空
	 */
	private String deductType;

	/** 
	* 外部用户实名认证相关信息, 用于做签约时的实名校验。 
注： 

name: 姓名
cert_type: 身份证：IDENTITY_CARD、护照：PASSPORT、军官证：OFFICER_CARD、士兵证：SOLDIER_CARD、户口本：HOKOU等
cert_no: 证件号码
need_check_info取值 T/F，只有为T时才做强制校验。
mobile:手机号，目前暂不使用此字段做校验
min_age: 允许的最小买家年龄,min_age为整数，必须大于等于0.
	 */
	private String extUserInfo;

	/** 
	* 扩展字段
	 */
	private String extendField;

	/** 
	* 通知方式设置，可为空
	 */
	private String notifyConfig;

	/** 
	* 外部产生的协议ID
	 */
	private String outAgreementId;

	/** 
	* 户名，户主真实姓名
	 */
	private String ownerName;

	/** 
	* 支付工具设置，目前可为空
	 */
	private String payConfig;

	/** 
	* 用户签约时，跳转到支付宝独立密码校验页面，校验成功后会将token和对应的用户ID缓存下来，然后跳回到机构页面生成token带回给机构，机构签约时必须传入token
	 */
	private String payPasswordToken;

	/** 
	* 商户ID
	 */
	private String pid;

	/** 
	* 签约到期时间。空表示无限期，一期固定传空。
	 */
	private String signExpireDate;

	/** 
	* 业务子类型。
WATER：缴水费
ELECTRIC：缴电费
GAS：缴燃气费
COMMUN：缴固话宽带
CATV：缴有线电视费
TRAFFIC：缴交通罚款
WUYE：缴物业费
HK：信用卡还款
CZ：手机充值
CAR：车险 
LIFE：寿险 
HEALTH：健康险
	 */
	private String subBizType;

	/** 
	* 用户ID
	 */
	private String userId;

    /**
     * Sets agent channel.
     *
     * @param agentChannel the agent channel
     */
    public void setAgentChannel(String agentChannel) {
		this.agentChannel = agentChannel;
	}

    /**
     * Gets agent channel.
     *
     * @return the agent channel
     */
    public String getAgentChannel() {
		return this.agentChannel;
	}

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
     * Sets bill key.
     *
     * @param billKey the bill key
     */
    public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

    /**
     * Gets bill key.
     *
     * @return the bill key
     */
    public String getBillKey() {
		return this.billKey;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets charge inst.
     *
     * @param chargeInst the charge inst
     */
    public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

    /**
     * Gets charge inst.
     *
     * @return the charge inst
     */
    public String getChargeInst() {
		return this.chargeInst;
	}

    /**
     * Sets deduct prod code.
     *
     * @param deductProdCode the deduct prod code
     */
    public void setDeductProdCode(String deductProdCode) {
		this.deductProdCode = deductProdCode;
	}

    /**
     * Gets deduct prod code.
     *
     * @return the deduct prod code
     */
    public String getDeductProdCode() {
		return this.deductProdCode;
	}

    /**
     * Sets deduct type.
     *
     * @param deductType the deduct type
     */
    public void setDeductType(String deductType) {
		this.deductType = deductType;
	}

    /**
     * Gets deduct type.
     *
     * @return the deduct type
     */
    public String getDeductType() {
		return this.deductType;
	}

    /**
     * Sets ext user info.
     *
     * @param extUserInfo the ext user info
     */
    public void setExtUserInfo(String extUserInfo) {
		this.extUserInfo = extUserInfo;
	}

    /**
     * Gets ext user info.
     *
     * @return the ext user info
     */
    public String getExtUserInfo() {
		return this.extUserInfo;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField() {
		return this.extendField;
	}

    /**
     * Sets notify config.
     *
     * @param notifyConfig the notify config
     */
    public void setNotifyConfig(String notifyConfig) {
		this.notifyConfig = notifyConfig;
	}

    /**
     * Gets notify config.
     *
     * @return the notify config
     */
    public String getNotifyConfig() {
		return this.notifyConfig;
	}

    /**
     * Sets out agreement id.
     *
     * @param outAgreementId the out agreement id
     */
    public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
	}

    /**
     * Gets out agreement id.
     *
     * @return the out agreement id
     */
    public String getOutAgreementId() {
		return this.outAgreementId;
	}

    /**
     * Sets owner name.
     *
     * @param ownerName the owner name
     */
    public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

    /**
     * Gets owner name.
     *
     * @return the owner name
     */
    public String getOwnerName() {
		return this.ownerName;
	}

    /**
     * Sets pay config.
     *
     * @param payConfig the pay config
     */
    public void setPayConfig(String payConfig) {
		this.payConfig = payConfig;
	}

    /**
     * Gets pay config.
     *
     * @return the pay config
     */
    public String getPayConfig() {
		return this.payConfig;
	}

    /**
     * Sets pay password token.
     *
     * @param payPasswordToken the pay password token
     */
    public void setPayPasswordToken(String payPasswordToken) {
		this.payPasswordToken = payPasswordToken;
	}

    /**
     * Gets pay password token.
     *
     * @return the pay password token
     */
    public String getPayPasswordToken() {
		return this.payPasswordToken;
	}

    /**
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(String pid) {
		this.pid = pid;
	}

    /**
     * Gets pid.
     *
     * @return the pid
     */
    public String getPid() {
		return this.pid;
	}

    /**
     * Sets sign expire date.
     *
     * @param signExpireDate the sign expire date
     */
    public void setSignExpireDate(String signExpireDate) {
		this.signExpireDate = signExpireDate;
	}

    /**
     * Gets sign expire date.
     *
     * @return the sign expire date
     */
    public String getSignExpireDate() {
		return this.signExpireDate;
	}

    /**
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

    /**
     * Gets sub biz type.
     *
     * @return the sub biz type
     */
    public String getSubBizType() {
		return this.subBizType;
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
		return "alipay.ebpp.pdeduct.sign.add";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("agent_channel", this.agentChannel);
		txtParams.put("agent_code", this.agentCode);
		txtParams.put("bill_key", this.billKey);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("charge_inst", this.chargeInst);
		txtParams.put("deduct_prod_code", this.deductProdCode);
		txtParams.put("deduct_type", this.deductType);
		txtParams.put("ext_user_info", this.extUserInfo);
		txtParams.put("extend_field", this.extendField);
		txtParams.put("notify_config", this.notifyConfig);
		txtParams.put("out_agreement_id", this.outAgreementId);
		txtParams.put("owner_name", this.ownerName);
		txtParams.put("pay_config", this.payConfig);
		txtParams.put("pay_password_token", this.payPasswordToken);
		txtParams.put("pid", this.pid);
		txtParams.put("sign_expire_date", this.signExpireDate);
		txtParams.put("sub_biz_type", this.subBizType);
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

	public Class<AlipayEbppPdeductSignAddResponse> getResponseClass() {
		return AlipayEbppPdeductSignAddResponse.class;
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
