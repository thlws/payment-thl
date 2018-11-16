package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AntlbsKBDiscountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.lbs.discount.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2017-11-03 16:59:45
 */
public class AlipayDataDataserviceLbsDiscountBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5377614744643495429L;

	/** 
	 * 广告投放出去的商品信息
	 */
	@ApiListField("discounts")
	@ApiField("antlbs_k_b_discount_info")
	private List<AntlbsKBDiscountInfo> discounts;

    /**
     * Sets discounts.
     *
     * @param discounts the discounts
     */
    public void setDiscounts(List<AntlbsKBDiscountInfo> discounts) {
		this.discounts = discounts;
	}

    /**
     * Gets discounts.
     *
     * @return the discounts
     */
    public List<AntlbsKBDiscountInfo> getDiscounts( ) {
		return this.discounts;
	}

}
