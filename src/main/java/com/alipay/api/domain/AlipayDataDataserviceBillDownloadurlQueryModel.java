package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 无授权模式的查询对账单下载地址
 *
 * @author auto create
 * @since 1.0, 2018-08-08 15:18:41
 */
public class AlipayDataDataserviceBillDownloadurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6216232421395497324L;

	/**
	 * 账单时间：日账单格式为yyyy-MM-dd，月账单格式为yyyy-MM。
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型：trade、signcustomer；trade指商户基于支付宝交易收单的业务账单；signcustomer是指基于商户支付宝余额收入及支出等资金变动的帐务账单；
	 */
	@ApiField("bill_type")
	private String billType;

    /**
     * Gets bill date.
     *
     * @return the bill date
     */
    public String getBillDate() {
		return this.billDate;
	}

    /**
     * Sets bill date.
     *
     * @param billDate the bill date
     */
    public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

    /**
     * Gets bill type.
     *
     * @return the bill type
     */
    public String getBillType() {
		return this.billType;
	}

    /**
     * Sets bill type.
     *
     * @param billType the bill type
     */
    public void setBillType(String billType) {
		this.billType = billType;
	}

}
