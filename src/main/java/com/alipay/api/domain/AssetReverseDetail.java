package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 逆向物料信息 - 退换货或取消订单
 *
 * @author auto create
 * @since 1.0, 2018-09-19 11:01:27
 */
public class AssetReverseDetail extends AlipayObject {

	private static final long serialVersionUID = 1726295245387321196L;

	/**
	 * 退货数量
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 取消订单或退货唯一ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 物料状态
	 */
	@ApiField("goods_status")
	private String goodsStatus;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets assign item id.
     *
     * @return the assign item id
     */
    public String getAssignItemId() {
		return this.assignItemId;
	}

    /**
     * Sets assign item id.
     *
     * @param assignItemId the assign item id
     */
    public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

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
     * Gets goods status.
     *
     * @return the goods status
     */
    public String getGoodsStatus() {
		return this.goodsStatus;
	}

    /**
     * Sets goods status.
     *
     * @param goodsStatus the goods status
     */
    public void setGoodsStatus(String goodsStatus) {
		this.goodsStatus = goodsStatus;
	}

}
