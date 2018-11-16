package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取数据反馈模板
 *
 * @author auto create
 * @since 1.0, 2017-02-16 15:46:19
 */
public class ZhimaDataFeedbackurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7179263715313768532L;

	/**
	 * 在支付宝商户版注册支付宝账号id
	 */
	@ApiField("merchant_id")
	private String merchantId;

    /**
     * Gets merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId() {
		return this.merchantId;
	}

    /**
     * Sets merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
