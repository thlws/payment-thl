package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换请求对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class AdviceVO extends AlipayObject {

	private static final long serialVersionUID = 4255283241595992448L;

	/**
	 * 兑换请求发起时间
	 */
	@ApiField("client_advice_timestamp")
	private Date clientAdviceTimestamp;

	/**
	 * 客户号：用于定义FX交易的客户，由外汇交易中心统一分配
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 客户请求序号:  客户侧的流水号，由客户上送
	 */
	@ApiField("client_ref")
	private String clientRef;

	/**
	 * 对应金额，选输项
	 */
	@ApiField("contra_amount")
	private String contraAmount;

	/**
	 * 对应币种
	 */
	@ApiField("contra_ccy")
	private String contraCcy;

	/**
	 * 端对端流水号
原TransactionID，用于标识全局唯一序号
	 */
	@ApiField("end_to_end_id")
	private String endToEndId;

	/**
	 * 请求类型：H - HedgeAdvise , T - TradeAdvise。锁价模式下先发送Hedge，在发送对应的Trade。非锁价模式下，可直接发送Trade
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 是否部分成交：Y，N。是否可部分成交
默认为不可部分成交
	 */
	@ApiField("partial_trade")
	private String partialTrade;

	/**
	 * 支付渠道:  上送收单业务中的支付渠道，须提前约定。
	 */
	@ApiField("payment_provider")
	private String paymentProvider;

	/**
	 * 支付类型, 默认为DEFAULT
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 客户协议扩展号，用于支持同一客户在不同场景下所需的汇率
	 */
	@ApiField("profile_id")
	private String profileId;

	/**
	 * 汇率的唯一编码
	 */
	@ApiField("rate_ref")
	private String rateRef;

	/**
	 * 汇率请求模式 :  TA时必输，仅在TA时有效。
字典：REQ - 按客户请求(含滑点)成交，若该价格失效，则交易失败；ACP - 汇率失效或请求中不带汇率，接受该客户协议的最新汇率，实际成交汇率以GlobalFX为准；"
	 */
	@ApiField("rate_request_mode")
	private String rateRequestMode;

	/**
	 * 汇率类型：SPOT，FORWARD。送RateRef的情况下，以RateRef关联的汇率为准。
	 */
	@ApiField("rate_type")
	private String rateType;

	/**
	 * 备用字段1
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
	 * 关联交易请求号: "本次交易请求关联的原交易号。填写规范：
1）正向交易的TA，填写HA MessageId
2）REFUND，添加原SALE的TA MessageId
3）CHARGEBACK，填写原SALE的TA MessageId
4）CHARGEBACK_REVERSE，填写原CHARGEBACK的TA MessageId
5）CANCELLATION，填写被Cancel交易的TA MessageId"
	 */
	@ApiField("related_message_id")
	private String relatedMessageId;

	/**
	 * 交易请求号
	 */
	@ApiField("request_message_id")
	private String requestMessageId;

	/**
	 * 客户请求的汇率，送RateRef的情况下，以RateRef关联的汇率为准。
	 */
	@ApiField("requested_rate")
	private String requestedRate;

	/**
	 * NDF交割下，实际交割币种的金额
	 */
	@ApiField("settlement_amount")
	private String settlementAmount;

	/**
	 * NDF交割下，实际交割的币种
	 */
	@ApiField("settlement_ccy")
	private String settlementCcy;

	/**
	 * 买卖方向：BUY,SELL。客户视角对交易货币的操作。该字段为必填，与原TransactionType的对应关系如下：
SALE - SELL
REFUND - BUY
CHARGEBACK - BUY
CHARGEBACK_RESEVSE - SELL
CANCELLATION - 使用原交易的side"
	 */
	@ApiField("side")
	private String side;

	/**
	 * 汇率上浮滑点 : BP单位，即汇率单位的万分之一。仅在“请求汇率模式”为REQ时有效，在请求汇率/汇率编码对应的汇率的基础上，Side为BUY时上浮滑点，Side为SELL时下浮滑点
	 */
	@ApiField("slip_point")
	private Long slipPoint;

	/**
	 * 调用方事件码
	 */
	@ApiField("source_event_code")
	private String sourceEventCode;

	/**
	 * 调用方产品码
	 */
	@ApiField("source_product_code")
	private String sourceProductCode;

	/**
	 * 时间所在时区
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 上层业务发起时间
	 */
	@ApiField("trade_timestamp")
	private Date tradeTimestamp;

	/**
	 * 交易金额
	 */
	@ApiField("transaction_amount")
	private String transactionAmount;

	/**
	 * 交易币种: 客户视角的交易买卖币种
	 */
	@ApiField("transaction_ccy")
	private String transactionCcy;

	/**
	 * 交易币种交割方式：DELIV，NDF。当Client的实际交割货币与交易币种不一致时，送NDF。
	 */
	@ApiField("transaction_ccy_type")
	private String transactionCcyType;

	/**
	 * 交易类型:   兼容收单业务兑换使用。字典：SALE，REFUND，CHARGEBACK，CHARGEBACK_REVERSE，CANCELLATION
	 */
	@ApiField("transaction_type")
	private String transactionType;

	/**
	 * 起息日期 :  YYYYMMDD，客户期望的资金交割日期
	 */
	@ApiField("value_date")
	private String valueDate;

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
     * Gets end to end id.
     *
     * @return the end to end id
     */
    public String getEndToEndId() {
		return this.endToEndId;
	}

    /**
     * Sets end to end id.
     *
     * @param endToEndId the end to end id
     */
    public void setEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
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
    public Long getSlipPoint() {
		return this.slipPoint;
	}

    /**
     * Sets slip point.
     *
     * @param slipPoint the slip point
     */
    public void setSlipPoint(Long slipPoint) {
		this.slipPoint = slipPoint;
	}

    /**
     * Gets source event code.
     *
     * @return the source event code
     */
    public String getSourceEventCode() {
		return this.sourceEventCode;
	}

    /**
     * Sets source event code.
     *
     * @param sourceEventCode the source event code
     */
    public void setSourceEventCode(String sourceEventCode) {
		this.sourceEventCode = sourceEventCode;
	}

    /**
     * Gets source product code.
     *
     * @return the source product code
     */
    public String getSourceProductCode() {
		return this.sourceProductCode;
	}

    /**
     * Sets source product code.
     *
     * @param sourceProductCode the source product code
     */
    public void setSourceProductCode(String sourceProductCode) {
		this.sourceProductCode = sourceProductCode;
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
