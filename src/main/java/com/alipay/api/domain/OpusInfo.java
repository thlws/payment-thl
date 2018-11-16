package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作品内容
 *
 * @author auto create
 * @since 1.0, 2017-10-20 11:05:01
 */
public class OpusInfo extends AlipayObject {

	private static final long serialVersionUID = 3231323975619832387L;

	/**
	 * 展示权重；必须大于等于0；排序规则：权重倒叙;默认值为0
	 */
	@ApiField("display_weight")
	private String displayWeight;

	/**
	 * 外部作品id
	 */
	@ApiField("external_opus_id")
	private String externalOpusId;

	/**
	 * 素材id
	 */
	@ApiField("media_id")
	private String mediaId;

	/**
	 * 头图素材type；
枚举类型：PICTURE/VIDEO
	 */
	@ApiField("media_type")
	private String mediaType;

	/**
	 * 素材url
	 */
	@ApiField("media_url")
	private String mediaUrl;

	/**
	 * 作品id
	 */
	@ApiField("opus_id")
	private String opusId;

	/**
	 * 素材标题
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets display weight.
     *
     * @return the display weight
     */
    public String getDisplayWeight() {
		return this.displayWeight;
	}

    /**
     * Sets display weight.
     *
     * @param displayWeight the display weight
     */
    public void setDisplayWeight(String displayWeight) {
		this.displayWeight = displayWeight;
	}

    /**
     * Gets external opus id.
     *
     * @return the external opus id
     */
    public String getExternalOpusId() {
		return this.externalOpusId;
	}

    /**
     * Sets external opus id.
     *
     * @param externalOpusId the external opus id
     */
    public void setExternalOpusId(String externalOpusId) {
		this.externalOpusId = externalOpusId;
	}

    /**
     * Gets media id.
     *
     * @return the media id
     */
    public String getMediaId() {
		return this.mediaId;
	}

    /**
     * Sets media id.
     *
     * @param mediaId the media id
     */
    public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

    /**
     * Gets media type.
     *
     * @return the media type
     */
    public String getMediaType() {
		return this.mediaType;
	}

    /**
     * Sets media type.
     *
     * @param mediaType the media type
     */
    public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

    /**
     * Gets media url.
     *
     * @return the media url
     */
    public String getMediaUrl() {
		return this.mediaUrl;
	}

    /**
     * Sets media url.
     *
     * @param mediaUrl the media url
     */
    public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

    /**
     * Gets opus id.
     *
     * @return the opus id
     */
    public String getOpusId() {
		return this.opusId;
	}

    /**
     * Sets opus id.
     *
     * @param opusId the opus id
     */
    public void setOpusId(String opusId) {
		this.opusId = opusId;
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

}
