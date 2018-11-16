package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单状态推进接口
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:22:57
 */
public class AlipayDaoweiOrderTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4847154522878684299L;

	/**
	 * 备注信息。商户在推进订单状态时填写的备注信息，不超过500字符。
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 需要推进的订单状态。目前支持的订单动作是：START_SERVICE(派单模式服务开始)；PROVIDER_CONFIRMED (服务者完成服务)。
	 */
	@ApiField("order_action")
	private String orderAction;

	/**
	 * 到位业务订单号。用户在到位下单时，由到位系统生成的32位全局唯一数字 id。
通过应用中的应用网关post发送给商户（应用网关配置参考链接：https%3A%2F%2Fdoc.open.alipay.com%2Fdocs%2Fdoc.htm%3Fspm%3Da219a.7629140.0.0.TcIuKL%26treeId%3D193%26articleId%3D105310%26docType%3D1）。
	 */
	@ApiField("order_no")
	private String orderNo;

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
     * Gets order action.
     *
     * @return the order action
     */
    public String getOrderAction() {
		return this.orderAction;
	}

    /**
     * Sets order action.
     *
     * @param orderAction the order action
     */
    public void setOrderAction(String orderAction) {
		this.orderAction = orderAction;
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
