package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停止AA收款批次
 *
 * @author auto create
 * @since 1.0, 2018-07-20 12:09:41
 */
public class AlipayFundTransAacollectBatchCloseModel extends AlipayObject {

	private static final long serialVersionUID = 8624563683269771976L;

	/**
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 创建批次返回 的token
	 */
	@ApiField("batch_token")
	private String batchToken;

	/**
	 * 当前支付宝用户id
	 */
	@ApiField("current_user_id")
	private String currentUserId;

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo() {
		return this.batchNo;
	}

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

    /**
     * Gets batch token.
     *
     * @return the batch token
     */
    public String getBatchToken() {
		return this.batchToken;
	}

    /**
     * Sets batch token.
     *
     * @param batchToken the batch token
     */
    public void setBatchToken(String batchToken) {
		this.batchToken = batchToken;
	}

    /**
     * Gets current user id.
     *
     * @return the current user id
     */
    public String getCurrentUserId() {
		return this.currentUserId;
	}

    /**
     * Sets current user id.
     *
     * @param currentUserId the current user id
     */
    public void setCurrentUserId(String currentUserId) {
		this.currentUserId = currentUserId;
	}

}
