package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.card.return.refund response.
 *
 * @author auto create
 * @since 1.0, 2018-05-18 22:35:00
 */
public class AlipayAssetCardReturnRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7179767854817648159L;

	/** 
	 * 账务操作时间
	 */
	@ApiField("account_dt")
	private Date accountDt;

	/** 
	 * 系统退卡订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 退卡资金，单位元，包含手续费
	 */
	@ApiField("return_amount")
	private String returnAmount;

	/** 
	 * 退款面额，单位元，包含手续费
	 */
	@ApiField("return_asset_amont")
	private String returnAssetAmont;

	/** 
	 * 退卡手续费资金，单位元
	 */
	@ApiField("return_fee_amount")
	private String returnFeeAmount;

	/** 
	 * 退卡手续费面额，单位元
	 */
	@ApiField("return_fee_asset_amount")
	private String returnFeeAssetAmount;

    /**
     * Sets account dt.
     *
     * @param accountDt the account dt
     */
    public void setAccountDt(Date accountDt) {
		this.accountDt = accountDt;
	}

    /**
     * Gets account dt.
     *
     * @return the account dt
     */
    public Date getAccountDt( ) {
		return this.accountDt;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo( ) {
		return this.orderNo;
	}

    /**
     * Sets return amount.
     *
     * @param returnAmount the return amount
     */
    public void setReturnAmount(String returnAmount) {
		this.returnAmount = returnAmount;
	}

    /**
     * Gets return amount.
     *
     * @return the return amount
     */
    public String getReturnAmount( ) {
		return this.returnAmount;
	}

    /**
     * Sets return asset amont.
     *
     * @param returnAssetAmont the return asset amont
     */
    public void setReturnAssetAmont(String returnAssetAmont) {
		this.returnAssetAmont = returnAssetAmont;
	}

    /**
     * Gets return asset amont.
     *
     * @return the return asset amont
     */
    public String getReturnAssetAmont( ) {
		return this.returnAssetAmont;
	}

    /**
     * Sets return fee amount.
     *
     * @param returnFeeAmount the return fee amount
     */
    public void setReturnFeeAmount(String returnFeeAmount) {
		this.returnFeeAmount = returnFeeAmount;
	}

    /**
     * Gets return fee amount.
     *
     * @return the return fee amount
     */
    public String getReturnFeeAmount( ) {
		return this.returnFeeAmount;
	}

    /**
     * Sets return fee asset amount.
     *
     * @param returnFeeAssetAmount the return fee asset amount
     */
    public void setReturnFeeAssetAmount(String returnFeeAssetAmount) {
		this.returnFeeAssetAmount = returnFeeAssetAmount;
	}

    /**
     * Gets return fee asset amount.
     *
     * @return the return fee asset amount
     */
    public String getReturnFeeAssetAmount( ) {
		return this.returnFeeAssetAmount;
	}

}
