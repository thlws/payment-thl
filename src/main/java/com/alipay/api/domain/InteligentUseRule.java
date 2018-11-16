package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能营销活动使用规则信息
 *
 * @author auto create
 * @since 1.0, 2018-01-22 17:04:20
 */
public class InteligentUseRule extends AlipayObject {

	private static final long serialVersionUID = 1158896488835695188L;

	/**
	 * 券的不可用时间
	 */
	@ApiField("inteligent_forbidden_time")
	private InteligentForbiddenTime inteligentForbiddenTime;

	/**
	 * 券可用时间段
	 */
	@ApiListField("inteligent_use_times")
	@ApiField("inteligent_use_time")
	private List<InteligentUseTime> inteligentUseTimes;

	/**
	 * 优惠券的使用支付渠道限制规
则，
不受支付渠道限制
:USE_NO_LIMIT;
仅限口碑储值卡支付时可用
:USE_ON_CURRENT_PAY_C
HANNEL;
口碑储值卡支付时不可用
:NOT_ALLOWED_USE;
【备注】支付渠道限制不允许修改
	 */
	@ApiField("limit_rule")
	private String limitRule;

	/**
	 * 券核销的最低消费门槛，单位元
	 */
	@ApiField("min_consume")
	private String minConsume;

	/**
	 * 核券门槛-最低消费金额-推荐约束；
提供推荐方案参数可调区间范围, 为空则认为不可调
	 */
	@ApiField("min_consume_condition")
	private InteligentDataCondition minConsumeCondition;

	/**
	 * 券买单跳转链接
	 */
	@ApiField("pay_redirect_url")
	private String payRedirectUrl;

	/**
	 * 券适用门店列表
仅品牌商发起的招商活动可为空
直发奖类型活动必须与活动适用门店一致
最多支持10w家门店
	 */
	@ApiListField("suit_shops")
	@ApiField("string")
	private List<String> suitShops;

    /**
     * Gets inteligent forbidden time.
     *
     * @return the inteligent forbidden time
     */
    public InteligentForbiddenTime getInteligentForbiddenTime() {
		return this.inteligentForbiddenTime;
	}

    /**
     * Sets inteligent forbidden time.
     *
     * @param inteligentForbiddenTime the inteligent forbidden time
     */
    public void setInteligentForbiddenTime(InteligentForbiddenTime inteligentForbiddenTime) {
		this.inteligentForbiddenTime = inteligentForbiddenTime;
	}

    /**
     * Gets inteligent use times.
     *
     * @return the inteligent use times
     */
    public List<InteligentUseTime> getInteligentUseTimes() {
		return this.inteligentUseTimes;
	}

    /**
     * Sets inteligent use times.
     *
     * @param inteligentUseTimes the inteligent use times
     */
    public void setInteligentUseTimes(List<InteligentUseTime> inteligentUseTimes) {
		this.inteligentUseTimes = inteligentUseTimes;
	}

    /**
     * Gets limit rule.
     *
     * @return the limit rule
     */
    public String getLimitRule() {
		return this.limitRule;
	}

    /**
     * Sets limit rule.
     *
     * @param limitRule the limit rule
     */
    public void setLimitRule(String limitRule) {
		this.limitRule = limitRule;
	}

    /**
     * Gets min consume.
     *
     * @return the min consume
     */
    public String getMinConsume() {
		return this.minConsume;
	}

    /**
     * Sets min consume.
     *
     * @param minConsume the min consume
     */
    public void setMinConsume(String minConsume) {
		this.minConsume = minConsume;
	}

    /**
     * Gets min consume condition.
     *
     * @return the min consume condition
     */
    public InteligentDataCondition getMinConsumeCondition() {
		return this.minConsumeCondition;
	}

    /**
     * Sets min consume condition.
     *
     * @param minConsumeCondition the min consume condition
     */
    public void setMinConsumeCondition(InteligentDataCondition minConsumeCondition) {
		this.minConsumeCondition = minConsumeCondition;
	}

    /**
     * Gets pay redirect url.
     *
     * @return the pay redirect url
     */
    public String getPayRedirectUrl() {
		return this.payRedirectUrl;
	}

    /**
     * Sets pay redirect url.
     *
     * @param payRedirectUrl the pay redirect url
     */
    public void setPayRedirectUrl(String payRedirectUrl) {
		this.payRedirectUrl = payRedirectUrl;
	}

    /**
     * Gets suit shops.
     *
     * @return the suit shops
     */
    public List<String> getSuitShops() {
		return this.suitShops;
	}

    /**
     * Sets suit shops.
     *
     * @param suitShops the suit shops
     */
    public void setSuitShops(List<String> suitShops) {
		this.suitShops = suitShops;
	}

}
