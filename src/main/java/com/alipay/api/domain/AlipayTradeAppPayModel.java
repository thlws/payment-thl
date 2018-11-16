package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * app支付接口2.0
 *
 * @author auto create
 * @since 1.0, 2018-07-16 16:12:48
 */
public class AlipayTradeAppPayModel extends AlipayObject {

	private static final long serialVersionUID = 6839333259641314575L;

	/**
	 * 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。
	 */
	@ApiField("body")
	private String body;

	/**
	 * 商户传入业务信息，具体值要和支付宝约定，应用于安全，营销等参数直传场景，格式为json格式
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 禁用渠道，用户不可用指定渠道支付
当有多个渠道时用“,”分隔
注，与enable_pay_channels互斥
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 可用渠道，用户只能在指定渠道范围内支付
当有多个渠道时用“,”分隔
注，与disable_pay_channels互斥
	 */
	@ApiField("enable_pay_channels")
	private String enablePayChannels;

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
	 * 商品主类型 :0-虚拟类商品,1-实物类商品
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 开票信息
	 */
	@ApiField("invoice_info")
	private InvoiceInfo invoiceInfo;

	/**
	 * 商户网站唯一订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝只会在同步返回（包括跳转回商户网站）和异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 销售产品码，商家和支付宝签约的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 优惠参数
注：仅与支付宝协商后可用
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * 描述分账信息，json格式，详见分账参数说明
	 */
	@ApiField("royalty_info")
	private RoyaltyInfo royaltyInfo;

	/**
	 * 收款支付宝用户ID。 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 描述结算信息，json格式，详见结算参数说明
	 */
	@ApiField("settle_info")
	private SettleInfo settleInfo;

	/**
	 * 指定渠道，目前仅支持传入pcredit
若由于用户原因渠道不可用，用户可选择是否用其他渠道支付。
注：该参数不可与花呗分期参数同时传入
	 */
	@ApiField("specified_channel")
	private String specifiedChannel;

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
	 * 商品的标题/交易标题/订单标题/订单关键字等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 绝对超时时间，格式为yyyy-MM-dd HH:mm。
	 */
	@ApiField("time_expire")
	private String timeExpire;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

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
     * Gets enable pay channels.
     *
     * @return the enable pay channels
     */
    public String getEnablePayChannels() {
		return this.enablePayChannels;
	}

    /**
     * Sets enable pay channels.
     *
     * @param enablePayChannels the enable pay channels
     */
    public void setEnablePayChannels(String enablePayChannels) {
		this.enablePayChannels = enablePayChannels;
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
     * Gets goods type.
     *
     * @return the goods type
     */
    public String getGoodsType() {
		return this.goodsType;
	}

    /**
     * Sets goods type.
     *
     * @param goodsType the goods type
     */
    public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

    /**
     * Gets invoice info.
     *
     * @return the invoice info
     */
    public InvoiceInfo getInvoiceInfo() {
		return this.invoiceInfo;
	}

    /**
     * Sets invoice info.
     *
     * @param invoiceInfo the invoice info
     */
    public void setInvoiceInfo(InvoiceInfo invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
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
     * Gets passback params.
     *
     * @return the passback params
     */
    public String getPassbackParams() {
		return this.passbackParams;
	}

    /**
     * Sets passback params.
     *
     * @param passbackParams the passback params
     */
    public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
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
     * Gets promo params.
     *
     * @return the promo params
     */
    public String getPromoParams() {
		return this.promoParams;
	}

    /**
     * Sets promo params.
     *
     * @param promoParams the promo params
     */
    public void setPromoParams(String promoParams) {
		this.promoParams = promoParams;
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
     * Gets specified channel.
     *
     * @return the specified channel
     */
    public String getSpecifiedChannel() {
		return this.specifiedChannel;
	}

    /**
     * Sets specified channel.
     *
     * @param specifiedChannel the specified channel
     */
    public void setSpecifiedChannel(String specifiedChannel) {
		this.specifiedChannel = specifiedChannel;
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
     * Gets time expire.
     *
     * @return the time expire
     */
    public String getTimeExpire() {
		return this.timeExpire;
	}

    /**
     * Sets time expire.
     *
     * @param timeExpire the time expire
     */
    public void setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
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

}
