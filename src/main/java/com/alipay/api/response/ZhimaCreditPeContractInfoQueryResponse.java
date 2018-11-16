package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ContractBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.contract.info.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-02 10:08:21
 */
public class ZhimaCreditPeContractInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6844112459449946648L;

	/** 
	 * 用户签署合约基本信息
	 */
	@ApiField("contract_basic_info")
	private ContractBasicInfo contractBasicInfo;

	/** 
	 * 合约状态
0:  合约不存在 1：合约尚未完成 2：履约成功 3: 履约失败
	 */
	@ApiField("contract_status")
	private Long contractStatus;

	/** 
	 * 合约状态描述
"not found", "incompleted", "success", "fail"
	 */
	@ApiField("contract_status_desc")
	private String contractStatusDesc;

    /**
     * Sets contract basic info.
     *
     * @param contractBasicInfo the contract basic info
     */
    public void setContractBasicInfo(ContractBasicInfo contractBasicInfo) {
		this.contractBasicInfo = contractBasicInfo;
	}

    /**
     * Gets contract basic info.
     *
     * @return the contract basic info
     */
    public ContractBasicInfo getContractBasicInfo( ) {
		return this.contractBasicInfo;
	}

    /**
     * Sets contract status.
     *
     * @param contractStatus the contract status
     */
    public void setContractStatus(Long contractStatus) {
		this.contractStatus = contractStatus;
	}

    /**
     * Gets contract status.
     *
     * @return the contract status
     */
    public Long getContractStatus( ) {
		return this.contractStatus;
	}

    /**
     * Sets contract status desc.
     *
     * @param contractStatusDesc the contract status desc
     */
    public void setContractStatusDesc(String contractStatusDesc) {
		this.contractStatusDesc = contractStatusDesc;
	}

    /**
     * Gets contract status desc.
     *
     * @return the contract status desc
     */
    public String getContractStatusDesc( ) {
		return this.contractStatusDesc;
	}

}
