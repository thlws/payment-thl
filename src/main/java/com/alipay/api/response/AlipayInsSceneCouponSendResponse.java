package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsCertificate;
import com.alipay.api.domain.InsProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.coupon.send response.
 *
 * @author auto create
 * @since 1.0, 2017-02-23 21:17:32
 */
public class AlipayInsSceneCouponSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1413875937582867582L;

	/** 
	 * 发奖凭证
	 */
	@ApiField("certificate")
	private InsCertificate certificate;

	/** 
	 * 活动ID
	 */
	@ApiField("compaign_id")
	private String compaignId;

	/** 
	 * 发奖流水ID
	 */
	@ApiField("flow_id")
	private String flowId;

	/** 
	 * 保险产品
	 */
	@ApiField("product")
	private InsProduct product;

    /**
     * Sets certificate.
     *
     * @param certificate the certificate
     */
    public void setCertificate(InsCertificate certificate) {
		this.certificate = certificate;
	}

    /**
     * Gets certificate.
     *
     * @return the certificate
     */
    public InsCertificate getCertificate( ) {
		return this.certificate;
	}

    /**
     * Sets compaign id.
     *
     * @param compaignId the compaign id
     */
    public void setCompaignId(String compaignId) {
		this.compaignId = compaignId;
	}

    /**
     * Gets compaign id.
     *
     * @return the compaign id
     */
    public String getCompaignId( ) {
		return this.compaignId;
	}

    /**
     * Sets flow id.
     *
     * @param flowId the flow id
     */
    public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

    /**
     * Gets flow id.
     *
     * @return the flow id
     */
    public String getFlowId( ) {
		return this.flowId;
	}

    /**
     * Sets product.
     *
     * @param product the product
     */
    public void setProduct(InsProduct product) {
		this.product = product;
	}

    /**
     * Gets product.
     *
     * @return the product
     */
    public InsProduct getProduct( ) {
		return this.product;
	}

}
