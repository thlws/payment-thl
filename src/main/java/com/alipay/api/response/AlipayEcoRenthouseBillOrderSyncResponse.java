package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.bill.order.sync response.
 *
 * @author auto create
 * @since 1.0, 2017-11-08 10:54:24
 */
public class AlipayEcoRenthouseBillOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4882634272779241263L;

	/** 
	 * billNo-账单编号
status-1:成功
	 */
	@ApiListField("result_bill_list")
	@ApiField("string")
	private List<String> resultBillList;

    /**
     * Sets result bill list.
     *
     * @param resultBillList the result bill list
     */
    public void setResultBillList(List<String> resultBillList) {
		this.resultBillList = resultBillList;
	}

    /**
     * Gets result bill list.
     *
     * @return the result bill list
     */
    public List<String> getResultBillList( ) {
		return this.resultBillList;
	}

}
