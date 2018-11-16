package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约批量查询
 *
 * @author auto create
 * @since 1.0, 2018-07-27 18:09:37
 */
public class ZhimaCreditPeContractBatchinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4322665194483287169L;

	/**
	 * 活动名
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 查询批次号，从1开始计数
	 */
	@ApiField("batch_index")
	private Long batchIndex;

	/**
	 * 场景类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 批量查询数据日期
	 */
	@ApiField("query_date")
	private String queryDate;

	/**
	 * 查询事务号
	 */
	@ApiField("transaction_id")
	private String transactionId;

    /**
     * Gets activity name.
     *
     * @return the activity name
     */
    public String getActivityName() {
		return this.activityName;
	}

    /**
     * Sets activity name.
     *
     * @param activityName the activity name
     */
    public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

    /**
     * Gets batch index.
     *
     * @return the batch index
     */
    public Long getBatchIndex() {
		return this.batchIndex;
	}

    /**
     * Sets batch index.
     *
     * @param batchIndex the batch index
     */
    public void setBatchIndex(Long batchIndex) {
		this.batchIndex = batchIndex;
	}

    /**
     * Gets category.
     *
     * @return the category
     */
    public String getCategory() {
		return this.category;
	}

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
		this.category = category;
	}

    /**
     * Gets query date.
     *
     * @return the query date
     */
    public String getQueryDate() {
		return this.queryDate;
	}

    /**
     * Sets query date.
     *
     * @param queryDate the query date
     */
    public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}

    /**
     * Gets transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId() {
		return this.transactionId;
	}

    /**
     * Sets transaction id.
     *
     * @param transactionId the transaction id
     */
    public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
