package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票报销处理进度同步
 *
 * @author auto create
 * @since 1.0, 2018-04-23 13:18:37
 */
public class AlipayEbppInvoiceExpenseProgressSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2495495277287846957L;

	/**
	 * 同步申请id，每次发起同步时生成，isv每次请求需要保证唯一
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 报销状态变更执行时间
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 报销详情地址，提供用户通过发票管家查看报销进度的地址
如果报销企业入驻发票管家时需要isv传入报销详情地址，则必须提供
	 */
	@ApiField("expense_detail_url")
	private String expenseDetailUrl;

	/**
	 * 报销单据号
	 */
	@ApiField("expense_order_no")
	private String expenseOrderNo;

	/**
	 * 报销企业税号
	 */
	@ApiField("expense_tax_no")
	private String expenseTaxNo;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 报销操作
传值固定：
EXPENSE_APPLY－用户已提交申请
EXPENSE_APPROVAL_PASS －报销审核通过
EXPENSE_FINISHED－报销完结
EXPENSE_CANCEL－报销撤回
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets apply id.
     *
     * @return the apply id
     */
    public String getApplyId() {
		return this.applyId;
	}

    /**
     * Sets apply id.
     *
     * @param applyId the apply id
     */
    public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

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
     * Gets expense detail url.
     *
     * @return the expense detail url
     */
    public String getExpenseDetailUrl() {
		return this.expenseDetailUrl;
	}

    /**
     * Sets expense detail url.
     *
     * @param expenseDetailUrl the expense detail url
     */
    public void setExpenseDetailUrl(String expenseDetailUrl) {
		this.expenseDetailUrl = expenseDetailUrl;
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
     * Gets invoice code.
     *
     * @return the invoice code
     */
    public String getInvoiceCode() {
		return this.invoiceCode;
	}

    /**
     * Sets invoice code.
     *
     * @param invoiceCode the invoice code
     */
    public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

    /**
     * Gets invoice no.
     *
     * @return the invoice no
     */
    public String getInvoiceNo() {
		return this.invoiceNo;
	}

    /**
     * Sets invoice no.
     *
     * @param invoiceNo the invoice no
     */
    public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
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
