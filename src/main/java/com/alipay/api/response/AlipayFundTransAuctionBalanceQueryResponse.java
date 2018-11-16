package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.auction.balance.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-23 12:16:53
 */
public class AlipayFundTransAuctionBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3589931423368339445L;

	/** 
	 * 当前可用余额
	 */
	@ApiField("balance_available")
	private String balanceAvailable;

	/** 
	 * 冻结金额
	 */
	@ApiField("balance_freezed")
	private String balanceFreezed;

    /**
     * Sets balance available.
     *
     * @param balanceAvailable the balance available
     */
    public void setBalanceAvailable(String balanceAvailable) {
		this.balanceAvailable = balanceAvailable;
	}

    /**
     * Gets balance available.
     *
     * @return the balance available
     */
    public String getBalanceAvailable( ) {
		return this.balanceAvailable;
	}

    /**
     * Sets balance freezed.
     *
     * @param balanceFreezed the balance freezed
     */
    public void setBalanceFreezed(String balanceFreezed) {
		this.balanceFreezed = balanceFreezed;
	}

    /**
     * Gets balance freezed.
     *
     * @return the balance freezed
     */
    public String getBalanceFreezed( ) {
		return this.balanceFreezed;
	}

}
