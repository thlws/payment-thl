package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外汇交易请求对象
 *
 * @author auto create
 * @since 1.0, 2018-04-13 17:35:02
 */
public class TradeRequestVO extends AlipayObject {

	private static final long serialVersionUID = 6642465725294241597L;

	/**
	 * globalnet收单机构
	 */
	@ApiField("acquirer")
	private String acquirer;

	/**
	 * 收单成员id(gn站点成员编号）
	 */
	@ApiField("acquirer_mem_id")
	private String acquirerMemId;

	/**
	 * 反洗钱处理标志
	 */
	@ApiField("aml_status")
	private String amlStatus;

	/**
	 * 业务事件码
	 */
	@ApiField("biz_ev_code")
	private String bizEvCode;

	/**
	 * 业务产品码
	 */
	@ApiField("biz_pd_code")
	private String bizPdCode;

	/**
	 * 交易请求发起时间
	 */
	@ApiField("client_advice_timestamp")
	private Date clientAdviceTimestamp;

	/**
	 * 接入平台业务订单号
	 */
	@ApiField("client_business_id")
	private String clientBusinessId;

	/**
	 * 用于定义FX交易的客户，由购结汇中心统一分配
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 接入平台唯一序列号
	 */
	@ApiField("client_message_id")
	private String clientMessageId;

	/**
	 * 客户请求序号:  客户侧的流水号，由客户上送
	 */
	@ApiField("client_ref")
	private String clientRef;

	/**
	 * 接入平台
	 */
	@ApiField("client_system")
	private String clientSystem;

	/**
	 * 端到端传递的事件代码
	 */
	@ApiField("cnl_ev_code")
	private String cnlEvCode;

	/**
	 * 端到端流水号
	 */
	@ApiField("cnl_no")
	private String cnlNo;

	/**
	 * 端到端传递的产品代码
	 */
	@ApiField("cnl_pd_code")
	private String cnlPdCode;

	/**
	 * 对应金额
	 */
	@ApiField("contra_amount")
	private String contraAmount;

	/**
	 * 对应币种
	 */
	@ApiField("contra_ccy")
	private String contraCcy;

	/**
	 * 扩展字段
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 机构实体
	 */
	@ApiField("inst_entity")
	private String instEntity;

	/**
	 * 是否锁价,字典N否，Y是
	 */
	@ApiField("is_locked")
	private String isLocked;

	/**
	 * globalnet发卡机构
	 */
	@ApiField("issuer")
	private String issuer;

	/**
	 * 发卡成员id(gn站点成员编号）
	 */
	@ApiField("issuer_mem_id")
	private String issuerMemId;

	/**
	 * 商户MCC代码
	 */
	@ApiField("merchant_mcc")
	private String merchantMcc;

	/**
	 * 请求类型： T - TradeAdvise。
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 操作动作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 是否可部分成交,字典：Y，N。
	 */
	@ApiField("partial_trade")
	private String partialTrade;

	/**
	 * 交易商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付渠道
	 */
	@ApiField("payment_provider")
	private String paymentProvider;

	/**
	 * 支付类型
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 对客产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 客户协议扩展号，用于支持同一客户在不同场景下所需的汇率模式
	 */
	@ApiField("profile_id")
	private String profileId;

	/**
	 * 请求汇率基准币种
	 */
	@ApiField("rate_base_ccy")
	private String rateBaseCcy;

	/**
	 * 汇率的唯一编码
	 */
	@ApiField("rate_ref")
	private String rateRef;

	/**
	 * 汇率请求模式,字典：
REQ - 按客户请求(含滑点)成交，若该价格失效，则交易失败；
ACP - 汇率失效或请求中不带汇率，接受该客户协议的最新汇率，实际成交汇率以GlobalFX为准；
MAN- 无论如何都受理请求汇率
	 */
	@ApiField("rate_request_mode")
	private String rateRequestMode;

	/**
	 * 汇率类型，字典：SPOT，FORWARD，SWAP。
	 */
	@ApiField("rate_type")
	private String rateType;

	/**
	 * 备用字段
	 */
	@ApiField("reference_field1")
	private String referenceField1;

	/**
	 * 备用字段2
	 */
	@ApiField("reference_field2")
	private String referenceField2;

	/**
	 * 备用字段3
	 */
	@ApiField("reference_field3")
	private String referenceField3;

	/**
	 * 本次交易请求关联的原交易号。
	 */
	@ApiField("related_message_id")
	private String relatedMessageId;

	/**
	 * 业务唯一单据号
	 */
	@ApiField("request_message_id")
	private String requestMessageId;

