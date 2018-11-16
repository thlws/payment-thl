package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户汇率
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class ExClientRateVO extends AlipayObject {

	private static final long serialVersionUID = 2321174752778439182L;

	/**
	 * 协议编号
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 基准货币。汇率货币单位默认为1，即1货币单位的基础货币，对应非基准货币的价格
	 */
	@ApiField("base_ccy")
	private String baseCcy;

	/**
	 * 买入价格 为交易对手添加了点差后，基准货币的买入价格，直接面向终端客户
	 */
	@ApiField("bid_rate")
	private String bidRate;

	/**
	 * 终端客户买入价格 面向交易对手的基准货币买入价格，不包含终端客户点差
	 */
	@ApiField("client_bid_rate")
	private String clientBidRate;

	/**
	 * 客户id
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 终端客户卖出价格 面向交易对手的基准货币卖出价格，不包含终端客户点差
	 */
	@ApiField("client_offer_rate")
	private String clientOfferRate;

	/**
	 * 基准货币/非基准货币
	 */
	@ApiField("currency_pair")
	private String currencyPair;

	/**
	 * 汇率的失效时间
	 */
	@ApiField("expiry_time")
	private String expiryTime;

	/**
	 * 汇率生成日期,yyyymmdd
	 */
	@ApiField("generate_date")
	private String generateDate;

	/**
	 * 汇率生成时间 与rateTime一致
	 */
	@ApiField("generate_time")
	private Date generateTime;

	/**
	 * 字典：T - 可交易，F - 仅作为参考，不可交易
	 */
	@ApiField("guaranteed")
	private String guaranteed;

	/**
	 * 远期或者掉期点价格到期日, yyyymmdd
	 */
	@ApiField("maturity_date")
	private String maturityDate;

	/**
	 * 基准货币买入的最大金额，对于单笔、累计交易
	 */
	@ApiField("maximum_bid_amount")
	private Long maximumBidAmount;

	/**
	 * 基准货币卖出的最大金额，对于单笔、累计交易
	 */
	@ApiField("maximum_offer_amount")
	private Long maximumOfferAmount;

	/**
	 * 汇率中间价
	 */
	@ApiField("mid_rate")
	private String midRate;

	/**
	 * 基准货币买入的最小金额，对于单笔交易
	 */
	@ApiField("minimum_bid_amount")
	private String minimumBidAmount;

	/**
	 * 基准货币卖出的最小金额，对于单笔交易
	 */
	@ApiField("minimum_offer_amount")
	private String minimumOfferAmount;

	/**
	 * 卖出价格 添加了交易对手点差后，基准货币的卖出价格，直接面向终端客户
	 */
	@ApiField("offer_rate")
	private String offerRate;

	/**
	 * 在岸离岸标识 ON - 在岸，OFF - 离岸
	 */
	@ApiField("on_off_shore")
	private String onOffShore;

	/**
	 * 该汇率的来源机构
	 */
	@ApiField("origin_rate_inst")
	private String originRateInst;

	/**
	 * 原始汇率来源机构，对该汇率的唯一标识
	 */
	@ApiField("origin_rate_ref")
	private String originRateRef;

	/**
	 * 汇率期限 字典：TODAY, TOMORROW, SPOT, O/N, T/N等标准期限
	 */
	@ApiField("period")
	private String period;

	/**
	 * 子协议扩展号 对不同商户/渠道的报价协议
	 */
	@ApiField("profile_id")
	private String profileId;

	/**
	 * 非基准货币
	 */
	@ApiField("quote_ccy")
	private String quoteCcy;

	/**
	 * 标识单一货币对，每次汇率生成时变化，不重复
	 */
	@ApiField("rate_ref")
	private String rateRef;

	/**
	 * 汇率发布时间
	 */
	@ApiField("rate_time")
	private String rateTime;

	/**
	 * 字典: SPOT - 即期，FORWORD - 远期，SWAP - 掉期点
	 */
	@ApiField("rate_type")
	private String rateType;

	/**
	 * 汇率类型为远期下，即期的买入价
	 */
	@ApiField("sp_bid")
	private String spBid;

	/**
	 * 汇率类型为远期下，即期的中间价
	 */
	@ApiField("sp_mid")
	private String spMid;

	/**
	 * 汇率类型为远期下，即期的卖出价
	 */
	@ApiField("sp_offer")
	private String spOffer;

	/**
	 * 报价中心内部标准产品编码
	 */
	@ApiField("standard_product_rate_id")
	private String standardProductRateId;

	/**
	 * 汇率的有效时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 子协议id
	 */
	@ApiField("sub_agreement_id")
	private String subAgreementId;

	/**
	 * 锁定汇率模式下，在新旧汇率交替时，仍可以使用旧汇率下单的最外时间
	 */
	@ApiField("threshold_time")
	private String thresholdTime;

	/**
	 * 时间所在的时区
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 交易货币类型 字典: DELIV - 原币交割，NDF - 非原币交割
	 */
	@ApiField("transaction_ccy_type")
	private String transactionCcyType;

	/**
	 * 保价过期时间
	 */
	@ApiField("valid_time")
	private String validTime;

    /**
     * Gets agreement id.
     *
     * @return the agreement id
     */
    public String getAgreementId() {
		return this.agreementId;
	}

    /**
     * Sets agreement id.
     *
     * @param agreementId the agreement id
     */
    public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

    /**
     * Gets base ccy.
     *
     * @return the base ccy
     */
    public String getBaseCcy() {
		return this.baseCcy;
	}

    /**
     * Sets base ccy.
     *
     * @param baseCcy the base ccy
     */
    public void setBaseCcy(String baseCcy) {
		this.baseCcy = baseCcy;
	}

    /**
     * Gets bid rate.
     *
     * @return the bid rate
     */
    public String getBidRate() {
		return this.bidRate;
	}

    /**
     * Sets bid rate.
     *
     * @param bidRate the bid rate
     */
    public void setBidRate(String bidRate) {
		this.bidRate = bidRate;
	}

    /**
     * Gets client bid rate.
     *
     * @return the client bid rate
     */
    public String getClientBidRate() {
		return this.clientBidRate;
	}

    /**
     * Sets client bid rate.
     *
     * @param clientBidRate the client bid rate
     */
    public void setClientBidRate(String clientBidRate) {
		this.clientBidRate = clientBidRate;
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
     * Gets client offer rate.
     *
     * @return the client offer rate
     */
    public String getClientOfferRate() {
		return this.clientOfferRate;
	}

    /**
     * Sets client offer rate.
     *
     * @param clientOfferRate the client offer rate
     */
    public void setClientOfferRate(String clientOfferRate) {
		this.clientOfferRate = clientOfferRate;
	}

    /**
     * Gets currency pair.
     *
     * @return the currency pair
     */
    public String getCurrencyPair() {
		return this.currencyPair;
	}

    /**
     * Sets currency pair.
     *
     * @param currencyPair the currency pair
     */
    public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

    /**
     * Gets expiry time.
     *
     * @return the expiry time
     */
    public String getExpiryTime() {
		return this.expiryTime;
	}

    /**
     * Sets expiry time.
     *
     * @param expiryTime the expiry time
     */
    public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}

    /**
     * Gets generate date.
     *
     * @return the generate date
     */
    public String getGenerateDate() {
		return this.generateDate;
	}

    /**
     * Sets generate date.
     *
     * @param generateDate the generate date
     */
    public void setGenerateDate(String generateDate) {
		this.generateDate = generateDate;
	}

    /**
     * Gets generate time.
     *
     * @return the generate time
     */
    public Date getGenerateTime() {
		return this.generateTime;
	}

    /**
     * Sets generate time.
     *
     * @param generateTime the generate time
     */
    public void setGenerateTime(Date generateTime) {
		this.generateTime = generateTime;
	}

    /**
     * Gets guaranteed.
     *
     * @return the guaranteed
     */
    public String getGuaranteed() {
		return this.guaranteed;
	}

    /**
     * Sets guaranteed.
     *
     * @param guaranteed the guaranteed
     */
    public void setGuaranteed(String guaranteed) {
		this.guaranteed = guaranteed;
	}

    /**
     * Gets maturity date.
     *
     * @return the maturity date
     */
    public String getMaturityDate() {
		return this.maturityDate;
	}

    /**
     * Sets maturity date.
     *
     * @param maturityDate the maturity date
     */
    public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

    /**
     * Gets maximum bid amount.
     *
     * @return the maximum bid amount
     */
    public Long getMaximumBidAmount() {
		return this.maximumBidAmount;
	}

    /**
     * Sets maximum bid amount.
     *
     * @param maximumBidAmount the maximum bid amount
     */
    public void setMaximumBidAmount(Long maximumBidAmount) {
		this.maximumBidAmount = maximumBidAmount;
	}

    /**
     * Gets maximum offer amount.
     *
     * @return the maximum offer amount
     */
    public Long getMaximumOfferAmount() {
		return this.maximumOfferAmount;
	}

    /**
     * Sets maximum offer amount.
     *
     * @param maximumOfferAmount the maximum offer amount
     */
    public void setMaximumOfferAmount(Long maximumOfferAmount) {
		this.maximumOfferAmount = maximumOfferAmount;
	}

    /**
     * Gets mid rate.
     *
     * @return the mid rate
     */
    public String getMidRate() {
		return this.midRate;
	}

    /**
     * Sets mid rate.
     *
     * @param midRate the mid rate
     */
    public void setMidRate(String midRate) {
		this.midRate = midRate;
	}

    /**
     * Gets minimum bid amount.
     *
     * @return the minimum bid amount
     */
    public String getMinimumBidAmount() {
		return this.minimumBidAmount;
	}

    /**
     * Sets minimum bid amount.
     *
     * @param minimumBidAmount the minimum bid amount
     */
    public void setMinimumBidAmount(String minimumBidAmount) {
		this.minimumBidAmount = minimumBidAmount;
	}

    /**
     * Gets minimum offer amount.
     *
     * @return the minimum offer amount
     */
    public String getMinimumOfferAmount() {
		return this.minimumOfferAmount;
	}

    /**
     * Sets minimum offer amount.
     *
     * @param minimumOfferAmount the minimum offer amount
     */
    public void setMinimumOfferAmount(String minimumOfferAmount) {
		this.minimumOfferAmount = minimumOfferAmount;
	}

    /**
     * Gets offer rate.
     *
     * @return the offer rate
     */
    public String getOfferRate() {
		return this.offerRate;
	}

    /**
     * Sets offer rate.
     *
     * @param offerRate the offer rate
     */
    public void setOfferRate(String offerRate) {
		this.offerRate = offerRate;
	}

    /**
     * Gets on off shore.
     *
     * @return the on off shore
     */
    public String getOnOffShore() {
		return this.onOffShore;
	}

    /**
     * Sets on off shore.
     *
     * @param onOffShore the on off shore
     */
    public void setOnOffShore(String onOffShore) {
		this.onOffShore = onOffShore;
	}

    /**
     * Gets origin rate inst.
     *
     * @return the origin rate inst
     */
    public String getOriginRateInst() {
		return this.originRateInst;
	}

    /**
     * Sets origin rate inst.
     *
     * @param originRateInst the origin rate inst
     */
    public void setOriginRateInst(String originRateInst) {
		this.originRateInst = originRateInst;
	}

    /**
     * Gets origin rate ref.
     *
     * @return the origin rate ref
     */
    public String getOriginRateRef() {
		return this.originRateRef;
	}

    /**
     * Sets origin rate ref.
     *
     * @param originRateRef the origin rate ref
     */
    public void setOriginRateRef(String originRateRef) {
		this.originRateRef = originRateRef;
	}

    /**
     * Gets period.
     *
     * @return the period
     */
    public String getPeriod() {
		return this.period;
	}

    /**
     * Sets period.
     *
     * @param period the period
     */
    public void setPeriod(String period) {
		this.period = period;
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
     * Gets quote ccy.
     *
     * @return the quote ccy
     */
    public String getQuoteCcy() {
		return this.quoteCcy;
	}

    /**
     * Sets quote ccy.
     *
     * @param quoteCcy the quote ccy
     */
    public void setQuoteCcy(String quoteCcy) {
		this.quoteCcy = quoteCcy;
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
     * Gets rate time.
     *
     * @return the rate time
     */
    public String getRateTime() {
		return this.rateTime;
	}

    /**
     * Sets rate time.
     *
     * @param rateTime the rate time
     */
    public void setRateTime(String rateTime) {
		this.rateTime = rateTime;
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
     * Gets sp bid.
     *
     * @return the sp bid
     */
    public String getSpBid() {
		return this.spBid;
	}

    /**
     * Sets sp bid.
     *
     * @param spBid the sp bid
     */
    public void setSpBid(String spBid) {
		this.spBid = spBid;
	}

    /**
     * Gets sp mid.
     *
     * @return the sp mid
     */
    public String getSpMid() {
		return this.spMid;
	}

    /**
     * Sets sp mid.
     *
     * @param spMid the sp mid
     */
    public void setSpMid(String spMid) {
		this.spMid = spMid;
	}

    /**
     * Gets sp offer.
     *
     * @return the sp offer
     */
    public String getSpOffer() {
		return this.spOffer;
	}

    /**
     * Sets sp offer.
     *
     * @param spOffer the sp offer
     */
    public void setSpOffer(String spOffer) {
		this.spOffer = spOffer;
	}

    /**
     * Gets standard product rate id.
     *
     * @return the standard product rate id
     */
    public String getStandardProductRateId() {
		return this.standardProductRateId;
	}

    /**
     * Sets standard product rate id.
     *
     * @param standardProductRateId the standard product rate id
     */
    public void setStandardProductRateId(String standardProductRateId) {
		this.standardProductRateId = standardProductRateId;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public String getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

    /**
     * Gets sub agreement id.
     *
     * @return the sub agreement id
     */
    public String getSubAgreementId() {
		return this.subAgreementId;
	}

    /**
     * Sets sub agreement id.
     *
     * @param subAgreementId the sub agreement id
     */
    public void setSubAgreementId(String subAgreementId) {
		this.subAgreementId = subAgreementId;
	}

    /**
     * Gets threshold time.
     *
     * @return the threshold time
     */
    public String getThresholdTime() {
		return this.thresholdTime;
	}

    /**
     * Sets threshold time.
     *
     * @param thresholdTime the threshold time
     */
    public void setThresholdTime(String thresholdTime) {
		this.thresholdTime = thresholdTime;
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
     * Gets valid time.
     *
     * @return the valid time
     */
    public String getValidTime() {
		return this.validTime;
	}

    /**
     * Sets valid time.
     *
     * @param validTime the valid time
     */
    public void setValidTime(String validTime) {
		this.validTime = validTime;
	}

}
