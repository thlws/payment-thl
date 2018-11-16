package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 输出的出账机构模型
 *
 * @author auto create
 * @since 1.0, 2017-09-19 12:38:02
 */
public class JfExportChargeInstModel extends AlipayObject {

	private static final long serialVersionUID = 7389739145378797924L;

	/**
	 * 出账机构英文简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 出账机构中文名称
	 */
	@ApiField("charge_inst_name")
	private String chargeInstName;

	/**
	 * 出账机构所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 拓展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 出账机构所在省份
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
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField() {
		return this.extendField;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
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
