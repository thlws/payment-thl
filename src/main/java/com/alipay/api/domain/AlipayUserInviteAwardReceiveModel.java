package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户拉新奖品抽奖接口
 *
 * @author auto create
 * @since 1.0, 2017-12-07 20:42:10
 */
public class AlipayUserInviteAwardReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 2657649199181888912L;

	/**
	 * 用户扫码抽奖输入的手机号，手机号和用户ID必须有一个非空，如果两者都有，则优先取user_id的值作为后续发奖的用户账号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 外部业务方代码
	 */
	@ApiField("out_biz_code")
	private String outBizCode;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 蚂蚁统一会员ID，手机号和用户ID必须有一个非空，如果两者都有，则优先取user_id的值作为后续发奖的用户账号
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets out biz code.
     *
     * @return the out biz code
     */
    public String getOutBizCode() {
		return this.outBizCode;
	}

    /**
     * Sets out biz code.
     *
     * @param outBizCode the out biz code
     */
    public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
