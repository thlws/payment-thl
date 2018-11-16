package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.thirdparty.reward.create response.
 *
 * @author auto create
 * @since 1.0, 2018-09-18 15:50:21
 */
public class AlipayFundTransThirdpartyRewardCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1475111866883367889L;

	/** 
	 * 打赏单据号
	 */
	@ApiField("transfer_no")
	private String transferNo;

    /**
     * Sets transfer no.
     *
     * @param transferNo the transfer no
     */
    public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}

    /**
     * Gets transfer no.
     *
     * @return the transfer no
     */
    public String getTransferNo( ) {
		return this.transferNo;
	}

}
