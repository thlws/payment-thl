package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询代收付结果
 *
 * @author auto create
 * @since 1.0, 2017-08-25 10:19:04
 */
public class MybankCreditLoantradePartnerPaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7736976889866453769L;

	/**
	 * 网商内部申请单编号，外部机构根据此编号查询申请状态。
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
