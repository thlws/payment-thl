package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.data.item.recommend.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-03-10 18:40:36
 */
public class AlipayOpenDataItemRecommendBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7838277429996324471L;

	/** 
	 * 推荐结果
	 */
	@ApiListField("result_obj")
	@ApiField("rec_result_info")
	private List<RecResultInfo> resultObj;

    /**
     * Sets result obj.
     *
     * @param resultObj the result obj
     */
    public void setResultObj(List<RecResultInfo> resultObj) {
		this.resultObj = resultObj;
	}

    /**
     * Gets result obj.
     *
     * @return the result obj
     */
    public List<RecResultInfo> getResultObj( ) {
		return this.resultObj;
	}

}
