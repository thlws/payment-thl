package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受托打款接口
 *
 * @author auto create
 * @since 1.0, 2018-08-13 12:40:32
 */
public class AlipayFundCouponOrderDisburseModel extends AlipayObject {

	private static final long serialVersionUID = 4519759554932472749L;

	/**
	 * 需要支付的金额，单位为：元（人民币），精确到小数点后两位
取值范围：[0.01,100000000.00]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 发放红包时产生的支付宝资金订单号。deduct_auth_no与下面的deduct_out_order_no不能同时为空，二者都存在时，以deduct_auth_no为准。为了保证支付的高效，建议商户传入deduct_auth_no。
	 */
	@ApiField("deduct_auth_no")
	private String deductAuthNo;

	/**
	 * 发放红包时的商户授权资金订单号。deduct_out_order_no与上面的deduct_auth_no不能同时为空，二者都存在时，以deduct_auth_no为准。为了保证支付的高效，建议商户传入deduct_auth_no。
	 */
	@ApiField("deduct_out_order_no")
	private String deductOutOrderNo;

	/**
	 * 业务扩展参数，用于商户的特定业务信息的传递，json格式
	 */
	@ApiField("extra_param")
	private String extraParam;

	/**
	 * 业务订单的简单描述，如商品名称等
长度不超过100个字母或50个汉字
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户的授权资金订单号
同一商户不同的订单，商户授权资金订单号不能重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商户本次资金操作的请求流水号
同一商户每次不同的资金操作请求，商户请求流水号不要重复
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭该笔订单
取值范围：1m～7d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为90m，如果为空，默认1h
	 */
	@ApiField("pay_timeout")
	private String payTimeout;

	/**
	 * 收款方的支付宝登录号，形式为手机号或邮箱等
	 */
	@ApiField("payee_logon_id")
	private String payeeLogonId;

	/**
	 * 收款方的支付宝唯一用户号,以2088开头的16位纯数字组成
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

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
     * Gets deduct auth no.
     *
     * @return the deduct auth no
     */
    public String getDeductAuthNo() {
		return this.deductAuthNo;
	}

    /**
     * Sets deduct auth no.
     *
     * @param deductAuthNo the deduct auth no
     */
    public void setDeductAuthNo(String deductAuthNo) {
		this.deductAuthNo = deductAuthNo;
	}

    /**
     * Gets deduct out order no.
     *
     * @return the deduct out order no
     */
    public String getDeductOutOrderNo() {
		return this.deductOutOrderNo;
	}

    /**
     * Sets deduct out order no.
     *
     * @param deductOutOrderNo the deduct out order no
     */
    public void setDeductOutOrderNo(String deductOutOrderNo) {
		this.deductOutOrderNo = deductOutOrderNo;
	}

    /**
     * Gets extra param.
     *
     * @return the extra param
     */
    public String getExtraParam() {
		return this.extraParam;
	}

    /**
     * Sets extra param.
     *
     * @param extraParam the extra param
     */
    public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}

    /**
     * Gets order title.
     *
     * @return the order title
     */
    public String getOrderTitle() {
		return this.orderTitle;
	}

    /**
     * Sets order title.
     *
     * @param orderTitle the order title
     */
    public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
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
     * Gets pay timeout.
     *
     * @return the pay timeout
     */
    public String getPayTimeout() {
		return this.payTimeout;
	}

    /**
     * Sets pay timeout.
     *
     * @param payTimeout the pay timeout
     */
    public void setPayTimeout(String payTimeout) {
		this.payTimeout = payTimeout;
	}

    /**
     * Gets payee logon id.
     *
     * @return the payee logon id
     */
    public String getPayeeLogonId() {
		return this.payeeLogonId;
	}

    /**
     * Sets payee logon id.
     *
     * @param payeeLogonId the payee logon id
     */
    public void setPayeeLogonId(String payeeLogonId) {
		this.payeeLogonId = payeeLogonId;
	}

    /**
     * Gets payee user id.
     *
     * @return the payee user id
     */
    public String getPayeeUserId() {
		return this.payeeUserId;
	}

    /**
     * Sets payee user id.
     *
     * @param payeeUserId the payee user id
     */
    public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

}
