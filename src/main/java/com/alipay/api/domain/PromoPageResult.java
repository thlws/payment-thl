package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询后的结果
 *
 * @author auto create
 * @since 1.0, 2017-10-12 10:54:23
 */
public class PromoPageResult extends AlipayObject {

	private static final long serialVersionUID = 1383125869854588569L;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页多少条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 总共有多少页
	 */
	@ApiField("total_pages")
	private Long totalPages;

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
     * Gets total count.
     *
     * @return the total count
     */
    public Long getTotalCount() {
		return this.totalCount;
	}

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total pages.
     *
     * @return the total pages
     */
    public Long getTotalPages() {
		return this.totalPages;
	}

    /**
     * Sets total pages.
     *
     * @param totalPages the total pages
     */
    public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}

}
