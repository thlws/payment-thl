package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 11:24:36
 */
public class LogisticsInfo extends AlipayObject {

	private static final long serialVersionUID = 2817217324971546442L;

	/**
	 * 物流公司code
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物流公司名称
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

    /**
     * Gets logistics code.
     *
     * @return the logistics code
     */
    public String getLogisticsCode() {
		return this.logisticsCode;
	}

    /**
     * Sets logistics code.
     *
     * @param logisticsCode the logistics code
     */
    public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

    /**
     * Gets logistics name.
     *
     * @return the logistics name
     */
    public String getLogisticsName() {
		return this.logisticsName;
	}

    /**
     * Sets logistics name.
     *
     * @param logisticsName the logistics name
     */
    public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

    /**
     * Gets logistics no.
     *
     * @return the logistics no
     */
    public String getLogisticsNo() {
		return this.logisticsNo;
	}

    /**
     * Sets logistics no.
     *
     * @param logisticsNo the logistics no
     */
    public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

}
