package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑零售供应商信息查询
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:17:15
 */
public class KoubeiRetailWmsSupplierQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7686553846259531715L;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 供应商ID，限制批量查询100个ID
	 */
	@ApiListField("supplier_ids")
	@ApiField("string")
	private List<String> supplierIds;

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
     * Gets supplier ids.
     *
     * @return the supplier ids
     */
    public List<String> getSupplierIds() {
		return this.supplierIds;
	}

    /**
     * Sets supplier ids.
     *
     * @param supplierIds the supplier ids
     */
    public void setSupplierIds(List<String> supplierIds) {
		this.supplierIds = supplierIds;
	}

}
