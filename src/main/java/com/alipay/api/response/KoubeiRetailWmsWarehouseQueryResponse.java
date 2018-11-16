package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WarehouseVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.warehouse.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:17:06
 */
public class KoubeiRetailWmsWarehouseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8114689612658813514L;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 仓库信息
	 */
	@ApiListField("warehouses")
	@ApiField("warehouse_v_o")
	private List<WarehouseVO> warehouses;

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
     * Sets warehouses.
     *
     * @param warehouses the warehouses
     */
    public void setWarehouses(List<WarehouseVO> warehouses) {
		this.warehouses = warehouses;
	}

    /**
     * Gets warehouses.
     *
     * @return the warehouses
     */
    public List<WarehouseVO> getWarehouses( ) {
		return this.warehouses;
	}

}
