package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetdelivery.complete.sync response.
 *
 * @author auto create
 * @since 1.0, 2018-07-30 13:46:40
 */
public class AntMerchantExpandAssetdeliveryCompleteSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1182894594462417831L;

	/** 
	 * 配送反馈处理结果
	 */
	@ApiListField("delivery_results")
	@ApiField("asset_result")
	private List<AssetResult> deliveryResults;

    /**
     * Sets delivery results.
     *
     * @param deliveryResults the delivery results
     */
    public void setDeliveryResults(List<AssetResult> deliveryResults) {
		this.deliveryResults = deliveryResults;
	}

    /**
     * Gets delivery results.
     *
     * @return the delivery results
     */
    public List<AssetResult> getDeliveryResults( ) {
		return this.deliveryResults;
	}

}
