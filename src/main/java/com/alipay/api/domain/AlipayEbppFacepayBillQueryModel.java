package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费当面付账单状态查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-30 22:11:37
 */
public class AlipayEbppFacepayBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8255666365394495779L;

	/**
	 * 支付宝交易流水号(和user_id、user_identity_code三者至少传一个) 
（缴税业务：out_order_no/user_id/bill_no都可以不传）
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * ISV流水号，用于控制幂等，须确保全局唯一。
（缴税业务：可采用{征收机关代码}-{外部申报号}的形式）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付宝用户ID(和user_identity_code、bill_no三者至少传一个) 
（缴税业务：out_order_no/user_id/bill_no都可以不传）
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户支付宝付款码 (需使用下单时用的码值，10分钟内有效）(和user_id、bill_no三者至少传一个)
（缴税业务：out_order_no/user_id/bill_no都可以不传）
	 */
	@ApiField("user_identity_code")
	private String userIdentityCode;

    /**
     * Gets bill no.
     *
     * @return the bill no
     */
    public String getBillNo() {
		return this.billNo;
	}

    /**
     * Sets bill no.
     *
     * @param billNo the bill no
     */
    public void setBillNo(String billNo) {
		this.billNo = billNo;
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

    /**
     * Gets user identity code.
     *
     * @return the user identity code
     */
    public String getUserIdentityCode() {
		return this.userIdentityCode;
	}

    /**
     * Sets user identity code.
     *
     * @param userIdentityCode the user identity code
     */
    public void setUserIdentityCode(String userIdentityCode) {
		this.userIdentityCode = userIdentityCode;
	}

}
