package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑客分佣账单查询接口
 *
 * @author auto create
 * @since 1.0, 2017-09-29 15:05:35
 */
public class KoubeiAdvertCommissionBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8495178889821624195L;

	/**
	 * 账期(格式为yyyyMM)
	 */
	@ApiField("date")
	private String date;

	/**
	 * 账单类型
deal-交易账单
settle-结算账单
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
		return this.date;
	}

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
		this.date = date;
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

}
