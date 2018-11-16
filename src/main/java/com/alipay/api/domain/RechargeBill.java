package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 待圈存的明细
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class RechargeBill extends AlipayObject {

	private static final long serialVersionUID = 2771739975724257699L;

	/**
	 * 用户充值金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 充值时间：YYYY-MM-DD hh:mm:ss
	 */
	@ApiField("deposit_time")
	private String depositTime;

	/**
	 * Transfer：待圈存
Success：圈存成功
Fail：圈存失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

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
     * Gets deposit time.
     *
     * @return the deposit time
     */
    public String getDepositTime() {
		return this.depositTime;
	}

    /**
     * Sets deposit time.
     *
     * @param depositTime the deposit time
     */
    public void setDepositTime(String depositTime) {
		this.depositTime = depositTime;
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
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
