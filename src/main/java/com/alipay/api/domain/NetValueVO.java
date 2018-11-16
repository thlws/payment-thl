package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金净值的值对象
 *
 * @author auto create
 * @since 1.0, 2017-11-16 22:31:51
 */
public class NetValueVO extends AlipayObject {

	private static final long serialVersionUID = 3857214496118882798L;

	/**
	 * 基金单位净值，含4位小数
	 */
	@ApiField("net_value")
	private String netValue;

	/**
	 * 基金净值日期
	 */
	@ApiField("net_value_date")
	private String netValueDate;

	/**
	 * 七日年化收益率，含5位小数，可以为负
	 */
	@ApiField("profit_seven_days")
	private String profitSevenDays;

	/**
	 * 万份收益，含5位小数，可以为负
	 */
	@ApiField("profit_ten_thousand")
	private String profitTenThousand;

    /**
     * Gets net value.
     *
     * @return the net value
     */
    public String getNetValue() {
		return this.netValue;
	}

    /**
     * Sets net value.
     *
     * @param netValue the net value
     */
    public void setNetValue(String netValue) {
		this.netValue = netValue;
	}

    /**
     * Gets net value date.
     *
     * @return the net value date
     */
    public String getNetValueDate() {
		return this.netValueDate;
	}

    /**
     * Sets net value date.
     *
     * @param netValueDate the net value date
     */
    public void setNetValueDate(String netValueDate) {
		this.netValueDate = netValueDate;
	}

    /**
     * Gets profit seven days.
     *
     * @return the profit seven days
     */
    public String getProfitSevenDays() {
		return this.profitSevenDays;
	}

    /**
     * Sets profit seven days.
     *
     * @param profitSevenDays the profit seven days
     */
    public void setProfitSevenDays(String profitSevenDays) {
		this.profitSevenDays = profitSevenDays;
	}

    /**
     * Gets profit ten thousand.
     *
     * @return the profit ten thousand
     */
    public String getProfitTenThousand() {
		return this.profitTenThousand;
	}

    /**
     * Sets profit ten thousand.
     *
     * @param profitTenThousand the profit ten thousand
     */
    public void setProfitTenThousand(String profitTenThousand) {
		this.profitTenThousand = profitTenThousand;
	}

}
