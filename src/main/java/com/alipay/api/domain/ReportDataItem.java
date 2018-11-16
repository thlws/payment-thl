package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报表数据信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ReportDataItem extends AlipayObject {

	private static final long serialVersionUID = 3836656969535912336L;

	/**
	 * 表示一行数据，每个对象是一列的数据
	 */
	@ApiField("row_data")
	private String rowData;

    /**
     * Gets row data.
     *
     * @return the row data
     */
    public String getRowData() {
		return this.rowData;
	}

    /**
     * Sets row data.
     *
     * @param rowData the row data
     */
    public void setRowData(String rowData) {
		this.rowData = rowData;
	}

}
