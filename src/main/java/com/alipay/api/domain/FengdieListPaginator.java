package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凤蝶分页数据模型
 *
 * @author auto create
 * @since 1.0, 2018-05-17 16:01:04
 */
public class FengdieListPaginator extends AlipayObject {

	private static final long serialVersionUID = 6865717183182449545L;

	/**
	 * 总页数
	 */
	@ApiField("page_count")
	private Long pageCount;

	/**
	 * 当前页码
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 每页显示记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 符合条件的记录总数
	 */
	@ApiField("total")
	private Long total;

    /**
     * Gets page count.
     *
     * @return the page count
     */
    public Long getPageCount() {
		return this.pageCount;
	}

    /**
     * Sets page count.
     *
     * @param pageCount the page count
     */
    public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

    /**
     * Gets page number.
     *
     * @return the page number
     */
    public Long getPageNumber() {
		return this.pageNumber;
	}

    /**
     * Sets page number.
     *
     * @param pageNumber the page number
     */
    public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
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
     * Gets total.
     *
     * @return the total
     */
    public Long getTotal() {
		return this.total;
	}

    /**
     * Sets total.
     *
     * @param total the total
     */
    public void setTotal(Long total) {
		this.total = total;
	}

}
