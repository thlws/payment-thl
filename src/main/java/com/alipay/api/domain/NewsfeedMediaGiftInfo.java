package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 红包数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class NewsfeedMediaGiftInfo extends AlipayObject {

	private static final long serialVersionUID = 5834119852534975864L;

	/**
	 * 地址
	 */
	@ApiField("action")
	private String action;

	/**
	 * 安卓的高度
	 */
	@ApiField("adr_height")
	private String adrHeight;

	/**
	 * 安卓缩略图
	 */
	@ApiField("adr_thumb")
	private String adrThumb;

	/**
	 * 安卓宽度
	 */
	@ApiField("adr_width")
	private String adrWidth;

	/**
	 * ios高度
	 */
	@ApiField("ios_height")
	private String iosHeight;

	/**
	 * ios缩略图
	 */
	@ApiField("ios_thumb")
	private String iosThumb;

	/**
	 * ios宽度
	 */
	@ApiField("ios_width")
	private String iosWidth;

	/**
	 * 大图
	 */
	@ApiField("theme")
	private String theme;

	/**
	 * 红包类型all、f、m
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets action.
     *
     * @return the action
     */
    public String getAction() {
		return this.action;
	}

    /**
     * Sets action.
     *
     * @param action the action
     */
    public void setAction(String action) {
		this.action = action;
	}

    /**
     * Gets adr height.
     *
     * @return the adr height
     */
    public String getAdrHeight() {
		return this.adrHeight;
	}

    /**
     * Sets adr height.
     *
     * @param adrHeight the adr height
     */
    public void setAdrHeight(String adrHeight) {
		this.adrHeight = adrHeight;
	}

    /**
     * Gets adr thumb.
     *
     * @return the adr thumb
     */
    public String getAdrThumb() {
		return this.adrThumb;
	}

    /**
     * Sets adr thumb.
     *
     * @param adrThumb the adr thumb
     */
    public void setAdrThumb(String adrThumb) {
		this.adrThumb = adrThumb;
	}

    /**
     * Gets adr width.
     *
     * @return the adr width
     */
    public String getAdrWidth() {
		return this.adrWidth;
	}

    /**
     * Sets adr width.
     *
     * @param adrWidth the adr width
     */
    public void setAdrWidth(String adrWidth) {
		this.adrWidth = adrWidth;
	}

    /**
     * Gets ios height.
     *
     * @return the ios height
     */
    public String getIosHeight() {
		return this.iosHeight;
	}

    /**
     * Sets ios height.
     *
     * @param iosHeight the ios height
     */
    public void setIosHeight(String iosHeight) {
		this.iosHeight = iosHeight;
	}

    /**
     * Gets ios thumb.
     *
     * @return the ios thumb
     */
    public String getIosThumb() {
		return this.iosThumb;
	}

    /**
     * Sets ios thumb.
     *
     * @param iosThumb the ios thumb
     */
    public void setIosThumb(String iosThumb) {
		this.iosThumb = iosThumb;
	}

    /**
     * Gets ios width.
     *
     * @return the ios width
     */
    public String getIosWidth() {
		return this.iosWidth;
	}

    /**
     * Sets ios width.
     *
     * @param iosWidth the ios width
     */
    public void setIosWidth(String iosWidth) {
		this.iosWidth = iosWidth;
	}

    /**
     * Gets theme.
     *
     * @return the theme
     */
    public String getTheme() {
		return this.theme;
	}

    /**
     * Sets theme.
     *
     * @param theme the theme
     */
    public void setTheme(String theme) {
		this.theme = theme;
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

}
