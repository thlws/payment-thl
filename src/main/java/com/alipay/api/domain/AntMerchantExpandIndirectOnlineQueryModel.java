package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线上间连商户信息查询
 *
 * @author auto create
 * @since 1.0, 2017-09-25 10:07:42
 */
public class AntMerchantExpandIndirectOnlineQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4898841279584445264L;

	/**
	 * 受理商户在受理机构下的唯一标识，与sub_merchant_id二选一必传
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号，与external_id二选一必传
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

    /**
     * Gets external id.
     *
     * @return the external id
     */
    public String getExternalId() {
		return this.externalId;
	}

    /**
     * Sets external id.
     *
     * @param externalId the external id
     */
    public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

    /**
     * Gets sub merchant id.
     *
     * @return the sub merchant id
     */
    public String getSubMerchantId() {
		return this.subMerchantId;
	}

    /**
     * Sets sub merchant id.
     *
     * @param subMerchantId the sub merchant id
     */
    public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
