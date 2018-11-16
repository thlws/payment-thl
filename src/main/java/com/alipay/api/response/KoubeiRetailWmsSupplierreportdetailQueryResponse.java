package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupplierReport;
import com.alipay.api.domain.SupplierReportDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.supplierreportdetail.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:18:11
 */
public class KoubeiRetailWmsSupplierreportdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3515443912654794875L;

	/** 
	 * 盘点单信息
	 */
	@ApiField("supplier_report")
	private SupplierReport supplierReport;

	/** 
	 * 盘点单明细记录
	 */
	@ApiListField("supplier_report_details")
	@ApiField("supplier_report_detail")
	private List<SupplierReportDetail> supplierReportDetails;

    /**
     * Sets supplier report.
     *
     * @param supplierReport the supplier report
     */
    public void setSupplierReport(SupplierReport supplierReport) {
		this.supplierReport = supplierReport;
	}

    /**
     * Gets supplier report.
     *
     * @return the supplier report
     */
    public SupplierReport getSupplierReport( ) {
		return this.supplierReport;
	}

    /**
     * Sets supplier report details.
     *
     * @param supplierReportDetails the supplier report details
     */
    public void setSupplierReportDetails(List<SupplierReportDetail> supplierReportDetails) {
		this.supplierReportDetails = supplierReportDetails;
	}

    /**
     * Gets supplier report details.
     *
     * @return the supplier report details
     */
    public List<SupplierReportDetail> getSupplierReportDetails( ) {
		return this.supplierReportDetails;
	}

}
