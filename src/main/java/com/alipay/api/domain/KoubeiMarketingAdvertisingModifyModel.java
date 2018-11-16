package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改广告接口
 *
 * @author auto create
 * @since 1.0, 2018-08-31 13:06:40
 */
public class KoubeiMarketingAdvertisingModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1761837197952583611L;

	/**
	 * 行为地址。用户点击广告后，跳转URL地址, 协议必须为HTTPS。广告类型为PIC时，需要设置该值。
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 广告ID,唯一标识一条广告
	 */
	@ApiField("ad_id")
	private String adId;

	/**
	 * 广告内容，目前只支持图片类型，则传入图片ID标识，如何获取图片ID参考图片上传接口：alipay.offline.material.image.upload，图片尺寸为1242px＊290px。
	 */
	@ApiField("content")
	private String content;

	/**
	 * 投放广告结束时间，使用标准时间格式：yyyy-MM-dd HH:mm:ss，如果不设置，默认投放时间一个月
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 目前传入广告类型为图片，该字段可以先忽略。
	 */
	@ApiField("height")
	private String height;

	/**
	 * 投放广告开始时间，使用标准时间格式：yyyy-MM-dd HH:mm:ss，如果不设置，默认投放时间一个月
	 */
	@ApiField("start_time")
	private Date startTime;

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
     * Gets ad id.
     *
     * @return the ad id
     */
    public String getAdId() {
		return this.adId;
	}

    /**
     * Sets ad id.
     *
     * @param adId the ad id
     */
    public void setAdId(String adId) {
		this.adId = adId;
	}

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
		return this.content;
	}

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

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
     * Gets start time.
     *
     * @return the start time
     */
    public Date getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
