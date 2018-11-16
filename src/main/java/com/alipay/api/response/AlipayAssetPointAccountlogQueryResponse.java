package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PointAccountLog;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.accountlog.query response.
 *
 * @author auto create
 * @since 1.0, 2016-05-25 12:03:12
 */
public class AlipayAssetPointAccountlogQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4728781224758933729L;

	/** 
	 * 当前页数
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 集分宝账户流水详情列表
	 */
	@ApiListField("point_account_logs")
	@ApiField("point_account_log")
	private List<PointAccountLog> pointAccountLogs;

	/** 
	 * 集分宝流水总条数,返回满足条件的集分宝流水的总条数。
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页数，根据totalcount和pagesize计算出来
	 */
	@ApiField("total_pages")
	private Long totalPages;

    /**
     * Sets current page.
     *
     * @param currentPage the current page
     */
    public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

    /**
     * Gets current page.
     *
     * @return the current page
     */
    public Long getCurrentPage( ) {
		return this.currentPage;
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
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize( ) {
		return this.pageSize;
	}

    /**
     * Sets point account logs.
     *
     * @param pointAccountLogs the point account logs
     */
    public void setPointAccountLogs(List<PointAccountLog> pointAccountLogs) {
		this.pointAccountLogs = pointAccountLogs;
	}

    /**
     * Gets point account logs.
     *
     * @return the point account logs
     */
    public List<PointAccountLog> getPointAccountLogs( ) {
		return this.pointAccountLogs;
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
     * Gets total count.
     *
     * @return the total count
     */
    public Long getTotalCount( ) {
		return this.totalCount;
	}

    /**
     * Sets total pages.
     *
     * @param totalPages the total pages
     */
    public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}

    /**
     * Gets total pages.
     *
     * @return the total pages
     */
    public Long getTotalPages( ) {
		return this.totalPages;
	}

}
