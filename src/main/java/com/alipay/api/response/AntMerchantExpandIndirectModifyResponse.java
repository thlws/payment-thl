package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:05:01
 */
public class AntMerchantExpandIndirectModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7522977873246973815L;

	/** 
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

    /**
     * Sets sub merchant id.
     *
     * @param subMerchantId the sub merchant id
     */
    public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

    /**
     * Gets sub merchant id.
     *
     * @return the sub merchant id
     */
    public String getSubMerchantId( ) {
		return this.subMerchantId;
	}

}
