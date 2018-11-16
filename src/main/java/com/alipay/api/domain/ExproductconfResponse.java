package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品（学校）模型-输出参数
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class ExproductconfResponse extends AlipayObject {

	private static final long serialVersionUID = 6187346862743761123L;

	/**
	 * 出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 出账机构中文名称
	 */
	@ApiField("chargeinst_name")
	private String chargeinstName;

	/**
	 * 销账机构
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/**
	 * 销账机构中文名称
	 */
	@ApiField("chargeoffinst_name")
	private String chargeoffinstName;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 扩展字段
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 产品状态
	 */
	@ApiField("status")
	private String status;

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
     * Gets chargeinst name.
     *
     * @return the chargeinst name
     */
    public String getChargeinstName() {
		return this.chargeinstName;
	}

    /**
     * Sets chargeinst name.
     *
     * @param chargeinstName the chargeinst name
     */
    public void setChargeinstName(String chargeinstName) {
		this.chargeinstName = chargeinstName;
	}

    /**
     * Gets chargeoff inst.
     *
     * @return the chargeoff inst
     */
    public String getChargeoffInst() {
		return this.chargeoffInst;
	}

    /**
     * Sets chargeoff inst.
     *
     * @param chargeoffInst the chargeoff inst
     */
    public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

    /**
     * Gets chargeoffinst name.
     *
     * @return the chargeoffinst name
     */
    public String getChargeoffinstName() {
		return this.chargeoffinstName;
	}

    /**
     * Sets chargeoffinst name.
     *
     * @param chargeoffinstName the chargeoffinst name
     */
    public void setChargeoffinstName(String chargeoffinstName) {
		this.chargeoffinstName = chargeoffinstName;
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
     * Gets extend.
     *
     * @return the extend
     */
    public String getExtend() {
		return this.extend;
	}

    /**
     * Sets extend.
     *
     * @param extend the extend
     */
    public void setExtend(String extend) {
		this.extend = extend;
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

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
