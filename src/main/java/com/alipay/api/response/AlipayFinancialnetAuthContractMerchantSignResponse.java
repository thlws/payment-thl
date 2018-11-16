package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.contract.merchant.sign response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 14:09:58
 */
public class AlipayFinancialnetAuthContractMerchantSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 2847937635192454445L;

	/** 
	 * 合约批次号
	 */
	@ApiField("contract_batch_no")
	private String contractBatchNo;

	/** 
	 * 合约号
	 */
	@ApiListField("contract_no_list")
	@ApiField("string")
	private List<String> contractNoList;

    /**
     * Sets contract batch no.
     *
     * @param contractBatchNo the contract batch no
     */
    public void setContractBatchNo(String contractBatchNo) {
		this.contractBatchNo = contractBatchNo;
	}

    /**
     * Gets contract batch no.
     *
     * @return the contract batch no
     */
    public String getContractBatchNo( ) {
		return this.contractBatchNo;
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
