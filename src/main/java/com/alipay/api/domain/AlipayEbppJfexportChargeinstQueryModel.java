package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询缴费业务输出的出账机构
 *
 * @author auto create
 * @since 1.0, 2017-09-19 12:38:02
 */
public class AlipayEbppJfexportChargeinstQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3159675185636688773L;

	/**
	 * 业务类型英文简称，固定传JF，表示缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 拓展字段，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 第几页，从1开始，默认为1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 是否分页查询，非分页查询时最多返回500条数据。
	 */
	@ApiField("page_query")
	private Boolean pageQuery;

	/**
	 * 每页展示的行数，默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 子业务类型英文简称，ELECTRIC-电费，WATER-水费，GAS-燃气费
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField() {
		return this.extendField;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

    /**
     * Gets page.
     *
     * @return the page
     */
    public Long getPage() {
		return this.page;
	}

    /**
     * Sets page.
     *
     * @param page the page
     */
    public void setPage(Long page) {
		this.page = page;
	}

    /**
     * Gets page query.
     *
     * @return the page query
     */
    public Boolean getPageQuery() {
		return this.pageQuery;
	}

    /**
     * Sets page query.
     *
     * @param pageQuery the page query
     */
    public void setPageQuery(Boolean pageQuery) {
		this.pageQuery = pageQuery;
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
     * Gets sub biz type.
     *
     * @return the sub biz type
     */
    public String getSubBizType() {
		return this.subBizType;
	}

    /**
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
