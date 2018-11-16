package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单内容变更接口
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:27:48
 */
public class AlipayEcoMycarMaintainOrderserverNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2842352843721386912L;

	/**
	 * 更改金额。变更项影响金额。金额增加为正数，金额减少为负数。金额单位(元)，保留两位小数。
	 */
	@ApiField("change_cost")
	private String changeCost;

	/**
	 * 变更描述，描述订单变更内容。
	 */
	@ApiField("change_desc")
	private String changeDesc;

	/**
	 * 车主平台订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

    /**
     * Gets change cost.
     *
     * @return the change cost
     */
    public String getChangeCost() {
		return this.changeCost;
	}

    /**
     * Sets change cost.
     *
     * @param changeCost the change cost
     */
    public void setChangeCost(String changeCost) {
		this.changeCost = changeCost;
	}

    /**
     * Gets change desc.
     *
     * @return the change desc
     */
    public String getChangeDesc() {
		return this.changeDesc;
	}

    /**
     * Sets change desc.
     *
     * @param changeDesc the change desc
     */
    public void setChangeDesc(String changeDesc) {
		this.changeDesc = changeDesc;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
