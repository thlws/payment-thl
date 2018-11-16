package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余额宝负债端预测数据
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:52:09
 */
public class AlipayYebLqdDataResult extends AlipayObject {

	private static final long serialVersionUID = 1816617829427888975L;

	/**
	 * 申购预测，单位:元
	 */
	@ApiField("predict_purchase_amt")
	private String predictPurchaseAmt;

	/**
	 * 赎回预测,单位:元
	 */
	@ApiField("predict_redeem_amt")
	private String predictRedeemAmt;

	/**
	 * 预测日期，格式为yyyymmdd
	 */
	@ApiField("target_date")
	private String targetDate;

    /**
     * Gets predict purchase amt.
     *
     * @return the predict purchase amt
     */
    public String getPredictPurchaseAmt() {
		return this.predictPurchaseAmt;
	}

    /**
     * Sets predict purchase amt.
     *
     * @param predictPurchaseAmt the predict purchase amt
     */
    public void setPredictPurchaseAmt(String predictPurchaseAmt) {
		this.predictPurchaseAmt = predictPurchaseAmt;
	}

    /**
     * Gets predict redeem amt.
     *
     * @return the predict redeem amt
     */
    public String getPredictRedeemAmt() {
		return this.predictRedeemAmt;
	}

    /**
     * Sets predict redeem amt.
     *
     * @param predictRedeemAmt the predict redeem amt
     */
    public void setPredictRedeemAmt(String predictRedeemAmt) {
		this.predictRedeemAmt = predictRedeemAmt;
	}

    /**
     * Gets target date.
     *
     * @return the target date
     */
    public String getTargetDate() {
		return this.targetDate;
	}

    /**
     * Sets target date.
     *
     * @param targetDate the target date
     */
    public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
	}

}
