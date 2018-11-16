package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约返点比率查询接口
 *
 * @author auto create
 * @since 1.0, 2016-09-09 20:38:21
 */
public class AntProdpaasArrangementRebateRateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7816542271364882771L;

	/**
	 * 数据项名称
	 */
	@ApiField("data_item_name")
	private String dataItemName;

	/**
	 * 一级类目ID
	 */
	@ApiField("first_category_id")
	private String firstCategoryId;

	/**
	 * 查询时间
	 */
	@ApiField("gmt_query")
	private String gmtQuery;

    /**
     * Gets data item name.
     *
     * @return the data item name
     */
    public String getDataItemName() {
		return this.dataItemName;
	}

    /**
     * Sets data item name.
     *
     * @param dataItemName the data item name
     */
    public void setDataItemName(String dataItemName) {
		this.dataItemName = dataItemName;
	}

    /**
     * Gets first category id.
     *
     * @return the first category id
     */
    public String getFirstCategoryId() {
		return this.firstCategoryId;
	}

    /**
     * Sets first category id.
     *
     * @param firstCategoryId the first category id
     */
    public void setFirstCategoryId(String firstCategoryId) {
		this.firstCategoryId = firstCategoryId;
	}

    /**
     * Gets gmt query.
     *
     * @return the gmt query
     */
    public String getGmtQuery() {
		return this.gmtQuery;
	}

    /**
     * Sets gmt query.
     *
     * @param gmtQuery the gmt query
     */
    public void setGmtQuery(String gmtQuery) {
		this.gmtQuery = gmtQuery;
	}

}
