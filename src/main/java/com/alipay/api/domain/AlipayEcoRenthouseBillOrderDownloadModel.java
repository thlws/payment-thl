package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户对账文件下载
 *
 * @author auto create
 * @since 1.0, 2018-09-12 20:06:34
 */
public class AlipayEcoRenthouseBillOrderDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 5242153444812982236L;

	/**
	 * 查询日期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 商户编号
	 */
	@ApiField("merchant_no")
	private String merchantNo;

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
     * Gets merchant no.
     *
     * @return the merchant no
     */
    public String getMerchantNo() {
		return this.merchantNo;
	}

    /**
     * Sets merchant no.
     *
     * @param merchantNo the merchant no
     */
    public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

}
