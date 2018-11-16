package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券资产详情信息对象
 *
 * @author auto create
 * @since 1.0, 2018-01-15 17:47:56
 */
public class VoucherDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 7671286318468595715L;

	/**
	 * 资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产生效时间
	 */
	@ApiField("effect_time")
	private String effectTime;

	/**
	 * 扩展字段信息，通过map存储的json串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 不可用时间段（只支持到天）
	 */
	@ApiField("forbbiden_time")
	private ForbbidenTime forbbidenTime;

	/**
	 * 资产过期时间
	 */
	@ApiField("invalid_time")
	private String invalidTime;

	/**
	 * 单品id中间用“,”分隔
	 */
	@ApiField("sku_codes")
	private String skuCodes;

	/**
	 * 可用时段条款
	 */
	@ApiListField("time_rules")
	@ApiField("use_time")
	private List<UseTime> timeRules;

	/**
	 * 券使用条件
	 */
	@ApiField("use_condition")
	private String useCondition;

	/**
	 * 全资产描述
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券类型(ALIPAY_FIX_VOUCHER:全场券；ALIPAY_ITEM_VOUCHER：单品券,KOUBEI_BUY_EXCHANGE_VOUCHER:兑换券)
	 */
	@ApiField("voucher_type")
	private String voucherType;

    /**
     * Gets asset id.
     *
     * @return the asset id
     */
    public String getAssetId() {
		return this.assetId;
	}

    /**
     * Sets asset id.
     *
     * @param assetId the asset id
     */
    public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

    /**
     * Gets effect time.
     *
     * @return the effect time
     */
    public String getEffectTime() {
		return this.effectTime;
	}

    /**
     * Sets effect time.
     *
     * @param effectTime the effect time
     */
    public void setEffectTime(String effectTime) {
		this.effectTime = effectTime;
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
     * Gets forbbiden time.
     *
     * @return the forbbiden time
     */
    public ForbbidenTime getForbbidenTime() {
		return this.forbbidenTime;
	}

    /**
     * Sets forbbiden time.
     *
     * @param forbbidenTime the forbbiden time
     */
    public void setForbbidenTime(ForbbidenTime forbbidenTime) {
		this.forbbidenTime = forbbidenTime;
	}

    /**
     * Gets invalid time.
     *
     * @return the invalid time
     */
    public String getInvalidTime() {
		return this.invalidTime;
	}

    /**
     * Sets invalid time.
     *
     * @param invalidTime the invalid time
     */
    public void setInvalidTime(String invalidTime) {
		this.invalidTime = invalidTime;
	}

    /**
     * Gets sku codes.
     *
     * @return the sku codes
     */
    public String getSkuCodes() {
		return this.skuCodes;
	}

    /**
     * Sets sku codes.
     *
     * @param skuCodes the sku codes
     */
    public void setSkuCodes(String skuCodes) {
		this.skuCodes = skuCodes;
	}

    /**
     * Gets time rules.
     *
     * @return the time rules
     */
    public List<UseTime> getTimeRules() {
		return this.timeRules;
	}

    /**
     * Sets time rules.
     *
     * @param timeRules the time rules
     */
    public void setTimeRules(List<UseTime> timeRules) {
		this.timeRules = timeRules;
	}

    /**
     * Gets use condition.
     *
     * @return the use condition
     */
    public String getUseCondition() {
		return this.useCondition;
	}

    /**
     * Sets use condition.
     *
     * @param useCondition the use condition
     */
    public void setUseCondition(String useCondition) {
		this.useCondition = useCondition;
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
