package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料单据获取成功反馈接口
 *
 * @author auto create
 * @since 1.0, 2017-11-21 17:41:15
 */
public class KoubeiSalesKbassetStuffOrdersresultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6821431783437322865L;

	/**
	 * 物料单据反馈列表，最大200条
	 */
	@ApiListField("orders_feedback")
	@ApiField("access_orders_feed_back")
	private List<AccessOrdersFeedBack> ordersFeedback;

    /**
     * Gets orders feedback.
     *
     * @return the orders feedback
     */
    public List<AccessOrdersFeedBack> getOrdersFeedback() {
		return this.ordersFeedback;
	}

    /**
     * Sets orders feedback.
     *
     * @param ordersFeedback the orders feedback
     */
    public void setOrdersFeedback(List<AccessOrdersFeedBack> ordersFeedback) {
		this.ordersFeedback = ordersFeedback;
	}

}
