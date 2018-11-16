package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrizeModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.prize.list.consult response.
 *
 * @author auto create
 * @since 1.0, 2018-02-07 12:01:42
 */
public class MybankMarketingCampaignPrizeListConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2586168622997738676L;

	/** 
	 * 可用的奖品列表
	 */
	@ApiListField("prize_list")
	@ApiField("prize_model")
	private List<PrizeModel> prizeList;

    /**
     * Sets prize list.
     *
     * @param prizeList the prize list
     */
    public void setPrizeList(List<PrizeModel> prizeList) {
		this.prizeList = prizeList;
	}

    /**
     * Gets prize list.
     *
     * @return the prize list
     */
    public List<PrizeModel> getPrizeList( ) {
		return this.prizeList;
	}

}
