package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配送完成反馈接口
 *
 * @author auto create
 * @since 1.0, 2018-07-30 13:46:40
 */
public class AntMerchantExpandAssetdeliveryCompleteSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4362432284754273352L;

	/**
	 * 配送完成反馈信息
	 */
	@ApiListField("asset_delivery_details")
	@ApiField("asset_delivery_detail")
	private List<AssetDeliveryDetail> assetDeliveryDetails;

    /**
     * Gets asset delivery details.
     *
     * @return the asset delivery details
     */
    public List<AssetDeliveryDetail> getAssetDeliveryDetails() {
		return this.assetDeliveryDetails;
	}

    /**
     * Sets asset delivery details.
     *
     * @param assetDeliveryDetails the asset delivery details
     */
    public void setAssetDeliveryDetails(List<AssetDeliveryDetail> assetDeliveryDetails) {
		this.assetDeliveryDetails = assetDeliveryDetails;
	}

}
