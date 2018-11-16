package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceItemContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.detail.output.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-07 15:40:00
 */
public class AlipayEbppInvoiceDetailOutputQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3282453293335377454L;

	/** 
	 * 防伪码
	 */
	@ApiField("anti_fake_code")
	private String antiFakeCode;

	/** 
	 * 不含税金额
	 */
	@ApiField("ex_tax_amount")
	private String exTaxAmount;

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
	 * 该发票可能存在异常，请核实后使用
true:无异常
false:存在异常
	 */
	@ApiField("has_risk")
	private Boolean hasRisk;

	/** 
	 * 是否已上传发票pdf文件
false－未上传
true－已上传
	 */
	@ApiField("has_upload_pdf")
	private String hasUploadPdf;

	/** 
	 * 发票金额（价税合计金额）
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
	 * 发票缩略图地址
	 */
	@ApiField("invoice_img_url")
	private String invoiceImgUrl;

	/** 
	 * 发票内容项
	 */
	@ApiListField("invoice_item_content_list")
	@ApiField("invoice_item_content")
	private List<InvoiceItemContent> invoiceItemContentList;

	/** 
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/** 
	 * 发票状态
SUCCEED－成功
EXPIRED－已失效
TRANSFERRED－已转交
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/** 
	 * 发票类型
值有两种情况：blue－蓝票 red－红票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/** 
	 * 销售方地址
	 */
	@ApiField("payee_address")
	private String payeeAddress;

	/** 
	 * 销售方开户银行账号
	 */
	@ApiField("payee_bank_account")
	private String payeeBankAccount;

	/** 
	 * 销售方开户银行名称
	 */
	@ApiField("payee_bank_name")
	private String payeeBankName;

	/** 
	 * 销售方电话
	 */
	@ApiField("payee_phone")
	private String payeePhone;

	/** 
	 * 销售方名称
	 */
	@ApiField("payee_register_name")
	private String payeeRegisterName;

	/** 
	 * 销售方税号
	 */
	@ApiField("payee_tax_no")
	private String payeeTaxNo;

	/** 
	 * 购买方地址
	 */
	@ApiField("payer_address")
	private String payerAddress;

	/** 
	 * 购买方开户银行账号
	 */
	@ApiField("payer_bank_account")
	private String payerBankAccount;

	/** 
	 * 购买方开户银行名称
	 */
	@ApiField("payer_bank_name")
	private String payerBankName;

	/** 
	 * 购买方名称
	 */
	@ApiField("payer_name")
	private String payerName;

	/** 
	 * 购买方电话
	 */
	@ApiField("payer_phone")
	private String payerPhone;

	/** 
	 * 购买方税号
	 */
	@ApiField("payer_tax_no")
	private String payerTaxNo;

	/** 
	 * 合计税额
	 */
	@ApiField("sum_tax_amount")
	private String sumTaxAmount;

	/** 
	 * 票种
PLAIN：增值税电子普通发票
SPECIAL：增值税专用发票
PLAIN_INVOICE:增值税普通发票
PAPER_INVOICE:增值税普通发票（卷式）
SALSE_INVOICE:机动车销售统一发票
	 */
	@ApiField("tax_type")
	private String taxType;

    /**
     * Sets anti fake code.
     *
     * @param antiFakeCode the anti fake code
     */
    public void setAntiFakeCode(String antiFakeCode) {
		this.antiFakeCode = antiFakeCode;
	}

    /**
     * Gets anti fake code.
     *
     * @return the anti fake code
     */
    public String getAntiFakeCode( ) {
		return this.antiFakeCode;
	}

    /**
     * Sets ex tax amount.
     *
     * @param exTaxAmount the ex tax amount
     */
    public void setExTaxAmount(String exTaxAmount) {
		this.exTaxAmount = exTaxAmount;
	}

    /**
     * Gets ex tax amount.
     *
     * @return the ex tax amount
     */
    public String getExTaxAmount( ) {
		return this.exTaxAmount;
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
     * Gets expense status.
     *
     * @return the expense status
     */
    public String getExpenseStatus( ) {
		return this.expenseStatus;
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
     * Gets has risk.
     *
     * @return the has risk
     */
    public Boolean getHasRisk( ) {
		return this.hasRisk;
	}

    /**
     * Sets has upload pdf.
     *
     * @param hasUploadPdf the has upload pdf
     */
    public void setHasUploadPdf(String hasUploadPdf) {
		this.hasUploadPdf = hasUploadPdf;
	}

    /**
     * Gets has upload pdf.
     *
     * @return the has upload pdf
     */
    public String getHasUploadPdf( ) {
		return this.hasUploadPdf;
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
     * Gets invoice amount.
     *
     * @return the invoice amount
     */
    public String getInvoiceAmount( ) {
		return this.invoiceAmount;
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
     * Gets invoice code.
     *
     * @return the invoice code
     */
    public String getInvoiceCode( ) {
		return this.invoiceCode;
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
     * Gets invoice date.
     *
     * @return the invoice date
     */
    public String getInvoiceDate( ) {
		return this.invoiceDate;
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
     * Gets invoice img url.
     *
     * @return the invoice img url
     */
    public String getInvoiceImgUrl( ) {
		return this.invoiceImgUrl;
	}

    /**
     * Sets invoice item content list.
     *
     * @param invoiceItemContentList the invoice item content list
     */
    public void setInvoiceItemContentList(List<InvoiceItemContent> invoiceItemContentList) {
		this.invoiceItemContentList = invoiceItemContentList;
	}

    /**
     * Gets invoice item content list.
     *
     * @return the invoice item content list
     */
    public List<InvoiceItemContent> getInvoiceItemContentList( ) {
		return this.invoiceItemContentList;
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
     * Gets invoice no.
     *
     * @return the invoice no
     */
    public String getInvoiceNo( ) {
		return this.invoiceNo;
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
     * Gets invoice status.
     *
     * @return the invoice status
     */
    public String getInvoiceStatus( ) {
		return this.invoiceStatus;
	}

    /**
     * Sets invoice type.
     *
     * @param invoiceType the invoice type
     */
    public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

    /**
     * Gets invoice type.
     *
     * @return the invoice type
     */
    public String getInvoiceType( ) {
		return this.invoiceType;
	}

    /**
     * Sets payee address.
     *
     * @param payeeAddress the payee address
     */
    public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}

    /**
     * Gets payee address.
     *
     * @return the payee address
     */
    public String getPayeeAddress( ) {
		return this.payeeAddress;
	}

    /**
     * Sets payee bank account.
     *
     * @param payeeBankAccount the payee bank account
     */
    public void setPayeeBankAccount(String payeeBankAccount) {
		this.payeeBankAccount = payeeBankAccount;
	}

    /**
     * Gets payee bank account.
     *
     * @return the payee bank account
     */
    public String getPayeeBankAccount( ) {
		return this.payeeBankAccount;
	}

    /**
     * Sets payee bank name.
     *
     * @param payeeBankName the payee bank name
     */
    public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}

    /**
     * Gets payee bank name.
     *
     * @return the payee bank name
     */
    public String getPayeeBankName( ) {
		return this.payeeBankName;
	}

    /**
     * Sets payee phone.
     *
     * @param payeePhone the payee phone
     */
    public void setPayeePhone(String payeePhone) {
		this.payeePhone = payeePhone;
	}

    /**
     * Gets payee phone.
     *
     * @return the payee phone
     */
    public String getPayeePhone( ) {
		return this.payeePhone;
	}

    /**
     * Sets payee register name.
     *
     * @param payeeRegisterName the payee register name
     */
    public void setPayeeRegisterName(String payeeRegisterName) {
		this.payeeRegisterName = payeeRegisterName;
	}

    /**
     * Gets payee register name.
     *
     * @return the payee register name
     */
    public String getPayeeRegisterName( ) {
		return this.payeeRegisterName;
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
     * Gets payee tax no.
     *
     * @return the payee tax no
     */
    public String getPayeeTaxNo( ) {
		return this.payeeTaxNo;
	}

    /**
     * Sets payer address.
     *
     * @param payerAddress the payer address
     */
    public void setPayerAddress(String payerAddress) {
		this.payerAddress = payerAddress;
	}

    /**
     * Gets payer address.
     *
     * @return the payer address
     */
    public String getPayerAddress( ) {
		return this.payerAddress;
	}

    /**
     * Sets payer bank account.
     *
     * @param payerBankAccount the payer bank account
     */
    public void setPayerBankAccount(String payerBankAccount) {
		this.payerBankAccount = payerBankAccount;
	}

    /**
     * Gets payer bank account.
     *
     * @return the payer bank account
     */
    public String getPayerBankAccount( ) {
		return this.payerBankAccount;
	}

    /**
     * Sets payer bank name.
     *
     * @param payerBankName the payer bank name
     */
    public void setPayerBankName(String payerBankName) {
		this.payerBankName = payerBankName;
	}

    /**
     * Gets payer bank name.
     *
     * @return the payer bank name
     */
    public String getPayerBankName( ) {
		return this.payerBankName;
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
     * Gets payer name.
     *
     * @return the payer name
     */
    public String getPayerName( ) {
		return this.payerName;
	}

    /**
     * Sets payer phone.
     *
     * @param payerPhone the payer phone
     */
    public void setPayerPhone(String payerPhone) {
		this.payerPhone = payerPhone;
	}

    /**
     * Gets payer phone.
     *
     * @return the payer phone
     */
    public String getPayerPhone( ) {
		return this.payerPhone;
	}

    /**
     * Sets payer tax no.
     *
     * @param payerTaxNo the payer tax no
     */
    public void setPayerTaxNo(String payerTaxNo) {
		this.payerTaxNo = payerTaxNo;
	}

    /**
     * Gets payer tax no.
     *
     * @return the payer tax no
     */
    public String getPayerTaxNo( ) {
		return this.payerTaxNo;
	}

    /**
     * Sets sum tax amount.
     *
     * @param sumTaxAmount the sum tax amount
     */
    public void setSumTaxAmount(String sumTaxAmount) {
		this.sumTaxAmount = sumTaxAmount;
	}

    /**
     * Gets sum tax amount.
     *
     * @return the sum tax amount
     */
    public String getSumTaxAmount( ) {
		return this.sumTaxAmount;
	}

    /**
     * Sets tax type.
     *
     * @param taxType the tax type
     */
    public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

    /**
     * Gets tax type.
     *
     * @return the tax type
     */
    public String getTaxType( ) {
		return this.taxType;
	}

}
