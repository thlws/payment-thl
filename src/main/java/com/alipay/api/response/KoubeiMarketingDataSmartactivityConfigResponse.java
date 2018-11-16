package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.smartactivity.config response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:02:41
 */
public class KoubeiMarketingDataSmartactivityConfigResponse extends AlipayResponse {

	private static final long serialVersionUID = 8111215515833876471L;

	/** 
	 * 活动类型
CONSUME_SEND 消费送
DIRECT_SEND 直发奖
GUESS_SEND 口令送
	 */
	@ApiField("activity_type")
	private String activityType;

	/** 
	 * 活动有效天数
	 */
	@ApiField("activity_valid_days")
	private String activityValidDays;

	/** 
	 * 活动配置CODE
	 */
	@ApiField("config_code")
	private String configCode;

	/** 
	 * 活动人群对象，包含针对N天未消费的用户/所有用户
	 */
	@ApiField("crowd_group")
	private String crowdGroup;

	/** 
	 * 扩展信息，对于拉新的会返回commission_rate(口碑客分佣比例)，对于方案组的会返回SMART_PROMO_GROUP_ID(方案组ID),SMART_PROMO_PLAN_ID方案ID，多个方案竖线分隔，consume_code表示消费送活动形式，包含RULES/USRLEVEL两个枚举值，分别表示按照用户规则和会员分层来创建活动组
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 商品ID，只有在诊断码为SUPER_ITEM表示菜品营销时此字段才可能有值，多个值之间使用竖线|分隔
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 商品名称，只有在诊断码为SUPER_ITEM表示菜品营销时此字段才可能有值，多个值之间使用竖线|分隔
	 */
	@ApiField("item_name")
	private String itemName;

	/** 
	 * 奖品面额门槛（阶梯状），消费满不同的金额可以使用不同的券,单位：分
	 */
	@ApiField("min_consume")
	private String minConsume;

	/** 
	 * 领券门槛（阶梯状），消费满不同的金额发不同金额的券券
活动类型为消费送且不是消费送礼包时设置
多营销工具之间不允许设置重复值
单位：分
	 */
	@ApiField("min_cost")
	private String minCost;

	/** 
	 * 营销类型，只有在诊断码为SUPER_ITEM表示菜品营销时此字段才可能有值，多个值之间使用竖线|分隔
	 */
	@ApiField("pro_type")
	private String proType;

	/** 
	 * 目前支持以下类型：
EXCHANGE：兑换券
MONEY：代金券
REDUCETO：减至券
RATE：折扣券
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/** 
	 * 券有效天数
	 */
	@ApiField("voucher_valid_days")
	private String voucherValidDays;

	/** 
	 * 券面额，折扣券为折扣比例、立减为金额 单位：分
	 */
	@ApiField("worth_value")
	private String worthValue;

    /**
     * Sets activity type.
     *
     * @param activityType the activity type
     */
    public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

    /**
     * Gets activity type.
     *
     * @return the activity type
     */
    public String getActivityType( ) {
		return this.activityType;
	}

    /**
     * Sets activity valid days.
     *
     * @param activityValidDays the activity valid days
     */
    public void setActivityValidDays(String activityValidDays) {
		this.activityValidDays = activityValidDays;
	}

    /**
     * Gets activity valid days.
     *
     * @return the activity valid days
     */
    public String getActivityValidDays( ) {
		return this.activityValidDays;
	}

    /**
     * Sets config code.
     *
     * @param configCode the config code
     */
    public void setConfigCode(String configCode) {
		this.configCode = configCode;
	}

    /**
     * Gets config code.
     *
     * @return the config code
     */
    public String getConfigCode( ) {
		return this.configCode;
	}

    /**
     * Sets crowd group.
     *
     * @param crowdGroup the crowd group
     */
    public void setCrowdGroup(String crowdGroup) {
		this.crowdGroup = crowdGroup;
	}

    /**
     * Gets crowd group.
     *
     * @return the crowd group
     */
    public String getCrowdGroup( ) {
		return this.crowdGroup;
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
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo( ) {
		return this.extInfo;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId( ) {
		return this.itemId;
	}

    /**
     * Sets item name.
     *
     * @param itemName the item name
     */
    public void setItemName(String itemName) {
		this.itemName = itemName;
	}

    /**
     * Gets item name.
     *
     * @return the item name
     */
    public String getItemName( ) {
		return this.itemName;
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
     * Gets min consume.
     *
     * @return the min consume
     */
    public String getMinConsume( ) {
		return this.minConsume;
	}

    /**
     * Sets min cost.
     *
     * @param minCost the min cost
     */
    public void setMinCost(String minCost) {
		this.minCost = minCost;
	}

    /**
     * Gets min cost.
     *
     * @return the min cost
     */
    public String getMinCost( ) {
		return this.minCost;
	}

    /**
     * Sets pro type.
     *
     * @param proType the pro type
     */
    public void setProType(String proType) {
		this.proType = proType;
	}

    /**
     * Gets pro type.
     *
     * @return the pro type
     */
    public String getProType( ) {
		return this.proType;
	}

    /**
     * Sets voucher type.
     *
     * @param voucherType the voucher type
     */
    public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

    /**
     * Gets voucher type.
     *
     * @return the voucher type
     */
    public String getVoucherType( ) {
		return this.voucherType;
	}

    /**
     * Sets voucher valid days.
     *
     * @param voucherValidDays the voucher valid days
     */
    public void setVoucherValidDays(String voucherValidDays) {
		this.voucherValidDays = voucherValidDays;
	}

    /**
     * Gets voucher valid days.
     *
     * @return the voucher valid days
     */
    public String getVoucherValidDays( ) {
		return this.voucherValidDays;
	}

    /**
     * Sets worth value.
     *
     * @param worthValue the worth value
     */
    public void setWorthValue(String worthValue) {
		this.worthValue = worthValue;
	}

    /**
     * Gets worth value.
     *
     * @return the worth value
     */
    public String getWorthValue( ) {
		return this.worthValue;
	}

}
