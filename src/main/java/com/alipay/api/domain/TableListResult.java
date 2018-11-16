package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 桌名桌号返回结果类，桌号，桌名为成员
 *
 * @author auto create
 * @since 1.0, 2017-06-26 14:14:11
 */
public class TableListResult extends AlipayObject {

	private static final long serialVersionUID = 2315125476323844788L;

	/**
	 * 桌名
	 */
	@ApiField("table_name")
	private String tableName;

	/**
	 * 桌号
	 */
	@ApiField("table_num")
	private String tableNum;

    /**
     * Gets table name.
     *
     * @return the table name
     */
    public String getTableName() {
		return this.tableName;
	}

    /**
     * Sets table name.
     *
     * @param tableName the table name
     */
    public void setTableName(String tableName) {
		this.tableName = tableName;
	}

    /**
     * Gets table num.
     *
     * @return the table num
     */
    public String getTableNum() {
		return this.tableNum;
	}

    /**
     * Sets table num.
     *
     * @param tableNum the table num
     */
    public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}

}
