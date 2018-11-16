package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 系统商修改作品集
 *
 * @author auto create
 * @since 1.0, 2017-10-20 11:04:46
 */
public class KoubeiServindustryPortfolioDataModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6747858144259844496L;

	/**
	 * 头图素材ID
	 */
	@ApiField("cover_media_id")
	private String coverMediaId;

	/**
	 * 头图素材type,枚举(PICTURE/VIDEO),更改头图时必传
	 */
	@ApiField("cover_media_type")
	private String coverMediaType;

	/**
	 * 作品集id
	 */
	@ApiField("portfolio_id")
	private String portfolioId;

	/**
	 * 操作人信息
	 */
	@ApiField("portfolio_operator_info")
	private PortfolioOperatorInfo portfolioOperatorInfo;

	/**
	 * 作品集门店关系&展示权重,需要传要关联的全部店铺,更新模式为覆盖
	 */
	@ApiListField("portfolio_shops")
	@ApiField("portfolio_shop")
	private List<PortfolioShop> portfolioShops;

	/**
	 * 作品集标题
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets cover media id.
     *
     * @return the cover media id
     */
    public String getCoverMediaId() {
		return this.coverMediaId;
	}

    /**
     * Sets cover media id.
     *
     * @param coverMediaId the cover media id
     */
    public void setCoverMediaId(String coverMediaId) {
		this.coverMediaId = coverMediaId;
	}

    /**
     * Gets cover media type.
     *
     * @return the cover media type
     */
    public String getCoverMediaType() {
		return this.coverMediaType;
	}

    /**
     * Sets cover media type.
     *
     * @param coverMediaType the cover media type
     */
    public void setCoverMediaType(String coverMediaType) {
		this.coverMediaType = coverMediaType;
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

    /**
     * Gets portfolio shops.
     *
     * @return the portfolio shops
     */
    public List<PortfolioShop> getPortfolioShops() {
		return this.portfolioShops;
	}

    /**
     * Sets portfolio shops.
     *
     * @param portfolioShops the portfolio shops
     */
    public void setPortfolioShops(List<PortfolioShop> portfolioShops) {
		this.portfolioShops = portfolioShops;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

}
