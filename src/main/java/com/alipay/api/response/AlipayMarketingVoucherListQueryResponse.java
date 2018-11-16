package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherLiteInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.list.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMarketingVoucherListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6817187654171231246L;

	/** 
	 * 券列表，一定不为null，但是size可以为0
	 */
	@ApiListField("vouchers")
	@ApiField("voucher_lite_info")
	private List<VoucherLiteInfo> vouchers;

    /**
     * Sets vouchers.
     *
     * @param vouchers the vouchers
     */
    public void setVouchers(List<VoucherLiteInfo> vouchers) {
		this.vouchers = vouchers;
	}

    /**
     * Gets vouchers.
     *
     * @return the vouchers
     */
    public List<VoucherLiteInfo> getVouchers( ) {
		return this.vouchers;
	}

}
