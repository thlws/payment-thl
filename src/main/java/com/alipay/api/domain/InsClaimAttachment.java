package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔案件附件材料
 *
 * @author auto create
 * @since 1.0, 2017-07-18 15:48:09
 */
public class InsClaimAttachment extends AlipayObject {

	private static final long serialVersionUID = 8146281119158626245L;

	/**
	 * 材料描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 文件名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 附件对应的路径
	 */
	@ApiField("path")
	private String path;

	/**
	 * 审核理由
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 材料审核状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 附件类型
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
		return this.description;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
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
     * Gets path.
     *
     * @return the path
     */
    public String getPath() {
		return this.path;
	}

    /**
     * Sets path.
     *
     * @param path the path
     */
    public void setPath(String path) {
		this.path = path;
	}

    /**
     * Gets reason.
     *
     * @return the reason
     */
    public String getReason() {
		return this.reason;
	}

    /**
     * Sets reason.
     *
     * @param reason the reason
     */
    public void setReason(String reason) {
		this.reason = reason;
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
