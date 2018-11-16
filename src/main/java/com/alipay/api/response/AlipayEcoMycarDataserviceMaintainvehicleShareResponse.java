package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MaintainVehicleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.dataservice.maintainvehicle.share response.
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:53:46
 */
public class AlipayEcoMycarDataserviceMaintainvehicleShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 8739255482795632163L;

	/** 
	 * 车辆详细信息
	 */
	@ApiField("info")
	private MaintainVehicleInfo info;

    /**
     * Sets info.
     *
     * @param info the info
     */
    public void setInfo(MaintainVehicleInfo info) {
		this.info = info;
	}

    /**
     * Gets info.
     *
     * @return the info
     */
    public MaintainVehicleInfo getInfo( ) {
		return this.info;
	}

}
