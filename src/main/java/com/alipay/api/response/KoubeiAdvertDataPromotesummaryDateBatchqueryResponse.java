package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoteDateModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.data.promotesummary.date.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2017-09-29 15:06:26
 */
public class KoubeiAdvertDataPromotesummaryDateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5645215362961992698L;

	/** 
	 * 口碑客推广日期维度汇总数据
	 */
	@ApiListField("data")
	@ApiField("promote_date_model")
	private List<PromoteDateModel> data;

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(List<PromoteDateModel> data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public List<PromoteDateModel> getData( ) {
		return this.data;
	}

}
