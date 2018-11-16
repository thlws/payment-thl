package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.yuebaoasset.detail.send response.
 *
 * @author auto create
 * @since 1.0, 2018-08-24 10:54:36
 */
public class AlipayDataDataserviceYuebaoassetDetailSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7799523749744526617L;

	/** 
	 * yeb_asset_data_num:本次录入数据条数。
可以根据该字段获取本次录入的数据条数，判断是否所有数据都已经落地。
	 */
	@ApiField("yeb_asset_data_num")
	private Long yebAssetDataNum;

    /**
     * Sets yeb asset data num.
     *
     * @param yebAssetDataNum the yeb asset data num
     */
    public void setYebAssetDataNum(Long yebAssetDataNum) {
		this.yebAssetDataNum = yebAssetDataNum;
	}

    /**
     * Gets yeb asset data num.
     *
     * @return the yeb asset data num
     */
    public Long getYebAssetDataNum( ) {
		return this.yebAssetDataNum;
	}

}
