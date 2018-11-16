package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品库加料查询接口
 *
 * @author auto create
 * @since 1.0, 2018-09-02 19:50:37
 */
public class KoubeiCateringDishMaterialQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5619674643464742855L;

	/**
	 * 加料的id
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 要查询的加料库的商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

    /**
     * Gets material id.
     *
     * @return the material id
     */
    public String getMaterialId() {
		return this.materialId;
	}

    /**
     * Sets material id.
     *
     * @param materialId the material id
     */
    public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

    /**
     * Gets merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId() {
		return this.merchantId;
	}

    /**
     * Sets merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
