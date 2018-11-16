package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券模板批量查询响应
 *
 * @author auto create
 * @since 1.0, 2017-03-28 22:18:14
 */
public class VoucherTemplateLiteInfo extends AlipayObject {

	private static final long serialVersionUID = 8427857967984265294L;

	/**
	 * 模板激活时间。草稿状态的模板该项为空
	 */
	@ApiField("activate_time")
	private Date activateTime;

	/**
	 * 模板创建时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 发放结束时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 券模板发放开始时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 模板状态，可枚举。分别为‘草稿’(I)、‘生效’(S)和‘过期’(E)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

    /**
     * Gets activate time.
     *
     * @return the activate time
     */
    public Date getActivateTime() {
		return this.activateTime;
	}

    /**
     * Sets activate time.
     *
     * @param activateTime the activate time
     */
    public void setActivateTime(Date activateTime) {
		this.activateTime = activateTime;
	}

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public Date getCreateTime() {
		return this.createTime;
	}

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

    /**
     * Gets publish end time.
     *
     * @return the publish end time
     */
    public Date getPublishEndTime() {
		return this.publishEndTime;
	}

    /**
     * Sets publish end time.
     *
     * @param publishEndTime the publish end time
     */
    public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

    /**
     * Gets publish start time.
     *
     * @return the publish start time
     */
    public Date getPublishStartTime() {
		return this.publishStartTime;
	}

    /**
     * Sets publish start time.
     *
     * @param publishStartTime the publish start time
     */
    public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

    /**
     * Gets voucher name.
     *
     * @return the voucher name
     */
    public String getVoucherName() {
		return this.voucherName;
	}

    /**
     * Sets voucher name.
     *
     * @param voucherName the voucher name
     */
    public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

}
