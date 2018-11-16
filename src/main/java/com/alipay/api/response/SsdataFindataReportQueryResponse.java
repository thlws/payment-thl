package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.findata.report.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-16 19:30:59
 */
public class SsdataFindataReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5441113255642583825L;

	/** 
	 * 查询的报告
	 */
	@ApiField("biz_content")
	private String bizContent;

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
     * Sets biz content.
     *
     * @param bizContent the biz content
     */
    public void setBizContent(String bizContent) {
		this.bizContent = bizContent;
	}

    /**
     * Gets biz content.
     *
     * @return the biz content
     */
    public String getBizContent( ) {
		return this.bizContent;
	}

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
