package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV获取用户违章车辆信息
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:52:42
 */
public class AlipayEcoMycarViolationVehicleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4496953887943986111L;

	/**
	 * 用户车辆ID,支付宝系统唯一
	 */
	@ApiField("vi_id")
	private String viId;

    /**
     * Gets vi id.
     *
     * @return the vi id
     */
    public String getViId() {
		return this.viId;
	}

    /**
     * Sets vi id.
     *
     * @param viId the vi id
     */
    public void setViId(String viId) {
		this.viId = viId;
	}

}
