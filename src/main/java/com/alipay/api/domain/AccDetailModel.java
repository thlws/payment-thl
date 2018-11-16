package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量代发到账户明细复杂模型
 *
 * @author auto create
 * @since 1.0, 2018-05-24 11:33:41
 */
public class AccDetailModel extends AlipayObject {

	private static final long serialVersionUID = 3864868543775766241L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 收款方身份认证信息。biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("cert_info")
	private CertInfo certInfo;

	/**
	 * 明细流水号
	 */
	@ApiField("detail_no")
	private String detailNo;

	/**
	 * 明细失败错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 明细失败错误原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 转账币种兑换的汇率信息。biz_scene是LOCAL场景下，该参数返回空。
	 */
	@ApiField("exchange_rate")
	private ExchangeRate exchangeRate;

	/**
	 * 是否需要通过alipay_order_no原单据重试.
T: 需要;
F或为空: 不需要.
	 */
	@ApiField("need_retry")
	private String needRetry;

	/**
	 * 收款方信息。
	 */
	@ApiField("payee_info")
	private AccPayeeInfo payeeInfo;

	/**
	 * 应付金额. 付款方应付金额.
LOCAL场景下为空.
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 支付币种.付款方应付的币种, 与批次请求时的payment_currency相同.
	 */
	@ApiField("payment_currency")
	private String paymentCurrency;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 结算金额。
收款方实际收到的金额.
biz_scene是LOCAL场景下，该参数返回空。
	 */
	@ApiField("settlement_amount")
	private String settlementAmount;

	/**
	 * 结算币种.收款方收到的币种. LOCAL场景下为空.
	 */
	@ApiField("settlement_currency")
	private String settlementCurrency;

	/**
	 * INIT：初始
APPLIED：已下单
DEALED：处理中
SUCCESS：处理成功
DISUSE：已废除
FAIL：处理失败
UNKNOWN：未知状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 转账金额。代发请求中指定的trans_amount.
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 转账币种
	 */
	@ApiField("trans_currency")
	private String transCurrency;

    /**
     * Gets alipay order no.
     *
     * @return the alipay order no
     */
    public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}

    /**
     * Sets alipay order no.
     *
     * @param alipayOrderNo the alipay order no
     */
    public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

    /**
     * Gets cert info.
     *
     * @return the cert info
     */
    public CertInfo getCertInfo() {
		return this.certInfo;
	}

    /**
     * Sets cert info.
     *
     * @param certInfo the cert info
     */
    public void setCertInfo(CertInfo certInfo) {
		this.certInfo = certInfo;
	}

    /**
     * Gets detail no.
     *
     * @return the detail no
     */
    public String getDetailNo() {
		return this.detailNo;
	}

    /**
     * Sets detail no.
     *
     * @param detailNo the detail no
     */
    public void setDetailNo(String detailNo) {
		this.detailNo = detailNo;
	}

    /**
     * Gets error code.
     *
     * @return the error code
     */
    public String getErrorCode() {
		return this.errorCode;
	}

    /**
     * Sets error code.
     *
     * @param errorCode the error code
     */
    public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

    /**
     * Gets error msg.
     *
     * @return the error msg
     */
    public String getErrorMsg() {
		return this.errorMsg;
	}

    /**
     * Sets error msg.
     *
     * @param errorMsg the error msg
     */
    public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

    /**
     * Gets exchange rate.
     *
     * @return the exchange rate
     */
    public ExchangeRate getExchangeRate() {
		return this.exchangeRate;
	}

    /**
     * Sets exchange rate.
     *
     * @param exchangeRate the exchange rate
     */
    public void setExchangeRate(ExchangeRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

    /**
     * Gets need retry.
     *
     * @return the need retry
     */
    public String getNeedRetry() {
		return this.needRetry;
	}

    /**
     * Sets need retry.
     *
     * @param needRetry the need retry
     */
    public void setNeedRetry(String needRetry) {
		this.needRetry = needRetry;
	}

    /**
     * Gets payee info.
     *
     * @return the payee info
     */
    public AccPayeeInfo getPayeeInfo() {
		return this.payeeInfo;
	}

    /**
     * Sets payee info.
     *
     * @param payeeInfo the payee info
     */
    public void setPayeeInfo(AccPayeeInfo payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

    /**
     * Gets payment amount.
     *
     * @return the payment amount
     */
    public String getPaymentAmount() {
		return this.paymentAmount;
	}

    /**
     * Sets payment amount.
     *
     * @param paymentAmount the payment amount
     */
    public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

    /**
     * Gets payment currency.
     *
     * @return the payment currency
     */
    public String getPaymentCurrency() {
		return this.paymentCurrency;
	}

    /**
     * Sets payment currency.
     *
     * @param paymentCurrency the payment currency
     */
    public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
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
     * Gets settlement currency.
     *
     * @return the settlement currency
     */
    public String getSettlementCurrency() {
		return this.settlementCurrency;
	}

    /**
     * Sets settlement currency.
     *
     * @param settlementCurrency the settlement currency
     */
    public void setSettlementCurrency(String settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets trans amount.
     *
     * @return the trans amount
     */
    public String getTransAmount() {
		return this.transAmount;
	}

    /**
     * Sets trans amount.
     *
     * @param transAmount the trans amount
     */
    public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
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

}
