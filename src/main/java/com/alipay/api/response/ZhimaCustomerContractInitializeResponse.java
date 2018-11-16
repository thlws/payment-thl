package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.contract.initialize response.
 *
 * @author auto create
 * @since 1.0, 2017-12-19 13:55:57
 */
public class ZhimaCustomerContractInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4787258279542347522L;

	/** 
	 * 电子合约号，后续的电子签名流程需要用到
	 */
	@ApiField("contract_no")
	private String contractNo;

    /**
     * Sets contract no.
     *
     * @param contractNo the contract no
     */
    public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

    /**
     * Gets contract no.
     *
     * @return the contract no
     */
    public String getContractNo( ) {
		return this.contractNo;
	}

}
