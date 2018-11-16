package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 返回给isv结果，成员为列表类型
 *
 * @author auto create
 * @since 1.0, 2017-06-26 14:14:12
 */
public class TableInfoResult extends AlipayObject {

	private static final long serialVersionUID = 3714446549181616391L;

	/**
	 * 返回TableListResult集合
	 */
	@ApiListField("table_info_list")
	@ApiField("table_list_result")
	private List<TableListResult> tableInfoList;

    /**
     * Gets table info list.
     *
     * @return the table info list
     */
    public List<TableListResult> getTableInfoList() {
		return this.tableInfoList;
	}

    /**
     * Sets table info list.
     *
     * @param tableInfoList the table info list
     */
    public void setTableInfoList(List<TableListResult> tableInfoList) {
		this.tableInfoList = tableInfoList;
	}

}
