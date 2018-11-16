package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IP地址归属地对象。其中province为IP地址归属地的省，city为IP地址归属地的城市
 *
 * @author auto create
 * @since 1.0, 2018-03-30 16:27:11
 */
public class IpAddrLbsInfo extends AlipayObject {

	private static final long serialVersionUID = 5247769684619235189L;

	/**
	 * IP地址归属地所以城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * IP归属地所在的省
	 */
	@ApiField("province")
	private String province;

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
		return this.city;
	}

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
		this.city = city;
	}

    /**
     * Gets province.
     *
     * @return the province
     */
    public String getProvince() {
		return this.province;
	}

    /**
     * Sets province.
     *
     * @param province the province
     */
    public void setProvince(String province) {
		this.province = province;
	}

}
