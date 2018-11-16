package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YLBPriceDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.yulibao.price.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-08 17:34:58
 */
public class MybankFinanceYulibaoPriceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1444836313654481789L;

	/** 
	 * 余利宝行情信息列表
	 */
	@ApiListField("ylb_price_detail_infos")
	@ApiField("y_l_b_price_detail_info")
	private List<YLBPriceDetailInfo> ylbPriceDetailInfos;

    /**
     * Sets ylb price detail infos.
     *
     * @param ylbPriceDetailInfos the ylb price detail infos
     */
    public void setYlbPriceDetailInfos(List<YLBPriceDetailInfo> ylbPriceDetailInfos) {
		this.ylbPriceDetailInfos = ylbPriceDetailInfos;
	}

    /**
     * Gets ylb price detail infos.
     *
     * @return the ylb price detail infos
     */
    public List<YLBPriceDetailInfo> getYlbPriceDetailInfos( ) {
		return this.ylbPriceDetailInfos;
	}

}
