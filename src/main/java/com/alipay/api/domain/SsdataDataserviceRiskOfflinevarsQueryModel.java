package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 离线变量查询
 *
 * @author auto create
 * @since 1.0, 2017-11-30 15:43:39
 */
public class SsdataDataserviceRiskOfflinevarsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7345412817294647864L;

	/**
	 * 查询离线变量的主键
	 */
	@ApiField("rowkeys")
	private String rowkeys;

    /**
     * Gets rowkeys.
     *
     * @return the rowkeys
     */
    public String getRowkeys() {
		return this.rowkeys;
	}

    /**
     * Sets rowkeys.
     *
     * @param rowkeys the rowkeys
     */
    public void setRowkeys(String rowkeys) {
		this.rowkeys = rowkeys;
	}

}
