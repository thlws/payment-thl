package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrizeModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.prize.list.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-21 18:35:44
 */
public class MybankMarketingCampaignPrizeListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4843233846353753517L;

	/** 
	 * 奖品列表
	 */
	@ApiListField("prize_list")
	@ApiField("prize_model")
	private List<PrizeModel> prizeList;

	/** 
	 * 奖品总个数
	 */
	@ApiField("total_size")
	private Long totalSize;

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

    /**
     * Sets total size.
     *
     * @param totalSize the total size
     */
    public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

    /**
     * Gets total size.
     *
     * @return the total size
     */
    public Long getTotalSize( ) {
		return this.totalSize;
	}

}
