package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询机构英文名称
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:56:59
 */
public class AlipayEbppProdmodeInstshortnameQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2219938465398665858L;

	/**
	 * 出账机构中文名称
	 */
	@ApiField("chargeinst_cn_name")
	private String chargeinstCnName;

    /**
     * Gets chargeinst cn name.
     *
     * @return the chargeinst cn name
     */
    public String getChargeinstCnName() {
		return this.chargeinstCnName;
	}

    /**
     * Sets chargeinst cn name.
     *
     * @param chargeinstCnName the chargeinst cn name
     */
    public void setChargeinstCnName(String chargeinstCnName) {
		this.chargeinstCnName = chargeinstCnName;
	}

}
