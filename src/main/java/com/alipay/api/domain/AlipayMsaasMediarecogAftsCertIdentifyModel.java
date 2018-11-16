package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多媒体OCR行驶证识别
 *
 * @author auto create
 * @since 1.0, 2017-12-13 10:47:42
 */
public class AlipayMsaasMediarecogAftsCertIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 1187375243195824767L;

	/**
	 * 扩展入参
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 高
	 */
	@ApiField("h")
	private Long h;

	/**
	 * 车牌号
	 */
	@ApiField("plate_number")
	private String plateNumber;

	/**
	 * 传入资源URL或djangoid或aftsid
	 */
	@ApiField("url")
	private String url;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 宽
	 */
	@ApiField("w")
	private Long w;

	/**
	 * 左上角x
	 */
	@ApiField("x")
	private Long x;

	/**
	 * 左上角y
	 */
	@ApiField("y")
	private Long y;

    /**
     * Gets ext.
     *
     * @return the ext
     */
    public String getExt() {
		return this.ext;
	}

    /**
     * Sets ext.
     *
     * @param ext the ext
     */
    public void setExt(String ext) {
		this.ext = ext;
	}

    /**
     * Gets h.
     *
     * @return the h
     */
    public Long getH() {
		return this.h;
	}

    /**
     * Sets h.
     *
     * @param h the h
     */
    public void setH(Long h) {
		this.h = h;
	}

    /**
     * Gets plate number.
     *
     * @return the plate number
     */
    public String getPlateNumber() {
		return this.plateNumber;
	}

    /**
     * Sets plate number.
     *
     * @param plateNumber the plate number
     */
    public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
		return this.url;
	}

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
		this.url = url;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets w.
     *
     * @return the w
     */
    public Long getW() {
		return this.w;
	}

    /**
     * Sets w.
     *
     * @param w the w
     */
    public void setW(Long w) {
		this.w = w;
	}

    /**
     * Gets x.
     *
     * @return the x
     */
    public Long getX() {
		return this.x;
	}

    /**
     * Sets x.
     *
     * @param x the x
     */
    public void setX(Long x) {
		this.x = x;
	}

    /**
     * Gets y.
     *
     * @return the y
     */
    public Long getY() {
		return this.y;
	}

    /**
     * Sets y.
     *
     * @param y the y
     */
    public void setY(Long y) {
		this.y = y;
	}

}
