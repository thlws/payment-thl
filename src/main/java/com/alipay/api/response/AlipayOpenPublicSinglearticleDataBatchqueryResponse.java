package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SingleArticleAnalysisData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.singlearticle.data.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-01-05 15:06:32
 */
public class AlipayOpenPublicSinglearticleDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4692841288424866694L;

	/** 
	 * 单篇文章分析数据列表
	 */
	@ApiListField("data_list")
	@ApiField("single_article_analysis_data")
	private List<SingleArticleAnalysisData> dataList;

    /**
     * Sets data list.
     *
     * @param dataList the data list
     */
    public void setDataList(List<SingleArticleAnalysisData> dataList) {
		this.dataList = dataList;
	}

    /**
     * Gets data list.
     *
     * @return the data list
     */
    public List<SingleArticleAnalysisData> getDataList( ) {
		return this.dataList;
	}

}
