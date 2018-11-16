package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视频动态的描述数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class NewsfeedMediaVideoInfo extends AlipayObject {

	private static final long serialVersionUID = 7183113236227213337L;

	/**
	 * 高度
	 */
	@ApiField("height")
	private String height;

	/**
	 * 视频缩略图的ID（支持djangoId）
	 */
	@ApiField("img_id")
	private String imgId;

	/**
	 * 视频的id（支持djangoId）
	 */
	@ApiField("video_id")
	private String videoId;

	/**
	 * 宽度
	 */
	@ApiField("width")
	private String width;

    /**
     * Gets height.
     *
     * @return the height
     */
    public String getHeight() {
		return this.height;
	}

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(String height) {
		this.height = height;
	}

    /**
     * Gets img id.
     *
     * @return the img id
     */
    public String getImgId() {
		return this.imgId;
	}

    /**
     * Sets img id.
     *
     * @param imgId the img id
     */
    public void setImgId(String imgId) {
		this.imgId = imgId;
	}

    /**
     * Gets video id.
     *
     * @return the video id
     */
    public String getVideoId() {
		return this.videoId;
	}

    /**
     * Sets video id.
     *
     * @param videoId the video id
     */
    public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

    /**
     * Gets width.
     *
     * @return the width
     */
    public String getWidth() {
		return this.width;
	}

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(String width) {
		this.width = width;
	}

}
