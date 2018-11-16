package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘抢购批量商品查询接口
 *
 * @author auto create
 * @since 1.0, 2017-12-01 11:22:32
 */
public class KoubeiItemTaobaoIndexQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4613565843542355124L;

	/**
	 * 城市编码
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 场景码,TAO_BIG_BUY:淘抢购大牌抢购;JU_BIG_BUY:聚划算大牌抢购
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets city id.
     *
     * @return the city id
     */
    public String getCityId() {
		return this.cityId;
	}

    /**
     * Sets city id.
     *
     * @param cityId the city id
     */
    public void setCityId(String cityId) {
		this.cityId = cityId;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public String getLatitude() {
		return this.latitude;
	}

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     */
    public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public String getLongitude() {
		return this.longitude;
	}

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     */
    public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

    /**
     * Gets scene code.
     *
     * @return the scene code
     */
    public String getSceneCode() {
		return this.sceneCode;
	}

    /**
     * Sets scene code.
     *
     * @param sceneCode the scene code
     */
    public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
