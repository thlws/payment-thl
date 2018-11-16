package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送蚂蚁森林林区实时图片
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:17:35
 */
public class AlipayUserCharityForestsendpicSendModel extends AlipayObject {

	private static final long serialVersionUID = 1181386597597135494L;

	/**
	 * 蚂蚁森林林区ID
	 */
	@ApiField("forest_id")
	private String forestId;

	/**
	 * 图片唯一编号，用于幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 拍摄图片时的气象信息，包括温度（temperature °C）、湿度（humidity %）、气压（pressure hPa）和光照强度（illumination Lux）等，json格式
	 */
	@ApiField("pic_ext_info")
	private String picExtInfo;

	/**
	 * 蚂蚁森林实时图像地址，必须是阿里云地址，包含"aliyun"信息
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 图片拍摄时间，format: YYYY-MM-DDTHH:MM:SS
	 */
	@ApiField("shoot_time")
	private String shootTime;

    /**
     * Gets forest id.
     *
     * @return the forest id
     */
    public String getForestId() {
		return this.forestId;
	}

    /**
     * Sets forest id.
     *
     * @param forestId the forest id
     */
    public void setForestId(String forestId) {
		this.forestId = forestId;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets pic ext info.
     *
     * @return the pic ext info
     */
    public String getPicExtInfo() {
		return this.picExtInfo;
	}

    /**
     * Sets pic ext info.
     *
     * @param picExtInfo the pic ext info
     */
    public void setPicExtInfo(String picExtInfo) {
		this.picExtInfo = picExtInfo;
	}

    /**
     * Gets pic url.
     *
     * @return the pic url
     */
    public String getPicUrl() {
		return this.picUrl;
	}

    /**
     * Sets pic url.
     *
     * @param picUrl the pic url
     */
    public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

    /**
     * Gets shoot time.
     *
     * @return the shoot time
     */
    public String getShootTime() {
		return this.shootTime;
	}

    /**
     * Sets shoot time.
     *
     * @param shootTime the shoot time
     */
    public void setShootTime(String shootTime) {
		this.shootTime = shootTime;
	}

}
