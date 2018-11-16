package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退票订单
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class DishonorOrder extends AlipayObject {

	private static final long serialVersionUID = 6841614713719276468L;

	/**
	 * 退票金额：单位：元。
只支持2位小数，小数点前最大支持13位，金额必须大于0。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 退票时间：格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("dishonor_date")
	private String dishonorDate;

	/**
	 * 退票原因：银行返回的退票原因。
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 支付宝转账单据号。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户转账唯一订单号:发起转账来源方定义的转账单据号。该参数的赋值均以查询结果中的out_biz_no为准。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付时间:格式为yyyy-MM-dd HH:mm:ss。转账失败不返回。
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 付款方账户:付款方支付宝唯一标识（2088开头16位数字字符串）或支付宝会员登录号（邮箱或手机号）
	 */
	@ApiField("payer_account")
	private String payerAccount;

	/**
	 * 提现流水号。
	 */
	@ApiField("payment_no")
	private String paymentNo;

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
     * Gets dishonor date.
     *
     * @return the dishonor date
     */
    public String getDishonorDate() {
		return this.dishonorDate;
	}

    /**
     * Sets dishonor date.
     *
     * @param dishonorDate the dishonor date
     */
    public void setDishonorDate(String dishonorDate) {
		this.dishonorDate = dishonorDate;
	}

    /**
     * Gets fail reason.
     *
     * @return the fail reason
     */
    public String getFailReason() {
		return this.failReason;
	}

    /**
     * Sets fail reason.
     *
     * @param failReason the fail reason
     */
    public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId() {
		return this.orderId;
	}

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets pay date.
     *
     * @return the pay date
     */
    public String getPayDate() {
		return this.payDate;
	}

    /**
     * Sets pay date.
     *
     * @param payDate the pay date
     */
    public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

    /**
     * Gets payer account.
     *
     * @return the payer account
     */
    public String getPayerAccount() {
		return this.payerAccount;
	}

    /**
     * Sets payer account.
     *
     * @param payerAccount the payer account
     */
    public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}

    /**
     * Gets payment no.
     *
     * @return the payment no
     */
    public String getPaymentNo() {
		return this.paymentNo;
	}

    /**
     * Sets payment no.
     *
     * @param paymentNo the payment no
     */
    public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}

}
