package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板消息行业设置修改接口
 *
 * @author auto create
 * @since 1.0, 2017-10-10 11:14:23
 */
public class AlipayOpenPublicTemplateMessageIndustryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8444833789516433943L;

	/**
	 * 服务窗消息模板所属主行业一/二级编码
	 */
	@ApiField("primary_industry_code")
	private String primaryIndustryCode;

	/**
	 * 服务窗消息模板所属主行业一/二级名称，<a href="https://doc.open.alipay.com/doc2/detail?treeId=197&docType=1&articleId=105043">查看行业信息</a>
	 */
	@ApiField("primary_industry_name")
	private String primaryIndustryName;

	/**
	 * 服务窗消息模板所属副行业一/二级编码
	 */
	@ApiField("secondary_industry_code")
	private String secondaryIndustryCode;

	/**
	 * 服务窗消息模板所属副行业一/二级名称
	 */
	@ApiField("secondary_industry_name")
	private String secondaryIndustryName;

    /**
     * Gets primary industry code.
     *
     * @return the primary industry code
     */
    public String getPrimaryIndustryCode() {
		return this.primaryIndustryCode;
	}

    /**
     * Sets primary industry code.
     *
     * @param primaryIndustryCode the primary industry code
     */
    public void setPrimaryIndustryCode(String primaryIndustryCode) {
		this.primaryIndustryCode = primaryIndustryCode;
	}

    /**
     * Gets primary industry name.
     *
     * @return the primary industry name
     */
    public String getPrimaryIndustryName() {
		return this.primaryIndustryName;
	}

    /**
     * Sets primary industry name.
     *
     * @param primaryIndustryName the primary industry name
     */
    public void setPrimaryIndustryName(String primaryIndustryName) {
		this.primaryIndustryName = primaryIndustryName;
	}

    /**
     * Gets secondary industry code.
     *
     * @return the secondary industry code
     */
    public String getSecondaryIndustryCode() {
		return this.secondaryIndustryCode;
	}

    /**
     * Sets secondary industry code.
     *
     * @param secondaryIndustryCode the secondary industry code
     */
    public void setSecondaryIndustryCode(String secondaryIndustryCode) {
		this.secondaryIndustryCode = secondaryIndustryCode;
	}

    /**
     * Gets secondary industry name.
     *
     * @return the secondary industry name
     */
    public String getSecondaryIndustryName() {
		return this.secondaryIndustryName;
	}

    /**
     * Sets secondary industry name.
     *
     * @param secondaryIndustryName the secondary industry name
     */
    public void setSecondaryIndustryName(String secondaryIndustryName) {
		this.secondaryIndustryName = secondaryIndustryName;
	}

}
