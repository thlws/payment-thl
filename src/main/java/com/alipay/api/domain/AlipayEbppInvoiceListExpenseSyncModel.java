package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报销状态批量同步开放接口
 *
 * @author auto create
 * @since 1.0, 2018-09-06 11:17:34
 */
public class AlipayEbppInvoiceListExpenseSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4888796185174928129L;

	/**
	 * 报销进度变更时间
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 商户报销单据号
	 */
	@ApiField("expense_order_no")
	private String expenseOrderNo;

	/**
	 * 报销企业税号
	 */
	@ApiField("expense_tax_no")
	private String expenseTaxNo;

	/**
	 * 需要同步报销状态的发票列表
	 */
	@ApiListField("invoice_element_list")
	@ApiField("invoice_element_status_sync_open_model")
	private List<InvoiceElementStatusSyncOpenModel> invoiceElementList;

	/**
	 * 报销审批备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * EXPENSE_APPLY:报销申请提交;EXPENSE_APPROVAL_PASS:报销申请审核通过;EXPENSE_FINISHED:报销申请完成;EXPENSE_CANCEL:报销申请撤回
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户uid
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets business time.
     *
     * @return the business time
     */
    public String getBusinessTime() {
		return this.businessTime;
	}

    /**
     * Sets business time.
     *
     * @param businessTime the business time
     */
    public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

    /**
     * Gets expense order no.
     *
     * @return the expense order no
     */
    public String getExpenseOrderNo() {
		return this.expenseOrderNo;
	}

    /**
     * Sets expense order no.
     *
     * @param expenseOrderNo the expense order no
     */
    public void setExpenseOrderNo(String expenseOrderNo) {
		this.expenseOrderNo = expenseOrderNo;
	}

    /**
     * Gets expense tax no.
     *
     * @return the expense tax no
     */
    public String getExpenseTaxNo() {
		return this.expenseTaxNo;
	}

    /**
     * Sets expense tax no.
     *
     * @param expenseTaxNo the expense tax no
     */
    public void setExpenseTaxNo(String expenseTaxNo) {
		this.expenseTaxNo = expenseTaxNo;
	}

    /**
     * Gets invoice element list.
     *
     * @return the invoice element list
     */
    public List<InvoiceElementStatusSyncOpenModel> getInvoiceElementList() {
		return this.invoiceElementList;
	}

    /**
     * Sets invoice element list.
     *
     * @param invoiceElementList the invoice element list
     */
    public void setInvoiceElementList(List<InvoiceElementStatusSyncOpenModel> invoiceElementList) {
		this.invoiceElementList = invoiceElementList;
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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
