package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户转移给银联网联接口
 *
 * @author auto create
 * @since 1.0, 2018-09-10 10:59:05
 */
public class AntMerchantExpandIndirectTransferModel extends AlipayObject {

	private static final long serialVersionUID = 5891751712544793898L;

	/**
	 * 商户编号，由机构定义，需要保证在机构下唯一，与sub_merchant_id二选一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号，与external_id二选一
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 商户转移目标的id，填银联或者网联的id
	 */
	@ApiField("transfer_target_id")
	private String transferTargetId;

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

    /**
     * Gets transfer target id.
     *
     * @return the transfer target id
     */
    public String getTransferTargetId() {
		return this.transferTargetId;
	}

    /**
     * Sets transfer target id.
     *
     * @param transferTargetId the transfer target id
     */
    public void setTransferTargetId(String transferTargetId) {
		this.transferTargetId = transferTargetId;
	}

}
