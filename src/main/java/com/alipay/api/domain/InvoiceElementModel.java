package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票要素模型
 *
 * @author auto create
 * @since 1.0, 2018-08-24 14:52:47
 */
public class InvoiceElementModel extends AlipayObject {

	private static final long serialVersionUID = 3338445441182244697L;

	/**
	 * 发票报销状态
取值范围：
WAIT_EXPENSE－未报销
EXPENSE_PROCESSING－报销中
EXPENSE_FINISHED－已报销
	 */
	@ApiField("expense_status")
	private String expenseStatus;

	/**
	 * 发票是否有pdf文件
	 */
	@ApiField("has_pdf_file")
	private Boolean hasPdfFile;

	/**
	 * 该发票可能存在异常，请核实后使用
true:无异常
false:存在异常
	 */
	@ApiField("has_risk")
	private Boolean hasRisk;

	/**
	 * 发票金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票pdf文件转换后jpg预览地址
	 */
	@ApiField("invoice_img_url")
	private String invoiceImgUrl;

	/**
	 * 发票类型
可选值
PLAIN：增值税电子普通发票
SPECIAL：增值税专用发票
PLAIN_INVOICE:增值税普通发票
PAPER_INVOICE:增值税普通发票（卷式）
SALSE_INVOICE:机动车销售统一发票
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票状态　
取值范围
SUCCEED－正常蓝票
EXPIRED－已失效
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * logo地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 商户全称
	 */
	@ApiField("m_name")
	private String mName;

	/**
	 * 销方名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 销方税号
	 */
	@ApiField("payee_tax_no")
	private String payeeTaxNo;

	/**
	 * 购方名称
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 购方税号
	 */
	@ApiField("payer_tax_no")
	private String payerTaxNo;

    /**
     * Gets expense status.
     *
     * @return the expense status
     */
    public String getExpenseStatus() {
		return this.expenseStatus;
	}

    /**
     * Sets expense status.
     *
     * @param expenseStatus the expense status
     */
    public void setExpenseStatus(String expenseStatus) {
		this.expenseStatus = expenseStatus;
	}

    /**
     * Gets has pdf file.
     *
     * @return the has pdf file
     */
    public Boolean getHasPdfFile() {
		return this.hasPdfFile;
	}

    /**
     * Sets has pdf file.
     *
     * @param hasPdfFile the has pdf file
     */
    public void setHasPdfFile(Boolean hasPdfFile) {
		this.hasPdfFile = hasPdfFile;
	}

    /**
     * Gets has risk.
     *
     * @return the has risk
     */
    public Boolean getHasRisk() {
		return this.hasRisk;
	}

    /**
     * Sets has risk.
     *
     * @param hasRisk the has risk
     */
    public void setHasRisk(Boolean hasRisk) {
		this.hasRisk = hasRisk;
	}

    /**
     * Gets invoice amount.
     *
     * @return the invoice amount
     */
    public String getInvoiceAmount() {
		return this.invoiceAmount;
	}

    /**
     * Sets invoice amount.
     *
     * @param invoiceAmount the invoice amount
     */
    public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
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
     * Gets invoice date.
     *
     * @return the invoice date
     */
    public String getInvoiceDate() {
		return this.invoiceDate;
	}

    /**
     * Sets invoice date.
     *
     * @param invoiceDate the invoice date
     */
    public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

    /**
     * Gets invoice img url.
     *
     * @return the invoice img url
     */
    public String getInvoiceImgUrl() {
		return this.invoiceImgUrl;
	}

    /**
     * Sets invoice img url.
     *
     * @param invoiceImgUrl the invoice img url
     */
    public void setInvoiceImgUrl(String invoiceImgUrl) {
		this.invoiceImgUrl = invoiceImgUrl;
	}

    /**
     * Gets invoice kind.
     *
     * @return the invoice kind
     */
    public String getInvoiceKind() {
		return this.invoiceKind;
	}

    /**
     * Sets invoice kind.
     *
     * @param invoiceKind the invoice kind
     */
    public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
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
     * Gets invoice status.
     *
     * @return the invoice status
     */
    public String getInvoiceStatus() {
		return this.invoiceStatus;
	}

    /**
     * Sets invoice status.
     *
     * @param invoiceStatus the invoice status
     */
    public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

    /**
     * Gets logo url.
     *
     * @return the logo url
     */
    public String getLogoUrl() {
		return this.logoUrl;
	}

    /**
     * Sets logo url.
     *
     * @param logoUrl the logo url
     */
    public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getmName() {
		return this.mName;
	}

    /**
     * Sets name.
     *
     * @param mName the m name
     */
    public void setmName(String mName) {
		this.mName = mName;
	}

    /**
     * Gets payee name.
     *
     * @return the payee name
     */
    public String getPayeeName() {
		return this.payeeName;
	}

    /**
     * Sets payee name.
     *
     * @param payeeName the payee name
     */
    public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

    /**
     * Gets payee tax no.
     *
     * @return the payee tax no
     */
    public String getPayeeTaxNo() {
		return this.payeeTaxNo;
	}

    /**
     * Sets payee tax no.
     *
     * @param payeeTaxNo the payee tax no
     */
    public void setPayeeTaxNo(String payeeTaxNo) {
		this.payeeTaxNo = payeeTaxNo;
	}

    /**
     * Gets payer name.
     *
     * @return the payer name
     */
    public String getPayerName() {
		return this.payerName;
	}

    /**
     * Sets payer name.
     *
     * @param payerName the payer name
     */
    public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

    /**
     * Gets payer tax no.
     *
     * @return the payer tax no
     */
    public String getPayerTaxNo() {
		return this.payerTaxNo;
	}

    /**
     * Sets payer tax no.
     *
     * @param payerTaxNo the payer tax no
     */
    public void setPayerTaxNo(String payerTaxNo) {
		this.payerTaxNo = payerTaxNo;
	}

}
