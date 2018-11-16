package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询场景下内容列表信息
 *
 * @author auto create
 * @since 1.0, 2018-09-13 20:49:08
 */
public class AlipaySocialBaseSceneContentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3196236522543529291L;

	/**
	 * 城市id
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 内容中台提供的运营后台配置场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 返回文章列表的个数，目前最多10条
	 */
	@ApiField("top_size")
	private Long topSize;

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
     * Gets scene id.
     *
     * @return the scene id
     */
    public String getSceneId() {
		return this.sceneId;
	}

    /**
     * Sets scene id.
     *
     * @param sceneId the scene id
     */
    public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

    /**
     * Gets top size.
     *
     * @return the top size
     */
    public Long getTopSize() {
		return this.topSize;
	}

    /**
     * Sets top size.
     *
     * @param topSize the top size
     */
    public void setTopSize(Long topSize) {
		this.topSize = topSize;
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
