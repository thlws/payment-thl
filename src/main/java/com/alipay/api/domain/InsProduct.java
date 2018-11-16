package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险产品
 *
 * @author auto create
 * @since 1.0, 2018-01-02 14:36:49
 */
public class InsProduct extends AlipayObject {

	private static final long serialVersionUID = 5384657232555567371L;

	/**
	 * 险种列表
	 */
	@ApiField("coverages")
	private InsProdCoverage coverages;

	/**
	 * 起保时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("effect_date")
	private String effectDate;

	/**
	 * 结束时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("invalid_date")
	private String invalidDate;

	/**
	 * 是否标准产品
	 */
	@ApiField("is_sp")
	private Boolean isSp;

	/**
	 * 责任信息
	 */
	@ApiListField("liabilities")
	@ApiField("ins_liability")
	private List<InsLiability> liabilities;

	/**
	 * 保险机构;当产品为标准产品时该值为空
	 */
	@ApiField("merchant")
	private InsMerchant merchant;

	/**
	 * 产品编码;由蚂蚁保险平台分配,商户通过该产品编码投保特定的保险产品
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品描述
	 */
	@ApiField("prod_desc")
	private String prodDesc;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 标准产品码
	 */
	@ApiField("prod_no")
	private String prodNo;

	/**
	 * 产品版本号
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 实付保费[优惠后的金额]
	 */
	@ApiField("real_premium")
	private String realPremium;

	/**
	 * 优惠保费
	 */
	@ApiField("reduce_premium")
	private String reducePremium;

	/**
	 * 资源项
	 */
	@ApiListField("resources")
	@ApiField("ins_prod_resource")
	private List<InsProdResource> resources;

	/**
	 * 产品销量，配置了销量统计的产品才会有销量信息
	 */
	@ApiField("sales")
	private Long sales;

	/**
	 * 产品简称
	 */
	@ApiField("short_name")
	private String shortName;

	/**
	 * 标准产品编码;标准产品是不同保险公司同一类型产品的一种抽象
	 */
	@ApiField("sp_code")
	private String spCode;

	/**
	 * 标记列表
	 */
	@ApiListField("tags")
	@ApiField("ins_prod_tag")
	private List<InsProdTag> tags;

	/**
	 * 总保费
	 */
	@ApiField("total_premium")
	private String totalPremium;

    /**
     * Gets coverages.
     *
     * @return the coverages
     */
    public InsProdCoverage getCoverages() {
		return this.coverages;
	}

    /**
     * Sets coverages.
     *
     * @param coverages the coverages
     */
    public void setCoverages(InsProdCoverage coverages) {
		this.coverages = coverages;
	}

    /**
     * Gets effect date.
     *
     * @return the effect date
     */
    public String getEffectDate() {
		return this.effectDate;
	}

