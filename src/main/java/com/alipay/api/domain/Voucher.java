package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券对象
 *
 * @author auto create
 * @since 1.0, 2018-04-17 18:15:59
 */
public class Voucher extends AlipayObject {

	private static final long serialVersionUID = 7272531762832956316L;

	/**
	 * 是否允许拆分，券在核销的时候是否允许券的面额拆分使用。(仅限渠道类型为ISV企业福利：ISV_ENTERPRISE_BENIFIT的场景使用)
	 */
	@ApiField("allow_split")
	private Boolean allowSplit;

	/**
	 * 券剩余面额，单位元
券详情查询接口返回，可拆分券中的券详情展示用
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 券副标题
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 券的说明条款
	 */
	@ApiListField("clause_terms")
	@ApiField("clause_term")
	private List<ClauseTerm> clauseTerms;

	/**
	 * 延迟生效信息
	 */
	@ApiField("delay_info")
	private DelayInfo delayInfo;

	/**
	 * 券详细说明
最多包含500个字符
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 券使用说明描述列表
	 */
	@ApiListField("desc_detail_list")
	@ApiField("voucher_desc_detail")
	private List<VoucherDescDetail> descDetailList;

	/**
	 * 券的展示信息
	 */
	@ApiField("display_config")
	private DisplayConfig displayConfig;

	/**
	 * 券是否可转赠，默认为可转赠
	 */
	@ApiField("donate_flag")
	private String donateFlag;

	/**
	 * 券生效的方式，目前支持以下方式
立即生效：IMMEDIATELY
延迟生效：DELAY
仅在券有效期类型为相对有效期时生效
	 */
	@ApiField("effect_type")
	private String effectType;

	/**
	 * 券有效期的结束时间
仅在券有效期类型为绝对有效期时生效
必须晚于活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 券的扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 单品信息
兑换券不允许设置单品信息
减至券必须设置单品信息
其他类型券可按需设置
	 */
	@ApiField("item_info")
	private ItemInfo itemInfo;

	/**
	 * 券LOGO文件ID，调用图片上传接口alipay.offline.material.image.upload获得
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 最高优惠金额，单位元
指用券最高可以优惠的金额
必须为合法金额类型字符串仅当券类型为折扣券（RATE），每满减券（PER_FULL_CUT）有效
	 */
	@ApiField("max_amount")
	private String maxAmount;

	/**
	 * 券叠加的属性，
仅全场券可设置该选项；
NO_MULTI:不可与其他全场券和单品券叠加;
MULTI_USE_WITH_SINGLE:
该全场优惠和单品优惠的叠加
；MULTI_USE_WITH_OTHE
RS:该全场优惠和其他所有优惠都可以叠加
	 */
	@ApiField("multi_use_mode")
	private String multiUseMode;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 折扣率
仅当券类型为折扣券时有效
有效折扣率取值范围0.11-0.99
仅允许保留小数点后两位
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 券相对有效期，单位天
仅在券有效期类型为相对有效期时生效
如，设5表示领券领取后5日内有效
	 */
	@ApiField("relative_time")
	private String relativeTime;

	/**
	 * 券核销时，抹零方式，目前支持：
NOT_AUTO_ROUNDING:不自动抹零
AUTO_ROUNDING_YUAN:自动抹零到元
AUTO_ROUNDING_JIAO:自动抹零到角
ROUNDING_UP_YUAN:四舍五入到元
ROUNDING_UP_JIAO:四舍五入到角
	 */
	@ApiField("rounding_rule")
	private String roundingRule;

	/**
	 * 券有效期的开始时间
仅在券有效期类型为绝对有效期时生效
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 券类型，目前支持以下类型：
EXCHANGE：兑换券；
MONEY：代金券；
REDUCETO：减至券；
RATE：折扣券；
PER_FULL_CUT：每满减券
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券的使用说明
使用须知最多6条，且每条最多100字
	 */
	@ApiListField("use_instructions")
	@ApiField("string")
	private List<String> useInstructions;

	/**
	 * 券的使用规则信息
	 */
	@ApiField("use_rule")
	private UseRule useRule;

