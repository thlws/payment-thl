package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbAdvertDealBillResponse;
import com.alipay.api.domain.KbAdvertSettleBillResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.bill.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-29 15:05:35
 */
public class KoubeiAdvertCommissionBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1384914868446338622L;

	/** 
	 * 账期(格式为yyyyMM)
	 */
	@ApiField("date")
	private String date;

	/** 
	 * 交易账单
只有type=deal才会有值
	 */
	@ApiField("deal_bill")
	private KbAdvertDealBillResponse dealBill;

	/** 
	 * 结算账单
只有type=settle才会有值
	 */
	@ApiField("settle_bill")
	private KbAdvertSettleBillResponse settleBill;

	/** 
	 * 账单类型
deal-交易账单
settle-结算账单
	 */
	@ApiField("type")
	private String type;

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
		this.date = date;
	}

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate( ) {
		return this.date;
	}

    /**
     * Sets deal bill.
     *
     * @param dealBill the deal bill
     */
    public void setDealBill(KbAdvertDealBillResponse dealBill) {
		this.dealBill = dealBill;
	}

    /**
     * Gets deal bill.
     *
     * @return the deal bill
     */
    public KbAdvertDealBillResponse getDealBill( ) {
		return this.dealBill;
	}

    /**
     * Sets settle bill.
     *
     * @param settleBill the settle bill
     */
    public void setSettleBill(KbAdvertSettleBillResponse settleBill) {
		this.settleBill = settleBill;
	}

    /**
     * Gets settle bill.
     *
     * @return the settle bill
     */
    public KbAdvertSettleBillResponse getSettleBill( ) {
		return this.settleBill;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType( ) {
		return this.type;
	}

}
