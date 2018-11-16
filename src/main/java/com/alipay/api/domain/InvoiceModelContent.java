package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票详情模型
 *
 * @author auto create
 * @since 1.0, 2018-05-28 10:41:48
 */
public class InvoiceModelContent extends AlipayObject {

	private static final long serialVersionUID = 2262437354824886667L;

	/**
	 * key=value，每组键值对以回车分割
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * 下载的发票文件类型
可选值：
pdf（发票原文件）
jpg（发票原文件缩略图）
	 */
	@ApiField("file_download_type")
	private String fileDownloadType;

	/**
	 * 文件下载地址，当同步发票tax_type=PLAIN时，必传；
此处的链接请务必传入可下载PDF的链接
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	/**
	 * 发票金额，大于0且精确到小数点两位，以元为单位
需要传入税价合计金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票代码，国税局生成的唯一值，不可为空串
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票内容项
	 */
	@ApiListField("invoice_content")
	@ApiField("invoice_item_content")
	private List<InvoiceItemContent> invoiceContent;

	/**
	 * 发票日期，用户填写，目前精确到日
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票防伪码
	 */
	@ApiField("invoice_fake_code")
	private String invoiceFakeCode;

	/**
	 * 原始发票PDF文件流
	 */
	@ApiField("invoice_file_data")
	private String invoiceFileData;

	/**
	 * 发票原始文件jpg文件地址
	 */
	@ApiField("invoice_img_url")
	private String invoiceImgUrl;

	/**
	 * 发票号码，国税局生成的唯一号码，不可为空串；
使用时请注意，invoice_no+invoice_code唯一，不能重复
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票开具操作人
	 */
	@ApiField("invoice_operator")
	private String invoiceOperator;

	/**
	 * 发票title
	 */
	@ApiField("invoice_title")
	private InvoiceTitleModel invoiceTitle;

	/**
	 * 发票类型，按照可选值只传入英文部分，该字段严格要求大小写
可选值:
blue（蓝票）
red（红票）
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 仅用于同步红票，原始蓝票发票代码，同步红票时必传
	 */
	@ApiField("original_blue_invoice_code")
	private String originalBlueInvoiceCode;

	/**
	 * 仅用于同步红票，原始蓝票发票号码，同步红票时必传
	 */
	@ApiField("original_blue_invoice_no")
	private String originalBlueInvoiceNo;

	/**
	 * 商户交易流水号，不可为空串;
传入红票时请注意，此字段的值要和蓝票保持一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户唯一开票申请业务流水号，同一个isv下不能重复
	 */
	@ApiField("out_invoice_id")
	private String outInvoiceId;

	/**
	 * 开票单位地址
	 */
	@ApiField("register_address")
	private String registerAddress;

	/**
	 * 开票单位开户行账号
	 */
	@ApiField("register_bank_account")
	private String registerBankAccount;

	/**
	 * 开票单位开户行名称
	 */
	@ApiField("register_bank_name")
	private String registerBankName;

	/**
	 * 开票单位
	 */
	@ApiField("register_name")
	private String registerName;

	/**
	 * 纳税人识别号，不可为空串
	 */
	@ApiField("register_no")
	private String registerNo;

	/**
	 * 开票人电话，支持座机和手机两种格式
	 */
	@ApiField("register_phone_no")
	private String registerPhoneNo;

	/**
	 * 价税合计
	 */
	@ApiField("sum_amount")
	private String sumAmount;

	/**
	 * 税额
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 税种
可选值：
PLAIN（普票的情况）
SPECIAL（专票的情况）
	 */
	@ApiField("tax_type")
	private String taxType;

	/**
	 * 支付宝用户id,当同步的是蓝票时，必传。红票时不需传。
	 */
	@ApiField("user_id")
	private String userId;

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
     * Gets invoice content.
     *
     * @return the invoice content
     */
    public List<InvoiceItemContent> getInvoiceContent() {
		return this.invoiceContent;
	}

