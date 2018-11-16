package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询使用ISV模板的托管小程序列表
 *
 * @author auto create
 * @since 1.0, 2018-01-24 23:51:50
 */
public class AlipayOpenMiniTemplateUsageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1887216438558489634L;

	/**
	 * 查询的页数，默认第一页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页的数量，最多查询50个，默认查询10个
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板小程序的版本号
	 */
	@ApiField("template_version")
	private String templateVersion;

    /**
     * Gets page num.
     *
     * @return the page num
     */
    public Long getPageNum() {
		return this.pageNum;
	}

    /**
     * Sets page num.
     *
     * @param pageNum the page num
     */
    public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

    /**
     * Gets template version.
     *
     * @return the template version
     */
    public String getTemplateVersion() {
		return this.templateVersion;
	}

    /**
     * Sets template version.
     *
     * @param templateVersion the template version
     */
    public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

}
