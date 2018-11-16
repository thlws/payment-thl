package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupplierReport;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.supplierreport.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:18:22
 */
public class KoubeiRetailWmsSupplierreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8339214598484518545L;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 盘点单列表
	 */
	@ApiListField("supplier_report_list")
	@ApiField("supplier_report")
	private List<SupplierReport> supplierReportList;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public Long getPageNo( ) {
		return this.pageNo;
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
     * Sets supplier report list.
     *
     * @param supplierReportList the supplier report list
     */
    public void setSupplierReportList(List<SupplierReport> supplierReportList) {
		this.supplierReportList = supplierReportList;
	}

    /**
     * Gets supplier report list.
     *
     * @return the supplier report list
     */
    public List<SupplierReport> getSupplierReportList( ) {
		return this.supplierReportList;
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

}
