package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建工单
 *
 * @author auto create
 * @since 1.0, 2018-03-30 19:52:12
 */
public class AlipayIserviceItaskProcessDetailCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3158488548275684476L;

	/**
	 * 接口服务端名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 附件地址
	 */
	@ApiField("attachment")
	private String attachment;

	/**
	 * 接口客户端名称
	 */
	@ApiField("exapp_name")
	private String exappName;

	/**
	 * 外部工单创建人ID
	 */
	@ApiField("excreator_id")
	private String excreatorId;

	/**
	 * 外部工单创建人名称
	 */
	@ApiField("excreator_name")
	private String excreatorName;

	/**
	 * 外部工单创建人部门ID
	 */
	@ApiField("exsystem_department_id")
	private String exsystemDepartmentId;

	/**
	 * BU名称（xspace填写对应的租户名称）
	 */
	@ApiField("exsystem_department_name")
	private String exsystemDepartmentName;

	/**
	 * 外部工单业务扩展字段列表，业务属性信息都放置在此字段。最多10个字段。
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
	 * 工单流程编号_服务端提供给消费端流程模板code
	 */
	@ApiField("process_template_code")
	private String processTemplateCode;

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
     * Gets excreator id.
     *
     * @return the excreator id
     */
    public String getExcreatorId() {
		return this.excreatorId;
	}

    /**
     * Sets excreator id.
     *
     * @param excreatorId the excreator id
     */
    public void setExcreatorId(String excreatorId) {
		this.excreatorId = excreatorId;
	}

    /**
     * Gets excreator name.
     *
     * @return the excreator name
     */
    public String getExcreatorName() {
		return this.excreatorName;
	}

    /**
     * Sets excreator name.
     *
     * @param excreatorName the excreator name
     */
    public void setExcreatorName(String excreatorName) {
		this.excreatorName = excreatorName;
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

}
