package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推送新支持违章查询的城市
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:30:11
 */
public class AlipayEcoMycarViolationCityPushModel extends AlipayObject {

	private static final long serialVersionUID = 7894838924886373732L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 该城市规则是新增还是更新, 0:新增,1:更新
	 */
	@ApiField("push_type")
	private String pushType;

	/**
	 * 该城市是否支持违章查询,0:支持,1:不支持
	 */
	@ApiField("service_status")
	private String serviceStatus;

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

    /**
     * Gets push type.
     *
     * @return the push type
     */
    public String getPushType() {
		return this.pushType;
	}

    /**
     * Sets push type.
     *
     * @param pushType the push type
     */
    public void setPushType(String pushType) {
		this.pushType = pushType;
	}

    /**
     * Gets service status.
     *
     * @return the service status
     */
    public String getServiceStatus() {
		return this.serviceStatus;
	}

    /**
     * Sets service status.
     *
     * @param serviceStatus the service status
     */
    public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

}
