package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizListDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.dropdata.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:56:16
 */
public class AlipayEbppProdmodeDropdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1566325642232437452L;

	/** 
	 * 返回业务类型、子业务类型、产品模式及销账模式下拉列表
	 */
	@ApiListField("data_list")
	@ApiField("biz_list_data_info")
	private List<BizListDataInfo> dataList;

    /**
     * Sets data list.
     *
     * @param dataList the data list
     */
    public void setDataList(List<BizListDataInfo> dataList) {
		this.dataList = dataList;
	}

    /**
     * Gets data list.
     *
     * @return the data list
     */
    public List<BizListDataInfo> getDataList( ) {
		return this.dataList;
	}

}
