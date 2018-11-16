package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用于在线下场景交易一次创建并支付掉
 * 修改路由策略到R
 *
 * @author auto create
 * @since 1.0, 2018-09-11 16:42:52
 */
public class AlipayTradePayModel extends AlipayObject {

	private static final long serialVersionUID = 2751487184996738468L;

	/**
	 * 代扣业务需要传入协议相关信息
	 */
	@ApiField("agreement_params")
	private AgreementParams agreementParams;

	/**
	 * 支付宝的店铺编号
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/**
	 * 支付授权码，25~30开头的长度为16~24位的数字，实际字符串长度以开发者获取的付款码长度为准
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 预授权确认模式，授权转交易请求中传入，适用于预授权转交易业务使用，目前只支持PRE_AUTH(预授权产品码)
COMPLETE：转交易支付完成结束预授权，解冻剩余金额; NOT_COMPLETE：转交易支付完成不结束预授权，不解冻剩余金额
	 */
	@ApiField("auth_confirm_mode")
	private String authConfirmMode;

	/**
	 * 预授权号，预授权转交易请求中传入，适用于预授权转交易业务使用，目前只支持FUND_TRADE_FAST_PAY（资金订单即时到帐交易）、境外预授权产品（OVERSEAS_AUTH_PAY）两个产品。
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 订单描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 商户传入业务信息，具体值要和支付宝约定，应用于安全，营销等参数直传场景，格式为json格式
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 买家的支付宝用户id，如果为空，会从传入了码值信息中获取买家ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 禁用支付渠道,多个渠道以逗号分割，如同时禁用信用支付类型和积分，则disable_pay_channels="credit_group,point"
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
如果该值未传入，但传入了【订单总金额】和【不可打折金额】，则该值默认为【订单总金额】-【不可打折金额】
	 */
	@ApiField("discountable_amount")
	private String discountableAmount;

	/**
	 * 外部指定买家
	 */
	@ApiField("ext_user_info")
	private ExtUserInfo extUserInfo;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private ExtendParams extendParams;

	/**
	 * 订单包含的商品列表信息，json格式，其它说明详见商品明细说明
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 商户的原始订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 商户操作员编号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 描述分账信息，json格式，其它说明详见分账说明
	 */
	@ApiField("royalty_info")
	private RoyaltyInfo royaltyInfo;

	/**
	 * 支付场景
条码支付，取值：bar_code
声波支付，取值：wave_code
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 商户指定的结算币种，支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY
	 */
	@ApiField("settle_currency")
	private String settleCurrency;

	/**
	 * 描述结算信息，json格式，详见结算参数说明
	 */
	@ApiField("settle_info")
	private SettleInfo settleInfo;

	/**
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 间连受理商户信息体，当前只对特殊银行机构特定场景下使用此字段
	 */
	@ApiField("sub_merchant")
	private SubMerchant subMerchant;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 商户机具终端编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 商户传入终端设备相关信息，具体值要和支付宝约定
	 */
	@ApiField("terminal_params")
	private String terminalParams;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
如果同时传入【可打折金额】和【不可打折金额】，该参数可以不用传入；
如果同时传入了【可打折金额】，【不可打折金额】，【订单总金额】三者，则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 标价币种,  total_amount 对应的币种单位。支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	/**
	 * 不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。如果该值未传入，但传入了【订单总金额】和【可打折金额】，则该值默认为【订单总金额】-【可打折金额】
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

    /**
     * Gets agreement params.
     *
     * @return the agreement params
     */
    public AgreementParams getAgreementParams() {
		return this.agreementParams;
	}

    /**
     * Sets agreement params.
     *
     * @param agreementParams the agreement params
     */
    public void setAgreementParams(AgreementParams agreementParams) {
		this.agreementParams = agreementParams;
	}

    /**
     * Gets alipay store id.
     *
     * @return the alipay store id
     */
    public String getAlipayStoreId() {
		return this.alipayStoreId;
	}

