package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票查询输出模型
 *
 * @author auto create
 * @since 1.0, 2017-05-09 19:40:04
 */
public class InvoiceQueryOpenModel extends AlipayObject {

	private static final long serialVersionUID = 1891922413615537298L;

	/**
	 * 申请发起方，
描述开票申请的发起角色，由销售方（PAYEE）或购买方（PAYER）发起。
	 */
	@ApiField("apply_from")
	private String applyFrom;

	/**
	 * 校验码
	 */
	@ApiField("check_code")
	private String checkCode;

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
	 * 发票代码
	 */
	@ApiField("einv_code")
	private String einvCode;

	/**
	 * 发票号码
	 */
	@ApiField("einv_no")
	private String einvNo;

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
	 * 发票明细项
	 */
	@ApiListField("invoice_content")
	@ApiField("invoice_item_query_open_model")
	private List<InvoiceItemQueryOpenModel> invoiceContent;

	/**
	 * 发票日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 支付宝发票id，全局唯一
	 */
	@ApiField("invoice_id")
	private String invoiceId;

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
	 * 购买方发票抬头信息
	 */
	@ApiField("invoice_title")
	private InvoiceTitleQueryOpenModel invoiceTitle;

	/**
	 * 发票类型：蓝票/红票
BLUE（蓝票）/RED（红票）
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 定义商户的一级简称,用于标识商户品牌，对应于商户入驻时填写的"商户品牌简称"。
如：肯德基：KFC
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 仅用于红冲，仅用于红冲，对应红冲对应的原始蓝票的发票号码
	 */
	@ApiField("ori_blue_inv_code")
	private String oriBlueInvCode;

	/**
	 * 仅用于红冲，仅用于红冲，对应红冲对应的原始蓝票的发票号码
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
	 * 发票文件预览图
	 */
	@ApiField("preview_image_url")
	private String previewImageUrl;

	/**
	 * 定义商户的二级简称,用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的"商户门店简称"。
如：肯德基-杭州西湖区文一西路店：KFC-HZ-19003
要求："商户品牌简称+商户门店简称"作为确定商户及其下属机构的唯一标识，不可重复。
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	/**
	 * 合计税额
	 */
	@ApiField("sum_tax_amount")
	private String sumTaxAmount;

	/**
	 * 交易发生时间
	 */
	@ApiField("trade_date")
	private String tradeDate;

	/**
	 * 支付宝用户id，支付宝用户的唯一标识。
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets apply from.
     *
     * @return the apply from
     */
    public String getApplyFrom() {
		return this.applyFrom;
	}

    /**
     * Sets apply from.
     *
     * @param applyFrom the apply from
     */
    public void setApplyFrom(String applyFrom) {
		this.applyFrom = applyFrom;
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
     * Gets einv code.
     *
     * @return the einv code
     */
    public String getEinvCode() {
		return this.einvCode;
	}

    /**
     * Sets einv code.
     *
     * @param einvCode the einv code
     */
    public void setEinvCode(String einvCode) {
		this.einvCode = einvCode;
	}

    /**
     * Gets einv no.
     *
     * @return the einv no
     */
    public String getEinvNo() {
		return this.einvNo;
	}

    /**
     * Sets einv no.
     *
     * @param einvNo the einv no
     */
    public void setEinvNo(String einvNo) {
		this.einvNo = einvNo;
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
    public List<InvoiceItemQueryOpenModel> getInvoiceContent() {
		return this.invoiceContent;
	}

    /**
     * Sets invoice content.
     *
     * @param invoiceContent the invoice content
     */
    public void setInvoiceContent(List<InvoiceItemQueryOpenModel> invoiceContent) {
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
     * Gets invoice id.
     *
     * @return the invoice id
     */
    public String getInvoiceId() {
		return this.invoiceId;
	}

    /**
     * Sets invoice id.
     *
     * @param invoiceId the invoice id
     */
    public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
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
    public InvoiceTitleQueryOpenModel getInvoiceTitle() {
		return this.invoiceTitle;
	}

    /**
     * Sets invoice title.
     *
     * @param invoiceTitle the invoice title
     */
    public void setInvoiceTitle(InvoiceTitleQueryOpenModel invoiceTitle) {
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
     * Gets short name.
     *
     * @return the short name
     */
    public String getmShortName() {
		return this.mShortName;
	}

    /**
     * Sets short name.
     *
     * @param mShortName the m short name
     */
    public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
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
     * Gets preview image url.
     *
     * @return the preview image url
     */
    public String getPreviewImageUrl() {
		return this.previewImageUrl;
	}

    /**
     * Sets preview image url.
     *
     * @param previewImageUrl the preview image url
     */
    public void setPreviewImageUrl(String previewImageUrl) {
		this.previewImageUrl = previewImageUrl;
	}

    /**
     * Gets sub m short name.
     *
     * @return the sub m short name
     */
    public String getSubMShortName() {
		return this.subMShortName;
	}

    /**
     * Sets sub m short name.
     *
     * @param subMShortName the sub m short name
     */
    public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
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
