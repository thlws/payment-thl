package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安全库存批量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-09-17 09:54:10
 */
public class KoubeiRetailWmsGoodssafetyinventoryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8458139627384487264L;

	/**
	 * 货品编码，限制最大查询数量1000
	 */
	@ApiListField("goods_codes")
	@ApiField("string")
	private List<String> goodsCodes;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

    /**
     * Gets goods codes.
     *
     * @return the goods codes
     */
    public List<String> getGoodsCodes() {
		return this.goodsCodes;
	}

    /**
     * Sets goods codes.
     *
     * @param goodsCodes the goods codes
     */
    public void setGoodsCodes(List<String> goodsCodes) {
		this.goodsCodes = goodsCodes;
	}

    /**
     * Gets warehouse code.
     *
     * @return the warehouse code
     */
    public String getWarehouseCode() {
		return this.warehouseCode;
	}

    /**
     * Sets warehouse code.
     *
     * @param warehouseCode the warehouse code
     */
    public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
