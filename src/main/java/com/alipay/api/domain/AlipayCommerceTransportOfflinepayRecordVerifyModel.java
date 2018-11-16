package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝脱机操作信息验证
 *
 * @author auto create
 * @since 1.0, 2016-07-01 22:05:47
 */
public class AlipayCommerceTransportOfflinepayRecordVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 2544117581476678649L;

	/**
	 * 原始脱机记录信息
	 */
	@ApiField("record")
	private String record;

    /**
     * Gets record.
     *
     * @return the record
     */
    public String getRecord() {
		return this.record;
	}

    /**
     * Sets record.
     *
     * @param record the record
     */
    public void setRecord(String record) {
		this.record = record;
	}

}
