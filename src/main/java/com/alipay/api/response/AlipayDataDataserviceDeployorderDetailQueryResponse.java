package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DxDeployOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.deployorder.detail.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:51:01
 */
public class AlipayDataDataserviceDeployorderDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8327354427422614224L;

	/** 
	 * 部署单列表
	 */
	@ApiListField("deploy_order_list")
	@ApiField("dx_deploy_order_info")
	private List<DxDeployOrderInfo> deployOrderList;

    /**
     * Sets deploy order list.
     *
     * @param deployOrderList the deploy order list
     */
    public void setDeployOrderList(List<DxDeployOrderInfo> deployOrderList) {
		this.deployOrderList = deployOrderList;
	}

    /**
     * Gets deploy order list.
     *
     * @return the deploy order list
     */
    public List<DxDeployOrderInfo> getDeployOrderList( ) {
		return this.deployOrderList;
	}

}
