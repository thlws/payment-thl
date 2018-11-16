package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryPackageVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.deliverypackage.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-12 17:20:00
 */
public class KoubeiRetailWmsDeliverypackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6532363777276988131L;

	/** 
	 * 包裹列表
	 */
	@ApiListField("delivery_package_vo_list")
	@ApiField("delivery_package_v_o")
	private List<DeliveryPackageVO> deliveryPackageVoList;

    /**
     * Sets delivery package vo list.
     *
     * @param deliveryPackageVoList the delivery package vo list
     */
    public void setDeliveryPackageVoList(List<DeliveryPackageVO> deliveryPackageVoList) {
		this.deliveryPackageVoList = deliveryPackageVoList;
	}

    /**
     * Gets delivery package vo list.
     *
     * @return the delivery package vo list
     */
    public List<DeliveryPackageVO> getDeliveryPackageVoList( ) {
		return this.deliveryPackageVoList;
	}

}
