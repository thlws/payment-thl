package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.logistics.express.price.query response.
 *
 * @author auto create
 * @since 1.0, 2017-04-06 18:04:51
 */
public class AlipayEcoLogisticsExpressPriceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2519566749767164221L;

	/** 
	 * 续重价格（单位：元）
	 */
	@ApiField("extra_weight_price")
	private String extraWeightPrice;

	/** 
	 * 续重单位（单位：克）
	 */
	@ApiField("extra_weight_unit")
	private Long extraWeightUnit;

	/** 
	 * 首重重量（单位：克）
	 */
	@ApiField("preset_weight")
	private Long presetWeight;

	/** 
	 * 首重价格（单位：元）
	 */
	@ApiField("preset_weight_price")
	private String presetWeightPrice;

    /**
     * Sets extra weight price.
     *
     * @param extraWeightPrice the extra weight price
     */
    public void setExtraWeightPrice(String extraWeightPrice) {
		this.extraWeightPrice = extraWeightPrice;
	}

    /**
     * Gets extra weight price.
     *
     * @return the extra weight price
     */
    public String getExtraWeightPrice( ) {
		return this.extraWeightPrice;
	}

    /**
     * Sets extra weight unit.
     *
     * @param extraWeightUnit the extra weight unit
     */
    public void setExtraWeightUnit(Long extraWeightUnit) {
		this.extraWeightUnit = extraWeightUnit;
	}

    /**
     * Gets extra weight unit.
     *
     * @return the extra weight unit
     */
    public Long getExtraWeightUnit( ) {
		return this.extraWeightUnit;
	}

    /**
     * Sets preset weight.
     *
     * @param presetWeight the preset weight
     */
    public void setPresetWeight(Long presetWeight) {
		this.presetWeight = presetWeight;
	}

    /**
     * Gets preset weight.
     *
     * @return the preset weight
     */
    public Long getPresetWeight( ) {
		return this.presetWeight;
	}

    /**
     * Sets preset weight price.
     *
     * @param presetWeightPrice the preset weight price
     */
    public void setPresetWeightPrice(String presetWeightPrice) {
		this.presetWeightPrice = presetWeightPrice;
	}

    /**
     * Gets preset weight price.
     *
     * @return the preset weight price
     */
    public String getPresetWeightPrice( ) {
		return this.presetWeightPrice;
	}

}
