package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报表行对象
 *
 * @author auto create
 * @since 1.0, 2016-10-28 10:26:15
 */
public class AlisisReportRow extends AlipayObject {

	private static final long serialVersionUID = 2219452299584316459L;

	/**
	 * 报表行信息，每个对象是一列的数据
	 */
	@ApiListField("row_data")
	@ApiField("alisis_report_column")
	private List<AlisisReportColumn> rowData;

    /**
     * Gets row data.
     *
     * @return the row data
     */
    public List<AlisisReportColumn> getRowData() {
		return this.rowData;
	}

    /**
     * Sets row data.
     *
     * @param rowData the row data
     */
    public void setRowData(List<AlisisReportColumn> rowData) {
		this.rowData = rowData;
	}

}
