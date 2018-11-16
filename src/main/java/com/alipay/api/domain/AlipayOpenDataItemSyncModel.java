package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部事件同步
 *
 * @author auto create
 * @since 1.0, 2018-03-08 16:41:54
 */
public class AlipayOpenDataItemSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1179692883469317982L;

	/**
	 * 变更事件类型
枚举值
1 展台信息变更
2 首页投放状态变更
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 扩展信息，JSON格式，内容包含可能有:
catagory_code 分类code
area_code 地区code
service_code 服务code
status 状态
audit_time 审核时间
reason 审核反馈
operator 操作人
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部修改key
event_type 加 external_id 全局唯一
展台信息变更时填写展台id
投放信息变更时填写投放id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 变更时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 操作类型
枚举值
ADD 新增
UPDATE 修改
DEL 删除
	 */
	@ApiField("operate_type")
	private String operateType;

    /**
     * Gets event type.
     *
     * @return the event type
     */
    public String getEventType() {
		return this.eventType;
	}

    /**
     * Sets event type.
     *
     * @param eventType the event type
     */
    public void setEventType(String eventType) {
		this.eventType = eventType;
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
     * Gets external id.
     *
     * @return the external id
     */
    public String getExternalId() {
		return this.externalId;
	}

    /**
     * Sets external id.
     *
     * @param externalId the external id
     */
    public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public String getGmtModified() {
		return this.gmtModified;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

    /**
     * Gets operate type.
     *
     * @return the operate type
     */
    public String getOperateType() {
		return this.operateType;
	}

    /**
     * Sets operate type.
     *
     * @param operateType the operate type
     */
    public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