	/**
	 * 券有效期类型，目前支持以下类型：
RELATIVE：相对有效期
FIXED：绝对有效期
	 */
	@ApiField("validate_type")
	private String validateType;

	/**
	 * 该字段仅在兑换券条件下(即券类型为EXCHANGE)，用于设置兑换券的核销方式
USER_CLICK:用户自己点击券上的按钮核销
MERCHANT_SCAN：商户通过APP扫码核销
其他情况下此字段为空
	 */
	@ApiField("verify_mode")
	private String verifyMode;

	/**
	 * 券图片文件ID,调用上传图片接口alipay.offline.material.image.upload获得
	 */
	@ApiField("voucher_img")
	private String voucherImg;

	/**
	 * 券的备注

用于收银系统识别指定券使用；如备注中传入“123”，券发出后核销时将在当面付接口将该值传回，供收银系统识别
	 */
	@ApiField("voucher_note")
	private String voucherNote;

	/**
	 * 券面额，单位元必须为合法金额类型字符串券类型为代金券（MONEY）、减至券（REDUCETO）、每满减券（PER_FULL_CUT）时必填
如：
代金券：10元代金券中的10为券面额；
每满减券：毎满100减10元，其中的10为券面额；
减至券：单品原价100，现价10元，其中10为券面额，单品减至券的券面额必须低于单品原价
	 */
	@ApiField("worth_value")
	private String worthValue;

    /**
     * Gets allow split.
     *
     * @return the allow split
     */
    public Boolean getAllowSplit() {
		return this.allowSplit;
	}

    /**
     * Sets allow split.
     *
     * @param allowSplit the allow split
     */
    public void setAllowSplit(Boolean allowSplit) {
		this.allowSplit = allowSplit;
	}

    /**
     * Gets available amount.
     *
     * @return the available amount
     */
    public String getAvailableAmount() {
		return this.availableAmount;
	}

    /**
     * Sets available amount.
     *
     * @param availableAmount the available amount
     */
    public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

    /**
     * Gets brand name.
     *
     * @return the brand name
     */
    public String getBrandName() {
		return this.brandName;
	}

    /**
     * Sets brand name.
     *
     * @param brandName the brand name
     */
    public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

    /**
     * Gets clause terms.
     *
     * @return the clause terms
     */
    public List<ClauseTerm> getClauseTerms() {
		return this.clauseTerms;
	}

    /**
     * Sets clause terms.
     *
     * @param clauseTerms the clause terms
     */
    public void setClauseTerms(List<ClauseTerm> clauseTerms) {
		this.clauseTerms = clauseTerms;
	}

    /**
     * Gets delay info.
     *
     * @return the delay info
     */
    public DelayInfo getDelayInfo() {
		return this.delayInfo;
	}

