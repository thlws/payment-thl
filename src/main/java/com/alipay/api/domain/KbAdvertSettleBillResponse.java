package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统账单查询结果(结算账单)
 *
 * @author auto create
 * @since 1.0, 2017-04-17 10:53:54
 */
public class KbAdvertSettleBillResponse extends AlipayObject {

	private static final long serialVersionUID = 2634131399214699193L;

	/**
	 * 账单下载地址(为空表示查无账单)
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 结算账单打款日期(为空表示未打款)
	 */
	@ApiField("paid_date")
	private String paidDate;

    /**
     * Gets download url.
     *
     * @return the download url
     */
    public String getDownloadUrl() {
		return this.downloadUrl;
	}

    /**
     * Sets download url.
     *
     * @param downloadUrl the download url
     */
    public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

    /**
     * Gets paid date.
     *
     * @return the paid date
     */
    public String getPaidDate() {
		return this.paidDate;
	}

    /**
     * Sets paid date.
     *
     * @param paidDate the paid date
     */
    public void setPaidDate(String paidDate) {
		this.paidDate = paidDate;
	}

}
