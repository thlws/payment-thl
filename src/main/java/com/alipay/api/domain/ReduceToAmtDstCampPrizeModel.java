package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指定优惠金额
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class ReduceToAmtDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 7149893591123998798L;

	/**
	 * 优惠后价格
	 */
	@ApiField("reduct_to_amt")
	private String reductToAmt;

    /**
     * Gets reduct to amt.
     *
     * @return the reduct to amt
     */
    public String getReductToAmt() {
		return this.reductToAmt;
	}

    /**
     * Sets reduct to amt.
     *
     * @param reductToAmt the reduct to amt
     */
    public void setReductToAmt(String reductToAmt) {
		this.reductToAmt = reductToAmt;
	}

}
