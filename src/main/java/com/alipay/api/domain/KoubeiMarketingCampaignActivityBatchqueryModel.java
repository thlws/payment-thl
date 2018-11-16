package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑营销活动列表查询
 *
 * @author auto create
 * @since 1.0, 2017-09-29 18:12:38
 */
public class KoubeiMarketingCampaignActivityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4127716524964942688L;

	/**
	 * 操作人id，必须和operator_type配对存在，不填时默认是商户
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 页码，默认为1
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 页大小，默认为20
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 查询条件
	 */
	@ApiListField("query_criterias")
	@ApiField("condition")
	private List<Condition> queryCriterias;

    /**
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId() {
		return this.operatorId;
	}

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

    /**
     * Gets operator type.
     *
     * @return the operator type
     */
    public String getOperatorType() {
		return this.operatorType;
	}

    /**
     * Sets operator type.
     *
     * @param operatorType the operator type
     */
    public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

    /**
     * Gets page number.
     *
     * @return the page number
     */
    public String getPageNumber() {
		return this.pageNumber;
	}

    /**
     * Sets page number.
     *
     * @param pageNumber the page number
     */
    public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public String getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets query criterias.
     *
     * @return the query criterias
     */
    public List<Condition> getQueryCriterias() {
		return this.queryCriterias;
	}

    /**
     * Sets query criterias.
     *
     * @param queryCriterias the query criterias
     */
    public void setQueryCriterias(List<Condition> queryCriterias) {
		this.queryCriterias = queryCriterias;
	}

}
