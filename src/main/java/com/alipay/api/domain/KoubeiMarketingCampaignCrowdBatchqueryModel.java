package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户人群组列表查询接口
 *
 * @author auto create
 * @since 1.0, 2017-02-15 16:31:23
 */
public class KoubeiMarketingCampaignCrowdBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8512438224483522628L;

	/**
	 * 人群名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 分页页码，从1开始计数,如果不填写默认为1
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 分页大小，每页显示的数目，如果不填写默认为20
	 */
	@ApiField("page_size")
	private String pageSize;

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

    /**
     * Gets page number.
     *
     * @return the page number
     */
    public String getPageNumber() {
		return this.pageNumber;
	}

    /**
     * Sets page number.
     *
     * @param pageNumber the page number
     */
    public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public String getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
