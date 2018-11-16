package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多媒体算法车减排识别
 *
 * @author auto create
 * @since 1.0, 2017-08-22 16:23:52
 */
public class AlipayMsaasMediarecogAftsCarIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 8512838579233826319L;

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
	 * 用户输入的里程数
	 */
	@ApiField("kilometres")
	private Long kilometres;

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
	 * 引导框左上角x
	 */
	@ApiField("x")
	private Long x;

	/**
	 * 引导框左上角y
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
     * Gets kilometres.
     *
     * @return the kilometres
     */
    public Long getKilometres() {
		return this.kilometres;
	}

    /**
     * Sets kilometres.
     *
     * @param kilometres the kilometres
     */
    public void setKilometres(Long kilometres) {
		this.kilometres = kilometres;
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
