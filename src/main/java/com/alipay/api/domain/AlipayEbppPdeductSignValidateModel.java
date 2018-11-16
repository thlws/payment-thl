package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费直连代扣签约前置校验
 *
 * @author auto create
 * @since 1.0, 2017-08-04 11:19:34
 */
public class AlipayEbppPdeductSignValidateModel extends AlipayObject {

	private static final long serialVersionUID = 3248488687143633743L;

	/**
	 * 机构签约代扣来源渠道
PUBLICPLATFORM：服务窗
	 */
	@ApiField("agent_channel")
	private String agentChannel;

	/**
	 * 从服务窗发起则为该服务窗的appid的值
	 */
	@ApiField("agent_code")
	private String agentCode;

	/**
	 * 户号，机构针对于每户的水、电都会有唯一的标识户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型。
JF：缴水、电、燃气、固话宽带、有线电视、交通罚款费用
WUYE：缴物业费
HK：信用卡还款
TX：手机充值
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付宝缴费系统中的出账机构ID
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 签约类型,可为空。目前类型有INST_DIRECT_DEDUCT
	 */
	@ApiField("deduct_type")
	private String deductType;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 通知方式设置，本期预留字段，固定传空。
	 */
	@ApiField("notify_config")
	private String notifyConfig;

	/**
	 * 外部机构签约的协议id
	 */
	@ApiField("out_agreement_id")
	private String outAgreementId;

	/**
	 * 户名，户主真实姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 支付工具设置，目前可为空。类型有：BALANCE;CARTOON;BIGAMOUNT_CREDIT_CARTOON;DEBIT_EXPRESS;OPTIMIZED_MOTO;PCREDIT_PAY;MONEY_FUND
	 */
	@ApiField("pay_config")
	private String payConfig;

	/**
	 * 商户签约支付宝账号的userid，2088开头16位长度的字符串，在支付宝系统中唯一
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 签约到期时间。空表示无限期，一期固定传空。
	 */
	@ApiField("sign_expire_date")
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
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 用户支付宝账号id，2088开头16位长度的字符串，在支付宝系统中唯一
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets agent channel.
     *
     * @return the agent channel
     */
    public String getAgentChannel() {
		return this.agentChannel;
	}

    /**
     * Sets agent channel.
     *
     * @param agentChannel the agent channel
     */
    public void setAgentChannel(String agentChannel) {
		this.agentChannel = agentChannel;
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
     * Sets agent code.
     *
     * @param agentCode the agent code
     */
    public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
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
     * Sets bill key.
     *
     * @param billKey the bill key
     */
    public void setBillKey(String billKey) {
		this.billKey = billKey;
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
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
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
     * Sets charge inst.
     *
     * @param chargeInst the charge inst
     */
    public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
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
     * Sets deduct type.
     *
     * @param deductType the deduct type
     */
    public void setDeductType(String deductType) {
		this.deductType = deductType;
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
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
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
     * Sets notify config.
     *
     * @param notifyConfig the notify config
     */
    public void setNotifyConfig(String notifyConfig) {
		this.notifyConfig = notifyConfig;
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
     * Sets out agreement id.
     *
     * @param outAgreementId the out agreement id
     */
    public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
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
     * Sets owner name.
     *
     * @param ownerName the owner name
     */
    public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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
     * Sets pay config.
     *
     * @param payConfig the pay config
     */
    public void setPayConfig(String payConfig) {
		this.payConfig = payConfig;
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
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(String pid) {
		this.pid = pid;
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
     * Sets sign expire date.
     *
     * @param signExpireDate the sign expire date
     */
    public void setSignExpireDate(String signExpireDate) {
		this.signExpireDate = signExpireDate;
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
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
