package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出行营销场景
 *
 * @author auto create
 * @since 1.0, 2018-08-17 10:19:02
 */
public class TravelScene extends AlipayObject {

	private static final long serialVersionUID = 8793376399498692342L;

	/**
	 * 出行场景，综合体入参列表
	 */
	@ApiListField("data_list")
	@ApiField("travel_mall_request")
	private List<TravelMallRequest> dataList;

    /**
     * Gets data list.
     *
     * @return the data list
     */
    public List<TravelMallRequest> getDataList() {
		return this.dataList;
	}

    /**
     * Sets data list.
     *
     * @param dataList the data list
     */
    public void setDataList(List<TravelMallRequest> dataList) {
		this.dataList = dataList;
	}

}
