package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凭证分页查询列表
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class InsCertificatePaginationList extends AlipayObject {

	private static final long serialVersionUID = 5821364745686378575L;

	/**
	 * 当前页数
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 结果列表
	 */
	@ApiListField("list")
	@ApiField("ins_certificate_api_d_t_o")
	private List<InsCertificateApiDTO> list;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 全部页数
	 */
	@ApiField("total_page_num")
	private Long totalPageNum;

    /**
     * Gets current page.
     *
     * @return the current page
     */
    public Long getCurrentPage() {
		return this.currentPage;
	}

    /**
     * Sets current page.
     *
     * @param currentPage the current page
     */
    public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

    /**
     * Gets list.
     *
     * @return the list
     */
    public List<InsCertificateApiDTO> getList() {
		return this.list;
	}

    /**
     * Sets list.
     *
     * @param list the list
     */
    public void setList(List<InsCertificateApiDTO> list) {
		this.list = list;
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
     * Gets total page num.
     *
     * @return the total page num
     */
    public Long getTotalPageNum() {
		return this.totalPageNum;
	}

    /**
     * Sets total page num.
     *
     * @param totalPageNum the total page num
     */
    public void setTotalPageNum(Long totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

}
