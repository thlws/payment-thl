package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 系统商创建作品接口
 *
 * @author auto create
 * @since 1.0, 2017-10-20 11:05:01
 */
public class KoubeiServindustryPortfolioOpusCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8653118644144758745L;

	/**
	 * ISV插件ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 作品列表信息
	 */
	@ApiListField("opuses")
	@ApiField("opus_info")
	private List<OpusInfo> opuses;

	/**
	 * 作品集ID
	 */
	@ApiField("portfolio_id")
	private String portfolioId;

	/**
	 * 操作人信息
	 */
	@ApiField("portfolio_operator_info")
	private PortfolioOperatorInfo portfolioOperatorInfo;

    /**
     * Gets commodity id.
     *
     * @return the commodity id
     */
    public String getCommodityId() {
		return this.commodityId;
	}

    /**
     * Sets commodity id.
     *
     * @param commodityId the commodity id
     */
    public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

    /**
     * Gets opuses.
     *
     * @return the opuses
     */
    public List<OpusInfo> getOpuses() {
		return this.opuses;
	}

    /**
     * Sets opuses.
     *
     * @param opuses the opuses
     */
    public void setOpuses(List<OpusInfo> opuses) {
		this.opuses = opuses;
	}

    /**
     * Gets portfolio id.
     *
     * @return the portfolio id
     */
    public String getPortfolioId() {
		return this.portfolioId;
	}

    /**
     * Sets portfolio id.
     *
     * @param portfolioId the portfolio id
     */
    public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

    /**
     * Gets portfolio operator info.
     *
     * @return the portfolio operator info
     */
    public PortfolioOperatorInfo getPortfolioOperatorInfo() {
		return this.portfolioOperatorInfo;
	}

    /**
     * Sets portfolio operator info.
     *
     * @param portfolioOperatorInfo the portfolio operator info
     */
    public void setPortfolioOperatorInfo(PortfolioOperatorInfo portfolioOperatorInfo) {
		this.portfolioOperatorInfo = portfolioOperatorInfo;
	}

}
