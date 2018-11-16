package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销自运营活动
 *
 * @author auto create
 * @since 1.0, 2018-01-22 19:53:03
 */
public class InteligentMerchantPromo extends AlipayObject {

	private static final long serialVersionUID = 8111344464211614462L;

	/**
	 * 商户自运营活动，当promo_type='GENERAL_MERCHANT',该对象不能为空，其他类型无效
	 */
	@ApiField("general_promo")
	private InteligentGeneralMerchantPromo generalPromo;

	/**
	 * 子活动营销类型；枚举值：（GENERAL_MERCHANT：商户自运营活动）
	 */
	@ApiField("promo_type")
	private String promoType;

    /**
     * Gets general promo.
     *
     * @return the general promo
     */
    public InteligentGeneralMerchantPromo getGeneralPromo() {
		return this.generalPromo;
	}

    /**
     * Sets general promo.
     *
     * @param generalPromo the general promo
     */
    public void setGeneralPromo(InteligentGeneralMerchantPromo generalPromo) {
		this.generalPromo = generalPromo;
	}

    /**
     * Gets promo type.
     *
     * @return the promo type
     */
    public String getPromoType() {
		return this.promoType;
	}

    /**
     * Sets promo type.
     *
     * @param promoType the promo type
     */
    public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

}
