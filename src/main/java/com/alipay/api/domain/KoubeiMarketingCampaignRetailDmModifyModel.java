package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 快消店铺展位内容修改接口
 *
 * @author auto create
 * @since 1.0, 2018-01-08 16:35:30
 */
public class KoubeiMarketingCampaignRetailDmModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5175678434375777357L;

	/**
	 * 第三方详情页链接：该商品/活动的详细介绍，注意：该字段需要过风控校验，不得传入敏感链接
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 促销结束时间，用于产品详情展示，格式为：2017-02-07 11:11:11。
注意开始时间要求早于结束时间
	 */
	@ApiField("activity_end_time")
	private String activityEndTime;

	/**
	 * 促销开始时间，在产品详情中展示，格式为：2017-02-01 11:11:11。
注意：开始时间要求早于结束时间
	 */
	@ApiField("activity_start_time")
	private String activityStartTime;

	/**
	 * 简要的促销说明，用于对促销的内容进行直接明了的说明（如会员价：10元）。注意：该字段需要过风控校验，不得传入敏感词。
	 */
	@ApiField("brief")
	private String brief;

	/**
	 * 下架时间，基本格式:yyyy-MM-dd HH:mm:ss，下架时间必须晚于上架时间，下架时间不得早于当前时间，下架状态的内容不能上架,上架状态下架时间不能为空，只有上架状态可以修改下架时间。
	 */
	@ApiField("campaign_end_time")
	private Date campaignEndTime;

	/**
	 * 活动类型：该活动是属于单品优惠，还是全场活动，单品优惠 SINGLE,全场优惠UNIVERSAL
	 */
	@ApiField("campaign_type")
	private String campaignType;

	/**
	 * 内容ID，调用koubei.marketing.campaign.retail.dm.create创建内容时返回的内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 优惠类型，全场优惠传入枚举值
比如：DISCOUNT(折扣),OFF(立减),CARD(集点),VOUCHER(代金),REDEMPTION(换购),EXCHANGE(兑换),GIFT(买赠),OTHERS(其他)
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 该活动的活动文案，主要涉及（活动时间、参与方式、活动力度），最多不得超过1024个字，注意：该字段需要过风控校验，不得传入敏感词
	 */
	@ApiField("description")
	private String description;

	/**
	 * 扩展备用信息，一些其他信息存入该字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 图片url，该图片id只有一个，由Isv传入，（通过alipay.offline.material.image.upload 接口上传视频/图片获取的资源id）(图片的宽高比为4:3)
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 品牌：该商品属于哪个牌子/该活动属于哪个商家（比如 海飞丝，统一，徐福记，立白......）
	 */
	@ApiField("item_brand")
	private String itemBrand;

	/**
	 * 该商品/活动所属类别（吃的:食品   面膜:个人洗护    拖把:家庭清洁）
	 */
	@ApiField("item_category")
	private String itemCategory;

	/**
	 * 商品编码，SKU或店内码，该编码由Isv系统传入
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 商品名称，单品优惠时传入商品名称；全场活动时传入活动名称，注意：该字段需要过风控校验，不得传入敏感词
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 该商品/活动，是否是会员专享的，TRUE表示会员专享，FALSE表示非会员专享
	 */
	@ApiField("member_only")
	private String memberOnly;

	/**
	 * 适用外部门店id，传入该优惠适用口碑门店id，可以传入多个值，列表类型
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 4:3缩略图url，用于产品在店铺页简单规范的展示。 （通过alipay.offline.material.image.upload 接口上传视频/图片获取的资源id） 
注意：本图片会进行图片尺寸校验，不符合4:3尺寸则无法上传。
	 */
	@ApiField("thumbnail_image_id")
	private String thumbnailImageId;

    /**
     * Gets action url.
     *
     * @return the action url
     */
    public String getActionUrl() {
		return this.actionUrl;
	}

    /**
     * Sets action url.
     *
     * @param actionUrl the action url
     */
    public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

    /**
     * Gets activity end time.
     *
     * @return the activity end time
     */
    public String getActivityEndTime() {
		return this.activityEndTime;
	}

    /**
     * Sets activity end time.
     *
     * @param activityEndTime the activity end time
     */
    public void setActivityEndTime(String activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

    /**
     * Gets activity start time.
     *
     * @return the activity start time
     */
    public String getActivityStartTime() {
		return this.activityStartTime;
	}

    /**
     * Sets activity start time.
     *
     * @param activityStartTime the activity start time
     */
    public void setActivityStartTime(String activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

    /**
     * Gets brief.
     *
     * @return the brief
     */
    public String getBrief() {
		return this.brief;
	}

    /**
     * Sets brief.
     *
     * @param brief the brief
     */
    public void setBrief(String brief) {
		this.brief = brief;
	}

    /**
     * Gets campaign end time.
     *
     * @return the campaign end time
     */
    public Date getCampaignEndTime() {
		return this.campaignEndTime;
	}

    /**
     * Sets campaign end time.
     *
     * @param campaignEndTime the campaign end time
     */
    public void setCampaignEndTime(Date campaignEndTime) {
		this.campaignEndTime = campaignEndTime;
	}

    /**
     * Gets campaign type.
     *
     * @return the campaign type
     */
    public String getCampaignType() {
		return this.campaignType;
	}

    /**
     * Sets campaign type.
     *
     * @param campaignType the campaign type
     */
    public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}

    /**
     * Gets content id.
     *
     * @return the content id
     */
    public String getContentId() {
		return this.contentId;
	}

    /**
     * Sets content id.
     *
     * @param contentId the content id
     */
    public void setContentId(String contentId) {
		this.contentId = contentId;
	}

    /**
     * Gets coupon type.
     *
     * @return the coupon type
     */
    public String getCouponType() {
		return this.couponType;
	}

    /**
     * Sets coupon type.
     *
     * @param couponType the coupon type
     */
    public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
		return this.description;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
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
     * Gets image id.
     *
     * @return the image id
     */
    public String getImageId() {
		return this.imageId;
	}

    /**
     * Sets image id.
     *
     * @param imageId the image id
     */
    public void setImageId(String imageId) {
		this.imageId = imageId;
	}

    /**
     * Gets item brand.
     *
     * @return the item brand
     */
    public String getItemBrand() {
		return this.itemBrand;
	}

    /**
     * Sets item brand.
     *
     * @param itemBrand the item brand
     */
    public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

    /**
     * Gets item category.
     *
     * @return the item category
     */
    public String getItemCategory() {
		return this.itemCategory;
	}

    /**
     * Sets item category.
     *
     * @param itemCategory the item category
     */
    public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

    /**
     * Gets item code.
     *
     * @return the item code
     */
    public String getItemCode() {
		return this.itemCode;
	}

    /**
     * Sets item code.
     *
     * @param itemCode the item code
     */
    public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

    /**
     * Gets item name.
     *
     * @return the item name
     */
    public String getItemName() {
		return this.itemName;
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
     * Gets member only.
     *
     * @return the member only
     */
    public String getMemberOnly() {
		return this.memberOnly;
	}

    /**
     * Sets member only.
     *
     * @param memberOnly the member only
     */
    public void setMemberOnly(String memberOnly) {
		this.memberOnly = memberOnly;
	}

    /**
     * Gets shop ids.
     *
     * @return the shop ids
     */
    public List<String> getShopIds() {
		return this.shopIds;
	}

    /**
     * Sets shop ids.
     *
     * @param shopIds the shop ids
     */
    public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

    /**
     * Gets thumbnail image id.
     *
     * @return the thumbnail image id
     */
    public String getThumbnailImageId() {
		return this.thumbnailImageId;
	}

    /**
     * Sets thumbnail image id.
     *
     * @param thumbnailImageId the thumbnail image id
     */
    public void setThumbnailImageId(String thumbnailImageId) {
		this.thumbnailImageId = thumbnailImageId;
	}

}
