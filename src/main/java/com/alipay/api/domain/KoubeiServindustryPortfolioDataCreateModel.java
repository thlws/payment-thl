package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑泛行业系统商创建作品集接口
 *
 * @author auto create
 * @since 1.0, 2017-10-20 11:04:51
 */
public class KoubeiServindustryPortfolioDataCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6756866846247572745L;

	/**
	 * ISV插件ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 头图素材id
	 */
	@ApiField("cover_media_id")
	private String coverMediaId;

	/**
	 * 头图素材type;
枚举（PICTURE/VIDEO）
	 */
	@ApiField("cover_media_type")
	private String coverMediaType;

	/**
	 * 外部作品集ID
	 */
	@ApiField("external_portfolio_id")
	private String externalPortfolioId;

	/**
	 * 操作人信息
	 */
	@ApiField("portfolio_operator_info")
	private PortfolioOperatorInfo portfolioOperatorInfo;

	/**
	 * 作品集与门店的关系、作品集在门店的展示权重
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
     * Gets external portfolio id.
     *
     * @return the external portfolio id
     */
    public String getExternalPortfolioId() {
		return this.externalPortfolioId;
	}

    /**
     * Sets external portfolio id.
     *
     * @param externalPortfolioId the external portfolio id
     */
    public void setExternalPortfolioId(String externalPortfolioId) {
		this.externalPortfolioId = externalPortfolioId;
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
