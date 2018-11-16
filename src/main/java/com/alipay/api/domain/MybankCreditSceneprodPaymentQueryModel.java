package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融代收付结果查询
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:37:34
 */
public class MybankCreditSceneprodPaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3864235985512787841L;

	/**
	 * 网商内部代收付申请单编号，外部机构根据此编号查询申请状态。
	 */
	@ApiField("in_apply_no")
	private String inApplyNo;

    /**
     * Gets in apply no.
     *
     * @return the in apply no
     */
    public String getInApplyNo() {
		return this.inApplyNo;
	}

    /**
     * Sets in apply no.
     *
     * @param inApplyNo the in apply no
     */
    public void setInApplyNo(String inApplyNo) {
		this.inApplyNo = inApplyNo;
	}

}
