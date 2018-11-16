package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 滴滴自动化测试支付
 *
 * @author auto create
 * @since 1.0, 2017-11-27 15:09:33
 */
public class AlipayTradeFastpayEteDidiPayModel extends AlipayObject {

	private static final long serialVersionUID = 8111637419799528736L;

	/**
	 * 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。
	 */
	@ApiField("body")
	private String body;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 付款支付宝用户登录ID
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 付款支付宝用户登录密码
	 */
	@ApiField("login_passwd")
	private String loginPasswd;

	/**
	 * 外部商户异步通知地址
	 */
	@ApiField("mc_notify_url")
	private String mcNotifyUrl;

	/**
	 * 商户网站唯一订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 外部商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 付款支付宝用户支付密码
	 */
	@ApiField("pay_passwd")
	private String payPasswd;

	/**
	 * 销售产品码，商家和支付宝签约的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 收款支付宝用户ID。 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 商品的标题/交易标题/订单标题/订单关键字等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 该笔订单的资金总额，单位为RMB-Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * 付款支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
		return this.body;
	}

    /**
     * Sets body.
     *
     * @param body the body
     */
    public void setBody(String body) {
		this.body = body;
	}

    /**
     * Gets extend params.
     *
     * @return the extend params
     */
    public String getExtendParams() {
		return this.extendParams;
	}

    /**
     * Sets extend params.
     *
     * @param extendParams the extend params
     */
    public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

    /**
     * Gets login id.
     *
     * @return the login id
     */
    public String getLoginId() {
		return this.loginId;
	}

    /**
     * Sets login id.
     *
     * @param loginId the login id
     */
    public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

    /**
     * Gets login passwd.
     *
     * @return the login passwd
     */
    public String getLoginPasswd() {
		return this.loginPasswd;
	}

    /**
     * Sets login passwd.
     *
     * @param loginPasswd the login passwd
     */
    public void setLoginPasswd(String loginPasswd) {
		this.loginPasswd = loginPasswd;
	}

    /**
     * Gets mc notify url.
     *
     * @return the mc notify url
     */
    public String getMcNotifyUrl() {
		return this.mcNotifyUrl;
	}

    /**
     * Sets mc notify url.
     *
     * @param mcNotifyUrl the mc notify url
     */
    public void setMcNotifyUrl(String mcNotifyUrl) {
		this.mcNotifyUrl = mcNotifyUrl;
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
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets pay passwd.
     *
     * @return the pay passwd
     */
    public String getPayPasswd() {
		return this.payPasswd;
	}

    /**
     * Sets pay passwd.
     *
     * @param payPasswd the pay passwd
     */
    public void setPayPasswd(String payPasswd) {
		this.payPasswd = payPasswd;
	}

    /**
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    /**
     * Gets seller id.
     *
     * @return the seller id
     */
    public String getSellerId() {
		return this.sellerId;
	}

    /**
     * Sets seller id.
     *
     * @param sellerId the seller id
     */
    public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject() {
		return this.subject;
	}

    /**
     * Sets subject.
     *
     * @param subject the subject
     */
    public void setSubject(String subject) {
		this.subject = subject;
	}

    /**
     * Gets total fee.
     *
     * @return the total fee
     */
    public String getTotalFee() {
		return this.totalFee;
	}

    /**
     * Sets total fee.
     *
     * @param totalFee the total fee
     */
    public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
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