	/**
	 * 请求交易汇率
	 */
	@ApiField("requested_rate")
	private String requestedRate;

	/**
	 * NDF交割下，实际交割币种的金额
	 */
	@ApiField("settlement_amount")
	private String settlementAmount;

	/**
	 * 交割币种
	 */
	@ApiField("settlement_ccy")
	private String settlementCcy;

	/**
	 * 交易方向
	 */
	@ApiField("side")
	private String side;

	/**
	 * 汇率上浮滑点 : BP单位，即汇率单位的万分之一。仅在“请求汇率模式”为REQ时有效，在请求汇率/汇率编码对应的汇率的基础上，Side为BUY时上浮滑点，Side为SELL时下浮滑点
	 */
	@ApiField("slip_point")
	private String slipPoint;

	/**
	 * 客户所在的时区，按照标准时区。
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 租户信息
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 上层业务应用发起交易时间
	 */
	@ApiField("trade_timestamp")
	private Date tradeTimestamp;

	/**
	 * 成交模式,按成交价格产生方式，起息日是否明确，交易日期是否明确，交易金额是否部分成交等维度产生的标识组合出的模式
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 交易金额
	 */
	@ApiField("transaction_amount")
	private String transactionAmount;

	/**
	 * 交易币种
	 */
	@ApiField("transaction_ccy")
	private String transactionCcy;

	/**
	 * 交易币种交割方式,字典：DELIV，NDF。当Client的实际交割货币与交易币种不一致时，送NDF。
	 */
	@ApiField("transaction_ccy_type")
	private String transactionCcyType;

	/**
	 * 交易类型使用。字典：SALE，REFUND，CHARGEBACK，CHARGEBACK_REVERSE，CANCELLATION等
	 */
	@ApiField("transaction_type")
	private String transactionType;

	/**
	 * 发起交易的用户或商户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 起息日期YYYYMMDD
	 */
	@ApiField("value_date")
	private String valueDate;

    /**
     * Gets acquirer.
     *
     * @return the acquirer
     */
    public String getAcquirer() {
		return this.acquirer;
	}

    /**
     * Sets acquirer.
     *
     * @param acquirer the acquirer
     */
    public void setAcquirer(String acquirer) {
		this.acquirer = acquirer;
	}

    /**
     * Gets acquirer mem id.
     *
     * @return the acquirer mem id
     */
    public String getAcquirerMemId() {
		return this.acquirerMemId;
	}

    /**
     * Sets acquirer mem id.
     *
     * @param acquirerMemId the acquirer mem id
     */
    public void setAcquirerMemId(String acquirerMemId) {
		this.acquirerMemId = acquirerMemId;
	}

    /**
     * Gets aml status.
     *
     * @return the aml status
     */
    public String getAmlStatus() {
		return this.amlStatus;
	}

    /**
     * Sets aml status.
     *
     * @param amlStatus the aml status
     */
    public void setAmlStatus(String amlStatus) {
		this.amlStatus = amlStatus;
	}

    /**
     * Gets biz ev code.
     *
     * @return the biz ev code
     */
    public String getBizEvCode() {
		return this.bizEvCode;
	}

    /**
     * Sets biz ev code.
     *
     * @param bizEvCode the biz ev code
     */
    public void setBizEvCode(String bizEvCode) {
		this.bizEvCode = bizEvCode;
	}

    /**
     * Gets biz pd code.
     *
     * @return the biz pd code
     */
    public String getBizPdCode() {
		return this.bizPdCode;
	}

    /**
     * Sets biz pd code.
     *
     * @param bizPdCode the biz pd code
     */
    public void setBizPdCode(String bizPdCode) {
		this.bizPdCode = bizPdCode;
	}

    /**
     * Gets client advice timestamp.
     *
     * @return the client advice timestamp
     */
    public Date getClientAdviceTimestamp() {
		return this.clientAdviceTimestamp;
	}

    /**
     * Sets client advice timestamp.
     *
     * @param clientAdviceTimestamp the client advice timestamp
     */
    public void setClientAdviceTimestamp(Date clientAdviceTimestamp) {
		this.clientAdviceTimestamp = clientAdviceTimestamp;
	}

    /**
     * Gets client business id.
     *
     * @return the client business id
     */
    public String getClientBusinessId() {
		return this.clientBusinessId;
	}

    /**
     * Sets client business id.
     *
     * @param clientBusinessId the client business id
     */
    public void setClientBusinessId(String clientBusinessId) {
		this.clientBusinessId = clientBusinessId;
	}

    /**
     * Gets client id.
     *
     * @return the client id
     */
    public String getClientId() {
		return this.clientId;
	}

