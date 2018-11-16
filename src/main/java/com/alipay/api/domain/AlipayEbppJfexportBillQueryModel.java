package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付宝缴费订单
 *
 * @author auto create
 * @since 1.0, 2018-05-02 14:57:29
 */
public class AlipayEbppJfexportBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4677334541553715999L;

	/**
	 * 支付宝的业务订单号，具有唯一性和幂等性
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 业务类型英文名称
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 拓展字段，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

    /**
     * Gets bill no.
     *
     * @return the bill no
     */
    public String getBillNo() {
		return this.billNo;
	}

    /**
     * Sets bill no.
     *
     * @param billNo the bill no
     */
    public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField() {
		return this.extendField;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

}
