package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PortfolioInfoOpenModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.portfolio.shop.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2017-12-28 13:57:52
 */
public class KoubeiServindustryPortfolioShopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5295784836443123694L;

	/** 
	 * 总数
	 */
	@ApiField("portfolio_count")
	private Long portfolioCount;

	/** 
	 * 返回作品集列表
	 */
	@ApiListField("portfolio_info_list")
	@ApiField("portfolio_info_open_model")
	private List<PortfolioInfoOpenModel> portfolioInfoList;

    /**
     * Sets portfolio count.
     *
     * @param portfolioCount the portfolio count
     */
    public void setPortfolioCount(Long portfolioCount) {
		this.portfolioCount = portfolioCount;
	}

    /**
     * Gets portfolio count.
     *
     * @return the portfolio count
     */
    public Long getPortfolioCount( ) {
		return this.portfolioCount;
	}

    /**
     * Sets portfolio info list.
     *
     * @param portfolioInfoList the portfolio info list
     */
    public void setPortfolioInfoList(List<PortfolioInfoOpenModel> portfolioInfoList) {
		this.portfolioInfoList = portfolioInfoList;
	}

    /**
     * Gets portfolio info list.
     *
     * @return the portfolio info list
     */
    public List<PortfolioInfoOpenModel> getPortfolioInfoList( ) {
		return this.portfolioInfoList;
	}

}
