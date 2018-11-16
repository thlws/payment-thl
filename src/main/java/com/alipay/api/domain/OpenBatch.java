package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云验收单品批次
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class OpenBatch extends AlipayObject {

	private static final long serialVersionUID = 3121741366265314858L;

	/**
	 * 批次id
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 批次状态
0，未检测
1，检测中
2，未通过
3，已通过
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/**
	 * 单品数
	 */
	@ApiField("item_num")
	private String itemNum;

    /**
     * Gets batch id.
     *
     * @return the batch id
     */
    public String getBatchId() {
		return this.batchId;
	}

    /**
     * Sets batch id.
     *
     * @param batchId the batch id
     */
    public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

    /**
     * Gets batch status.
     *
     * @return the batch status
     */
    public String getBatchStatus() {
		return this.batchStatus;
	}

    /**
     * Sets batch status.
     *
     * @param batchStatus the batch status
     */
    public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

    /**
     * Gets item num.
     *
     * @return the item num
     */
    public String getItemNum() {
		return this.itemNum;
	}

    /**
     * Sets item num.
     *
     * @param itemNum the item num
     */
    public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

}
