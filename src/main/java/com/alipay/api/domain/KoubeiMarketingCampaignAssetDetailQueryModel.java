package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询资产的详情信息
 *
 * @author auto create
 * @since 1.0, 2018-01-10 14:14:43
 */
public class KoubeiMarketingCampaignAssetDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7768787677836183563L;

	/**
	 * 用户资产id，配合《用户口碑优惠资产查询接口koubei.marketing.campaign.user.asset.query》使用，返回信息列表中的asset_id则为传递的入参值。
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 配合《用户口碑优惠资产查询接口koubei.marketing.campaign.user.asset.query》查询券列表数据使用，如果获取的是voucher_asset_list数据，则对应的枚举为：VOUCHER；（目前只支持该类型）
	 */
	@ApiField("asset_type")
	private String assetType;

    /**
     * Gets asset id.
     *
     * @return the asset id
     */
    public String getAssetId() {
		return this.assetId;
	}

    /**
     * Sets asset id.
     *
     * @param assetId the asset id
     */
    public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

    /**
     * Gets asset type.
     *
     * @return the asset type
     */
    public String getAssetType() {
		return this.assetType;
	}

    /**
     * Sets asset type.
     *
     * @param assetType the asset type
     */
    public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

}
