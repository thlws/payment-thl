package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * aa收款查询详情
 *
 * @author auto create
 * @since 1.0, 2018-07-20 12:10:02
 */
public class AlipayFundTransAacollectBatchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1366654537543374163L;

	/**
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 防止接口被遍历所设置的查询token，在调用创建批次时生成，随批次号下发
	 */
	@ApiField("batch_token")
	private String batchToken;

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

}
