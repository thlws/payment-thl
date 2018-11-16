package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券的使用规则信息
 *
 * @author auto create
 * @since 1.0, 2017-09-28 10:50:32
 */
public class UseRule extends AlipayObject {

	private static final long serialVersionUID = 4841981482176324788L;

	/**
	 * 扩展属性，无需设置
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 券的不可用时间
	 */
	@ApiField("forbidden_time")
	private ForbbidenTime forbiddenTime;

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
	 * 券可用时间段
	 */
	@ApiListField("use_time")
	@ApiField("use_time")
	private List<UseTime> useTime;

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets forbidden time.
     *
     * @return the forbidden time
     */
    public ForbbidenTime getForbiddenTime() {
		return this.forbiddenTime;
	}

    /**
     * Sets forbidden time.
     *
     * @param forbiddenTime the forbidden time
     */
    public void setForbiddenTime(ForbbidenTime forbiddenTime) {
		this.forbiddenTime = forbiddenTime;
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

    /**
     * Gets use time.
     *
     * @return the use time
     */
    public List<UseTime> getUseTime() {
		return this.useTime;
	}

    /**
     * Sets use time.
     *
     * @param useTime the use time
     */
    public void setUseTime(List<UseTime> useTime) {
		this.useTime = useTime;
	}

}
