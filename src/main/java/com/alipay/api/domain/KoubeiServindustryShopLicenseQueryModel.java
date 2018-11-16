package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据Pid查询该商户下的门店是否有营业执照
 *
 * @author auto create
 * @since 1.0, 2018-08-31 14:42:09
 */
public class KoubeiServindustryShopLicenseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1115525561132723735L;

	/**
	 * 商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
