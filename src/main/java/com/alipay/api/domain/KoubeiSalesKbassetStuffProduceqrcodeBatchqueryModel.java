package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页获取口碑码数据
 *
 * @author auto create
 * @since 1.0, 2017-11-21 17:39:18
 */
public class KoubeiSalesKbassetStuffProduceqrcodeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6585987411741443616L;

	/**
	 * 口碑批次号
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 每页容量，最小1，最大100
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 生产单号
	 */
	@ApiField("produce_order_id")
	private String produceOrderId;

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
     * Gets page size.
     *
     * @return the page size
     */
    public String getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets produce order id.
     *
     * @return the produce order id
     */
    public String getProduceOrderId() {
		return this.produceOrderId;
	}

    /**
     * Sets produce order id.
     *
     * @param produceOrderId the produce order id
     */
    public void setProduceOrderId(String produceOrderId) {
		this.produceOrderId = produceOrderId;
	}

}
