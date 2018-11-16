package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户查询
 *
 * @author auto create
 * @since 1.0, 2018-07-06 15:33:18
 */
public class AntMerchantExpandIndirectQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4118827915344588159L;

	/**
	 * 商户编号，由机构定义，需要保证在机构下唯一，如果未传sub_merchant_id ，则必传 external_id 和 org_pid
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 机构pid，根据org_pid + external_id 可以唯一确定商户，如果未传sub_merchant_id ，则必传 external_id 和 org_pid
	 */
	@ApiField("org_pid")
	private String orgPid;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号，如果未传 external_id 和 org_pid，则必传sub_merchant_id
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
     * Gets org pid.
     *
     * @return the org pid
     */
    public String getOrgPid() {
		return this.orgPid;
	}

    /**
     * Sets org pid.
     *
     * @param orgPid the org pid
     */
    public void setOrgPid(String orgPid) {
		this.orgPid = orgPid;
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
