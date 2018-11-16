package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayContract;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.contract.get response.
 *
 * @author auto create
 * @since 1.0, 2016-06-06 20:23:18
 */
public class AlipayUserContractGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8755397319231318665L;

	/** 
	 * 支付宝用户订购信息
	 */
	@ApiField("alipay_contract")
	private AlipayContract alipayContract;

    /**
     * Sets alipay contract.
     *
     * @param alipayContract the alipay contract
     */
    public void setAlipayContract(AlipayContract alipayContract) {
		this.alipayContract = alipayContract;
	}

    /**
     * Gets alipay contract.
     *
     * @return the alipay contract
     */
    public AlipayContract getAlipayContract( ) {
		return this.alipayContract;
	}

}
