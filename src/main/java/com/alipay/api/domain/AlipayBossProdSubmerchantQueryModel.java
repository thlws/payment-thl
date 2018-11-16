package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户查询接口
 *
 * @author auto create
 * @since 1.0, 2017-09-23 20:46:10
 */
public class AlipayBossProdSubmerchantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7486216378546338625L;

	/**
	 * 受理商户在受理机构下的唯一标识，与sub_merchant_id二选一必传
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 受理商户在支付宝入驻后的识别号，商户入驻后由支付宝返回，与external_id二选一必传
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
