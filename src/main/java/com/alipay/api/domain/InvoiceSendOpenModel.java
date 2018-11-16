package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票同步场景下的发票入参模型
 *
 * @author auto create
 * @since 1.0, 2018-09-18 19:58:01
 */
public class InvoiceSendOpenModel extends AlipayObject {

	private static final long serialVersionUID = 7257266288214634198L;

	/**
	 * 支付宝端的申请id。如果在开票过程中，是通过支付宝提交的申请到机构端，支付宝会带上开票申请在支付宝生成的申请id，机构在回传发票的时候只需要回传这个申请id，不用获取用户的uid，支付宝可以根据申请id将发票归集到对应的用户名下
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 票面上的校验码信息。
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 票面上复核人信息。
	 */
	@ApiField("checker")
	private String checker;

	/**
	 * 票面上开票员信息。
	 */
	@ApiField("clerk")
	private String clerk;

	/**
	 * 不含税金额，票面上的不含税金额，单位（元），保留两位小数。
	 */
	@ApiField("ex_tax_amount")
	private String exTaxAmount;

	/**
	 * 预留的扩展字段，格式如：key1=value1\nkey2=value2\nkey3=value3，字段之间以\n分隔。
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * 下载文件类型，需要回传文件下载链接的情况下必传，PDF:下载文件类型为pdf;JPG:下载的文件类型为jpg。
	 */
	@ApiField("file_download_type")
	private String fileDownloadType;

	/**
	 * 发票的pdf或者jpg文件下载地址。
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	/**
	 * 发票代码，该字段与invoice_no构成一张发票的唯一标识。
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票明细项。
	 */
	@ApiListField("invoice_content")
	@ApiField("invoice_item_open_model")
	private List<InvoiceItemOpenModel> invoiceContent;

	/**
	 * 开票日期，格式如：YYYY-MM-DD。
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 标识发票的类型，PLAIN:增值税电子普通发票;SPECIAL:增值税专用发票;PLAIN_INVOICE:增值税普通发票;SALSE_INVOICE:机动车销售统一发票
;PAPER_INVOICE:增值税普通发票(卷式)。
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 票面上备注信息。
	 */
	@ApiField("invoice_memo")
	private String invoiceMemo;

	/**
	 * 发票号码，该字段与invoice_code构成一张发票的唯一标识。
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票抬头，票面上的购买方信息。
	 */
	@ApiField("invoice_title")
	private InvoiceTitleOpenModel invoiceTitle;

	/**
	 * 标识是红票还是蓝票，RED:红票;BLUE:蓝票。
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 红票情况下，必须填入原始蓝票的发票代码。
	 */
	@ApiField("ori_blue_inv_code")
	private String oriBlueInvCode;

	/**
	 * 红票情况下，必须填入原始蓝票的发票号码。
	 */
	@ApiField("ori_blue_inv_no")
	private String oriBlueInvNo;

	/**
	 * 外部发票id，isv生成发票之后所生成的发票流水号，主要用做存储。
	 */
	@ApiField("out_invoice_id")
	private String outInvoiceId;

	/**
	 * 该发票基于的实际交易流水号。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 票面上收款人信息。
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * 票面上销售方地址、电话信息。
	 */
	@ApiField("payee_address_tel")
	private String payeeAddressTel;

	/**
	 * 票面上销售方开户行及账号。
	 */
	@ApiField("payee_bank_name_account")
	private String payeeBankNameAccount;

	/**
	 * 票面上销售方企业名称。
	 */
	@ApiField("payee_register_name")
	private String payeeRegisterName;

	/**
	 * 票面上销售方税号信息。
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 价税合计，票面上的总开票金额，单位（元），保留两位小数，sum_amount=ex_tax_amount+tax_amount。
	 */
	@ApiField("sum_amount")
	private String sumAmount;

	/**
	 * 合计税额，票面上的合计税额，单位（元），保留两位小数。
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 支付宝用户userId，当发送红字发票时，即invoice_type＝RED时，可选填；或者apply_id不为空的时候，可选填；其他情况必填。
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
     * Gets check code.
     *
     * @return the check code
     */
    public String getCheckCode() {
		return this.checkCode;
	}

    /**
     * Sets check code.
     *
     * @param checkCode the check code
     */
    public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

    /**
     * Gets checker.
     *
     * @return the checker
     */
    public String getChecker() {
		return this.checker;
	}

    /**
     * Sets checker.
     *
     * @param checker the checker
     */
    public void setChecker(String checker) {
		this.checker = checker;
	}

    /**
     * Gets clerk.
     *
     * @return the clerk
     */
    public String getClerk() {
		return this.clerk;
	}

    /**
     * Sets clerk.
     *
     * @param clerk the clerk
     */
    public void setClerk(String clerk) {
		this.clerk = clerk;
	}

