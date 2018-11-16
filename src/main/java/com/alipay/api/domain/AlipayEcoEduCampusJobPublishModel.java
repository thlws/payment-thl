package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实习生职位刷新接口
 *
 * @author auto create
 * @since 1.0, 2017-06-01 14:55:55
 */
public class AlipayEcoEduCampusJobPublishModel extends AlipayObject {

	private static final long serialVersionUID = 1784535378317993337L;

	/**
	 * 过期时间(毫秒数)
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 刷新时间(毫秒数)
	 */
	@ApiField("gmt_refresh")
	private String gmtRefresh;

	/**
	 * 职位来源方编码
	 */
	@ApiField("source_code")
	private String sourceCode;

	/**
	 * 职位在合作方的ID
	 */
	@ApiField("source_id")
	private String sourceId;

    /**
     * Gets gmt expired.
     *
     * @return the gmt expired
     */
    public String getGmtExpired() {
		return this.gmtExpired;
	}

    /**
     * Sets gmt expired.
     *
     * @param gmtExpired the gmt expired
     */
    public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

    /**
     * Gets gmt refresh.
     *
     * @return the gmt refresh
     */
    public String getGmtRefresh() {
		return this.gmtRefresh;
	}

    /**
     * Sets gmt refresh.
     *
     * @param gmtRefresh the gmt refresh
     */
    public void setGmtRefresh(String gmtRefresh) {
		this.gmtRefresh = gmtRefresh;
	}

    /**
     * Gets source code.
     *
     * @return the source code
     */
    public String getSourceCode() {
		return this.sourceCode;
	}

    /**
     * Sets source code.
     *
     * @param sourceCode the source code
     */
    public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

    /**
     * Gets source id.
     *
     * @return the source id
     */
    public String getSourceId() {
		return this.sourceId;
	}

    /**
     * Sets source id.
     *
     * @param sourceId the source id
     */
    public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
