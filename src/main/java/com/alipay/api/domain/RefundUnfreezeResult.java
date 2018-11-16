package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款解冻信息
 *
 * @author auto create
 * @since 1.0, 2016-11-21 12:06:39
 */
public class RefundUnfreezeResult extends AlipayObject {

	private static final long serialVersionUID = 8846676267822966694L;

	/**
	 * 冻结单号
	 */
	@ApiField("freeze_no")
	private String freezeNo;

	/**
	 * 解冻结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 解冻状态。S成功，F失败。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 解冻金额
	 */
	@ApiField("unfreeze_amount")
	private String unfreezeAmount;

	/**
	 * 解冻单号
	 */
	@ApiField("unfreeze_no")
	private String unfreezeNo;

	/**
	 * 解冻时间
	 */
	@ApiField("unfreeze_time")
	private String unfreezeTime;

    /**
     * Gets freeze no.
     *
     * @return the freeze no
     */
    public String getFreezeNo() {
		return this.freezeNo;
	}

    /**
     * Sets freeze no.
     *
     * @param freezeNo the freeze no
     */
    public void setFreezeNo(String freezeNo) {
		this.freezeNo = freezeNo;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode() {
		return this.resultCode;
	}

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
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
     * Gets unfreeze amount.
     *
     * @return the unfreeze amount
     */
    public String getUnfreezeAmount() {
		return this.unfreezeAmount;
	}

    /**
     * Sets unfreeze amount.
     *
     * @param unfreezeAmount the unfreeze amount
     */
    public void setUnfreezeAmount(String unfreezeAmount) {
		this.unfreezeAmount = unfreezeAmount;
	}

    /**
     * Gets unfreeze no.
     *
     * @return the unfreeze no
     */
    public String getUnfreezeNo() {
		return this.unfreezeNo;
	}

    /**
     * Sets unfreeze no.
     *
     * @param unfreezeNo the unfreeze no
     */
    public void setUnfreezeNo(String unfreezeNo) {
		this.unfreezeNo = unfreezeNo;
	}

    /**
     * Gets unfreeze time.
     *
     * @return the unfreeze time
     */
    public String getUnfreezeTime() {
		return this.unfreezeTime;
	}

    /**
     * Sets unfreeze time.
     *
     * @param unfreezeTime the unfreeze time
     */
    public void setUnfreezeTime(String unfreezeTime) {
		this.unfreezeTime = unfreezeTime;
	}

}
