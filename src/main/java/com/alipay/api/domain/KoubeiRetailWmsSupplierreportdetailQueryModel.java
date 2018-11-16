package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供货商通知单详情
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:18:11
 */
public class KoubeiRetailWmsSupplierreportdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7638957785475733662L;

	/**
	 * 供货商盘点单id
	 */
	@ApiField("supplier_report_id")
	private String supplierReportId;

    /**
     * Gets supplier report id.
     *
     * @return the supplier report id
     */
    public String getSupplierReportId() {
		return this.supplierReportId;
	}

    /**
     * Sets supplier report id.
     *
     * @param supplierReportId the supplier report id
     */
    public void setSupplierReportId(String supplierReportId) {
		this.supplierReportId = supplierReportId;
	}

}
