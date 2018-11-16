package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员卡消费记录同步
 *
 * @author auto create
 * @since 1.0, 2017-06-23 14:51:37
 */
public class AlipayMarketingCardConsumeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2284119257554914974L;

	/**
	 * 用户实际付的现金金额
1.针对预付卡面额的核销金额在use_benefit_list展现，作为权益金额
2.权益金额不叠加在该金额上
	 */
	@ApiField("act_pay_amount")
	private String actPayAmount;

	/**
	 * 卡信息（交易后的实际卡信息）
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

	/**
	 * 获取权益列表
	 */
	@ApiListField("gain_benefit_list")
	@ApiField("benefit_info_detail")
	private List<BenefitInfoDetail> gainBenefitList;

	/**
	 * 备注信息，现有直接填写门店信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 门店编号
	 */
	@ApiField("shop_code")
	private String shopCode;

	/**
	 * 产生该笔交易时，用户出具的凭证类型
ALIPAY：支付宝电子卡
ENTITY：实体卡
OTHER：其他
	 */
	@ApiField("swipe_cert_type")
	private String swipeCertType;

	/**
	 * 支付宝业务卡号，开卡接口中返回获取
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号类型
BIZ_CARD：支付宝业务卡号
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

	/**
	 * 交易金额：本次交易的实际总金额（可认为标价金额）
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易名称
为空时根据交易类型提供默认名称
	 */
	@ApiField("trade_name")
	private String tradeName;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 线下交易时间（是用户付款的交易时间）
当交易时间晚于上次消费记录同步时间，则会发生卡信息变更
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	/**
	 * 交易类型
开卡：OPEN
消费：TRADE
充值：DEPOSIT
退卡：RETURN
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 实际消耗的权益
	 */
	@ApiListField("use_benefit_list")
	@ApiField("benefit_info_detail")
	private List<BenefitInfoDetail> useBenefitList;

    /**
     * Gets act pay amount.
     *
     * @return the act pay amount
     */
    public String getActPayAmount() {
		return this.actPayAmount;
	}

    /**
     * Sets act pay amount.
     *
     * @param actPayAmount the act pay amount
     */
    public void setActPayAmount(String actPayAmount) {
		this.actPayAmount = actPayAmount;
	}

    /**
     * Gets card info.
     *
     * @return the card info
     */
    public MerchantCard getCardInfo() {
		return this.cardInfo;
	}

    /**
     * Sets card info.
     *
     * @param cardInfo the card info
     */
    public void setCardInfo(MerchantCard cardInfo) {
		this.cardInfo = cardInfo;
	}

    /**
     * Gets gain benefit list.
     *
     * @return the gain benefit list
     */
    public List<BenefitInfoDetail> getGainBenefitList() {
		return this.gainBenefitList;
	}

    /**
     * Sets gain benefit list.
     *
     * @param gainBenefitList the gain benefit list
     */
    public void setGainBenefitList(List<BenefitInfoDetail> gainBenefitList) {
		this.gainBenefitList = gainBenefitList;
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
     * Gets shop code.
     *
     * @return the shop code
     */
    public String getShopCode() {
		return this.shopCode;
	}

    /**
     * Sets shop code.
     *
     * @param shopCode the shop code
     */
    public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

    /**
     * Gets swipe cert type.
     *
     * @return the swipe cert type
     */
    public String getSwipeCertType() {
		return this.swipeCertType;
	}

    /**
     * Sets swipe cert type.
     *
     * @param swipeCertType the swipe cert type
     */
    public void setSwipeCertType(String swipeCertType) {
		this.swipeCertType = swipeCertType;
	}

    /**
     * Gets target card no.
     *
     * @return the target card no
     */
    public String getTargetCardNo() {
		return this.targetCardNo;
	}

    /**
     * Sets target card no.
     *
     * @param targetCardNo the target card no
     */
    public void setTargetCardNo(String targetCardNo) {
		this.targetCardNo = targetCardNo;
	}

    /**
     * Gets target card no type.
     *
     * @return the target card no type
     */
    public String getTargetCardNoType() {
		return this.targetCardNoType;
	}

    /**
     * Sets target card no type.
     *
     * @param targetCardNoType the target card no type
     */
    public void setTargetCardNoType(String targetCardNoType) {
		this.targetCardNoType = targetCardNoType;
	}

    /**
     * Gets trade amount.
     *
     * @return the trade amount
     */
    public String getTradeAmount() {
		return this.tradeAmount;
	}

    /**
     * Sets trade amount.
     *
     * @param tradeAmount the trade amount
     */
    public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

    /**
     * Gets trade name.
     *
     * @return the trade name
     */
    public String getTradeName() {
		return this.tradeName;
	}

    /**
     * Sets trade name.
     *
     * @param tradeName the trade name
     */
    public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

    /**
     * Gets trade time.
     *
     * @return the trade time
     */
    public Date getTradeTime() {
		return this.tradeTime;
	}

    /**
     * Sets trade time.
     *
     * @param tradeTime the trade time
     */
    public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
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
     * Gets use benefit list.
     *
     * @return the use benefit list
     */
    public List<BenefitInfoDetail> getUseBenefitList() {
		return this.useBenefitList;
	}

    /**
     * Sets use benefit list.
     *
     * @param useBenefitList the use benefit list
     */
    public void setUseBenefitList(List<BenefitInfoDetail> useBenefitList) {
		this.useBenefitList = useBenefitList;
	}

}
