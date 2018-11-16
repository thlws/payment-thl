package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户通过该接口进行交易的创建下单
 *
 * @author auto create
 * @since 1.0, 2018-09-11 16:43:18
 */
public class AlipayTradeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6853832658241559845L;

	/**
	 * 支付宝的店铺编号
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/**
	 * 对交易或商品的描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 商户传入业务信息，具体值要和支付宝约定，应用于安全，营销等参数直传场景，格式为json格式
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 买家的支付宝唯一用户号（2088开头的16位纯数字）
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝账号，和buyer_id不能同时为空
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/**
	 * 禁用渠道,用户不可用指定渠道支付，多个渠道以逗号分割
注，与enable_pay_channels互斥
<a href="https://docs.open.alipay.com/common/wifww7">渠道列表</a>
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 可打折金额.
参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
如果该值未传入，但传入了【订单总金额】，【不可打折金额】则该值默认为【订单总金额】-【不可打折金额】
	 */
	@ApiField("discountable_amount")
	private String discountableAmount;

	/**
	 * 可用渠道,用户只能在指定渠道范围内支付，多个渠道以逗号分割
注，与disable_pay_channels互斥
渠道列表：https://docs.open.alipay.com/common/wifww7
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
	 * 订单包含的商品列表信息，json格式，其它说明详见：“商品明细说明”
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 物流信息
	 */
	@ApiField("logistics_detail")
	private LogisticsDetail logisticsDetail;

	/**
	 * 商户原始订单号，最大长度限制32位
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 商户操作员编号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 收货人及地址信息
	 */
	@ApiField("receiver_address_info")
	private ReceiverAddressInfo receiverAddressInfo;

	/**
	 * 描述分账信息，json格式。
	 */
	@ApiField("royalty_info")
	private RoyaltyInfo royaltyInfo;

	/**
	 * 卖家支付宝用户ID。
如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

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
	 * 二级商户信息,当前只对特殊银行机构特定场景下使用此字段
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
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
如果同时传入了【打折金额】，【不可打折金额】，【订单总金额】三者，则必须满足如下条件：【订单总金额】=【打折金额】+【不可打折金额】
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不可打折金额.
不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
如果该值未传入，但传入了【订单总金额】,【打折金额】，则该值默认为【订单总金额】-【打折金额】
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

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
     * Gets buyer logon id.
     *
     * @return the buyer logon id
     */
    public String getBuyerLogonId() {
		return this.buyerLogonId;
	}

    /**
     * Sets buyer logon id.
     *
     * @param buyerLogonId the buyer logon id
     */
    public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
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
     * Gets logistics detail.
     *
     * @return the logistics detail
     */
    public LogisticsDetail getLogisticsDetail() {
		return this.logisticsDetail;
	}

    /**
     * Sets logistics detail.
     *
     * @param logisticsDetail the logistics detail
     */
    public void setLogisticsDetail(LogisticsDetail logisticsDetail) {
		this.logisticsDetail = logisticsDetail;
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
     * Gets receiver address info.
     *
     * @return the receiver address info
     */
    public ReceiverAddressInfo getReceiverAddressInfo() {
		return this.receiverAddressInfo;
	}

    /**
     * Sets receiver address info.
     *
     * @param receiverAddressInfo the receiver address info
     */
    public void setReceiverAddressInfo(ReceiverAddressInfo receiverAddressInfo) {
		this.receiverAddressInfo = receiverAddressInfo;
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
