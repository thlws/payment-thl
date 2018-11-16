package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.access.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-01-11 17:13:56
 */
public class AlipayInsSceneProductAccessApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7239261276481346247L;

	/** 
	 * true 表示可以准入， false表示不可以准入。
当准入结果为false的时候需要提示用户当前不能购买该产品
	 */
	@ApiField("is_access")
	private Boolean isAccess;

	/** 
	 * 产品信息(保险标准查询信息)
	 */
	@ApiField("product")
	private InsProduct product;

	/** 
	 * 不准入原因，该原因为统一的风控原因，用于上游日志使用，不能直接提示给用户，建议给用户的提示文案和蚂蚁PD沟通后给出。
该字段在系统异常的情况下为空
	 */
	@ApiField("reason")
	private String reason;

    /**
     * Sets is access.
     *
     * @param isAccess the is access
     */
    public void setIsAccess(Boolean isAccess) {
		this.isAccess = isAccess;
	}

    /**
     * Gets is access.
     *
     * @return the is access
     */
    public Boolean getIsAccess( ) {
		return this.isAccess;
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

    /**
     * Sets reason.
     *
     * @param reason the reason
     */
    public void setReason(String reason) {
		this.reason = reason;
	}

    /**
     * Gets reason.
     *
     * @return the reason
     */
    public String getReason( ) {
		return this.reason;
	}

}
