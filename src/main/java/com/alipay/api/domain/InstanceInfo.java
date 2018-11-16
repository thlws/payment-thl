package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户维度券信息模型
 *
 * @author auto create
 * @since 1.0, 2017-08-24 21:58:29
 */
public class InstanceInfo extends AlipayObject {

	private static final long serialVersionUID = 4112147879147297461L;

	/**
	 * 内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 券失效时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 券开始生效时间
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 券id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 券名称
	 */
	@ApiField("instance_name")
	private String instanceName;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

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
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public Date getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public Date getGmtStart() {
		return this.gmtStart;
	}

    /**
     * Sets gmt start.
     *
     * @param gmtStart the gmt start
     */
    public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

    /**
     * Gets instance id.
     *
     * @return the instance id
     */
    public String getInstanceId() {
		return this.instanceId;
	}

    /**
     * Sets instance id.
     *
     * @param instanceId the instance id
     */
    public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

    /**
     * Gets instance name.
     *
     * @return the instance name
     */
    public String getInstanceName() {
		return this.instanceName;
	}

    /**
     * Sets instance name.
     *
     * @param instanceName the instance name
     */
    public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
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
