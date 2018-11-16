package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘宝司法拍卖余额查询
 *
 * @author auto create
 * @since 1.0, 2018-01-23 12:16:13
 */
public class AlipayFundTransAuctionBalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1157852335162378417L;

	/**
	 * 业务id，唯一业务标识
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 开户银行标识
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 核身id，用于验证是否已经核身成功
	 */
	@ApiField("verify_id")
	private String verifyId;

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets inst id.
     *
     * @return the inst id
     */
    public String getInstId() {
		return this.instId;
	}

    /**
     * Sets inst id.
     *
     * @param instId the inst id
     */
    public void setInstId(String instId) {
		this.instId = instId;
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
     * Gets verify id.
     *
     * @return the verify id
     */
    public String getVerifyId() {
		return this.verifyId;
	}

    /**
     * Sets verify id.
     *
     * @param verifyId the verify id
     */
    public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
