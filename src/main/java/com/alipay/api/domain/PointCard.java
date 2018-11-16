package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集点卡工具
 *
 * @author auto create
 * @since 1.0, 2017-06-05 11:25:25
 */
public class PointCard extends AlipayObject {

	private static final long serialVersionUID = 5455194921148595344L;

	/**
	 * 工具的描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 工具的有效期的结束时间（必须晚于活动的结束时间）
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 工具的LOGO文件ID
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 工具的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 工具的有效期的起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 工具类型，目前支持：
集点卡：POINT_CARD
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
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
     * Gets logo.
     *
     * @return the logo
     */
    public String getLogo() {
		return this.logo;
	}

    /**
     * Sets logo.
     *
     * @param logo the logo
     */
    public void setLogo(String logo) {
		this.logo = logo;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
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
