package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配送物料信息反馈接口
 *
 * @author auto create
 * @since 1.0, 2018-08-10 21:03:03
 */
public class AntMerchantExpandAssetinfoDeliverySyncModel extends AlipayObject {

	private static final long serialVersionUID = 1643384498411791335L;

	/**
	 * 传入需要反馈的物料信息对象列表。
	 */
	@ApiListField("asset_infos")
	@ApiField("asset_info_item")
	private List<AssetInfoItem> assetInfos;

    /**
     * Gets asset infos.
     *
     * @return the asset infos
     */
    public List<AssetInfoItem> getAssetInfos() {
		return this.assetInfos;
	}

    /**
     * Sets asset infos.
     *
     * @param assetInfos the asset infos
     */
    public void setAssetInfos(List<AssetInfoItem> assetInfos) {
		this.assetInfos = assetInfos;
	}

}
