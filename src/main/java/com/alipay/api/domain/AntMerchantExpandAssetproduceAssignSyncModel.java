package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生产指令接收反馈接口
 *
 * @author auto create
 * @since 1.0, 2018-07-30 13:45:33
 */
public class AntMerchantExpandAssetproduceAssignSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4529437539725916174L;

	/**
	 * 生产指令接收情况，最多200条
	 */
	@ApiListField("asset_results")
	@ApiField("asset_result")
	private List<AssetResult> assetResults;

    /**
     * Gets asset results.
     *
     * @return the asset results
     */
    public List<AssetResult> getAssetResults() {
		return this.assetResults;
	}

    /**
     * Sets asset results.
     *
     * @param assetResults the asset results
     */
    public void setAssetResults(List<AssetResult> assetResults) {
		this.assetResults = assetResults;
	}

}
