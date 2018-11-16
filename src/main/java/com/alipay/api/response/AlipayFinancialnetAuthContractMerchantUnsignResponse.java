package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.contract.merchant.unsign response.
 *
 * @author auto create
 * @since 1.0, 2018-06-26 17:37:46
 */
public class AlipayFinancialnetAuthContractMerchantUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3157299659233853579L;

	/** 
	 * 合约批次号列表
	 */
	@ApiListField("contract_batch_no_list")
	@ApiField("string")
	private List<String> contractBatchNoList;

	/** 
	 * 合约号列表
	 */
	@ApiListField("contract_no_list")
	@ApiField("string")
	private List<String> contractNoList;

    /**
     * Sets contract batch no list.
     *
     * @param contractBatchNoList the contract batch no list
     */
    public void setContractBatchNoList(List<String> contractBatchNoList) {
		this.contractBatchNoList = contractBatchNoList;
	}

    /**
     * Gets contract batch no list.
     *
     * @return the contract batch no list
     */
    public List<String> getContractBatchNoList( ) {
		return this.contractBatchNoList;
	}

    /**
     * Sets contract no list.
     *
     * @param contractNoList the contract no list
     */
    public void setContractNoList(List<String> contractNoList) {
		this.contractNoList = contractNoList;
	}

    /**
     * Gets contract no list.
     *
     * @return the contract no list
     */
    public List<String> getContractNoList( ) {
		return this.contractNoList;
	}

}
