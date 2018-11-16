package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险雷达上传监控实体列表接口
 *
 * @author auto create
 * @since 1.0, 2018-03-22 19:33:27
 */
public class ZhimaCreditEpEntityMonitorUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4492159351317533175L;

	/**
	 * 监控实体列表（实体名，实体代码）
	 */
	@ApiField("entity_list")
	private String entityList;

	/**
	 * 监控实体类别
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 监控方案ID,可空
	 */
	@ApiField("solution_id")
	private String solutionId;

	/**
	 * 芝麻商户2688 ID
	 */
	@ApiField("zhima_pid")
	private String zhimaPid;

    /**
     * Gets entity list.
     *
     * @return the entity list
     */
    public String getEntityList() {
		return this.entityList;
	}

    /**
     * Sets entity list.
     *
     * @param entityList the entity list
     */
    public void setEntityList(String entityList) {
		this.entityList = entityList;
	}

    /**
     * Gets entity type.
     *
     * @return the entity type
     */
    public String getEntityType() {
		return this.entityType;
	}

    /**
     * Sets entity type.
     *
     * @param entityType the entity type
     */
    public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

    /**
     * Gets solution id.
     *
     * @return the solution id
     */
    public String getSolutionId() {
		return this.solutionId;
	}

    /**
     * Sets solution id.
     *
     * @param solutionId the solution id
     */
    public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

    /**
     * Gets zhima pid.
     *
     * @return the zhima pid
     */
    public String getZhimaPid() {
		return this.zhimaPid;
	}

    /**
     * Sets zhima pid.
     *
     * @param zhimaPid the zhima pid
     */
    public void setZhimaPid(String zhimaPid) {
		this.zhimaPid = zhimaPid;
	}

}
