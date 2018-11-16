package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.unfreeze response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 20:43:42
 */
public class KoubeiMerchantOperatorUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5385727572898464287L;

	/** 
	 * 操作结果 true: success, false: failed
	 */
	@ApiField("result")
	private Boolean result;

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(Boolean result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public Boolean getResult( ) {
		return this.result;
	}

}
