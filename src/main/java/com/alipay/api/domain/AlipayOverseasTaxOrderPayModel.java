package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝跨境退税
 *
 * @author auto create
 * @since 1.0, 2018-09-06 11:06:28
 */
public class AlipayOverseasTaxOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 5889479817258265573L;

	/**
	 * 退税数据有效天数，15到30天，超过指定天数未处理的退税单会过期而退税失败
	 */
	@ApiField("available_day")
	private Long availableDay;

	/**
	 * 业务模式，目前暂只支持 FOREX_TAX_REFUND (外币退税)
	 */
	@ApiField("biz_mode")
	private String bizMode;

	/**
	 * 退税公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 用户出境确认时间，格式 : yyyy-MM-dd HH:mm:ss，北京时间24小时制，时区东八区
	 */
	@ApiField("confirm_date")
	private Date confirmDate;

	/**
	 * 退税国家码，ISO标准alpha-2国家代码
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 出境口岸
	 */
	@ApiField("departure_point")
	private String departurePoint;

	/**
	 * 退税单过期时间，退税单据的有效期是6个月，退税打印时间+6个月，格式 : yyyy-MM-dd HH:mm:ss，北京时间24小时制，时区东八区
	 */
	@ApiField("doc_expire_date")
	private Date docExpireDate;

	/**
	 * 纸质退税单上的ID，由退税公司给出；由字母、数字构成且长度不能小于3且不能大于64。
	 */
	@ApiField("doc_id")
	private String docId;

	/**
	 * 业务扩展参数，用于商户的特定业务信息的传递,json格式.当identify_account_type为uid,退税公司必须传递支付宝钱包付款码，退税公司通过扫描用户支付宝钱包付款码获取,17位到32位的数字.格式为{"barcodeNo":"barcodeNo"}
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 支付宝账号标识号，由identify_account_type指定类型:
identify_account_type为barcode表示支付宝钱包付款码，退税公司通过扫描用户支付宝钱包付款码获取，17位到32位的数字.
identify_account_type为uid表示支付宝用户Id,退税公司通过调用alipay.overseas.tax.userinfo.query接口获取
	 */
	@ApiField("identify_account_no")
	private String identifyAccountNo;

	/**
	 * 支付宝账号标识类型，
条码退税，取值：barcode,uid
	 */
	@ApiField("identify_account_type")
	private String identifyAccountType;

	/**
	 * 国籍，用户护照上的国家码
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * 退税机构业务流水号，唯一，由退税机构生成，只能包含英字母、数字，长度不能小于3且不能大于64
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 护照姓名，用户护照上的英文姓名
	 */
	@ApiField("passport_name")
	private String passportName;

	/**
	 * 护照号，退税客人的护照号
	 */
	@ApiField("passport_no")
	private String passportNo;

	/**
	 * 购物金额，退税单上的购物金额，为数字格式，精确到币种最小单位，币种由sales_currency指定，如sales_currency为SGD，币种最小单位为分，100元新币，则sales_amount传入10000.
	 */
	@ApiField("sales_amount")
	private String salesAmount;

	/**
	 * 购物币种，ISO标准购物国家alpha-3币种代码
	 */
	@ApiField("sales_currency")
	private String salesCurrency;

	/**
	 * 购物时间，格式 : yyyy-MM-dd HH:mm:ss，北京时间24小时制，时区东八区
	 */
	@ApiField("sales_date")
	private Date salesDate;

	/**
	 * 退税金额，退税公司退税金额，币种由tax_refund_currency指定，精确到币种最小单位，如tax_refund_currency为SGD，币种最小单位为分，100元新币，则tax_refund_amount传入10000.
	 */
	@ApiField("tax_refund_amount")
	private String taxRefundAmount;

	/**
	 * 退税公司退税币种，一般指外币，ISO标准退税国家alpha-3币种代码
	 */
	@ApiField("tax_refund_currency")
	private String taxRefundCurrency;

	/**
	 * 退税单打印时间，格式 : yyyy-MM-dd HH:mm:ss，北京时间24小时制，时区东八区
	 */
	@ApiField("tax_refund_print_date")
	private Date taxRefundPrintDate;

	/**
	 * 退税场景类型，03 机场实时退税，目前暂只支持03
	 */
	@ApiField("tax_refund_scene_type")
	private String taxRefundSceneType;

	/**
	 * 用户实际收到的退税金额，币种由user_received_currency指定，精确到最小币种单位，如user_received_currency为CNY，币种最小单位为分，100元人民币，则user_received_amount传入10000，当biz_mode为FOREX_TAX_REFUND时勿传
	 */
	@ApiField("user_received_amount")
	private String userReceivedAmount;

	/**
	 * 用户实际收款币种，一般指人民币 CNY，ISO标准退税国家alpha-3币种代码
	 */
	@ApiField("user_received_currency")
	private String userReceivedCurrency;

    /**
     * Gets available day.
     *
     * @return the available day
     */
    public Long getAvailableDay() {
		return this.availableDay;
	}

    /**
     * Sets available day.
     *
     * @param availableDay the available day
     */
    public void setAvailableDay(Long availableDay) {
		this.availableDay = availableDay;
	}

    /**
     * Gets biz mode.
     *
     * @return the biz mode
     */
    public String getBizMode() {
		return this.bizMode;
	}

    /**
     * Sets biz mode.
     *
     * @param bizMode the biz mode
     */
    public void setBizMode(String bizMode) {
		this.bizMode = bizMode;
	}

    /**
     * Gets company name.
     *
     * @return the company name
     */
    public String getCompanyName() {
		return this.companyName;
	}

    /**
     * Sets company name.
     *
     * @param companyName the company name
     */
    public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

    /**
     * Gets confirm date.
     *
     * @return the confirm date
     */
    public Date getConfirmDate() {
		return this.confirmDate;
	}

    /**
     * Sets confirm date.
     *
     * @param confirmDate the confirm date
     */
    public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}

    /**
     * Gets country code.
     *
     * @return the country code
     */
    public String getCountryCode() {
		return this.countryCode;
	}

    /**
     * Sets country code.
     *
     * @param countryCode the country code
     */
    public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

    /**
     * Gets departure point.
     *
     * @return the departure point
     */
    public String getDeparturePoint() {
		return this.departurePoint;
	}

    /**
     * Sets departure point.
     *
     * @param departurePoint the departure point
     */
    public void setDeparturePoint(String departurePoint) {
		this.departurePoint = departurePoint;
	}

    /**
     * Gets doc expire date.
     *
     * @return the doc expire date
     */
    public Date getDocExpireDate() {
		return this.docExpireDate;
	}

    /**
     * Sets doc expire date.
     *
     * @param docExpireDate the doc expire date
     */
    public void setDocExpireDate(Date docExpireDate) {
		this.docExpireDate = docExpireDate;
	}

    /**
     * Gets doc id.
     *
     * @return the doc id
     */
    public String getDocId() {
		return this.docId;
	}

    /**
     * Sets doc id.
     *
     * @param docId the doc id
     */
    public void setDocId(String docId) {
		this.docId = docId;
	}

    /**
     * Gets extend param.
     *
     * @return the extend param
     */
    public String getExtendParam() {
		return this.extendParam;
	}

    /**
     * Sets extend param.
     *
     * @param extendParam the extend param
     */
    public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
	}

    /**
     * Gets identify account no.
     *
     * @return the identify account no
     */
    public String getIdentifyAccountNo() {
		return this.identifyAccountNo;
	}

    /**
     * Sets identify account no.
     *
     * @param identifyAccountNo the identify account no
     */
    public void setIdentifyAccountNo(String identifyAccountNo) {
		this.identifyAccountNo = identifyAccountNo;
	}

    /**
     * Gets identify account type.
     *
     * @return the identify account type
     */
    public String getIdentifyAccountType() {
		return this.identifyAccountType;
	}

    /**
     * Sets identify account type.
     *
     * @param identifyAccountType the identify account type
     */
    public void setIdentifyAccountType(String identifyAccountType) {
		this.identifyAccountType = identifyAccountType;
	}

    /**
     * Gets nationality.
     *
     * @return the nationality
     */
    public String getNationality() {
		return this.nationality;
	}

    /**
     * Sets nationality.
     *
     * @param nationality the nationality
     */
    public void setNationality(String nationality) {
		this.nationality = nationality;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets passport name.
     *
     * @return the passport name
     */
    public String getPassportName() {
		return this.passportName;
	}

    /**
     * Sets passport name.
     *
     * @param passportName the passport name
     */
    public void setPassportName(String passportName) {
		this.passportName = passportName;
	}

    /**
     * Gets passport no.
     *
     * @return the passport no
     */
    public String getPassportNo() {
		return this.passportNo;
	}

    /**
     * Sets passport no.
     *
     * @param passportNo the passport no
     */
    public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

    /**
     * Gets sales amount.
     *
     * @return the sales amount
     */
    public String getSalesAmount() {
		return this.salesAmount;
	}

    /**
     * Sets sales amount.
     *
     * @param salesAmount the sales amount
     */
    public void setSalesAmount(String salesAmount) {
		this.salesAmount = salesAmount;
	}

    /**
     * Gets sales currency.
     *
     * @return the sales currency
     */
    public String getSalesCurrency() {
		return this.salesCurrency;
	}

    /**
     * Sets sales currency.
     *
     * @param salesCurrency the sales currency
     */
    public void setSalesCurrency(String salesCurrency) {
		this.salesCurrency = salesCurrency;
	}

    /**
     * Gets sales date.
     *
     * @return the sales date
     */
    public Date getSalesDate() {
		return this.salesDate;
	}

    /**
     * Sets sales date.
     *
     * @param salesDate the sales date
     */
    public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

    /**
     * Gets tax refund amount.
     *
     * @return the tax refund amount
     */
    public String getTaxRefundAmount() {
		return this.taxRefundAmount;
	}

    /**
     * Sets tax refund amount.
     *
     * @param taxRefundAmount the tax refund amount
     */
    public void setTaxRefundAmount(String taxRefundAmount) {
		this.taxRefundAmount = taxRefundAmount;
	}

    /**
     * Gets tax refund currency.
     *
     * @return the tax refund currency
     */
    public String getTaxRefundCurrency() {
		return this.taxRefundCurrency;
	}

    /**
     * Sets tax refund currency.
     *
     * @param taxRefundCurrency the tax refund currency
     */
    public void setTaxRefundCurrency(String taxRefundCurrency) {
		this.taxRefundCurrency = taxRefundCurrency;
	}

    /**
     * Gets tax refund print date.
     *
     * @return the tax refund print date
     */
    public Date getTaxRefundPrintDate() {
		return this.taxRefundPrintDate;
	}

    /**
     * Sets tax refund print date.
     *
     * @param taxRefundPrintDate the tax refund print date
     */
    public void setTaxRefundPrintDate(Date taxRefundPrintDate) {
		this.taxRefundPrintDate = taxRefundPrintDate;
	}

    /**
     * Gets tax refund scene type.
     *
     * @return the tax refund scene type
     */
    public String getTaxRefundSceneType() {
		return this.taxRefundSceneType;
	}

    /**
     * Sets tax refund scene type.
     *
     * @param taxRefundSceneType the tax refund scene type
     */
    public void setTaxRefundSceneType(String taxRefundSceneType) {
		this.taxRefundSceneType = taxRefundSceneType;
	}

    /**
     * Gets user received amount.
     *
     * @return the user received amount
     */
    public String getUserReceivedAmount() {
		return this.userReceivedAmount;
	}

    /**
     * Sets user received amount.
     *
     * @param userReceivedAmount the user received amount
     */
    public void setUserReceivedAmount(String userReceivedAmount) {
		this.userReceivedAmount = userReceivedAmount;
	}

    /**
     * Gets user received currency.
     *
     * @return the user received currency
     */
    public String getUserReceivedCurrency() {
		return this.userReceivedCurrency;
	}

    /**
     * Sets user received currency.
     *
     * @param userReceivedCurrency the user received currency
     */
    public void setUserReceivedCurrency(String userReceivedCurrency) {
		this.userReceivedCurrency = userReceivedCurrency;
	}

}
