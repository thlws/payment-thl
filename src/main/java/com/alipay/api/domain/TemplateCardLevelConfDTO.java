package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡级别配置信息
 *
 * @author auto create
 * @since 1.0, 2017-10-27 17:49:09
 */
public class TemplateCardLevelConfDTO extends AlipayObject {

	private static final long serialVersionUID = 2455992767224899659L;

	/**
	 * 会员级别 该级别和开卡接口中的level要一致
	 */
	@ApiField("level")
	private String level;

	/**
	 * 会员级别描述
	 */
	@ApiField("level_desc")
	private String levelDesc;

	/**
	 * 会员级别对应icon， 通过接口（alipay.offline.material.image.upload）上传图片
	 */
	@ApiField("level_icon")
	private String levelIcon;

	/**
	 * 会员级别显示名称
	 */
	@ApiField("level_show_name")
	private String levelShowName;

    /**
     * Gets level.
     *
     * @return the level
     */
    public String getLevel() {
		return this.level;
	}

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(String level) {
		this.level = level;
	}

    /**
     * Gets level desc.
     *
     * @return the level desc
     */
    public String getLevelDesc() {
		return this.levelDesc;
	}

    /**
     * Sets level desc.
     *
     * @param levelDesc the level desc
     */
    public void setLevelDesc(String levelDesc) {
		this.levelDesc = levelDesc;
	}

    /**
     * Gets level icon.
     *
     * @return the level icon
     */
    public String getLevelIcon() {
		return this.levelIcon;
	}

    /**
     * Sets level icon.
     *
     * @param levelIcon the level icon
     */
    public void setLevelIcon(String levelIcon) {
		this.levelIcon = levelIcon;
	}

    /**
     * Gets level show name.
     *
     * @return the level show name
     */
    public String getLevelShowName() {
		return this.levelShowName;
	}

    /**
     * Sets level show name.
     *
     * @param levelShowName the level show name
     */
    public void setLevelShowName(String levelShowName) {
		this.levelShowName = levelShowName;
	}

}
