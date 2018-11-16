package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡券模板查询
 *
 * @author auto create
 * @since 1.0, 2018-02-01 00:36:35
 */
public class AlipayMarketingPassTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7166797765421594798L;

	/**
	 * 页码，必须为大于0的整数， 1表示第一页，2表示第2页；
不填则默认为1，查第1页数据。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录条数，必须为大于0的整数，最大值为20；
不填则默认20。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 模板ID（编号），创建模板接口返回的模板ID
	 */
	@ApiField("tpl_id")
	private String tplId;

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
     * Gets tpl id.
     *
     * @return the tpl id
     */
    public String getTplId() {
		return this.tplId;
	}

    /**
     * Sets tpl id.
     *
     * @param tplId the tpl id
     */
    public void setTplId(String tplId) {
		this.tplId = tplId;
	}

}
