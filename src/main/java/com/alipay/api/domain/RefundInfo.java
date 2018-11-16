package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退货明细信息
 *
 * @author auto create
 * @since 1.0, 2018-02-08 10:30:16
 */
public class RefundInfo extends AlipayObject {

	private static final long serialVersionUID = 2296443614549396351L;

	/**
	 * 退款金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商品单ID
	 */
	@ApiField("item_order_no")
	private String itemOrderNo;

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
     * Gets item order no.
     *
     * @return the item order no
     */
    public String getItemOrderNo() {
		return this.itemOrderNo;
	}

    /**
     * Sets item order no.
     *
     * @param itemOrderNo the item order no
     */
    public void setItemOrderNo(String itemOrderNo) {
		this.itemOrderNo = itemOrderNo;
	}

}
