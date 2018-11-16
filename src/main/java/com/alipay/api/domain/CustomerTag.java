package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据资产平台 Get Customer Tags 对云数据实验室提供的结果
 *
 * @author auto create
 * @since 1.0, 2015-10-14 16:38:58
 */
public class CustomerTag extends AlipayObject {

	private static final long serialVersionUID = 3218361722175862411L;

	/**
	 * 字段名称
	 */
	@ApiField("col_name")
	private String colName;

	/**
	 * column_type字段类型
	 */
	@ApiField("column_type")
	private String columnType;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 标签名
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets col name.
     *
     * @return the col name
     */
    public String getColName() {
		return this.colName;
	}

    /**
     * Sets col name.
     *
     * @param colName the col name
     */
    public void setColName(String colName) {
		this.colName = colName;
	}

    /**
     * Gets column type.
     *
     * @return the column type
     */
    public String getColumnType() {
		return this.columnType;
	}

    /**
     * Sets column type.
     *
     * @param columnType the column type
     */
    public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

}
