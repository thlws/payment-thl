package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询报告
 *
 * @author auto create
 * @since 1.0, 2017-11-16 19:30:59
 */
public class SsdataFindataReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5624833721145573667L;

	/**
	 * 商户在调用产品的第一个接口时系统返回的业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo() {
		return this.bizNo;
	}

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
