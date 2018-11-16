package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取云凤蝶空间可用模板列表
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:17:06
 */
public class AlipayMarketingToolFengdieTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1484828998219254273L;

	/**
	 * 作为当前操作者的空间成员用户名， 值为 origin_user_id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 当前页数，默认为1
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 每页记录数，不能超过50，默认为10
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 欲查询的空间 ID
	 */
	@ApiField("space_id")
	private String spaceId;

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
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
     * Gets space id.
     *
     * @return the space id
     */
    public String getSpaceId() {
		return this.spaceId;
	}

    /**
     * Sets space id.
     *
     * @param spaceId the space id
     */
    public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

}
