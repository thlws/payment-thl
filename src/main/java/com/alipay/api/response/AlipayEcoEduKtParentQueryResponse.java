package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.parent.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-31 17:30:00
 */
public class AlipayEcoEduKtParentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7595633928756575762L;

	/** 
	 * 如果用户已经添加过这个孩子，则返回SUCCESS ， 失败返回FAIL。
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}
