package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 所有需要报价机构对应的精友码
 *
 * @author auto create
 * @since 1.0, 2017-10-24 17:03:38
 */
public class VehicleInfo extends AlipayObject {

	private static final long serialVersionUID = 4191967778647748591L;

	/**
	 * 保险公司ID
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 保险公司对应的精友码（转码）
	 */
	@ApiField("vehicle_code")
	private String vehicleCode;

    /**
     * Gets company id.
     *
     * @return the company id
     */
    public String getCompanyId() {
		return this.companyId;
	}

    /**
     * Sets company id.
     *
     * @param companyId the company id
     */
    public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

    /**
     * Gets vehicle code.
     *
     * @return the vehicle code
     */
    public String getVehicleCode() {
		return this.vehicleCode;
	}

    /**
     * Sets vehicle code.
     *
     * @param vehicleCode the vehicle code
     */
    public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

}