    /**
     * Sets effect date.
     *
     * @param effectDate the effect date
     */
    public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}

    /**
     * Gets invalid date.
     *
     * @return the invalid date
     */
    public String getInvalidDate() {
		return this.invalidDate;
	}

    /**
     * Sets invalid date.
     *
     * @param invalidDate the invalid date
     */
    public void setInvalidDate(String invalidDate) {
		this.invalidDate = invalidDate;
	}

    /**
     * Gets is sp.
     *
     * @return the is sp
     */
    public Boolean getIsSp() {
		return this.isSp;
	}

    /**
     * Sets is sp.
     *
     * @param isSp the is sp
     */
    public void setIsSp(Boolean isSp) {
		this.isSp = isSp;
	}

    /**
     * Gets liabilities.
     *
     * @return the liabilities
     */
    public List<InsLiability> getLiabilities() {
		return this.liabilities;
	}

    /**
     * Sets liabilities.
     *
     * @param liabilities the liabilities
     */
    public void setLiabilities(List<InsLiability> liabilities) {
		this.liabilities = liabilities;
	}

    /**
     * Gets merchant.
     *
     * @return the merchant
     */
    public InsMerchant getMerchant() {
		return this.merchant;
	}

    /**
     * Sets merchant.
     *
     * @param merchant the merchant
     */
    public void setMerchant(InsMerchant merchant) {
		this.merchant = merchant;
	}

    /**
     * Gets prod code.
     *
     * @return the prod code
     */
    public String getProdCode() {
		return this.prodCode;
	}

    /**
     * Sets prod code.
     *
     * @param prodCode the prod code
     */
    public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

    /**
     * Gets prod desc.
     *
     * @return the prod desc
     */
    public String getProdDesc() {
		return this.prodDesc;
	}

    /**
     * Sets prod desc.
     *
     * @param prodDesc the prod desc
     */
    public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

    /**
     * Gets prod name.
     *
     * @return the prod name
     */
    public String getProdName() {
		return this.prodName;
	}

    /**
     * Sets prod name.
     *
     * @param prodName the prod name
     */
    public void setProdName(String prodName) {
		this.prodName = prodName;
	}

    /**
     * Gets prod no.
     *
     * @return the prod no
     */
    public String getProdNo() {
		return this.prodNo;
	}

    /**
     * Sets prod no.
     *
     * @param prodNo the prod no
     */
    public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

    /**
     * Gets prod version.
     *
     * @return the prod version
     */
    public String getProdVersion() {
		return this.prodVersion;
	}

    /**
     * Sets prod version.
     *
     * @param prodVersion the prod version
     */
    public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

    /**
     * Gets real premium.
     *
     * @return the real premium
     */
    public String getRealPremium() {
		return this.realPremium;
	}

    /**
     * Sets real premium.
     *
     * @param realPremium the real premium
     */
    public void setRealPremium(String realPremium) {
		this.realPremium = realPremium;
	}

    /**
     * Gets reduce premium.
     *
     * @return the reduce premium
     */
    public String getReducePremium() {
		return this.reducePremium;
	}

    /**
     * Sets reduce premium.
     *
     * @param reducePremium the reduce premium
     */
    public void setReducePremium(String reducePremium) {
		this.reducePremium = reducePremium;
	}

    /**
     * Gets resources.
     *
     * @return the resources
     */
    public List<InsProdResource> getResources() {
		return this.resources;
	}

    /**
     * Sets resources.
     *
     * @param resources the resources
     */
    public void setResources(List<InsProdResource> resources) {
		this.resources = resources;
	}

    /**
     * Gets sales.
     *
     * @return the sales
     */
    public Long getSales() {
		return this.sales;
	}

    /**
     * Sets sales.
     *
     * @param sales the sales
     */
    public void setSales(Long sales) {
		this.sales = sales;
	}

    /**
     * Gets short name.
     *
     * @return the short name
     */
    public String getShortName() {
		return this.shortName;
	}

    /**
     * Sets short name.
     *
     * @param shortName the short name
     */
    public void setShortName(String shortName) {
		this.shortName = shortName;
	}

    /**
     * Gets sp code.
     *
     * @return the sp code
     */
    public String getSpCode() {
		return this.spCode;
	}

    /**
     * Sets sp code.
     *
     * @param spCode the sp code
     */
    public void setSpCode(String spCode) {
		this.spCode = spCode;
	}

    /**
     * Gets tags.
     *
     * @return the tags
     */
    public List<InsProdTag> getTags() {
		return this.tags;
	}

    /**
     * Sets tags.
     *
     * @param tags the tags
     */
    public void setTags(List<InsProdTag> tags) {
		this.tags = tags;
	}

    /**
     * Gets total premium.
     *
     * @return the total premium
     */
    public String getTotalPremium() {
		return this.totalPremium;
	}

    /**
     * Sets total premium.
     *
     * @param totalPremium the total premium
     */
    public void setTotalPremium(String totalPremium) {
		this.totalPremium = totalPremium;
	}

}
