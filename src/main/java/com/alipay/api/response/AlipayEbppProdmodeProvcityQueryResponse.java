package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryProvCityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.provcity.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:56:41
 */
public class AlipayEbppProdmodeProvcityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1752233652299478626L;

	/** 
	 * 返回省市下拉列表数据
	 */
	@ApiListField("data_list")
	@ApiField("query_prov_city_info")
	private List<QueryProvCityInfo> dataList;

    /**
     * Sets data list.
     *
     * @param dataList the data list
     */
    public void setDataList(List<QueryProvCityInfo> dataList) {
		this.dataList = dataList;
	}

    /**
     * Gets data list.
     *
     * @return the data list
     */
    public List<QueryProvCityInfo> getDataList( ) {
		return this.dataList;
	}

}
