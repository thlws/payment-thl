package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 源汇率
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class PricingVO extends AlipayObject {

	private static final long serialVersionUID = 6227852987653728972L;

	/**
	 * 买入价
	 */
	@ApiField("bid")
	private String bid;

	/**
	 * 基准币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 基本币种单位
	 */
	@ApiField("currency_unit")
	private Long currencyUnit;

	/**
	 * 汇率失效时间yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expiry_timestamp")
	private String expiryTimestamp;

	/**
	 * 汇率生成时间 用来做幂等 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("generate_timestamp")
	private String generateTimestamp;

	/**
	 * 远期或者掉期到期时间 yyyyMMdd
	 */
	@ApiField("maturity_date")
	private String maturityDate;

	/**
	 * 该价格的最大买入量
	 */
	@ApiField("maximum_bid_amount")
	private Long maximumBidAmount;

	/**
	 * 该价格的最大卖出量
	 */
	@ApiField("maximum_offer_amount")
	private Long maximumOfferAmount;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 中间价
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 该价格的最小买入量
	 */
	@ApiField("minimum_bid_amount")
	private Long minimumBidAmount;

	/**
	 * 该价格的最小卖出量
	 */
	@ApiField("minimum_offer_amount")
	private Long minimumOfferAmount;

	/**
	 * 卖出价
	 */
	@ApiField("offer")
	private String offer;

	/**
	 * 标准期限TODAY TOM SPOT 1D 1W 1M 1Y
	 */
	@ApiField("period")
	private String period;

	/**
	 * 源汇率参考id 唯一id
	 */
	@ApiField("rate_reference_id")
	private String rateReferenceId;

	/**
	 * 汇率类型 SPOT FORWARD
	 */
	@ApiField("rate_type")
	private String rateType;

	/**
	 * 即期买入价
	 */
	@ApiField("spot_bid")
	private String spotBid;

	/**
	 * 即期中间价
	 */
	@ApiField("spot_mid")
	private String spotMid;

	/**
	 * 即期卖出价
	 */
	@ApiField("spot_offer")
	private String spotOffer;

	/**
	 * 汇率生效时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_timestamp")
	private String startTimestamp;

	/**
	 * 货币对
	 */
	@ApiField("symbol")
	private String symbol;

	/**
	 * 汇率缓冲时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("threshold_timestamp")
	private String thresholdTimestamp;

	/**
	 * 锁汇失效时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_timestamp")
	private String validTimestamp;

    /**
     * Gets bid.
     *
     * @return the bid
     */
    public String getBid() {
		return this.bid;
	}

    /**
     * Sets bid.
     *
     * @param bid the bid
     */
    public void setBid(String bid) {
		this.bid = bid;
	}

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
		return this.currency;
	}

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
		this.currency = currency;
	}

    /**
     * Gets currency unit.
     *
     * @return the currency unit
     */
    public Long getCurrencyUnit() {
		return this.currencyUnit;
	}

    /**
     * Sets currency unit.
     *
     * @param currencyUnit the currency unit
     */
    public void setCurrencyUnit(Long currencyUnit) {
		this.currencyUnit = currencyUnit;
	}

    /**
     * Gets expiry timestamp.
     *
     * @return the expiry timestamp
     */
    public String getExpiryTimestamp() {
		return this.expiryTimestamp;
	}

    /**
     * Sets expiry timestamp.
     *
     * @param expiryTimestamp the expiry timestamp
     */
    public void setExpiryTimestamp(String expiryTimestamp) {
		this.expiryTimestamp = expiryTimestamp;
	}

    /**
     * Gets generate timestamp.
     *
     * @return the generate timestamp
     */
    public String getGenerateTimestamp() {
		return this.generateTimestamp;
	}

    /**
     * Sets generate timestamp.
     *
     * @param generateTimestamp the generate timestamp
     */
    public void setGenerateTimestamp(String generateTimestamp) {
		this.generateTimestamp = generateTimestamp;
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
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets mid.
     *
     * @return the mid
     */
    public String getMid() {
		return this.mid;
	}

    /**
     * Sets mid.
     *
     * @param mid the mid
     */
    public void setMid(String mid) {
		this.mid = mid;
	}

    /**
     * Gets minimum bid amount.
     *
     * @return the minimum bid amount
     */
    public Long getMinimumBidAmount() {
		return this.minimumBidAmount;
	}

    /**
     * Sets minimum bid amount.
     *
     * @param minimumBidAmount the minimum bid amount
     */
    public void setMinimumBidAmount(Long minimumBidAmount) {
		this.minimumBidAmount = minimumBidAmount;
	}

    /**
     * Gets minimum offer amount.
     *
     * @return the minimum offer amount
     */
    public Long getMinimumOfferAmount() {
		return this.minimumOfferAmount;
	}

    /**
     * Sets minimum offer amount.
     *
     * @param minimumOfferAmount the minimum offer amount
     */
    public void setMinimumOfferAmount(Long minimumOfferAmount) {
		this.minimumOfferAmount = minimumOfferAmount;
	}

    /**
     * Gets offer.
     *
     * @return the offer
     */
    public String getOffer() {
		return this.offer;
	}

    /**
     * Sets offer.
     *
     * @param offer the offer
     */
    public void setOffer(String offer) {
		this.offer = offer;
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
     * Gets rate reference id.
     *
     * @return the rate reference id
     */
    public String getRateReferenceId() {
		return this.rateReferenceId;
	}

    /**
     * Sets rate reference id.
     *
     * @param rateReferenceId the rate reference id
     */
    public void setRateReferenceId(String rateReferenceId) {
		this.rateReferenceId = rateReferenceId;
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
     * Gets spot bid.
     *
     * @return the spot bid
     */
    public String getSpotBid() {
		return this.spotBid;
	}

    /**
     * Sets spot bid.
     *
     * @param spotBid the spot bid
     */
    public void setSpotBid(String spotBid) {
		this.spotBid = spotBid;
	}

    /**
     * Gets spot mid.
     *
     * @return the spot mid
     */
    public String getSpotMid() {
		return this.spotMid;
	}

    /**
     * Sets spot mid.
     *
     * @param spotMid the spot mid
     */
    public void setSpotMid(String spotMid) {
		this.spotMid = spotMid;
	}

    /**
     * Gets spot offer.
     *
     * @return the spot offer
     */
    public String getSpotOffer() {
		return this.spotOffer;
	}

    /**
     * Sets spot offer.
     *
     * @param spotOffer the spot offer
     */
    public void setSpotOffer(String spotOffer) {
		this.spotOffer = spotOffer;
	}

    /**
     * Gets start timestamp.
     *
     * @return the start timestamp
     */
    public String getStartTimestamp() {
		return this.startTimestamp;
	}

    /**
     * Sets start timestamp.
     *
     * @param startTimestamp the start timestamp
     */
    public void setStartTimestamp(String startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

    /**
     * Gets symbol.
     *
     * @return the symbol
     */
    public String getSymbol() {
		return this.symbol;
	}

    /**
     * Sets symbol.
     *
     * @param symbol the symbol
     */
    public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

    /**
     * Gets threshold timestamp.
     *
     * @return the threshold timestamp
     */
    public String getThresholdTimestamp() {
		return this.thresholdTimestamp;
	}

    /**
     * Sets threshold timestamp.
     *
     * @param thresholdTimestamp the threshold timestamp
     */
    public void setThresholdTimestamp(String thresholdTimestamp) {
		this.thresholdTimestamp = thresholdTimestamp;
	}

    /**
     * Gets valid timestamp.
     *
     * @return the valid timestamp
     */
    public String getValidTimestamp() {
		return this.validTimestamp;
	}

    /**
     * Sets valid timestamp.
     *
     * @param validTimestamp the valid timestamp
     */
    public void setValidTimestamp(String validTimestamp) {
		this.validTimestamp = validTimestamp;
	}

}