    /**
     * Gets ex tax amount.
     *
     * @return the ex tax amount
     */
    public String getExTaxAmount() {
		return this.exTaxAmount;
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
     * Gets extend fields.
     *
     * @return the extend fields
     */
    public String getExtendFields() {
		return this.extendFields;
	}

    /**
     * Sets extend fields.
     *
     * @param extendFields the extend fields
     */
    public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

    /**
     * Gets file download type.
     *
     * @return the file download type
     */
    public String getFileDownloadType() {
		return this.fileDownloadType;
	}

    /**
     * Sets file download type.
     *
     * @param fileDownloadType the file download type
     */
    public void setFileDownloadType(String fileDownloadType) {
		this.fileDownloadType = fileDownloadType;
	}

    /**
     * Gets file download url.
     *
     * @return the file download url
     */
    public String getFileDownloadUrl() {
		return this.fileDownloadUrl;
	}

    /**
     * Sets file download url.
     *
     * @param fileDownloadUrl the file download url
     */
    public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
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
     * Gets invoice content.
     *
     * @return the invoice content
     */
    public List<InvoiceItemOpenModel> getInvoiceContent() {
		return this.invoiceContent;
	}

    /**
     * Sets invoice content.
     *
     * @param invoiceContent the invoice content
     */
    public void setInvoiceContent(List<InvoiceItemOpenModel> invoiceContent) {
		this.invoiceContent = invoiceContent;
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
     * Gets invoice memo.
     *
     * @return the invoice memo
     */
    public String getInvoiceMemo() {
		return this.invoiceMemo;
	}

    /**
     * Sets invoice memo.
     *
     * @param invoiceMemo the invoice memo
     */
    public void setInvoiceMemo(String invoiceMemo) {
		this.invoiceMemo = invoiceMemo;
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
     * Gets invoice title.
     *
     * @return the invoice title
     */
    public InvoiceTitleOpenModel getInvoiceTitle() {
		return this.invoiceTitle;
	}

    /**
     * Sets invoice title.
     *
     * @param invoiceTitle the invoice title
     */
    public void setInvoiceTitle(InvoiceTitleOpenModel invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

    /**
     * Gets invoice type.
     *
     * @return the invoice type
     */
    public String getInvoiceType() {
		return this.invoiceType;
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
     * Gets ori blue inv code.
     *
     * @return the ori blue inv code
     */
    public String getOriBlueInvCode() {
		return this.oriBlueInvCode;
	}

    /**
     * Sets ori blue inv code.
     *
     * @param oriBlueInvCode the ori blue inv code
     */
    public void setOriBlueInvCode(String oriBlueInvCode) {
		this.oriBlueInvCode = oriBlueInvCode;
	}

    /**
     * Gets ori blue inv no.
     *
     * @return the ori blue inv no
     */
    public String getOriBlueInvNo() {
		return this.oriBlueInvNo;
	}

    /**
     * Sets ori blue inv no.
     *
     * @param oriBlueInvNo the ori blue inv no
     */
    public void setOriBlueInvNo(String oriBlueInvNo) {
		this.oriBlueInvNo = oriBlueInvNo;
	}

    /**
     * Gets out invoice id.
     *
     * @return the out invoice id
     */
    public String getOutInvoiceId() {
		return this.outInvoiceId;
	}

    /**
     * Sets out invoice id.
     *
     * @param outInvoiceId the out invoice id
     */
    public void setOutInvoiceId(String outInvoiceId) {
		this.outInvoiceId = outInvoiceId;
	}

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
		return this.outTradeNo;
	}

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

    /**
     * Gets payee.
     *
     * @return the payee
     */
    public String getPayee() {
		return this.payee;
	}

    /**
     * Sets payee.
     *
     * @param payee the payee
     */
    public void setPayee(String payee) {
		this.payee = payee;
	}

    /**
     * Gets payee address tel.
     *
     * @return the payee address tel
     */
    public String getPayeeAddressTel() {
		return this.payeeAddressTel;
	}

    /**
     * Sets payee address tel.
     *
     * @param payeeAddressTel the payee address tel
     */
    public void setPayeeAddressTel(String payeeAddressTel) {
		this.payeeAddressTel = payeeAddressTel;
	}

    /**
     * Gets payee bank name account.
     *
     * @return the payee bank name account
     */
    public String getPayeeBankNameAccount() {
		return this.payeeBankNameAccount;
	}

    /**
     * Sets payee bank name account.
     *
     * @param payeeBankNameAccount the payee bank name account
     */
    public void setPayeeBankNameAccount(String payeeBankNameAccount) {
		this.payeeBankNameAccount = payeeBankNameAccount;
	}

    /**
     * Gets payee register name.
     *
     * @return the payee register name
     */
    public String getPayeeRegisterName() {
		return this.payeeRegisterName;
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
     * Gets payee register no.
     *
     * @return the payee register no
     */
    public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}

    /**
     * Sets payee register no.
     *
     * @param payeeRegisterNo the payee register no
     */
    public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

    /**
     * Gets sum amount.
     *
     * @return the sum amount
     */
    public String getSumAmount() {
		return this.sumAmount;
	}

    /**
     * Sets sum amount.
     *
     * @param sumAmount the sum amount
     */
    public void setSumAmount(String sumAmount) {
		this.sumAmount = sumAmount;
	}

    /**
     * Gets tax amount.
     *
     * @return the tax amount
     */
    public String getTaxAmount() {
		return this.taxAmount;
	}

    /**
     * Sets tax amount.
     *
     * @param taxAmount the tax amount
     */
    public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
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
