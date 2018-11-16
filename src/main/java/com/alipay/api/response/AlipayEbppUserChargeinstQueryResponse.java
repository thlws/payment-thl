package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryUserChargeInstAndAreaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.user.chargeinst.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:54:26
 */
public class AlipayEbppUserChargeinstQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5453973996629433431L;

	/** 
	 * 提供给邦道的接口，查询用户常缴机构与常住城市信息，该对象为输出具体内容。
	 */
	@ApiListField("data_list")
	@ApiField("query_user_charge_inst_and_area_info")
	private List<QueryUserChargeInstAndAreaInfo> dataList;

    /**
     * Sets data list.
     *
     * @param dataList the data list
     */
    public void setDataList(List<QueryUserChargeInstAndAreaInfo> dataList) {
		this.dataList = dataList;
	}

    /**
     * Gets data list.
     *
     * @return the data list
     */
    public List<QueryUserChargeInstAndAreaInfo> getDataList( ) {
		return this.dataList;
	}

}
