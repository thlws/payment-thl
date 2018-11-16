package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品维度库存批量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:30:33
 */
public class KoubeiRetailWmsInventoryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6253244449474538367L;

	/**
	 * 货品编码列表
	 */
	@ApiListField("goods_code_list")
	@ApiField("string")
	private List<String> goodsCodeList;

	/**
	 * 货品类型：ZP("正品"), CC("残次"), JS("机损"),  XS("箱损"),ZT("在途库存")
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

    /**
     * Gets goods code list.
     *
     * @return the goods code list
     */
    public List<String> getGoodsCodeList() {
		return this.goodsCodeList;
	}

    /**
     * Sets goods code list.
     *
     * @param goodsCodeList the goods code list
     */
    public void setGoodsCodeList(List<String> goodsCodeList) {
		this.goodsCodeList = goodsCodeList;
	}

    /**
     * Gets inventory type.
     *
     * @return the inventory type
     */
    public String getInventoryType() {
		return this.inventoryType;
	}

    /**
     * Sets inventory type.
     *
     * @param inventoryType the inventory type
     */
    public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

    /**
     * Gets operate context.
     *
     * @return the operate context
     */
    public OperateContext getOperateContext() {
		return this.operateContext;
	}

    /**
     * Sets operate context.
     *
     * @param operateContext the operate context
     */
    public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
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