    /**
     * Sets invoice content.
     *
     * @param invoiceContent the invoice content
     */
    public void setInvoiceContent(List<InvoiceItemContent> invoiceContent) {
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
     * Gets invoice fake code.
     *
     * @return the invoice fake code
     */
    public String getInvoiceFakeCode() {
		return this.invoiceFakeCode;
	}

    /**
     * Sets invoice fake code.
     *
     * @param invoiceFakeCode the invoice fake code
     */
    public void setInvoiceFakeCode(String invoiceFakeCode) {
		this.invoiceFakeCode = invoiceFakeCode;
	}

    /**
     * Gets invoice file data.
     *
     * @return the invoice file data
     */
    public String getInvoiceFileData() {
		return this.invoiceFileData;
	}

    /**
     * Sets invoice file data.
     *
     * @param invoiceFileData the invoice file data
     */
    public void setInvoiceFileData(String invoiceFileData) {
		this.invoiceFileData = invoiceFileData;
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
     * Gets invoice operator.
     *
     * @return the invoice operator
     */
    public String getInvoiceOperator() {
		return this.invoiceOperator;
	}

    /**
     * Sets invoice operator.
     *
     * @param invoiceOperator the invoice operator
     */
    public void setInvoiceOperator(String invoiceOperator) {
		this.invoiceOperator = invoiceOperator;
	}

    /**
     * Gets invoice title.
     *
     * @return the invoice title
     */
    public InvoiceTitleModel getInvoiceTitle() {
		return this.invoiceTitle;
	}

    /**
     * Sets invoice title.
     *
     * @param invoiceTitle the invoice title
     */
    public void setInvoiceTitle(InvoiceTitleModel invoiceTitle) {
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
     * Gets original blue invoice code.
     *
     * @return the original blue invoice code
     */
    public String getOriginalBlueInvoiceCode() {
		return this.originalBlueInvoiceCode;
	}

    /**
     * Sets original blue invoice code.
     *
     * @param originalBlueInvoiceCode the original blue invoice code
     */
    public void setOriginalBlueInvoiceCode(String originalBlueInvoiceCode) {
		this.originalBlueInvoiceCode = originalBlueInvoiceCode;
	}

    /**
     * Gets original blue invoice no.
     *
     * @return the original blue invoice no
     */
    public String getOriginalBlueInvoiceNo() {
		return this.originalBlueInvoiceNo;
	}

    /**
     * Sets original blue invoice no.
     *
     * @param originalBlueInvoiceNo the original blue invoice no
     */
    public void setOriginalBlueInvoiceNo(String originalBlueInvoiceNo) {
		this.originalBlueInvoiceNo = originalBlueInvoiceNo;
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
     * Gets register address.
     *
     * @return the register address
     */
    public String getRegisterAddress() {
		return this.registerAddress;
	}

    /**
     * Sets register address.
     *
     * @param registerAddress the register address
     */
    public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}

    /**
     * Gets register bank account.
     *
     * @return the register bank account
     */
    public String getRegisterBankAccount() {
		return this.registerBankAccount;
	}

    /**
     * Sets register bank account.
     *
     * @param registerBankAccount the register bank account
     */
    public void setRegisterBankAccount(String registerBankAccount) {
		this.registerBankAccount = registerBankAccount;
	}

    /**
     * Gets register bank name.
     *
     * @return the register bank name
     */
    public String getRegisterBankName() {
		return this.registerBankName;
	}

    /**
     * Sets register bank name.
     *
     * @param registerBankName the register bank name
     */
    public void setRegisterBankName(String registerBankName) {
		this.registerBankName = registerBankName;
	}

    /**
     * Gets register name.
     *
     * @return the register name
     */
    public String getRegisterName() {
		return this.registerName;
	}

    /**
     * Sets register name.
     *
     * @param registerName the register name
     */
    public void setRegisterName(String registerName) {
		this.registerName = registerName;
	}

    /**
     * Gets register no.
     *
     * @return the register no
     */
    public String getRegisterNo() {
		return this.registerNo;
	}

    /**
     * Sets register no.
     *
     * @param registerNo the register no
     */
    public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

    /**
     * Gets register phone no.
     *
     * @return the register phone no
     */
    public String getRegisterPhoneNo() {
		return this.registerPhoneNo;
	}

    /**
     * Sets register phone no.
     *
     * @param registerPhoneNo the register phone no
     */
    public void setRegisterPhoneNo(String registerPhoneNo) {
		this.registerPhoneNo = registerPhoneNo;
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
     * Gets tax type.
     *
     * @return the tax type
     */
    public String getTaxType() {
		return this.taxType;
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
