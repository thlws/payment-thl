package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserAnalysisData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.user.data.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-01-05 15:05:24
 */
public class AlipayOpenPublicUserDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1559166368139944768L;

	/** 
	 * 用户分析数据
	 */
	@ApiListField("data_list")
	@ApiField("user_analysis_data")
	private List<UserAnalysisData> dataList;

    /**
     * Sets data list.
     *
     * @param dataList the data list
     */
    public void setDataList(List<UserAnalysisData> dataList) {
		this.dataList = dataList;
	}

    /**
     * Gets data list.
     *
     * @return the data list
     */
    public List<UserAnalysisData> getDataList( ) {
		return this.dataList;
	}

}