    /**
     * Sets client id.
     *
     * @param clientId the client id
     */
    public void setClientId(String clientId) {
		this.clientId = clientId;
	}

    /**
     * Gets client message id.
     *
     * @return the client message id
     */
    public String getClientMessageId() {
		return this.clientMessageId;
	}

    /**
     * Sets client message id.
     *
     * @param clientMessageId the client message id
     */
    public void setClientMessageId(String clientMessageId) {
		this.clientMessageId = clientMessageId;
	}

    /**
     * Gets client ref.
     *
     * @return the client ref
     */
    public String getClientRef() {
		return this.clientRef;
	}

    /**
     * Sets client ref.
     *
     * @param clientRef the client ref
     */
    public void setClientRef(String clientRef) {
		this.clientRef = clientRef;
	}

    /**
     * Gets client system.
     *
     * @return the client system
     */
    public String getClientSystem() {
		return this.clientSystem;
	}

    /**
     * Sets client system.
     *
     * @param clientSystem the client system
     */
    public void setClientSystem(String clientSystem) {
		this.clientSystem = clientSystem;
	}

    /**
     * Gets cnl ev code.
     *
     * @return the cnl ev code
     */
    public String getCnlEvCode() {
		return this.cnlEvCode;
	}

    /**
     * Sets cnl ev code.
     *
     * @param cnlEvCode the cnl ev code
     */
    public void setCnlEvCode(String cnlEvCode) {
		this.cnlEvCode = cnlEvCode;
	}

    /**
     * Gets cnl no.
     *
     * @return the cnl no
     */
    public String getCnlNo() {
		return this.cnlNo;
	}

    /**
     * Sets cnl no.
     *
     * @param cnlNo the cnl no
     */
    public void setCnlNo(String cnlNo) {
		this.cnlNo = cnlNo;
	}

    /**
     * Gets cnl pd code.
     *
     * @return the cnl pd code
     */
    public String getCnlPdCode() {
		return this.cnlPdCode;
	}

    /**
     * Sets cnl pd code.
     *
     * @param cnlPdCode the cnl pd code
     */
    public void setCnlPdCode(String cnlPdCode) {
		this.cnlPdCode = cnlPdCode;
	}

    /**
     * Gets contra amount.
     *
     * @return the contra amount
     */
    public String getContraAmount() {
		return this.contraAmount;
	}

    /**
     * Sets contra amount.
     *
     * @param contraAmount the contra amount
     */
    public void setContraAmount(String contraAmount) {
		this.contraAmount = contraAmount;
	}

    /**
     * Gets contra ccy.
     *
     * @return the contra ccy
     */
    public String getContraCcy() {
		return this.contraCcy;
	}

    /**
     * Sets contra ccy.
     *
     * @param contraCcy the contra ccy
     */
    public void setContraCcy(String contraCcy) {
		this.contraCcy = contraCcy;
	}

    /**
     * Gets extension.
     *
     * @return the extension
     */
    public String getExtension() {
		return this.extension;
	}

    /**
     * Sets extension.
     *
     * @param extension the extension
     */
    public void setExtension(String extension) {
		this.extension = extension;
	}

    /**
     * Gets inst entity.
     *
     * @return the inst entity
     */
    public String getInstEntity() {
		return this.instEntity;
	}

    /**
     * Sets inst entity.
     *
     * @param instEntity the inst entity
     */
    public void setInstEntity(String instEntity) {
		this.instEntity = instEntity;
	}

    /**
     * Gets is locked.
     *
     * @return the is locked
     */
    public String getIsLocked() {
		return this.isLocked;
	}

