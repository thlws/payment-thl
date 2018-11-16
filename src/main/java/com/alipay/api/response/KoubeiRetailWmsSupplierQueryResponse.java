package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupplierVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.supplier.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:17:15
 */
public class KoubeiRetailWmsSupplierQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6695879781359417799L;

	/** 
	 * 供应商信息
	 */
	@ApiListField("suppliers")
	@ApiField("supplier_v_o")
	private List<SupplierVO> suppliers;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

    /**
     * Sets suppliers.
     *
     * @param suppliers the suppliers
     */
    public void setSuppliers(List<SupplierVO> suppliers) {
		this.suppliers = suppliers;
	}

    /**
     * Gets suppliers.
     *
     * @return the suppliers
     */
    public List<SupplierVO> getSuppliers( ) {
		return this.suppliers;
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
