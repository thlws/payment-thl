package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 逆向物流信息
 *
 * @author auto create
 * @since 1.0, 2018-09-19 10:49:39
 */
public class AssetReverseGoodsItem extends AlipayObject {

	private static final long serialVersionUID = 3772942871318318112L;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 阶段
	 */
	@ApiField("phase")
	private String phase;

	/**
	 * 逆向申请单ID
	 */
	@ApiField("reverse_apply_order_id")
	private String reverseApplyOrderId;

	/**
	 * 逆向申请单明细ID
	 */
	@ApiField("reverse_apply_order_item_id")
	private String reverseApplyOrderItemId;

	/**
	 * 标识类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 申请输入信息
	 */
	@ApiField("value")
	private String value;

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets phase.
     *
     * @return the phase
     */
    public String getPhase() {
		return this.phase;
	}

    /**
     * Sets phase.
     *
     * @param phase the phase
     */
    public void setPhase(String phase) {
		this.phase = phase;
	}

    /**
     * Gets reverse apply order id.
     *
     * @return the reverse apply order id
     */
    public String getReverseApplyOrderId() {
		return this.reverseApplyOrderId;
	}

    /**
     * Sets reverse apply order id.
     *
     * @param reverseApplyOrderId the reverse apply order id
     */
    public void setReverseApplyOrderId(String reverseApplyOrderId) {
		this.reverseApplyOrderId = reverseApplyOrderId;
	}

    /**
     * Gets reverse apply order item id.
     *
     * @return the reverse apply order item id
     */
    public String getReverseApplyOrderItemId() {
		return this.reverseApplyOrderItemId;
	}

    /**
     * Sets reverse apply order item id.
     *
     * @param reverseApplyOrderItemId the reverse apply order item id
     */
    public void setReverseApplyOrderItemId(String reverseApplyOrderItemId) {
		this.reverseApplyOrderItemId = reverseApplyOrderItemId;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
		return this.value;
	}

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(String value) {
		this.value = value;
	}

}
