package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑pos账单菜明细
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:30:38
 */
public class KbPosBillDishDetail extends AlipayObject {

	private static final long serialVersionUID = 7433632165881843158L;

	/**
	 * pos本地订单菜明细流水号
	 */
	@ApiField("out_detail_no")
	private String outDetailNo;

	/**
	 * 优免分摊金额（包含内部和外部优惠），以元为单位，精度到分
	 */
	@ApiField("trans_amount")
	private String transAmount;

    /**
     * Gets out detail no.
     *
     * @return the out detail no
     */
    public String getOutDetailNo() {
		return this.outDetailNo;
	}

    /**
     * Sets out detail no.
     *
     * @param outDetailNo the out detail no
     */
    public void setOutDetailNo(String outDetailNo) {
		this.outDetailNo = outDetailNo;
	}

    /**
     * Gets trans amount.
     *
     * @return the trans amount
     */
    public String getTransAmount() {
		return this.transAmount;
	}

    /**
     * Sets trans amount.
     *
     * @param transAmount the trans amount
     */
    public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

}
