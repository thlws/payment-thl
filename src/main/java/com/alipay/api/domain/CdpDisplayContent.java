package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * C端展示的投放内容查询接口，用来获取C端当前展示的投放内容，供ISV页面同步展示。
 *
 * @author auto create
 * @since 1.0, 2018-03-15 11:46:44
 */
public class CdpDisplayContent extends AlipayObject {

	private static final long serialVersionUID = 3727519171614139555L;

	/**
	 * 点击投放内容跳转地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 投放中的扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 投放生效结束时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 投放生效开始时间
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 投放图片地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 投放文本内容
	 */
	@ApiField("text")
	private String text;

	/**
	 * 投放类型字段（当前只有红包），红包redPacket、提示tips、全景ar、广告ad
	 */
	@ApiField("type")
	private String type;

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
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public Date getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public Date getGmtStart() {
		return this.gmtStart;
	}

    /**
     * Sets gmt start.
     *
     * @param gmtStart the gmt start
     */
    public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

    /**
     * Gets image url.
     *
     * @return the image url
     */
    public String getImageUrl() {
		return this.imageUrl;
	}

    /**
     * Sets image url.
     *
     * @param imageUrl the image url
     */
    public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
		return this.text;
	}

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(String text) {
		this.text = text;
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
