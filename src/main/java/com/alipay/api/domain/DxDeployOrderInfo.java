package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据决策服务部署单批量查询结果
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:55:02
 */
public class DxDeployOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 1594754841984382824L;

	/**
	 * 决策服务自定义名字空间字段
	 */
	@ApiField("biz_ns")
	private String bizNs;

	/**
	 * 部署事件类型,枚举值如下:
ONLINE,OFFLINE,UPDATE,VERIFY
	 */
	@ApiField("deploy_event_type")
	private String deployEventType;

	/**
	 * 部署对象类型，共有4个类型:DECISION_RULE(决策规则),DECISION_ROUTER(决策分流规则),DECISION_ROUTER_PERCENT(决策策略分流百分比),DATA_SOURCE(数据源)
	 */
	@ApiField("deploy_object_type")
	private String deployObjectType;

	/**
	 * 部署单内容
	 */
	@ApiField("deploy_payload")
	private String deployPayload;

	/**
	 * 部署单业务创建时间
	 */
	@ApiField("gmt_biz_create")
	private Date gmtBizCreate;

	/**
	 * 部署的分组名
	 */
	@ApiField("group")
	private String group;

	/**
	 * 重试的记录id
	 */
	@ApiField("pre_record_id")
	private String preRecordId;

	/**
	 * 记录id
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 是否为重试部署单
	 */
	@ApiField("retry")
	private Boolean retry;

    /**
     * Gets biz ns.
     *
     * @return the biz ns
     */
    public String getBizNs() {
		return this.bizNs;
	}

    /**
     * Sets biz ns.
     *
     * @param bizNs the biz ns
     */
    public void setBizNs(String bizNs) {
		this.bizNs = bizNs;
	}

    /**
     * Gets deploy event type.
     *
     * @return the deploy event type
     */
    public String getDeployEventType() {
		return this.deployEventType;
	}

    /**
     * Sets deploy event type.
     *
     * @param deployEventType the deploy event type
     */
    public void setDeployEventType(String deployEventType) {
		this.deployEventType = deployEventType;
	}

    /**
     * Gets deploy object type.
     *
     * @return the deploy object type
     */
    public String getDeployObjectType() {
		return this.deployObjectType;
	}

    /**
     * Sets deploy object type.
     *
     * @param deployObjectType the deploy object type
     */
    public void setDeployObjectType(String deployObjectType) {
		this.deployObjectType = deployObjectType;
	}

    /**
     * Gets deploy payload.
     *
     * @return the deploy payload
     */
    public String getDeployPayload() {
		return this.deployPayload;
	}

    /**
     * Sets deploy payload.
     *
     * @param deployPayload the deploy payload
     */
    public void setDeployPayload(String deployPayload) {
		this.deployPayload = deployPayload;
	}

    /**
     * Gets gmt biz create.
     *
     * @return the gmt biz create
     */
    public Date getGmtBizCreate() {
		return this.gmtBizCreate;
	}

    /**
     * Sets gmt biz create.
     *
     * @param gmtBizCreate the gmt biz create
     */
    public void setGmtBizCreate(Date gmtBizCreate) {
		this.gmtBizCreate = gmtBizCreate;
	}

    /**
     * Gets group.
     *
     * @return the group
     */
    public String getGroup() {
		return this.group;
	}

    /**
     * Sets group.
     *
     * @param group the group
     */
    public void setGroup(String group) {
		this.group = group;
	}

    /**
     * Gets pre record id.
     *
     * @return the pre record id
     */
    public String getPreRecordId() {
		return this.preRecordId;
	}

    /**
     * Sets pre record id.
     *
     * @param preRecordId the pre record id
     */
    public void setPreRecordId(String preRecordId) {
		this.preRecordId = preRecordId;
	}

    /**
     * Gets record id.
     *
     * @return the record id
     */
    public String getRecordId() {
		return this.recordId;
	}

    /**
     * Sets record id.
     *
     * @param recordId the record id
     */
    public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

    /**
     * Gets retry.
     *
     * @return the retry
     */
    public Boolean getRetry() {
		return this.retry;
	}

    /**
     * Sets retry.
     *
     * @param retry the retry
     */
    public void setRetry(Boolean retry) {
		this.retry = retry;
	}

}
