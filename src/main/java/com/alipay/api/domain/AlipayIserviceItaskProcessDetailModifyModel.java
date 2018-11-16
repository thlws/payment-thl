package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 工单推进接口
 *
 * @author auto create
 * @since 1.0, 2018-03-30 19:52:29
 */
public class AlipayIserviceItaskProcessDetailModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4835673374626481157L;

	/**
	 * 工单平台名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 工单附件的存储地址
	 */
	@ApiField("attachment")
	private String attachment;

	/**
	 * 接口客户端名称
	 */
	@ApiField("exapp_name")
	private String exappName;

	/**
	 * 外部系统对工单进行处理的人员所在部门ID。
	 */
	@ApiField("exsystem_department_id")
	private String exsystemDepartmentId;

	/**
	 * BU名称（XSPACE填写对应租户名称）
	 */
	@ApiField("exsystem_department_name")
	private String exsystemDepartmentName;

	/**
	 * 外部系统对工单的处理动作。前期与外部系统沟通后，提供给外部系统。枚举（agree，reject）
	 */
	@ApiField("exsystem_operate")
	private String exsystemOperate;

	/**
	 * 外部系统对工单进行处理的备注信息
	 */
	@ApiField("exsystem_operator_comment")
	private String exsystemOperatorComment;

	/**
	 * 外部系统对工单进行处理的人员ID。
	 */
	@ApiField("exsystem_operator_id")
	private String exsystemOperatorId;

	/**
	 * 外部系统对工单进行处理的人员名称。
	 */
	@ApiField("exsystem_operator_name")
	private String exsystemOperatorName;

	/**
	 * 外部工单业务扩展字段，业务属性信息都放置在此字段。最大10个字段。
	 */
	@ApiListField("extend_field_infos")
	@ApiField("extend_field_info")
	private List<ExtendFieldInfo> extendFieldInfos;

	/**
	 * 工单流程编号
	 */
	@ApiField("process_no")
	private String processNo;

	/**
	 * 工单流程编码_服务端提供给消费端流程模板code
	 */
	@ApiField("process_template_code")
	private String processTemplateCode;

	/**
	 * 工单信息唯一标识ID，简写为puid。为app_name、process_no和alipay_process_id共同组合而成，供工单推进接口使用。
	 */
	@ApiField("process_unique_id")
	private String processUniqueId;

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
     * Gets attachment.
     *
     * @return the attachment
     */
    public String getAttachment() {
		return this.attachment;
	}

    /**
     * Sets attachment.
     *
     * @param attachment the attachment
     */
    public void setAttachment(String attachment) {
		this.attachment = attachment;
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
     * Gets exsystem department id.
     *
     * @return the exsystem department id
     */
    public String getExsystemDepartmentId() {
		return this.exsystemDepartmentId;
	}

    /**
     * Sets exsystem department id.
     *
     * @param exsystemDepartmentId the exsystem department id
     */
    public void setExsystemDepartmentId(String exsystemDepartmentId) {
		this.exsystemDepartmentId = exsystemDepartmentId;
	}

    /**
     * Gets exsystem department name.
     *
     * @return the exsystem department name
     */
    public String getExsystemDepartmentName() {
		return this.exsystemDepartmentName;
	}

    /**
     * Sets exsystem department name.
     *
     * @param exsystemDepartmentName the exsystem department name
     */
    public void setExsystemDepartmentName(String exsystemDepartmentName) {
		this.exsystemDepartmentName = exsystemDepartmentName;
	}

    /**
     * Gets exsystem operate.
     *
     * @return the exsystem operate
     */
    public String getExsystemOperate() {
		return this.exsystemOperate;
	}

    /**
     * Sets exsystem operate.
     *
     * @param exsystemOperate the exsystem operate
     */
    public void setExsystemOperate(String exsystemOperate) {
		this.exsystemOperate = exsystemOperate;
	}

    /**
     * Gets exsystem operator comment.
     *
     * @return the exsystem operator comment
     */
    public String getExsystemOperatorComment() {
		return this.exsystemOperatorComment;
	}

    /**
     * Sets exsystem operator comment.
     *
     * @param exsystemOperatorComment the exsystem operator comment
     */
    public void setExsystemOperatorComment(String exsystemOperatorComment) {
		this.exsystemOperatorComment = exsystemOperatorComment;
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

    /**
     * Gets process no.
     *
     * @return the process no
     */
    public String getProcessNo() {
		return this.processNo;
	}

    /**
     * Sets process no.
     *
     * @param processNo the process no
     */
    public void setProcessNo(String processNo) {
		this.processNo = processNo;
	}

    /**
     * Gets process template code.
     *
     * @return the process template code
     */
    public String getProcessTemplateCode() {
		return this.processTemplateCode;
	}

    /**
     * Sets process template code.
     *
     * @param processTemplateCode the process template code
     */
    public void setProcessTemplateCode(String processTemplateCode) {
		this.processTemplateCode = processTemplateCode;
	}

    /**
     * Gets process unique id.
     *
     * @return the process unique id
     */
    public String getProcessUniqueId() {
		return this.processUniqueId;
	}

    /**
     * Sets process unique id.
     *
     * @param processUniqueId the process unique id
     */
    public void setProcessUniqueId(String processUniqueId) {
		this.processUniqueId = processUniqueId;
	}

}
