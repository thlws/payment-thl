package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应聘回调接口
 *
 * @author auto create
 * @since 1.0, 2017-08-03 10:59:12
 */
public class AlipayEcoEduCampusJobdeliverModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8249863898346976213L;

	/**
	 * 用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 补充文案
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 备用字段
	 */
	@ApiField("content_var")
	private String contentVar;

	/**
	 * 面试地点
	 */
	@ApiField("interview_location")
	private String interviewLocation;

	/**
	 * 面试时间(毫秒)
	 */
	@ApiField("interview_time")
	private String interviewTime;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 职位来源方编码
	 */
	@ApiField("source_code")
	private String sourceCode;

	/**
	 * 职位来源方id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 投递状态: 4被查看;5待处理;6邀面试;7已拒绝;8已录用;9已结束
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 状态更新时间(毫秒)
	 */
	@ApiField("update_time")
	private String updateTime;

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId() {
		return this.alipayUserId;
	}

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets comment.
     *
     * @return the comment
     */
    public String getComment() {
		return this.comment;
	}

    /**
     * Sets comment.
     *
     * @param comment the comment
     */
    public void setComment(String comment) {
		this.comment = comment;
	}

    /**
     * Gets content var.
     *
     * @return the content var
     */
    public String getContentVar() {
		return this.contentVar;
	}

    /**
     * Sets content var.
     *
     * @param contentVar the content var
     */
    public void setContentVar(String contentVar) {
		this.contentVar = contentVar;
	}

    /**
     * Gets interview location.
     *
     * @return the interview location
     */
    public String getInterviewLocation() {
		return this.interviewLocation;
	}

    /**
     * Sets interview location.
     *
     * @param interviewLocation the interview location
     */
    public void setInterviewLocation(String interviewLocation) {
		this.interviewLocation = interviewLocation;
	}

    /**
     * Gets interview time.
     *
     * @return the interview time
     */
    public String getInterviewTime() {
		return this.interviewTime;
	}

    /**
     * Sets interview time.
     *
     * @param interviewTime the interview time
     */
    public void setInterviewTime(String interviewTime) {
		this.interviewTime = interviewTime;
	}

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public String getLatitude() {
		return this.latitude;
	}

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     */
    public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public String getLongitude() {
		return this.longitude;
	}

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     */
    public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

    /**
     * Gets source code.
     *
     * @return the source code
     */
    public String getSourceCode() {
		return this.sourceCode;
	}

    /**
     * Sets source code.
     *
     * @param sourceCode the source code
     */
    public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

    /**
     * Gets source id.
     *
     * @return the source id
     */
    public String getSourceId() {
		return this.sourceId;
	}

    /**
     * Sets source id.
     *
     * @param sourceId the source id
     */
    public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public Long getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Long status) {
		this.status = status;
	}

    /**
     * Gets update time.
     *
     * @return the update time
     */
    public String getUpdateTime() {
		return this.updateTime;
	}

    /**
     * Sets update time.
     *
     * @param updateTime the update time
     */
    public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
