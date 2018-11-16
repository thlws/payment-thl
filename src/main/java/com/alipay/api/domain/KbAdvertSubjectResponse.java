package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统标的
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:12
 */
public class KbAdvertSubjectResponse extends AlipayObject {

	private static final long serialVersionUID = 6511848388765611655L;

	/**
	 * 分佣规则
	 */
	@ApiField("commission_clause")
	private KbAdvertCommissionClauseResponse commissionClause;

	/**
	 * 标的类型
voucher-券
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券标的
只有type=voucher才会有值
	 */
	@ApiField("voucher")
	private KbAdvertSubjectVoucherResponse voucher;

    /**
     * Gets commission clause.
     *
     * @return the commission clause
     */
    public KbAdvertCommissionClauseResponse getCommissionClause() {
		return this.commissionClause;
	}

    /**
     * Sets commission clause.
     *
     * @param commissionClause the commission clause
     */
    public void setCommissionClause(KbAdvertCommissionClauseResponse commissionClause) {
		this.commissionClause = commissionClause;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
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
     * Gets voucher.
     *
     * @return the voucher
     */
    public KbAdvertSubjectVoucherResponse getVoucher() {
		return this.voucher;
	}

    /**
     * Sets voucher.
     *
     * @param voucher the voucher
     */
    public void setVoucher(KbAdvertSubjectVoucherResponse voucher) {
		this.voucher = voucher;
	}

}
