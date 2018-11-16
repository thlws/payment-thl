package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部工单完结同步接口
 *
 * @author auto create
 * @since 1.0, 2018-09-14 20:33:46
 */
public class AlipayIserviceItaskProcessDetailSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5619352869769546157L;

	/**
	 * 需要同步的蚂蚁域内的具体工单平台
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 接口客户端名称
	 */
	@ApiField("exapp_name")
	private String exappName;

	/**
	 * 外部系统工单处理同学id
	 */
	@ApiField("exsystem_operator_id")
	private String exsystemOperatorId;

	/**
	 * 外部系统对工单进行处理的人员名称
	 */
	@ApiField("exsystem_operator_name")
	private String exsystemOperatorName;

	/**
	 * 外部系统的工单id
	 */
	@ApiField("exsystem_ticket_id")
	private String exsystemTicketId;

	/**
	 * 外部系统的工单状态，枚举值，目前只有一个值: COMPLETED。
如果传空，默认为 COMPLETED 。
	 */
	@ApiField("exsystem_ticket_state")
	private String exsystemTicketState;

	/**
	 * 外部工单业务扩展字段列表，业务属性信息都放置在此字段。
	 */
	@ApiListField("extend_field_infos")
	@ApiField("extend_field_info")
	private List<ExtendFieldInfo> extendFieldInfos;

    /**
     * Gets app name.
     *
     * @return the app name
     */
    public String getAppName() {
		return this.appName;
	}

    /**
     * Sets app name.
     *
     * @param appName the app name
     */
    public void setAppName(String appName) {
		this.appName = appName;
	}

    /**
     * Gets exapp name.
     *
     * @return the exapp name
     */
    public String getExappName() {
		return this.exappName;
	}

    /**
     * Sets exapp name.
     *
     * @param exappName the exapp name
     */
    public void setExappName(String exappName) {
		this.exappName = exappName;
	}

    /**
     * Gets exsystem operator id.
     *
     * @return the exsystem operator id
     */
    public String getExsystemOperatorId() {
		return this.exsystemOperatorId;
	}

    /**
     * Sets exsystem operator id.
     *
     * @param exsystemOperatorId the exsystem operator id
     */
    public void setExsystemOperatorId(String exsystemOperatorId) {
		this.exsystemOperatorId = exsystemOperatorId;
	}

    /**
     * Gets exsystem operator name.
     *
     * @return the exsystem operator name
     */
    public String getExsystemOperatorName() {
		return this.exsystemOperatorName;
	}

    /**
     * Sets exsystem operator name.
     *
     * @param exsystemOperatorName the exsystem operator name
     */
    public void setExsystemOperatorName(String exsystemOperatorName) {
		this.exsystemOperatorName = exsystemOperatorName;
	}

    /**
     * Gets exsystem ticket id.
     *
     * @return the exsystem ticket id
     */
    public String getExsystemTicketId() {
		return this.exsystemTicketId;
	}

    /**
     * Sets exsystem ticket id.
     *
     * @param exsystemTicketId the exsystem ticket id
     */
    public void setExsystemTicketId(String exsystemTicketId) {
		this.exsystemTicketId = exsystemTicketId;
	}

    /**
     * Gets exsystem ticket state.
     *
     * @return the exsystem ticket state
     */
    public String getExsystemTicketState() {
		return this.exsystemTicketState;
	}

    /**
     * Sets exsystem ticket state.
     *
     * @param exsystemTicketState the exsystem ticket state
     */
    public void setExsystemTicketState(String exsystemTicketState) {
		this.exsystemTicketState = exsystemTicketState;
	}

    /**
     * Gets extend field infos.
     *
     * @return the extend field infos
     */
    public List<ExtendFieldInfo> getExtendFieldInfos() {
		return this.extendFieldInfos;
	}

    /**
     * Sets extend field infos.
     *
     * @param extendFieldInfos the extend field infos
     */
    public void setExtendFieldInfos(List<ExtendFieldInfo> extendFieldInfos) {
		this.extendFieldInfos = extendFieldInfos;
	}

}
