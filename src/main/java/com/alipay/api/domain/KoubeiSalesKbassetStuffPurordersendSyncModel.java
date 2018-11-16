package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 采购单发货通知接口
 *
 * @author auto create
 * @since 1.0, 2017-11-21 17:40:07
 */
public class KoubeiSalesKbassetStuffPurordersendSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3689866425381832231L;

	/**
	 * 供应商同步的发货信息及物流信息记录（最多100条）
	 */
	@ApiListField("purchase_order_sends")
	@ApiField("access_purchase_order_send")
	private List<AccessPurchaseOrderSend> purchaseOrderSends;

    /**
     * Gets purchase order sends.
     *
     * @return the purchase order sends
     */
    public List<AccessPurchaseOrderSend> getPurchaseOrderSends() {
		return this.purchaseOrderSends;
	}

    /**
     * Sets purchase order sends.
     *
     * @param purchaseOrderSends the purchase order sends
     */
    public void setPurchaseOrderSends(List<AccessPurchaseOrderSend> purchaseOrderSends) {
		this.purchaseOrderSends = purchaseOrderSends;
	}

}
