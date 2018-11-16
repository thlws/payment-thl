package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券简要信息
 *
 * @author auto create
 * @since 1.0, 2017-03-28 22:18:02
 */
public class VoucherLiteInfo extends AlipayObject {

	private static final long serialVersionUID = 6287721989676123478L;

	/**
	 * 发券时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("send_time")
	private Date sendTime;

	/**
	 * 券状态，可枚举，分别为“可用”(ENABLED)和“不可用”(DISABLED)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

    /**
     * Gets send time.
     *
     * @return the send time
     */
    public Date getSendTime() {
		return this.sendTime;
	}

    /**
     * Sets send time.
     *
     * @param sendTime the send time
     */
    public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
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
     * Gets voucher id.
     *
     * @return the voucher id
     */
    public String getVoucherId() {
		return this.voucherId;
	}

    /**
     * Sets voucher id.
     *
     * @param voucherId the voucher id
     */
    public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
