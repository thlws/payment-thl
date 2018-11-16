package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受理单据撤销接口
 *
 * @author auto create
 * @since 1.0, 2017-11-29 16:52:35
 */
public class AlipayEbppBillRefundModel extends AlipayObject {

	private static final long serialVersionUID = 3128268381438923498L;

	/**
	 * 支付宝流水号。
	 */
	@ApiField("alipay_bill_no")
	private String alipayBillNo;

	/**
	 * 扩展字段，json格式的一系列键值对，示例只是个形式，具体的Key-Value需要根据具体业务另行约定。
无特别约定时，此字段不必传。
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 退款备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * ISV流水号，用于控制幂等，须确保全局唯一（缴税业务：可采用{征收机关代码}-{外部申报号}的形式）
out_order_no与alipay_bill_no二者中至少要传一个
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 退款金额，单位：元
不可超过创单时的金额。
如果scene是TOTAL_FAILURE，则强制要求全额退款，不支持部分退款。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款来源账户。
仅在退款请求对应的业务流水资金已经结算的情况下有用，不指定则不能对已结算业务流水发起退款。
取值可以给定受管控账户2088****************，需要事先在支付宝备案通过方可使用；亦可以填入THIS_ACCOUNT，表示会从当前调用者的账户退款给用户。
	 */
	@ApiField("refund_from")
	private String refundFrom;

	/**
	 * 退款场景，不同场景由不同策略处理。
OVERPAYMENT：退掉用户多支付的金额
PARTIALLY_DONE：业务上部分失败导致退款
TOTAL_FAILURE：完全失败导致的退款
	 */
	@ApiField("scene")
	private String scene;

    /**
     * Gets alipay bill no.
     *
     * @return the alipay bill no
     */
    public String getAlipayBillNo() {
		return this.alipayBillNo;
	}

    /**
     * Sets alipay bill no.
     *
     * @param alipayBillNo the alipay bill no
     */
    public void setAlipayBillNo(String alipayBillNo) {
		this.alipayBillNo = alipayBillNo;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField() {
		return this.extendField;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

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
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets refund amount.
     *
     * @return the refund amount
     */
    public String getRefundAmount() {
		return this.refundAmount;
	}

    /**
     * Sets refund amount.
     *
     * @param refundAmount the refund amount
     */
    public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

    /**
     * Gets refund from.
     *
     * @return the refund from
     */
    public String getRefundFrom() {
		return this.refundFrom;
	}

    /**
     * Sets refund from.
     *
     * @param refundFrom the refund from
     */
    public void setRefundFrom(String refundFrom) {
		this.refundFrom = refundFrom;
	}

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public String getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(String scene) {
		this.scene = scene;
	}

}
