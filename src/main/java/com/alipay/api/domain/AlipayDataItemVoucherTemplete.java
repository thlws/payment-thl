package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品券模板（数据）
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class AlipayDataItemVoucherTemplete extends AlipayObject {

	private static final long serialVersionUID = 8151856989485357222L;

	/**
	 * 延迟生效时间（手动领取条件下，可跟valid_period组合使用）
	 */
	@ApiField("delay_minute")
	private Long delayMinute;

	/**
	 * 券使用规则描述，包括描述标题及描述内容列表
	 */
	@ApiListField("desc_details")
	@ApiField("alipay_data_item_description")
	private List<AlipayDataItemDescription> descDetails;

	/**
	 * 折扣率，填写0~1间的小数且不包括0和1，如八折则传入0.8
	 */
	@ApiField("discount_rate")
	private String discountRate;

	/**
	 * 外部单品列表
	 */
	@ApiField("external_goods_list")
	private AlipayDataItemGoodsList externalGoodsList;

	/**
	 * 使用时间规则，控制商品的生效时间
	 */
	@ApiField("limit_period_info_list")
	private AlipayDataItemLimitPeriodInfo limitPeriodInfoList;

	/**
	 * 商品原金额，只有单品代金券有，丽人行业需要填写此字段
	 */
	@ApiField("original_amount")
	private String originalAmount;

	/**
	 * 券原折扣
	 */
	@ApiField("original_rate")
	private String originalRate;

	/**
	 * 单品代金券中的减至金额
	 */
	@ApiField("reduce_to_amount")
	private String reduceToAmount;

	/**
	 * 折扣金额取整规则 AUTO_ROUNDING_YUAN：自动抹零到元 AUTO_ROUNDING_JIAO：自动抹零到角 ROUNDING_UP_YUAN：四舍五入到元 ROUNDING_UP_JIAO：四舍五入到角
	 */
	@ApiField("rounding_rule")
	private String roundingRule;

	/**
	 * 起步数量，用于指定可享受优惠的起步单品购买数量
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 起步数量，用于指定可享受优惠的起步单品购买数量
	 */
	@ApiField("threshold_quantity")
	private String thresholdQuantity;

	/**
	 * 领券之后多长时间内可以核销，单位：分钟，传入数值需大于1440（一天）
	 */
	@ApiField("valid_period")
	private Long validPeriod;

	/**
	 * 价值金额
CASH类型为代金券金额
DISCOUNT类型为优惠封顶金额
	 */
	@ApiField("value_amount")
	private String valueAmount;

	/**
	 * 券的描述信息，目前客户端将统一展示“折扣须知”
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券类型：单品代金券为CASH类型，全场折扣券为DISCOUNT类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

    /**
     * Gets delay minute.
     *
     * @return the delay minute
     */
    public Long getDelayMinute() {
		return this.delayMinute;
	}

    /**
     * Sets delay minute.
     *
     * @param delayMinute the delay minute
     */
    public void setDelayMinute(Long delayMinute) {
		this.delayMinute = delayMinute;
	}

    /**
     * Gets desc details.
     *
     * @return the desc details
     */
    public List<AlipayDataItemDescription> getDescDetails() {
		return this.descDetails;
	}

    /**
     * Sets desc details.
     *
     * @param descDetails the desc details
     */
    public void setDescDetails(List<AlipayDataItemDescription> descDetails) {
		this.descDetails = descDetails;
	}

    /**
     * Gets discount rate.
     *
     * @return the discount rate
     */
    public String getDiscountRate() {
		return this.discountRate;
	}

    /**
     * Sets discount rate.
     *
     * @param discountRate the discount rate
     */
    public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

    /**
     * Gets external goods list.
     *
     * @return the external goods list
     */
    public AlipayDataItemGoodsList getExternalGoodsList() {
		return this.externalGoodsList;
	}

    /**
     * Sets external goods list.
     *
     * @param externalGoodsList the external goods list
     */
    public void setExternalGoodsList(AlipayDataItemGoodsList externalGoodsList) {
		this.externalGoodsList = externalGoodsList;
	}

    /**
     * Gets limit period info list.
     *
     * @return the limit period info list
     */
    public AlipayDataItemLimitPeriodInfo getLimitPeriodInfoList() {
		return this.limitPeriodInfoList;
	}

    /**
     * Sets limit period info list.
     *
     * @param limitPeriodInfoList the limit period info list
     */
    public void setLimitPeriodInfoList(AlipayDataItemLimitPeriodInfo limitPeriodInfoList) {
		this.limitPeriodInfoList = limitPeriodInfoList;
	}

    /**
     * Gets original amount.
     *
     * @return the original amount
     */
    public String getOriginalAmount() {
		return this.originalAmount;
	}

    /**
     * Sets original amount.
     *
     * @param originalAmount the original amount
     */
    public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
	}

    /**
     * Gets original rate.
     *
     * @return the original rate
     */
    public String getOriginalRate() {
		return this.originalRate;
	}

    /**
     * Sets original rate.
     *
     * @param originalRate the original rate
     */
    public void setOriginalRate(String originalRate) {
		this.originalRate = originalRate;
	}

    /**
     * Gets reduce to amount.
     *
     * @return the reduce to amount
     */
    public String getReduceToAmount() {
		return this.reduceToAmount;
	}

    /**
     * Sets reduce to amount.
     *
     * @param reduceToAmount the reduce to amount
     */
    public void setReduceToAmount(String reduceToAmount) {
		this.reduceToAmount = reduceToAmount;
	}

    /**
     * Gets rounding rule.
     *
     * @return the rounding rule
     */
    public String getRoundingRule() {
		return this.roundingRule;
	}

    /**
     * Sets rounding rule.
     *
     * @param roundingRule the rounding rule
     */
    public void setRoundingRule(String roundingRule) {
		this.roundingRule = roundingRule;
	}

    /**
     * Gets threshold amount.
     *
     * @return the threshold amount
     */
    public String getThresholdAmount() {
		return this.thresholdAmount;
	}

    /**
     * Sets threshold amount.
     *
     * @param thresholdAmount the threshold amount
     */
    public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

    /**
     * Gets threshold quantity.
     *
     * @return the threshold quantity
     */
    public String getThresholdQuantity() {
		return this.thresholdQuantity;
	}

    /**
     * Sets threshold quantity.
     *
     * @param thresholdQuantity the threshold quantity
     */
    public void setThresholdQuantity(String thresholdQuantity) {
		this.thresholdQuantity = thresholdQuantity;
	}

    /**
     * Gets valid period.
     *
     * @return the valid period
     */
    public Long getValidPeriod() {
		return this.validPeriod;
	}

    /**
     * Sets valid period.
     *
     * @param validPeriod the valid period
     */
    public void setValidPeriod(Long validPeriod) {
		this.validPeriod = validPeriod;
	}

    /**
     * Gets value amount.
     *
     * @return the value amount
     */
    public String getValueAmount() {
		return this.valueAmount;
	}

    /**
     * Sets value amount.
     *
     * @param valueAmount the value amount
     */
    public void setValueAmount(String valueAmount) {
		this.valueAmount = valueAmount;
	}

    /**
     * Gets voucher desc.
     *
     * @return the voucher desc
     */
    public String getVoucherDesc() {
		return this.voucherDesc;
	}

    /**
     * Sets voucher desc.
     *
     * @param voucherDesc the voucher desc
     */
    public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

    /**
     * Gets voucher type.
     *
     * @return the voucher type
     */
    public String getVoucherType() {
		return this.voucherType;
	}

    /**
     * Sets voucher type.
     *
     * @param voucherType the voucher type
     */
    public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
