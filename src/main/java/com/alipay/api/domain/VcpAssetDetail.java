package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产详情
 *
 * @author auto create
 * @since 1.0, 2018-05-18 22:32:20
 */
public class VcpAssetDetail extends AlipayObject {

	private static final long serialVersionUID = 2573219731466495761L;

	/**
	 * 资金金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资产金额
	 */
	@ApiField("assetamount")
	private String assetamount;

	/**
	 * 正常充值
	 */
	@ApiField("assetusechannel")
	private String assetusechannel;

	/**
	 * 收款用户id
	 */
	@ApiField("settleuserid")
	private String settleuserid;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets assetamount.
     *
     * @return the assetamount
     */
    public String getAssetamount() {
		return this.assetamount;
	}

    /**
     * Sets assetamount.
     *
     * @param assetamount the assetamount
     */
    public void setAssetamount(String assetamount) {
		this.assetamount = assetamount;
	}

    /**
     * Gets assetusechannel.
     *
     * @return the assetusechannel
     */
    public String getAssetusechannel() {
		return this.assetusechannel;
	}

    /**
     * Sets assetusechannel.
     *
     * @param assetusechannel the assetusechannel
     */
    public void setAssetusechannel(String assetusechannel) {
		this.assetusechannel = assetusechannel;
	}

    /**
     * Gets settleuserid.
     *
     * @return the settleuserid
     */
    public String getSettleuserid() {
		return this.settleuserid;
	}

    /**
     * Sets settleuserid.
     *
     * @param settleuserid the settleuserid
     */
    public void setSettleuserid(String settleuserid) {
		this.settleuserid = settleuserid;
	}

}
