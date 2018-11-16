package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ContractBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.contract.userstatus.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-27 18:10:15
 */
public class ZhimaCreditPeContractUserstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3188196591945919751L;

	/** 
	 * 对于用户状态2和3情况会返回用户最近签署的合约信息
	 */
	@ApiField("contract_basic_info")
	private ContractBasicInfo contractBasicInfo;

	/** 
	 * 1：未参加活动（首签）
2：正在活动履约中
3：活动结束
	 */
	@ApiField("user_status")
	private Long userStatus;

	/** 
	 * 状态描述：
"never", "in promise", "promise complete"
	 */
	@ApiField("user_status_desc")
	private String userStatusDesc;

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
     * Sets user status.
     *
     * @param userStatus the user status
     */
    public void setUserStatus(Long userStatus) {
		this.userStatus = userStatus;
	}

    /**
     * Gets user status.
     *
     * @return the user status
     */
    public Long getUserStatus( ) {
		return this.userStatus;
	}

    /**
     * Sets user status desc.
     *
     * @param userStatusDesc the user status desc
     */
    public void setUserStatusDesc(String userStatusDesc) {
		this.userStatusDesc = userStatusDesc;
	}

    /**
     * Gets user status desc.
     *
     * @return the user status desc
     */
    public String getUserStatusDesc( ) {
		return this.userStatusDesc;
	}

}
