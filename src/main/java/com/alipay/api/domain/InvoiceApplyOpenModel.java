package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票申请模型
 *
 * @author auto create
 * @since 1.0, 2018-07-02 10:29:40
 */
public class InvoiceApplyOpenModel extends AlipayObject {

	private static final long serialVersionUID = 2572924584757666516L;

	/**
	 * 复核人
	 */
	@ApiField("checker")
	private String checker;

	/**
	 * 操作员
	 */
	@ApiField("clerk")
	private String clerk;

	/**
	 * 不含税金额
	 */
	@ApiField("ex_tax_amount")
	private String exTaxAmount;

	/**
	 * 发票金额（加税合计）
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票内容项
	 */
	@ApiListField("invoice_content")
	@ApiField("invoice_item_apply_open_model")
	private List<InvoiceItemApplyOpenModel> invoiceContent;

	/**
	 * 发票类型：
增值税普通电子发票(PLAIN)
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 发票备注
	 */
	@ApiField("invoice_memo")
	private String invoiceMemo;

	/**
	 * 发票抬头
	 */
	@ApiField("invoice_title")
	private InvoiceTitleApplyOpenModel invoiceTitle;

	/**
	 * 仅用于红冲，对应红冲对应的原始蓝票的发票代码，红冲时该字段必填，开蓝票时该字段不需填
	 */
	@ApiField("ori_blue_inv_code")
	private String oriBlueInvCode;

	/**
	 * 仅用于红冲，对应红冲对应的原始蓝票的发票号码，红冲时该字段必填，开蓝票时该字段不需填
	 */
	@ApiField("ori_blue_inv_no")
	private String oriBlueInvNo;

	/**
	 * 发起方生成的开票申请唯一id，要求发起方全局唯一，支付宝依据其进行幂等控制。
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	/**
	 * 申请开票对应的商户交易流水号，该流水号必须保证在同商户范围内全局唯一。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 收款人
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * 销售方地址
	 */
	@ApiField("payee_address")
	private String payeeAddress;

	/**
	 * 销售方开户账户
	 */
	@ApiField("payee_bank_account")
	private String payeeBankAccount;

	/**
	 * 销售方开户行
	 */
	@ApiField("payee_bank_name")
	private String payeeBankName;

	/**
	 * 销售方名称，对应于销售方纳税人识别号的名称
	 */
	@ApiField("payee_register_name")
	private String payeeRegisterName;

	/**
	 * 销售方纳税人识别号
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 销售方电话
	 */
	@ApiField("payee_tel")
	private String payeeTel;

	/**
	 * 购买方联系方式-邮箱，商家开蓝票时，该字段必填，使用该邮箱向购买方发送发票pdf文件。其它情况均可不传
	 */
	@ApiField("payer_contact_email")
	private String payerContactEmail;

	/**
	 * 购买方联系方式，依据税控厂商的要求，如若底层税控对接的是浙江航信，该字段必传，其它情况可不传
	 */
	@ApiField("payer_contact_mobile")
	private String payerContactMobile;

	/**
	 * 合计税额
	 */
	@ApiField("sum_tax_amount")
	private String sumTaxAmount;

	/**
	 * 商户在税控服务开通后，税控厂商会向商户分配秘钥并提供token的生成方法，商户或ISV利用该方法生成token以获得此次调用的操作权限。目前对于阿里平台来说，不需要校验该权限，如果底层税控对接的是阿里平台的话，该字段可不填，其它的税控厂商该字段为必填
	 */
	@ApiField("tax_token")
	private String taxToken;

	/**
	 * 交易发生时间,依据税控厂商要求，目前底层税控对接的是浙江航信的话，该字段必填
	 */
	@ApiField("trade_date")
	private String tradeDate;

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
     * Gets invoice content.
     *
     * @return the invoice content
     */
    public List<InvoiceItemApplyOpenModel> getInvoiceContent() {
		return this.invoiceContent;
	}

    /**
     * Sets invoice content.
     *
     * @param invoiceContent the invoice content
     */
    public void setInvoiceContent(List<InvoiceItemApplyOpenModel> invoiceContent) {
		this.invoiceContent = invoiceContent;
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
     * Gets invoice title.
     *
     * @return the invoice title
     */
    public InvoiceTitleApplyOpenModel getInvoiceTitle() {
		return this.invoiceTitle;
	}

    /**
     * Sets invoice title.
     *
     * @param invoiceTitle the invoice title
     */
    public void setInvoiceTitle(InvoiceTitleApplyOpenModel invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
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
     * Gets out apply id.
     *
     * @return the out apply id
     */
    public String getOutApplyId() {
		return this.outApplyId;
	}

    /**
     * Sets out apply id.
     *
     * @param outApplyId the out apply id
     */
    public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
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
     * Gets payee address.
     *
     * @return the payee address
     */
    public String getPayeeAddress() {
		return this.payeeAddress;
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
     * Gets payee bank account.
     *
     * @return the payee bank account
     */
    public String getPayeeBankAccount() {
		return this.payeeBankAccount;
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
     * Gets payee bank name.
     *
     * @return the payee bank name
     */
    public String getPayeeBankName() {
		return this.payeeBankName;
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
     * Gets payee tel.
     *
     * @return the payee tel
     */
    public String getPayeeTel() {
		return this.payeeTel;
	}

    /**
     * Sets payee tel.
     *
     * @param payeeTel the payee tel
     */
    public void setPayeeTel(String payeeTel) {
		this.payeeTel = payeeTel;
	}

    /**
     * Gets payer contact email.
     *
     * @return the payer contact email
     */
    public String getPayerContactEmail() {
		return this.payerContactEmail;
	}

    /**
     * Sets payer contact email.
     *
     * @param payerContactEmail the payer contact email
     */
    public void setPayerContactEmail(String payerContactEmail) {
		this.payerContactEmail = payerContactEmail;
	}

    /**
     * Gets payer contact mobile.
     *
     * @return the payer contact mobile
     */
    public String getPayerContactMobile() {
		return this.payerContactMobile;
	}

    /**
     * Sets payer contact mobile.
     *
     * @param payerContactMobile the payer contact mobile
     */
    public void setPayerContactMobile(String payerContactMobile) {
		this.payerContactMobile = payerContactMobile;
	}

    /**
     * Gets sum tax amount.
     *
     * @return the sum tax amount
     */
    public String getSumTaxAmount() {
		return this.sumTaxAmount;
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
     * Gets tax token.
     *
     * @return the tax token
     */
    public String getTaxToken() {
		return this.taxToken;
	}

    /**
     * Sets tax token.
     *
     * @param taxToken the tax token
     */
    public void setTaxToken(String taxToken) {
		this.taxToken = taxToken;
	}

    /**
     * Gets trade date.
     *
     * @return the trade date
     */
    public String getTradeDate() {
		return this.tradeDate;
	}

    /**
     * Sets trade date.
     *
     * @param tradeDate the trade date
     */
    public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

}
