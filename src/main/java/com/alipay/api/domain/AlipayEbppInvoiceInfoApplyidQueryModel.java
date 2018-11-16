package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据发票申请id查询发票信息
 *
 * @author auto create
 * @since 1.0, 2018-04-13 10:32:51
 */
public class AlipayEbppInvoiceInfoApplyidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4882495232784197542L;

	/**
	 * 申请开票时支付宝返回的申请id，具有全局唯一性。
	 */
	@ApiField("apply_id")
	private String applyId;

    /**
     * Gets apply id.
     *
     * @return the apply id
     */
    public String getApplyId() {
		return this.applyId;
	}

    /**
     * Sets apply id.
     *
     * @param applyId the apply id
     */
    public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

}
