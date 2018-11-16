package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RechargeBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.deposit.query response.
 *
 * @author auto create
 * @since 1.0, 2015-12-15 11:37:56
 */
public class AlipayCommerceCityfacilitatorDepositQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4611295623615686984L;

	/** 
	 * 待圈存明细
	 */
	@ApiListField("recharge_bills")
	@ApiField("recharge_bill")
	private List<RechargeBill> rechargeBills;

    /**
     * Sets recharge bills.
     *
     * @param rechargeBills the recharge bills
     */
    public void setRechargeBills(List<RechargeBill> rechargeBills) {
		this.rechargeBills = rechargeBills;
	}

    /**
     * Gets recharge bills.
     *
     * @return the recharge bills
     */
    public List<RechargeBill> getRechargeBills( ) {
		return this.rechargeBills;
	}

}
