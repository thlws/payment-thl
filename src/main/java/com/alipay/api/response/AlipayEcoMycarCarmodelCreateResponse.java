package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.carmodel.create response.
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:52:34
 */
public class AlipayEcoMycarCarmodelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3215511155858198535L;

	/** 
	 * 支付宝车型库品牌编号（新增品牌信息时返回品牌编号）系统唯一
	 */
	@ApiField("brand_id")
	private String brandId;

	/** 
	 * 支付宝车型库厂商编号（新增厂商信息时返回厂商编号）系统唯一
	 */
	@ApiField("company_id")
	private String companyId;

	/** 
	 * 支付宝车型库车型编号（新增车型信息时返回车型编号）系统唯一
	 */
	@ApiField("model_id")
	private String modelId;

	/** 
	 * 支付宝车型库车系编号（新增车系信息时返回车系编号）系统唯一
	 */
	@ApiField("serie_id")
	private String serieId;

    /**
     * Sets brand id.
     *
     * @param brandId the brand id
     */
    public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

    /**
     * Gets brand id.
     *
     * @return the brand id
     */
    public String getBrandId( ) {
		return this.brandId;
	}

    /**
     * Sets company id.
     *
     * @param companyId the company id
     */
    public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

    /**
     * Gets company id.
     *
     * @return the company id
     */
    public String getCompanyId( ) {
		return this.companyId;
	}

    /**
     * Sets entity id.
     *
     * @param modelId the entity id
     */
    public void setModelId(String modelId) {
		this.modelId = modelId;
	}

    /**
     * Gets entity id.
     *
     * @return the entity id
     */
    public String getModelId( ) {
		return this.modelId;
	}

    /**
     * Sets serie id.
     *
     * @param serieId the serie id
     */
    public void setSerieId(String serieId) {
		this.serieId = serieId;
	}

    /**
     * Gets serie id.
     *
     * @return the serie id
     */
    public String getSerieId( ) {
		return this.serieId;
	}

}
