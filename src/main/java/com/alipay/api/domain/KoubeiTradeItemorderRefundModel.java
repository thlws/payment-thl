package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑商品交易退货接口
 *
 * @author auto create
 * @since 1.0, 2018-02-08 10:30:16
 */
public class KoubeiTradeItemorderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 7567726283721511125L;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 标识一次退款请求，同一笔订单多次退款需要保证唯一
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 退款原因描述
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 退货明细信息
	 */
	@ApiListField("refund_infos")
	@ApiField("refund_info")
	private List<RefundInfo> refundInfos;

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

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets reason.
     *
     * @return the reason
     */
    public String getReason() {
		return this.reason;
	}

    /**
     * Sets reason.
     *
     * @param reason the reason
     */
    public void setReason(String reason) {
		this.reason = reason;
	}

    /**
     * Gets refund infos.
     *
     * @return the refund infos
     */
    public List<RefundInfo> getRefundInfos() {
		return this.refundInfos;
	}

    /**
     * Sets refund infos.
     *
     * @param refundInfos the refund infos
     */
    public void setRefundInfos(List<RefundInfo> refundInfos) {
		this.refundInfos = refundInfos;
	}

}
