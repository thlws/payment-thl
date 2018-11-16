package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单明细信息，可以同步多笔账单，json数组
 *
 * @author auto create
 * @since 1.0, 2017-11-08 10:54:24
 */
public class AlipayEcoRenthouseBill extends AlipayObject {

	private static final long serialVersionUID = 3641838594492386118L;

	/**
	 * 账单金额
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 账单创建时间
数据格式: yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("bill_create_time")
	private Date billCreateTime;

	/**
	 * 对描述该笔账单进行具体描述，用于提醒用户。例如：八月房屋租金、八月杂费等。
	 */
	@ApiField("bill_desc")
	private String billDesc;

	/**
	 * 账单编号-ka保证唯一
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单状态
0:正常1:作废2:关闭
	 */
	@ApiField("bill_status")
	private Long billStatus;

	/**
	 * 账单类型
10001:房屋租金
10002:其他费用
20001:房屋押金
20002:其他押金
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 数据格式: yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("deadline_date")
	private String deadlineDate;

	/**
	 * 定金抵扣金额
	 */
	@ApiField("deduction_amount")
	private String deductionAmount;

	/**
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 结束时间
数据格式：yyyy-mm-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 租约编号(KA内部租约业务编号)
	 */
	@ApiField("lease_no")
	private String leaseNo;

	/**
	 * 其他未涵盖信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 最低支付金额
	 */
	@ApiField("min_pay_amount")
	private String minPayAmount;

	/**
	 * 已支付金额
	 */
	@ApiField("paid_amount")
	private String paidAmount;

	/**
	 * 1:禁止tp发起支付
	 */
	@ApiField("pay_lock")
	private Long payLock;

	/**
	 * 禁止支付原因-页面提示租客
	 */
	@ApiField("pay_lock_memo")
	private String payLockMemo;

	/**
	 * 支付状态
0:未支付1:已支付
	 */
	@ApiField("pay_status")
	private Long payStatus;

	/**
	 * 账单支付时间
数据格式: yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 开始时间
数据格式：yyyy-mm-dd
	 */
	@ApiField("start_date")
	private String startDate;

    /**
     * Gets bill amount.
     *
     * @return the bill amount
     */
    public String getBillAmount() {
		return this.billAmount;
	}

    /**
     * Sets bill amount.
     *
     * @param billAmount the bill amount
     */
    public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

    /**
     * Gets bill create time.
     *
     * @return the bill create time
     */
    public Date getBillCreateTime() {
		return this.billCreateTime;
	}

    /**
     * Sets bill create time.
     *
     * @param billCreateTime the bill create time
     */
    public void setBillCreateTime(Date billCreateTime) {
		this.billCreateTime = billCreateTime;
	}

    /**
     * Gets bill desc.
     *
     * @return the bill desc
     */
    public String getBillDesc() {
		return this.billDesc;
	}

    /**
     * Sets bill desc.
     *
     * @param billDesc the bill desc
     */
    public void setBillDesc(String billDesc) {
		this.billDesc = billDesc;
	}

    /**
     * Gets bill no.
     *
     * @return the bill no
     */
    public String getBillNo() {
		return this.billNo;
	}

    /**
     * Sets bill no.
     *
     * @param billNo the bill no
     */
    public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

    /**
     * Gets bill status.
     *
     * @return the bill status
     */
    public Long getBillStatus() {
		return this.billStatus;
	}

    /**
     * Sets bill status.
     *
     * @param billStatus the bill status
     */
    public void setBillStatus(Long billStatus) {
		this.billStatus = billStatus;
	}

    /**
     * Gets bill type.
     *
     * @return the bill type
     */
    public String getBillType() {
		return this.billType;
	}

    /**
     * Sets bill type.
     *
     * @param billType the bill type
     */
    public void setBillType(String billType) {
		this.billType = billType;
	}

    /**
     * Gets deadline date.
     *
     * @return the deadline date
     */
    public String getDeadlineDate() {
		return this.deadlineDate;
	}

    /**
     * Sets deadline date.
     *
     * @param deadlineDate the deadline date
     */
    public void setDeadlineDate(String deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

    /**
     * Gets deduction amount.
     *
     * @return the deduction amount
     */
    public String getDeductionAmount() {
		return this.deductionAmount;
	}

    /**
     * Sets deduction amount.
     *
     * @param deductionAmount the deduction amount
     */
    public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

    /**
     * Gets discount amount.
     *
     * @return the discount amount
     */
    public String getDiscountAmount() {
		return this.discountAmount;
	}

    /**
     * Sets discount amount.
     *
     * @param discountAmount the discount amount
     */
    public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

    /**
     * Gets end date.
     *
     * @return the end date
     */
    public String getEndDate() {
		return this.endDate;
	}

    /**
     * Sets end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

    /**
     * Gets lease no.
     *
     * @return the lease no
     */
    public String getLeaseNo() {
		return this.leaseNo;
	}

    /**
     * Sets lease no.
     *
     * @param leaseNo the lease no
     */
    public void setLeaseNo(String leaseNo) {
		this.leaseNo = leaseNo;
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
     * Gets min pay amount.
     *
     * @return the min pay amount
     */
    public String getMinPayAmount() {
		return this.minPayAmount;
	}

    /**
     * Sets min pay amount.
     *
     * @param minPayAmount the min pay amount
     */
    public void setMinPayAmount(String minPayAmount) {
		this.minPayAmount = minPayAmount;
	}

    /**
     * Gets paid amount.
     *
     * @return the paid amount
     */
    public String getPaidAmount() {
		return this.paidAmount;
	}

    /**
     * Sets paid amount.
     *
     * @param paidAmount the paid amount
     */
    public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

    /**
     * Gets pay lock.
     *
     * @return the pay lock
     */
    public Long getPayLock() {
		return this.payLock;
	}

    /**
     * Sets pay lock.
     *
     * @param payLock the pay lock
     */
    public void setPayLock(Long payLock) {
		this.payLock = payLock;
	}

    /**
     * Gets pay lock memo.
     *
     * @return the pay lock memo
     */
    public String getPayLockMemo() {
		return this.payLockMemo;
	}

    /**
     * Sets pay lock memo.
     *
     * @param payLockMemo the pay lock memo
     */
    public void setPayLockMemo(String payLockMemo) {
		this.payLockMemo = payLockMemo;
	}

    /**
     * Gets pay status.
     *
     * @return the pay status
     */
    public Long getPayStatus() {
		return this.payStatus;
	}

    /**
     * Sets pay status.
     *
     * @param payStatus the pay status
     */
    public void setPayStatus(Long payStatus) {
		this.payStatus = payStatus;
	}

    /**
     * Gets pay time.
     *
     * @return the pay time
     */
    public Date getPayTime() {
		return this.payTime;
	}

    /**
     * Sets pay time.
     *
     * @param payTime the pay time
     */
    public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public String getStartDate() {
		return this.startDate;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
