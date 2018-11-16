package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机具设备信息查询
 *
 * @author auto create
 * @since 1.0, 2018-07-31 17:08:29
 */
public class AlipayCommerceIotMdeviceprodQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7251596255761197627L;

	/**
	 * 设备id（物料系统的id）
	 */
	@ApiField("asset_id")
	private String assetId;

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

}
