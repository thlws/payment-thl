package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品库存单元属性值详情
 *
 * @author auto create
 * @since 1.0, 2018-06-26 14:23:36
 */
public class SkuPropertyValue extends AlipayObject {

	private static final long serialVersionUID = 6751682941614141888L;

	/**
	 * 外部sku属性值ID,由外部商户定义
	 */
	@ApiField("out_pv_id")
	private String outPvId;

	/**
	 * 外部商户sku属性值
	 */
	@ApiField("value")
	private String value;

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
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
		return this.value;
	}

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(String value) {
		this.value = value;
	}

}
