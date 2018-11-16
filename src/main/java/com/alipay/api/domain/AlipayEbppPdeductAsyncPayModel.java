package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公共事业缴费直连代扣异步扣款支付接口
 *
 * @author auto create
 * @since 1.0, 2017-08-04 11:19:56
 */
public class AlipayEbppPdeductAsyncPayModel extends AlipayObject {

	private static final long serialVersionUID = 8773245384521343111L;

	/**
	 * 分配给外部机构发起扣款时的渠道码。朗新为LANGXIN
	 */
	@ApiField("agent_channel")
	private String agentChannel;

	/**
	 * 二级渠道码，预留字段
	 */
	@ApiField("agent_code")
	private String agentCode;

	/**
	 * 支付宝代扣协议Id
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 滞纳金
	 */
	@ApiField("fine_amount")
	private String fineAmount;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户外部业务流水号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 扣款金额，支付总金额，包含滞纳金
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 商户partnerId
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 用户ID
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
     * Gets agreement id.
     *
     * @return the agreement id
     */
    public String getAgreementId() {
		return this.agreementId;
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
     * Gets bill date.
     *
     * @return the bill date
     */
    public String getBillDate() {
		return this.billDate;
	}

    /**
     * Sets bill date.
     *
     * @param billDate the bill date
     */
    public void setBillDate(String billDate) {
		this.billDate = billDate;
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
     * Gets fine amount.
     *
     * @return the fine amount
     */
    public String getFineAmount() {
		return this.fineAmount;
	}

    /**
     * Sets fine amount.
     *
     * @param fineAmount the fine amount
     */
    public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets pay amount.
     *
     * @return the pay amount
     */
    public String getPayAmount() {
		return this.payAmount;
	}

    /**
     * Sets pay amount.
     *
     * @param payAmount the pay amount
     */
    public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
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
