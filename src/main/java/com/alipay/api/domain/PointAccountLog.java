package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集分宝账户流水详情
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class PointAccountLog extends AlipayObject {

	private static final long serialVersionUID = 2628775919498163425L;

	/**
	 * 账务流水号,与"我的集分宝"页面流水号保持一致
	 */
	@ApiField("account_log_id")
	private String accountLogId;

	/**
	 * 该笔交易后该账户余额，值为集分宝个数
	 */
	@ApiField("balance")
	private Long balance;

	/**
	 * 支付宝订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部订单号,集分宝充值时淘宝传递给微账务的订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 交易金额,集分宝个数,如果个数小于0则是支出,大于0是收入
	 */
	@ApiField("point_amount")
	private Long pointAmount;

	/**
	 * 子交易代码
	 */
	@ApiField("sub_trans_code")
	private String subTransCode;

	/**
	 * 子交易代码对应中文翻译,如果不想依赖我们的枚举可以使用这个值
	 */
	@ApiField("sub_trans_code_cn")
	private String subTransCodeCn;

	/**
	 * 交易代码
	 */
	@ApiField("trans_code")
	private String transCode;

	/**
	 * 账务执行时间
	 */
	@ApiField("trans_date")
	private Date transDate;

	/**
	 * 交易备注信息
	 */
	@ApiField("trans_memo")
	private String transMemo;

    /**
     * Gets account log id.
     *
     * @return the account log id
     */
    public String getAccountLogId() {
		return this.accountLogId;
	}

    /**
     * Sets account log id.
     *
     * @param accountLogId the account log id
     */
    public void setAccountLogId(String accountLogId) {
		this.accountLogId = accountLogId;
	}

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public Long getBalance() {
		return this.balance;
	}

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(Long balance) {
		this.balance = balance;
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
     * Gets point amount.
     *
     * @return the point amount
     */
    public Long getPointAmount() {
		return this.pointAmount;
	}

    /**
     * Sets point amount.
     *
     * @param pointAmount the point amount
     */
    public void setPointAmount(Long pointAmount) {
		this.pointAmount = pointAmount;
	}

    /**
     * Gets sub trans code.
     *
     * @return the sub trans code
     */
    public String getSubTransCode() {
		return this.subTransCode;
	}

    /**
     * Sets sub trans code.
     *
     * @param subTransCode the sub trans code
     */
    public void setSubTransCode(String subTransCode) {
		this.subTransCode = subTransCode;
	}

    /**
     * Gets sub trans code cn.
     *
     * @return the sub trans code cn
     */
    public String getSubTransCodeCn() {
		return this.subTransCodeCn;
	}

    /**
     * Sets sub trans code cn.
     *
     * @param subTransCodeCn the sub trans code cn
     */
    public void setSubTransCodeCn(String subTransCodeCn) {
		this.subTransCodeCn = subTransCodeCn;
	}

    /**
     * Gets trans code.
     *
     * @return the trans code
     */
    public String getTransCode() {
		return this.transCode;
	}

    /**
     * Sets trans code.
     *
     * @param transCode the trans code
     */
    public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

    /**
     * Gets trans date.
     *
     * @return the trans date
     */
    public Date getTransDate() {
		return this.transDate;
	}

    /**
     * Sets trans date.
     *
     * @param transDate the trans date
     */
    public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

    /**
     * Gets trans memo.
     *
     * @return the trans memo
     */
    public String getTransMemo() {
		return this.transMemo;
	}

    /**
     * Sets trans memo.
     *
     * @param transMemo the trans memo
     */
    public void setTransMemo(String transMemo) {
		this.transMemo = transMemo;
	}

}
