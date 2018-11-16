package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡模板样式信息
 *
 * @author auto create
 * @since 1.0, 2018-05-04 15:36:49
 */
public class TemplateStyleInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5885491928658316175L;

	/**
	 * 背景图片Id，通过接口（alipay.offline.material.image.upload）上传图片

图片说明：2M以内，格式：bmp、png、jpeg、jpg、gif；
尺寸不小于1020*643px；
图片不得有圆角，不得拉伸变形
	 */
	@ApiField("background_id")
	private String backgroundId;

	/**
	 * banner图片地址。 通过接口（alipay.offline.material.image.upload）上传图片。
	 */
	@ApiField("banner_img_id")
	private String bannerImgId;

	/**
	 * banner跳转地址。
	 */
	@ApiField("banner_url")
	private String bannerUrl;

	/**
	 * 背景色
	 */
	@ApiField("bg_color")
	private String bgColor;

	/**
	 * 品牌商名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 钱包端显示名称（字符串长度）
	 */
	@ApiField("card_show_name")
	private String cardShowName;

	/**
	 * 注意：此字段已废弃。
卡片颜色
	 */
	@ApiField("color")
	private String color;

	/**
	 * 栏位信息布局。目前只支持list（列表）或grid（宫格）形式。如果为空则默认为list。
	 */
	@ApiField("column_info_layout")
	private String columnInfoLayout;

	/**
	 * 特色信息，用于领卡预览
	 */
	@ApiListField("feature_descriptions")
	@ApiField("string")
	private List<String> featureDescriptions;

	/**
	 * 设置是否在卡面展示（个人头像）图片信息，默认不展示；
当前仅用于身份验证信息类型的个人头像图片；
图片id随创建卡/更新卡时传入；
详见会员卡产品文档。
	 */
	@ApiField("front_image_enable")
	private Boolean frontImageEnable;

	/**
	 * 设置是否在卡面展示文案信息，默认不展示；
文案信息分行展示，最多展示4行文案，每行文案分为label和value两部分；
文案实际内容随创建卡/更新卡时传入；
详见会员卡产品说明文档。
	 */
	@ApiField("front_text_list_enable")
	private Boolean frontTextListEnable;

	/**
	 * logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片

图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；
尺寸不小于500*500px的正方形；
请优先使用商家LOGO；
	 */
	@ApiField("logo_id")
	private String logoId;

	/**
	 * 标语
	 */
	@ApiField("slogan")
	private String slogan;

	/**
	 * 标语图片， 通过接口（alipay.offline.material.image.upload）上传图片
	 */
	@ApiField("slogan_img_id")
	private String sloganImgId;

    /**
     * Gets background id.
     *
     * @return the background id
     */
    public String getBackgroundId() {
		return this.backgroundId;
	}

    /**
     * Sets background id.
     *
     * @param backgroundId the background id
     */
    public void setBackgroundId(String backgroundId) {
		this.backgroundId = backgroundId;
	}

    /**
     * Gets banner img id.
     *
     * @return the banner img id
     */
    public String getBannerImgId() {
		return this.bannerImgId;
	}

    /**
     * Sets banner img id.
     *
     * @param bannerImgId the banner img id
     */
    public void setBannerImgId(String bannerImgId) {
		this.bannerImgId = bannerImgId;
	}

    /**
     * Gets banner url.
     *
     * @return the banner url
     */
    public String getBannerUrl() {
		return this.bannerUrl;
	}

    /**
     * Sets banner url.
     *
     * @param bannerUrl the banner url
     */
    public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

    /**
     * Gets bg color.
     *
     * @return the bg color
     */
    public String getBgColor() {
		return this.bgColor;
	}

    /**
     * Sets bg color.
     *
     * @param bgColor the bg color
     */
    public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
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
     * Gets card show name.
     *
     * @return the card show name
     */
    public String getCardShowName() {
		return this.cardShowName;
	}

    /**
     * Sets card show name.
     *
     * @param cardShowName the card show name
     */
    public void setCardShowName(String cardShowName) {
		this.cardShowName = cardShowName;
	}

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor() {
		return this.color;
	}

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(String color) {
		this.color = color;
	}

    /**
     * Gets column info layout.
     *
     * @return the column info layout
     */
    public String getColumnInfoLayout() {
		return this.columnInfoLayout;
	}

    /**
     * Sets column info layout.
     *
     * @param columnInfoLayout the column info layout
     */
    public void setColumnInfoLayout(String columnInfoLayout) {
		this.columnInfoLayout = columnInfoLayout;
	}

    /**
     * Gets feature descriptions.
     *
     * @return the feature descriptions
     */
    public List<String> getFeatureDescriptions() {
		return this.featureDescriptions;
	}

    /**
     * Sets feature descriptions.
     *
     * @param featureDescriptions the feature descriptions
     */
    public void setFeatureDescriptions(List<String> featureDescriptions) {
		this.featureDescriptions = featureDescriptions;
	}

    /**
     * Gets front image enable.
     *
     * @return the front image enable
     */
    public Boolean getFrontImageEnable() {
		return this.frontImageEnable;
	}

    /**
     * Sets front image enable.
     *
     * @param frontImageEnable the front image enable
     */
    public void setFrontImageEnable(Boolean frontImageEnable) {
		this.frontImageEnable = frontImageEnable;
	}

    /**
     * Gets front text list enable.
     *
     * @return the front text list enable
     */
    public Boolean getFrontTextListEnable() {
		return this.frontTextListEnable;
	}

    /**
     * Sets front text list enable.
     *
     * @param frontTextListEnable the front text list enable
     */
    public void setFrontTextListEnable(Boolean frontTextListEnable) {
		this.frontTextListEnable = frontTextListEnable;
	}

    /**
     * Gets logo id.
     *
     * @return the logo id
     */
    public String getLogoId() {
		return this.logoId;
	}

    /**
     * Sets logo id.
     *
     * @param logoId the logo id
     */
    public void setLogoId(String logoId) {
		this.logoId = logoId;
	}

    /**
     * Gets slogan.
     *
     * @return the slogan
     */
    public String getSlogan() {
		return this.slogan;
	}

    /**
     * Sets slogan.
     *
     * @param slogan the slogan
     */
    public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

    /**
     * Gets slogan img id.
     *
     * @return the slogan img id
     */
    public String getSloganImgId() {
		return this.sloganImgId;
	}

    /**
     * Sets slogan img id.
     *
     * @param sloganImgId the slogan img id
     */
    public void setSloganImgId(String sloganImgId) {
		this.sloganImgId = sloganImgId;
	}

}
