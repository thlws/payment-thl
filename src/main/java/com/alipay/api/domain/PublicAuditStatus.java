package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号审核状态
 *
 * @author auto create
 * @since 1.0, 2017-09-20 17:31:46
 */
public class PublicAuditStatus extends AlipayObject {

	private static final long serialVersionUID = 3844263482271739662L;

	/**
	 * 审核状态描述，如果审核驳回则有相关的驳回理由
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过，AUDIT_NORMAL：无审核记录
	 */
	@ApiField("status")
	private String status;

	/**
	 * NAME:名称、AVATAR:头像、NAME_AVATAR:名称与头像、INTRODUCTION:简介
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
