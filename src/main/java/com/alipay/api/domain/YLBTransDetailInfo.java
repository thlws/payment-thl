package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余利宝交易详情信息数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class YLBTransDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 7441154731583674127L;

	/**
	 * 余利宝交易金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 交易到账时间
	 */
	@ApiField("trans_account_date")
	private Date transAccountDate;

	/**
	 * 交易时间
	 */
	@ApiField("trans_date")
	private Date transDate;

	/**
	 * 交易名称，如正常申购、正常赎回、收益发放、份额强增、份额强减
	 */
	@ApiField("trans_name")
	private String transName;

	/**
	 * 交易状态，如success-成功、failure-失败、inprocess-进行中等
	 */
	@ApiField("trans_status")
	private String transStatus;

	/**
	 * 交易类型，如正常申购、正常赎回、收益发放、份额强增、份额强减
	 */
	@ApiField("trans_type")
	private String transType;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo() {
		return this.bizNo;
	}

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
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
     * Gets trans account date.
     *
     * @return the trans account date
     */
    public Date getTransAccountDate() {
		return this.transAccountDate;
	}

    /**
     * Sets trans account date.
     *
     * @param transAccountDate the trans account date
     */
    public void setTransAccountDate(Date transAccountDate) {
		this.transAccountDate = transAccountDate;
	}

    /**
     * Gets trans date.
     *
     * @return the trans date
     */
    public Date getTransDate() {
		return this.transDate;
	}

    /**
     * Sets trans date.
     *
     * @param transDate the trans date
     */
    public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

    /**
     * Gets trans name.
     *
     * @return the trans name
     */
    public String getTransName() {
		return this.transName;
	}

    /**
     * Sets trans name.
     *
     * @param transName the trans name
     */
    public void setTransName(String transName) {
		this.transName = transName;
	}

    /**
     * Gets trans status.
     *
     * @return the trans status
     */
    public String getTransStatus() {
		return this.transStatus;
	}

    /**
     * Sets trans status.
     *
     * @param transStatus the trans status
     */
    public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}

    /**
     * Gets trans type.
     *
     * @return the trans type
     */
    public String getTransType() {
		return this.transType;
	}

    /**
     * Sets trans type.
     *
     * @param transType the trans type
     */
    public void setTransType(String transType) {
		this.transType = transType;
	}

}