    /**
     * Sets alipay store id.
     *
     * @param alipayStoreId the alipay store id
     */
    public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
		return this.authCode;
	}

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

    /**
     * Gets auth confirm mode.
     *
     * @return the auth confirm mode
     */
    public String getAuthConfirmMode() {
		return this.authConfirmMode;
	}

    /**
     * Sets auth confirm mode.
     *
     * @param authConfirmMode the auth confirm mode
     */
    public void setAuthConfirmMode(String authConfirmMode) {
		this.authConfirmMode = authConfirmMode;
	}

    /**
     * Gets auth no.
     *
     * @return the auth no
     */
    public String getAuthNo() {
		return this.authNo;
	}

    /**
     * Sets auth no.
     *
     * @param authNo the auth no
     */
    public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

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
     * Gets business params.
     *
     * @return the business params
     */
    public String getBusinessParams() {
		return this.businessParams;
	}

    /**
     * Sets business params.
     *
     * @param businessParams the business params
     */
    public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

    /**
     * Gets buyer id.
     *
     * @return the buyer id
     */
    public String getBuyerId() {
		return this.buyerId;
	}

    /**
     * Sets buyer id.
     *
     * @param buyerId the buyer id
     */
    public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

    /**
     * Gets disable pay channels.
     *
     * @return the disable pay channels
     */
    public String getDisablePayChannels() {
		return this.disablePayChannels;
	}

    /**
     * Sets disable pay channels.
     *
     * @param disablePayChannels the disable pay channels
     */
    public void setDisablePayChannels(String disablePayChannels) {
		this.disablePayChannels = disablePayChannels;
	}

    /**
     * Gets discountable amount.
     *
     * @return the discountable amount
     */
    public String getDiscountableAmount() {
		return this.discountableAmount;
	}

    /**
     * Sets discountable amount.
     *
     * @param discountableAmount the discountable amount
     */
    public void setDiscountableAmount(String discountableAmount) {
		this.discountableAmount = discountableAmount;
	}

    /**
     * Gets ext user info.
     *
     * @return the ext user info
     */
    public ExtUserInfo getExtUserInfo() {
		return this.extUserInfo;
	}

    /**
     * Sets ext user info.
     *
     * @param extUserInfo the ext user info
     */
    public void setExtUserInfo(ExtUserInfo extUserInfo) {
		this.extUserInfo = extUserInfo;
	}

    /**
     * Gets extend params.
     *
     * @return the extend params
     */
    public ExtendParams getExtendParams() {
		return this.extendParams;
	}

    /**
     * Sets extend params.
     *
     * @param extendParams the extend params
     */
    public void setExtendParams(ExtendParams extendParams) {
		this.extendParams = extendParams;
	}

    /**
     * Gets goods detail.
     *
     * @return the goods detail
     */
    public List<GoodsDetail> getGoodsDetail() {
		return this.goodsDetail;
	}

    /**
     * Sets goods detail.
     *
     * @param goodsDetail the goods detail
     */
    public void setGoodsDetail(List<GoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

    /**
     * Gets merchant order no.
     *
     * @return the merchant order no
     */
    public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}

    /**
     * Sets merchant order no.
     *
     * @param merchantOrderNo the merchant order no
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

    /**
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId() {
		return this.operatorId;
	}

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
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
     * Gets royalty info.
     *
     * @return the royalty info
     */
    public RoyaltyInfo getRoyaltyInfo() {
		return this.royaltyInfo;
	}

    /**
     * Sets royalty info.
     *
     * @param royaltyInfo the royalty info
     */
    public void setRoyaltyInfo(RoyaltyInfo royaltyInfo) {
		this.royaltyInfo = royaltyInfo;
	}

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public String getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(String scene) {
		this.scene = scene;
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
     * Gets settle currency.
     *
     * @return the settle currency
     */
    public String getSettleCurrency() {
		return this.settleCurrency;
	}

    /**
     * Sets settle currency.
     *
     * @param settleCurrency the settle currency
     */
    public void setSettleCurrency(String settleCurrency) {
		this.settleCurrency = settleCurrency;
	}

    /**
     * Gets settle info.
     *
     * @return the settle info
     */
    public SettleInfo getSettleInfo() {
		return this.settleInfo;
	}

    /**
     * Sets settle info.
     *
     * @param settleInfo the settle info
     */
    public void setSettleInfo(SettleInfo settleInfo) {
		this.settleInfo = settleInfo;
	}

    /**
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId() {
		return this.storeId;
	}

    /**
     * Sets store id.
     *
     * @param storeId the store id
     */
    public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

    /**
     * Gets sub merchant.
     *
     * @return the sub merchant
     */
    public SubMerchant getSubMerchant() {
		return this.subMerchant;
	}

    /**
     * Sets sub merchant.
     *
     * @param subMerchant the sub merchant
     */
    public void setSubMerchant(SubMerchant subMerchant) {
		this.subMerchant = subMerchant;
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
     * Gets terminal id.
     *
     * @return the terminal id
     */
    public String getTerminalId() {
		return this.terminalId;
	}

    /**
     * Sets terminal id.
     *
     * @param terminalId the terminal id
     */
    public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

    /**
     * Gets terminal params.
     *
     * @return the terminal params
     */
    public String getTerminalParams() {
		return this.terminalParams;
	}

    /**
     * Sets terminal params.
     *
     * @param terminalParams the terminal params
     */
    public void setTerminalParams(String terminalParams) {
		this.terminalParams = terminalParams;
	}

    /**
     * Gets timeout express.
     *
     * @return the timeout express
     */
    public String getTimeoutExpress() {
		return this.timeoutExpress;
	}

    /**
     * Sets timeout express.
     *
     * @param timeoutExpress the timeout express
     */
    public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets trans currency.
     *
     * @return the trans currency
     */
    public String getTransCurrency() {
		return this.transCurrency;
	}

    /**
     * Sets trans currency.
     *
     * @param transCurrency the trans currency
     */
    public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

    /**
     * Gets undiscountable amount.
     *
     * @return the undiscountable amount
     */
    public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}

    /**
     * Sets undiscountable amount.
     *
     * @param undiscountableAmount the undiscountable amount
     */
    public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

}
