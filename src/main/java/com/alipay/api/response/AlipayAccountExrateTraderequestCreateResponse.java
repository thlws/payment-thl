package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.traderequest.create response.
 *
 * @author auto create
 * @since 1.0, 2018-04-13 17:35:02
 */
public class AlipayAccountExrateTraderequestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5634478525564894399L;

	/** 
	 * 成交汇率的基准币种
	 */
	@ApiField("base_ccy")
	private String baseCcy;

	/** 
	 * 原请求客户号
	 */
	@ApiField("client_id")
	private String clientId;

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
	 * FX返回关联该笔业务单据的交易号
	 */
	@ApiField("deal_ref")
	private String dealRef;

	/** 
	 * 成交汇率
	 */
	@ApiField("dealt_rate")
	private String dealtRate;

	/** 
	 * 该请求是否为重复发送。当为true时，结果码和结果描述，为该交易当前的处理情况。
	 */
	@ApiField("duplicate")
	private String duplicate;

	/** 
	 * 请求类型
字典：H - HedgeAdvise , T - TradeAdvise。
	 */
	@ApiField("msg_type")
	private String msgType;

	/** 
	 * 业务唯一单据号
	 */
	@ApiField("requested_message_id")
	private String requestedMessageId;

	/** 
	 * 汇率使用状态,字典：QUALIFY, EXCEPTION。请求汇率是否被使用，QUALIFY - 与请求汇率一致，EXCEPTION - 未使用请求汇率
	 */
	@ApiField("requested_rate_status")
	private String requestedRateStatus;

	/** 
	 * 请求返回类型，字典，同步受理返回 acknowledge：ACK ;  异步成交回执 executtion  report：EXEC
	 */
	@ApiField("response_type")
	private String responseType;

	/** 
	 * 交易方向
	 */
	@ApiField("side")
	private String side;

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
	 * 起息日
	 */
	@ApiField("value_date")
	private String valueDate;

    /**
     * Sets base ccy.
     *
     * @param baseCcy the base ccy
     */
    public void setBaseCcy(String baseCcy) {
		this.baseCcy = baseCcy;
	}

    /**
     * Gets base ccy.
     *
     * @return the base ccy
     */
    public String getBaseCcy( ) {
		return this.baseCcy;
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
    public void setDuplicate(String duplicate) {
		this.duplicate = duplicate;
	}

    /**
     * Gets duplicate.
     *
     * @return the duplicate
     */
    public String getDuplicate( ) {
		return this.duplicate;
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
     * Sets requested message id.
     *
     * @param requestedMessageId the requested message id
     */
    public void setRequestedMessageId(String requestedMessageId) {
		this.requestedMessageId = requestedMessageId;
	}

    /**
     * Gets requested message id.
     *
     * @return the requested message id
     */
    public String getRequestedMessageId( ) {
		return this.requestedMessageId;
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
     * Sets response type.
     *
     * @param responseType the response type
     */
    public void setResponseType(String responseType) {
		this.responseType = responseType;
	}

    /**
     * Gets response type.
     *
     * @return the response type
     */
    public String getResponseType( ) {
		return this.responseType;
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
