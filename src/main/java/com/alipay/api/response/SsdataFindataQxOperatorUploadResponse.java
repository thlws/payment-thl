package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.findata.qx.operator.upload response.
 *
 * @author auto create
 * @since 1.0, 2017-10-30 20:08:20
 */
public class SsdataFindataQxOperatorUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4893455351753214534L;

	/** 
	 * 系统业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 商户系统的业务流水号
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo( ) {
		return this.bizNo;
	}

    /**
     * Sets org biz no.
     *
     * @param orgBizNo the org biz no
     */
    public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}

    /**
     * Gets org biz no.
     *
     * @return the org biz no
     */
    public String getOrgBizNo( ) {
		return this.orgBizNo;
	}

}