    /**
     * Sets is locked.
     *
     * @param isLocked the is locked
     */
    public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}

    /**
     * Gets issuer.
     *
     * @return the issuer
     */
    public String getIssuer() {
		return this.issuer;
	}

    /**
     * Sets issuer.
     *
     * @param issuer the issuer
     */
    public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

    /**
     * Gets issuer mem id.
     *
     * @return the issuer mem id
     */
    public String getIssuerMemId() {
		return this.issuerMemId;
	}

    /**
     * Sets issuer mem id.
     *
     * @param issuerMemId the issuer mem id
     */
    public void setIssuerMemId(String issuerMemId) {
		this.issuerMemId = issuerMemId;
	}

    /**
     * Gets merchant mcc.
     *
     * @return the merchant mcc
     */
    public String getMerchantMcc() {
		return this.merchantMcc;
	}

    /**
     * Sets merchant mcc.
     *
     * @param merchantMcc the merchant mcc
     */
    public void setMerchantMcc(String merchantMcc) {
		this.merchantMcc = merchantMcc;
	}

    /**
     * Gets msg type.
     *
     * @return the msg type
     */
    public String getMsgType() {
		return this.msgType;
	}

    /**
     * Sets msg type.
     *
     * @param msgType the msg type
     */
    public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

    /**
     * Gets operate type.
     *
     * @return the operate type
     */
    public String getOperateType() {
		return this.operateType;
	}

    /**
     * Sets operate type.
     *
     * @param operateType the operate type
     */
    public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

    /**
     * Gets partial trade.
     *
     * @return the partial trade
     */
    public String getPartialTrade() {
		return this.partialTrade;
	}

    /**
     * Sets partial trade.
     *
     * @param partialTrade the partial trade
     */
    public void setPartialTrade(String partialTrade) {
		this.partialTrade = partialTrade;
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
     * Gets payment provider.
     *
     * @return the payment provider
     */
    public String getPaymentProvider() {
		return this.paymentProvider;
	}

    /**
     * Sets payment provider.
     *
     * @param paymentProvider the payment provider
     */
    public void setPaymentProvider(String paymentProvider) {
		this.paymentProvider = paymentProvider;
	}

    /**
     * Gets payment type.
     *
     * @return the payment type
     */
    public String getPaymentType() {
		return this.paymentType;
	}

    /**
     * Sets payment type.
     *
     * @param paymentType the payment type
     */
    public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

    /**
     * Gets product id.
     *
     * @return the product id
     */
    public String getProductId() {
		return this.productId;
	}

    /**
     * Sets product id.
     *
     * @param productId the product id
     */
    public void setProductId(String productId) {
		this.productId = productId;
	}

    /**
     * Gets profile id.
     *
     * @return the profile id
     */
    public String getProfileId() {
		return this.profileId;
	}

    /**
     * Sets profile id.
     *
     * @param profileId the profile id
     */
    public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

    /**
     * Gets rate base ccy.
     *
     * @return the rate base ccy
     */
    public String getRateBaseCcy() {
		return this.rateBaseCcy;
	}

    /**
     * Sets rate base ccy.
     *
     * @param rateBaseCcy the rate base ccy
     */
    public void setRateBaseCcy(String rateBaseCcy) {
		this.rateBaseCcy = rateBaseCcy;
	}

    /**
     * Gets rate ref.
     *
     * @return the rate ref
     */
    public String getRateRef() {
		return this.rateRef;
	}

    /**
     * Sets rate ref.
     *
     * @param rateRef the rate ref
     */
    public void setRateRef(String rateRef) {
		this.rateRef = rateRef;
	}

    /**
     * Gets rate request mode.
     *
     * @return the rate request mode
     */
    public String getRateRequestMode() {
		return this.rateRequestMode;
	}

    /**
     * Sets rate request mode.
     *
     * @param rateRequestMode the rate request mode
     */
    public void setRateRequestMode(String rateRequestMode) {
		this.rateRequestMode = rateRequestMode;
	}

    /**
     * Gets rate type.
     *
     * @return the rate type
     */
    public String getRateType() {
		return this.rateType;
	}

    /**
     * Sets rate type.
     *
     * @param rateType the rate type
     */
    public void setRateType(String rateType) {
		this.rateType = rateType;
	}

    /**
     * Gets reference field 1.
     *
     * @return the reference field 1
     */
    public String getReferenceField1() {
		return this.referenceField1;
	}

    /**
     * Sets reference field 1.
     *
     * @param referenceField1 the reference field 1
     */
    public void setReferenceField1(String referenceField1) {
		this.referenceField1 = referenceField1;
	}

    /**
     * Gets reference field 2.
     *
     * @return the reference field 2
     */
    public String getReferenceField2() {
		return this.referenceField2;
	}

    /**
     * Sets reference field 2.
     *
     * @param referenceField2 the reference field 2
     */
    public void setReferenceField2(String referenceField2) {
		this.referenceField2 = referenceField2;
	}

    /**
     * Gets reference field 3.
     *
     * @return the reference field 3
     */
    public String getReferenceField3() {
		return this.referenceField3;
	}

    /**
     * Sets reference field 3.
     *
     * @param referenceField3 the reference field 3
     */
    public void setReferenceField3(String referenceField3) {
		this.referenceField3 = referenceField3;
	}

    /**
     * Gets related message id.
     *
     * @return the related message id
     */
    public String getRelatedMessageId() {
		return this.relatedMessageId;
	}

    /**
     * Sets related message id.
     *
     * @param relatedMessageId the related message id
     */
    public void setRelatedMessageId(String relatedMessageId) {
		this.relatedMessageId = relatedMessageId;
	}

    /**
     * Gets request message id.
     *
     * @return the request message id
     */
    public String getRequestMessageId() {
		return this.requestMessageId;
	}

    /**
     * Sets request message id.
     *
     * @param requestMessageId the request message id
     */
    public void setRequestMessageId(String requestMessageId) {
		this.requestMessageId = requestMessageId;
	}

    /**
     * Gets requested rate.
     *
     * @return the requested rate
     */
    public String getRequestedRate() {
		return this.requestedRate;
	}

    /**
     * Sets requested rate.
     *
     * @param requestedRate the requested rate
     */
    public void setRequestedRate(String requestedRate) {
		this.requestedRate = requestedRate;
	}

    /**
     * Gets settlement amount.
     *
     * @return the settlement amount
     */
    public String getSettlementAmount() {
		return this.settlementAmount;
	}

    /**
     * Sets settlement amount.
     *
     * @param settlementAmount the settlement amount
     */
    public void setSettlementAmount(String settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

    /**
     * Gets settlement ccy.
     *
     * @return the settlement ccy
     */
    public String getSettlementCcy() {
		return this.settlementCcy;
	}

    /**
     * Sets settlement ccy.
     *
     * @param settlementCcy the settlement ccy
     */
    public void setSettlementCcy(String settlementCcy) {
		this.settlementCcy = settlementCcy;
	}

    /**
     * Gets side.
     *
     * @return the side
     */
    public String getSide() {
		return this.side;
	}

    /**
     * Sets side.
     *
     * @param side the side
     */
    public void setSide(String side) {
		this.side = side;
	}

    /**
     * Gets slip point.
     *
     * @return the slip point
     */
    public String getSlipPoint() {
		return this.slipPoint;
	}

    /**
     * Sets slip point.
     *
     * @param slipPoint the slip point
     */
    public void setSlipPoint(String slipPoint) {
		this.slipPoint = slipPoint;
	}

    /**
     * Gets time zone.
     *
     * @return the time zone
     */
    public String getTimeZone() {
		return this.timeZone;
	}

    /**
     * Sets time zone.
     *
     * @param timeZone the time zone
     */
    public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

    /**
     * Gets tnt inst id.
     *
     * @return the tnt inst id
     */
    public String getTntInstId() {
		return this.tntInstId;
	}

    /**
     * Sets tnt inst id.
     *
     * @param tntInstId the tnt inst id
     */
    public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

    /**
     * Gets trade timestamp.
     *
     * @return the trade timestamp
     */
    public Date getTradeTimestamp() {
		return this.tradeTimestamp;
	}

    /**
     * Sets trade timestamp.
     *
     * @param tradeTimestamp the trade timestamp
     */
    public void setTradeTimestamp(Date tradeTimestamp) {
		this.tradeTimestamp = tradeTimestamp;
	}

    /**
     * Gets trade type.
     *
     * @return the trade type
     */
    public String getTradeType() {
		return this.tradeType;
	}

    /**
     * Sets trade type.
     *
     * @param tradeType the trade type
     */
    public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

    /**
     * Gets transaction amount.
     *
     * @return the transaction amount
     */
    public String getTransactionAmount() {
		return this.transactionAmount;
	}

    /**
     * Sets transaction amount.
     *
     * @param transactionAmount the transaction amount
     */
    public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

    /**
     * Gets transaction ccy.
     *
     * @return the transaction ccy
     */
    public String getTransactionCcy() {
		return this.transactionCcy;
	}

    /**
     * Sets transaction ccy.
     *
     * @param transactionCcy the transaction ccy
     */
    public void setTransactionCcy(String transactionCcy) {
		this.transactionCcy = transactionCcy;
	}

    /**
     * Gets transaction ccy type.
     *
     * @return the transaction ccy type
     */
    public String getTransactionCcyType() {
		return this.transactionCcyType;
	}

    /**
     * Sets transaction ccy type.
     *
     * @param transactionCcyType the transaction ccy type
     */
    public void setTransactionCcyType(String transactionCcyType) {
		this.transactionCcyType = transactionCcyType;
	}

    /**
     * Gets transaction type.
     *
     * @return the transaction type
     */
    public String getTransactionType() {
		return this.transactionType;
	}

    /**
     * Sets transaction type.
     *
     * @param transactionType the transaction type
     */
    public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
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

    /**
     * Gets value date.
     *
     * @return the value date
     */
    public String getValueDate() {
		return this.valueDate;
	}

    /**
     * Sets value date.
     *
     * @param valueDate the value date
     */
    public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

}
