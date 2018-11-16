package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetinfo.produce.sync response.
 *
 * @author auto create
 * @since 1.0, 2018-08-10 21:05:00
 */
public class AntMerchantExpandAssetinfoProduceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8818727618632613875L;

	/** 
	 * 物料信息反馈处理结果
	 */
	@ApiListField("info_results")
	@ApiField("asset_result")
	private List<AssetResult> infoResults;

    /**
     * Sets info results.
     *
     * @param infoResults the info results
     */
    public void setInfoResults(List<AssetResult> infoResults) {
		this.infoResults = infoResults;
	}

    /**
     * Gets info results.
     *
     * @return the info results
     */
    public List<AssetResult> getInfoResults( ) {
		return this.infoResults;
	}

}
