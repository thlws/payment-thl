package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出账机构接口输出参数列表 ChargeInstResult{ List<ChargeInstMode>}对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ChargeInstMode extends AlipayObject {

	private static final long serialVersionUID = 5264964941165912214L;

	/**
	 * 机构简称(英文名称)
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 机构中文名称
	 */
	@ApiField("charge_inst_name")
	private String chargeInstName;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

    /**
     * Gets charge inst.
     *
     * @return the charge inst
     */
    public String getChargeInst() {
		return this.chargeInst;
	}

    /**
     * Sets charge inst.
     *
     * @param chargeInst the charge inst
     */
    public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

    /**
     * Gets charge inst name.
     *
     * @return the charge inst name
     */
    public String getChargeInstName() {
		return this.chargeInstName;
	}

    /**
     * Sets charge inst name.
     *
     * @param chargeInstName the charge inst name
     */
    public void setChargeInstName(String chargeInstName) {
		this.chargeInstName = chargeInstName;
	}

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
     * Gets province.
     *
     * @return the province
     */
    public String getProvince() {
		return this.province;
	}

    /**
     * Sets province.
     *
     * @param province the province
     */
    public void setProvince(String province) {
		this.province = province;
	}

}
