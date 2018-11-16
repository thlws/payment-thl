package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务信息同步
 *
 * @author auto create
 * @since 1.0, 2018-04-09 18:17:19
 */
public class AlipayOpenServicemarketCommoditySmartcitySyncModel extends AlipayObject {

	private static final long serialVersionUID = 3198287562856289373L;

	/**
	 * 服务基础信息
	 */
	@ApiField("commodity_base_info")
	private CommodityBaseInfo commodityBaseInfo;

	/**
	 * 服务ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 是否预发环境数据，1是，0否
	 */
	@ApiField("is_pre")
	private String isPre;

	/**
	 * 新型智慧城市服务扩展信息
	 */
	@ApiField("smart_city_commodity_info")
	private SmartCityCommodityInfo smartCityCommodityInfo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets commodity base info.
     *
     * @return the commodity base info
     */
    public CommodityBaseInfo getCommodityBaseInfo() {
		return this.commodityBaseInfo;
	}

    /**
     * Sets commodity base info.
     *
     * @param commodityBaseInfo the commodity base info
     */
    public void setCommodityBaseInfo(CommodityBaseInfo commodityBaseInfo) {
		this.commodityBaseInfo = commodityBaseInfo;
	}

    /**
     * Gets commodity id.
     *
     * @return the commodity id
     */
    public String getCommodityId() {
		return this.commodityId;
	}

    /**
     * Sets commodity id.
     *
     * @param commodityId the commodity id
     */
    public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

    /**
     * Gets is pre.
     *
     * @return the is pre
     */
    public String getIsPre() {
		return this.isPre;
	}

    /**
     * Sets is pre.
     *
     * @param isPre the is pre
     */
    public void setIsPre(String isPre) {
		this.isPre = isPre;
	}

    /**
     * Gets smart city commodity info.
     *
     * @return the smart city commodity info
     */
    public SmartCityCommodityInfo getSmartCityCommodityInfo() {
		return this.smartCityCommodityInfo;
	}

    /**
     * Sets smart city commodity info.
     *
     * @param smartCityCommodityInfo the smart city commodity info
     */
    public void setSmartCityCommodityInfo(SmartCityCommodityInfo smartCityCommodityInfo) {
		this.smartCityCommodityInfo = smartCityCommodityInfo;
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
