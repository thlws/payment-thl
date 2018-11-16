package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手艺人作品
 *
 * @author auto create
 * @since 1.0, 2017-01-13 16:32:38
 */
public class CraftsmanWorkCreateOpenModel extends AlipayObject {

	private static final long serialVersionUID = 4587986167166158551L;

	/**
	 * 视频资源必传，视频时长，单位(秒)
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 媒体资源id（通过 alipay.offline.material.image.upload 接口上传图片获取的资源id）。图片上限最大5M,支持bmp,png,jpeg,jpg,gif格式的图片。视频上限最大50M,支持MP4格式。
	 */
	@ApiField("media_id")
	private String mediaId;

	/**
	 * 媒体类型。仅支持图片/视频格式，图片类型时传入PICTURE；视频类型时传入VIDEO
	 */
	@ApiField("media_type")
	private String mediaType;

	/**
	 * 外部作品id,isv的appId+外部作品id全局唯一
	 */
	@ApiField("out_work_id")
	private String outWorkId;

	/**
	 * 作品标题，上限10个字。
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public Long getDuration() {
		return this.duration;
	}

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(Long duration) {
		this.duration = duration;
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
     * Gets out work id.
     *
     * @return the out work id
     */
    public String getOutWorkId() {
		return this.outWorkId;
	}

    /**
     * Sets out work id.
     *
     * @param outWorkId the out work id
     */
    public void setOutWorkId(String outWorkId) {
		this.outWorkId = outWorkId;
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
