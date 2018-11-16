package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存量单位描述对象
 *
 * @author auto create
 * @since 1.0, 2017-03-17 17:48:10
 */
public class SkuDescInfo extends AlipayObject {

	private static final long serialVersionUID = 3166559872762567479L;

	/**
	 * 城市行政代码，用于不同城市定价时使用，默认价格使用-1
	 */
	@ApiField("city")
	private String city;

	/**
	 * 第三方商户定义的外部属性值Id,多个id用英文逗号分隔
	 */
	@ApiField("out_pv_id")
	private String outPvId;

	/**
	 * 商户库存量单位id.由外部商户生成,保证同一个商品下的id是唯一，只支持数字、字母和下划线
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
		return this.city;
	}

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
		this.city = city;
	}

    /**
     * Gets out pv id.
     *
     * @return the out pv id
     */
    public String getOutPvId() {
		return this.outPvId;
	}

    /**
     * Sets out pv id.
     *
     * @param outPvId the out pv id
     */
    public void setOutPvId(String outPvId) {
		this.outPvId = outPvId;
	}

    /**
     * Gets out sku id.
     *
     * @return the out sku id
     */
    public String getOutSkuId() {
		return this.outSkuId;
	}

    /**
     * Sets out sku id.
     *
     * @param outSkuId the out sku id
     */
    public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

}
