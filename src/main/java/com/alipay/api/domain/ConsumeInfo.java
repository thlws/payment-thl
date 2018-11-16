package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费送信息列表
 *
 * @author auto create
 * @since 1.0, 2016-11-24 22:26:22
 */
public class ConsumeInfo extends AlipayObject {

	private static final long serialVersionUID = 3126958446847356759L;

	/**
	 * 领取时间
	 */
	@ApiField("taken_time")
	private String takenTime;

	/**
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 面额（单位分）
	 */
	@ApiField("voucher_amt")
	private String voucherAmt;

    /**
     * Gets taken time.
     *
     * @return the taken time
     */
    public String getTakenTime() {
		return this.takenTime;
	}

    /**
     * Sets taken time.
     *
     * @param takenTime the taken time
     */
    public void setTakenTime(String takenTime) {
		this.takenTime = takenTime;
	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
		return this.userName;
	}

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

    /**
     * Gets voucher amt.
     *
     * @return the voucher amt
     */
    public String getVoucherAmt() {
		return this.voucherAmt;
	}

    /**
     * Sets voucher amt.
     *
     * @param voucherAmt the voucher amt
     */
    public void setVoucherAmt(String voucherAmt) {
		this.voucherAmt = voucherAmt;
	}

}
