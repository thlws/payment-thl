package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 错误上报的特征字段
 *
 * @author auto create
 * @since 1.0, 2017-07-03 14:41:37
 */
public class ReportErrorFeature extends AlipayObject {

	private static final long serialVersionUID = 8187463899342553298L;

	/**
	 * 桌号
	 */
	@ApiField("table_num")
	private String tableNum;

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