    /**
     * Sets delay info.
     *
     * @param delayInfo the delay info
     */
    public void setDelayInfo(DelayInfo delayInfo) {
		this.delayInfo = delayInfo;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets desc detail list.
     *
     * @return the desc detail list
     */
    public List<VoucherDescDetail> getDescDetailList() {
		return this.descDetailList;
	}

    /**
     * Sets desc detail list.
     *
     * @param descDetailList the desc detail list
     */
    public void setDescDetailList(List<VoucherDescDetail> descDetailList) {
		this.descDetailList = descDetailList;
	}

    /**
     * Gets display config.
     *
     * @return the display config
     */
    public DisplayConfig getDisplayConfig() {
		return this.displayConfig;
	}

    /**
     * Sets display config.
     *
     * @param displayConfig the display config
     */
    public void setDisplayConfig(DisplayConfig displayConfig) {
		this.displayConfig = displayConfig;
	}

    /**
     * Gets donate flag.
     *
     * @return the donate flag
     */
    public String getDonateFlag() {
		return this.donateFlag;
	}

    /**
     * Sets donate flag.
     *
     * @param donateFlag the donate flag
     */
    public void setDonateFlag(String donateFlag) {
		this.donateFlag = donateFlag;
	}

    /**
     * Gets effect type.
     *
     * @return the effect type
     */
    public String getEffectType() {
		return this.effectType;
	}

    /**
     * Sets effect type.
     *
     * @param effectType the effect type
     */
    public void setEffectType(String effectType) {
		this.effectType = effectType;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

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
     * Gets item info.
     *
     * @return the item info
     */
    public ItemInfo getItemInfo() {
		return this.itemInfo;
	}

    /**
     * Sets item info.
     *
     * @param itemInfo the item info
     */
    public void setItemInfo(ItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}

    /**
     * Gets logo.
     *
     * @return the logo
     */
    public String getLogo() {
		return this.logo;
	}

    /**
     * Sets logo.
     *
     * @param logo the logo
     */
    public void setLogo(String logo) {
		this.logo = logo;
	}

    /**
     * Gets max amount.
     *
     * @return the max amount
     */
    public String getMaxAmount() {
		return this.maxAmount;
	}

    /**
     * Sets max amount.
     *
     * @param maxAmount the max amount
     */
    public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}

    /**
     * Gets multi use mode.
     *
     * @return the multi use mode
     */
    public String getMultiUseMode() {
		return this.multiUseMode;
	}

    /**
     * Sets multi use mode.
     *
     * @param multiUseMode the multi use mode
     */
    public void setMultiUseMode(String multiUseMode) {
		this.multiUseMode = multiUseMode;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets rate.
     *
     * @return the rate
     */
    public String getRate() {
		return this.rate;
	}

    /**
     * Sets rate.
     *
     * @param rate the rate
     */
    public void setRate(String rate) {
		this.rate = rate;
	}

    /**
     * Gets relative time.
     *
     * @return the relative time
     */
    public String getRelativeTime() {
		return this.relativeTime;
	}

    /**
     * Sets relative time.
     *
     * @param relativeTime the relative time
     */
    public void setRelativeTime(String relativeTime) {
		this.relativeTime = relativeTime;
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
     * Gets start time.
     *
     * @return the start time
     */
    public Date getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets use instructions.
     *
     * @return the use instructions
     */
    public List<String> getUseInstructions() {
		return this.useInstructions;
	}

    /**
     * Sets use instructions.
     *
     * @param useInstructions the use instructions
     */
    public void setUseInstructions(List<String> useInstructions) {
		this.useInstructions = useInstructions;
	}

    /**
     * Gets use rule.
     *
     * @return the use rule
     */
    public UseRule getUseRule() {
		return this.useRule;
	}

    /**
     * Sets use rule.
     *
     * @param useRule the use rule
     */
    public void setUseRule(UseRule useRule) {
		this.useRule = useRule;
	}

    /**
     * Gets validate type.
     *
     * @return the validate type
     */
    public String getValidateType() {
		return this.validateType;
	}

    /**
     * Sets validate type.
     *
     * @param validateType the validate type
     */
    public void setValidateType(String validateType) {
		this.validateType = validateType;
	}

    /**
     * Gets verify mode.
     *
     * @return the verify mode
     */
    public String getVerifyMode() {
		return this.verifyMode;
	}

    /**
     * Sets verify mode.
     *
     * @param verifyMode the verify mode
     */
    public void setVerifyMode(String verifyMode) {
		this.verifyMode = verifyMode;
	}

    /**
     * Gets voucher img.
     *
     * @return the voucher img
     */
    public String getVoucherImg() {
		return this.voucherImg;
	}

    /**
     * Sets voucher img.
     *
     * @param voucherImg the voucher img
     */
    public void setVoucherImg(String voucherImg) {
		this.voucherImg = voucherImg;
	}

    /**
     * Gets voucher note.
     *
     * @return the voucher note
     */
    public String getVoucherNote() {
		return this.voucherNote;
	}

    /**
     * Sets voucher note.
     *
     * @param voucherNote the voucher note
     */
    public void setVoucherNote(String voucherNote) {
		this.voucherNote = voucherNote;
	}

    /**
     * Gets worth value.
     *
     * @return the worth value
     */
    public String getWorthValue() {
		return this.worthValue;
	}

    /**
     * Sets worth value.
     *
     * @param worthValue the worth value
     */
    public void setWorthValue(String worthValue) {
		this.worthValue = worthValue;
	}

}
