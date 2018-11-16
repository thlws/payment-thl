package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游发现平台优惠券详情
 *
 * @author auto create
 * @since 1.0, 2018-01-12 11:23:54
 */
public class PromotionInfo extends AlipayObject {

	private static final long serialVersionUID = 2756991379683435743L;

	/**
	 * 优惠品牌
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 优惠是否已领取
	 */
	@ApiField("collected")
	private Boolean collected;

	/**
	 * 优惠领取总数
	 */
	@ApiField("collected_count")
	private Long collectedCount;

	/**
	 * 优惠详情页跳转链接
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 优惠类型图标，惠折满减等
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 优惠头图
	 */
	@ApiField("main_image_url")
	private String mainImageUrl;

	/**
	 * 优惠ID
	 */
	@ApiField("promotion_id")
	private String promotionId;

	/**
	 * 优惠标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 使用条件说明
	 */
	@ApiField("using_condition")
	private String usingCondition;

	/**
	 * 使用范围说明
	 */
	@ApiField("using_scope")
	private String usingScope;

	/**
	 * 优惠有效期起：格式yyyy-mm-dd，如"2017-07-18"
	 */
	@ApiField("valid_date_from")
	private String validDateFrom;

	/**
	 * 优惠有效期止：格式yyyy-mm-dd，如"2017-07-18"
	 */
	@ApiField("valid_date_to")
	private String validDateTo;

	/**
	 * 相对有效期展示文案，当valid_date_from及valid_date_to为空时，此字段必然有值
	 */
	@ApiField("valid_time_text")
	private String validTimeText;

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
     * Gets collected.
     *
     * @return the collected
     */
    public Boolean getCollected() {
		return this.collected;
	}

    /**
     * Sets collected.
     *
     * @param collected the collected
     */
    public void setCollected(Boolean collected) {
		this.collected = collected;
	}

    /**
     * Gets collected count.
     *
     * @return the collected count
     */
    public Long getCollectedCount() {
		return this.collectedCount;
	}

    /**
     * Sets collected count.
     *
     * @param collectedCount the collected count
     */
    public void setCollectedCount(Long collectedCount) {
		this.collectedCount = collectedCount;
	}

    /**
     * Gets detail url.
     *
     * @return the detail url
     */
    public String getDetailUrl() {
		return this.detailUrl;
	}

    /**
     * Sets detail url.
     *
     * @param detailUrl the detail url
     */
    public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

    /**
     * Gets icon url.
     *
     * @return the icon url
     */
    public String getIconUrl() {
		return this.iconUrl;
	}

    /**
     * Sets icon url.
     *
     * @param iconUrl the icon url
     */
    public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

    /**
     * Gets main image url.
     *
     * @return the main image url
     */
    public String getMainImageUrl() {
		return this.mainImageUrl;
	}

    /**
     * Sets main image url.
     *
     * @param mainImageUrl the main image url
     */
    public void setMainImageUrl(String mainImageUrl) {
		this.mainImageUrl = mainImageUrl;
	}

    /**
     * Gets promotion id.
     *
     * @return the promotion id
     */
    public String getPromotionId() {
		return this.promotionId;
	}

    /**
     * Sets promotion id.
     *
     * @param promotionId the promotion id
     */
    public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

    /**
     * Gets using condition.
     *
     * @return the using condition
     */
    public String getUsingCondition() {
		return this.usingCondition;
	}

    /**
     * Sets using condition.
     *
     * @param usingCondition the using condition
     */
    public void setUsingCondition(String usingCondition) {
		this.usingCondition = usingCondition;
	}

    /**
     * Gets using scope.
     *
     * @return the using scope
     */
    public String getUsingScope() {
		return this.usingScope;
	}

    /**
     * Sets using scope.
     *
     * @param usingScope the using scope
     */
    public void setUsingScope(String usingScope) {
		this.usingScope = usingScope;
	}

    /**
     * Gets valid date from.
     *
     * @return the valid date from
     */
    public String getValidDateFrom() {
		return this.validDateFrom;
	}

    /**
     * Sets valid date from.
     *
     * @param validDateFrom the valid date from
     */
    public void setValidDateFrom(String validDateFrom) {
		this.validDateFrom = validDateFrom;
	}

    /**
     * Gets valid date to.
     *
     * @return the valid date to
     */
    public String getValidDateTo() {
		return this.validDateTo;
	}

    /**
     * Sets valid date to.
     *
     * @param validDateTo the valid date to
     */
    public void setValidDateTo(String validDateTo) {
		this.validDateTo = validDateTo;
	}

    /**
     * Gets valid time text.
     *
     * @return the valid time text
     */
    public String getValidTimeText() {
		return this.validTimeText;
	}

    /**
     * Sets valid time text.
     *
     * @param validTimeText the valid time text
     */
    public void setValidTimeText(String validTimeText) {
		this.validTimeText = validTimeText;
	}

}
