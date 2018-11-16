package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 系统商删除作品接口
 *
 * @author auto create
 * @since 1.0, 2017-10-20 11:04:58
 */
public class KoubeiServindustryPortfolioOpusDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7326646644545411888L;

	/**
	 * 作品ID列表
	 */
	@ApiListField("opus_ids")
	@ApiField("string")
	private List<String> opusIds;

	/**
	 * 操作人信息
	 */
	@ApiField("portfolio_operator_info")
	private PortfolioOperatorInfo portfolioOperatorInfo;

    /**
     * Gets opus ids.
     *
     * @return the opus ids
     */
    public List<String> getOpusIds() {
		return this.opusIds;
	}

    /**
     * Sets opus ids.
     *
     * @param opusIds the opus ids
     */
    public void setOpusIds(List<String> opusIds) {
		this.opusIds = opusIds;
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
