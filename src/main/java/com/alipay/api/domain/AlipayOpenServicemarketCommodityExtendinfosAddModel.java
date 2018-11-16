package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务插件扩展信息补充
 *
 * @author auto create
 * @since 1.0, 2018-03-16 17:31:37
 */
public class AlipayOpenServicemarketCommodityExtendinfosAddModel extends AlipayObject {

	private static final long serialVersionUID = 2711917731899887441L;

	/**
	 * 公服扩展信息列表
	 */
	@ApiListField("commodity_ext_infos")
	@ApiField("commodity_public_ext_infos")
	private List<CommodityPublicExtInfos> commodityExtInfos;

	/**
	 * 服务插件ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 应用ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets commodity ext infos.
     *
     * @return the commodity ext infos
     */
    public List<CommodityPublicExtInfos> getCommodityExtInfos() {
		return this.commodityExtInfos;
	}

    /**
     * Sets commodity ext infos.
     *
     * @param commodityExtInfos the commodity ext infos
     */
    public void setCommodityExtInfos(List<CommodityPublicExtInfos> commodityExtInfos) {
		this.commodityExtInfos = commodityExtInfos;
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
