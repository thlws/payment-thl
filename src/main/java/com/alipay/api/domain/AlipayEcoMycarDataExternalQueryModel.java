package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业平台外部查询请求
 *
 * @author auto create
 * @since 1.0, 2018-03-06 20:18:29
 */
public class AlipayEcoMycarDataExternalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5779522811491644773L;

	/**
	 * external_system_name
	 */
	@ApiField("external_system_name")
	private String externalSystemName;

	/**
	 * is_transfer_uid
	 */
	@ApiField("is_transfer_uid")
	private Boolean isTransferUid;

	/**
	 * operate_type
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * query_condition
	 */
	@ApiField("query_condition")
	private String queryCondition;

    /**
     * Gets external system name.
     *
     * @return the external system name
     */
    public String getExternalSystemName() {
		return this.externalSystemName;
	}

    /**
     * Sets external system name.
     *
     * @param externalSystemName the external system name
     */
    public void setExternalSystemName(String externalSystemName) {
		this.externalSystemName = externalSystemName;
	}

    /**
     * Gets is transfer uid.
     *
     * @return the is transfer uid
     */
    public Boolean getIsTransferUid() {
		return this.isTransferUid;
	}

    /**
     * Sets is transfer uid.
     *
     * @param isTransferUid the is transfer uid
     */
    public void setIsTransferUid(Boolean isTransferUid) {
		this.isTransferUid = isTransferUid;
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

    /**
     * Gets query condition.
     *
     * @return the query condition
     */
    public String getQueryCondition() {
		return this.queryCondition;
	}

    /**
     * Sets query condition.
     *
     * @param queryCondition the query condition
     */
    public void setQueryCondition(String queryCondition) {
		this.queryCondition = queryCondition;
	}

}
