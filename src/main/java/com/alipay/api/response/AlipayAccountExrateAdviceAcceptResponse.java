package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.advice.accept response.
 *
 * @author auto create
 * @since 1.0, 2016-05-23 14:55:42
 */
public class AlipayAccountExrateAdviceAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 4214514565171378623L;

	/** 
	 * 客户号：用于定义FX交易的客户，由外汇交易中心统一分配
	 */
	@ApiField("client_id")
	private String clientId;

	/** 
	 * 对应金额，选输项
	 */
	@ApiField("contra_amount")
	private String contraAmount;

	/** 
	 * 相应币种
	 */
	@ApiField("contra_ccy")
	private String contraCcy;

	/** 
	 * FX中心的处理序号
	 */
	@ApiField("deal_ref")
	private String dealRef;

	/** 
	 * 实际成交的汇率，原FXRateUsed。
	 */
	@ApiField("dealt_rate")
	private String dealtRate;

	/** 
	 * 是否重复消息
	 */
	@ApiField("duplicate")
	private Boolean duplicate;

	/** 
	 * 交易请求号
	 */
	@ApiField("messag_id")
	private String messagId;

	/** 
	 * 请求类型
字典：H - HedgeAdvise , T - TradeAdvise。锁价模式下先发送Hedge，在发送对应的Trade。非锁价模式下，可直接发送Trade
	 */
	@ApiField("msg_type")
	private String msgType;

	/** 
	 * 汇率使用状态
字典：QUALIFY, EXCEPTION。请求汇率是否被使用，QUALIFY - 与请求汇率一致，EXCEPTION - 未使用请求汇率
	 */
	@ApiField("requested_rate_status")
	private String requestedRateStatus;

	/** 
	 * 买卖方向：BUY,SELL。客户视角对交易货币的操作。该字段为必填，与原TransactionType的对应关系如下：
SALE - SELL
REFUND - BUY
CHARGEBACK - BUY
CHARGEBACK_RESEVSE - SELL
CANCELLATION - 使用原交易的side"
r1
	 */
	@ApiField("side")
	private String side;

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
	 * 起息日期 :  YYYYMMDD，客户期望的资金交割日期
	 */
	@ApiField("value_date")
	private String valueDate;

    /**
     * Sets client id.
     *
     * @param clientId the client id
     */
    public void setClientId(String clientId) {
		this.clientId = clientId;
	}

    /**
     * Gets client id.
     *
     * @return the client id
     */
    public String getClientId( ) {
		return this.clientId;
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
     * Gets contra amount.
     *
     * @return the contra amount
     */
    public String getContraAmount( ) {
		return this.contraAmount;
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
     * Gets contra ccy.
     *
     * @return the contra ccy
     */
    public String getContraCcy( ) {
		return this.contraCcy;
	}

    /**
     * Sets deal ref.
     *
     * @param dealRef the deal ref
     */
    public void setDealRef(String dealRef) {
		this.dealRef = dealRef;
	}

    /**
     * Gets deal ref.
     *
     * @return the deal ref
     */
    public String getDealRef( ) {
		return this.dealRef;
	}

    /**
     * Sets dealt rate.
     *
     * @param dealtRate the dealt rate
     */
    public void setDealtRate(String dealtRate) {
		this.dealtRate = dealtRate;
	}

    /**
     * Gets dealt rate.
     *
     * @return the dealt rate
     */
    public String getDealtRate( ) {
		return this.dealtRate;
	}

    /**
     * Sets duplicate.
     *
     * @param duplicate the duplicate
     */
    public void setDuplicate(Boolean duplicate) {
		this.duplicate = duplicate;
	}

    /**
     * Gets duplicate.
     *
     * @return the duplicate
     */
    public Boolean getDuplicate( ) {
		return this.duplicate;
	}

    /**
     * Sets messag id.
     *
     * @param messagId the messag id
     */
    public void setMessagId(String messagId) {
		this.messagId = messagId;
	}

    /**
     * Gets messag id.
     *
     * @return the messag id
     */
    public String getMessagId( ) {
		return this.messagId;
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
     * Gets msg type.
     *
     * @return the msg type
     */
    public String getMsgType( ) {
		return this.msgType;
	}

    /**
     * Sets requested rate status.
     *
     * @param requestedRateStatus the requested rate status
     */
    public void setRequestedRateStatus(String requestedRateStatus) {
		this.requestedRateStatus = requestedRateStatus;
	}

    /**
     * Gets requested rate status.
     *
     * @return the requested rate status
     */
    public String getRequestedRateStatus( ) {
		return this.requestedRateStatus;
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
     * Gets side.
     *
     * @return the side
     */
    public String getSide( ) {
		return this.side;
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
     * Gets transaction amount.
     *
     * @return the transaction amount
     */
    public String getTransactionAmount( ) {
		return this.transactionAmount;
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
     * Gets transaction ccy.
     *
     * @return the transaction ccy
     */
    public String getTransactionCcy( ) {
		return this.transactionCcy;
	}

    /**
     * Sets value date.
     *
     * @param valueDate the value date
     */
    public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

    /**
     * Gets value date.
     *
     * @return the value date
     */
    public String getValueDate( ) {
		return this.valueDate;
	}

}
