package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 使用规则信息
 *
 * @author auto create
 * @since 1.0, 2016-06-23 17:38:07
 */
public class UseRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 1286772768864258646L;

	/**
	 * 适用门店列表
	 */
	@ApiListField("suitable_shops")
	@ApiField("string")
	private List<String> suitableShops;

	/**
	 * 核销方式
	 */
	@ApiListField("use_mode")
	@ApiField("string")
	private List<String> useMode;

    /**
     * Gets suitable shops.
     *
     * @return the suitable shops
     */
    public List<String> getSuitableShops() {
		return this.suitableShops;
	}

    /**
     * Sets suitable shops.
     *
     * @param suitableShops the suitable shops
     */
    public void setSuitableShops(List<String> suitableShops) {
		this.suitableShops = suitableShops;
	}

    /**
     * Gets use mode.
     *
     * @return the use mode
     */
    public List<String> getUseMode() {
		return this.useMode;
	}

    /**
     * Sets use mode.
     *
     * @param useMode the use mode
     */
    public void setUseMode(List<String> useMode) {
		this.useMode = useMode;
	}

}
