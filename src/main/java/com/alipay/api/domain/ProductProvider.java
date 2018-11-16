package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值产品提供商
 *
 * @author auto create
 * @since 1.0, 2013-12-17 15:37:31
 */
public class ProductProvider extends AlipayObject {

	private static final long serialVersionUID = 8223598278391929625L;

	/**
	 * 卡代英文名称 备注:淘宝交易为空
	 */
	@ApiField("agency")
	private String agency;

	/**
	 * 卡代中文名称 备注：淘宝交易为空
	 */
	@ApiField("agency_name")
	private String agencyName;

	/**
	 * 业务 类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 充值产品主表ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 子业务类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 子运营商英文名称 备注:淘宝交易为空
	 */
	@ApiField("sub_operator")
	private String subOperator;

	/**
	 * 子运营商中文名称 ,如浙江移动
	 */
	@ApiField("sub_operator_name")
	private String subOperatorName;

    /**
     * Gets agency.
     *
     * @return the agency
     */
    public String getAgency() {
		return this.agency;
	}

    /**
     * Sets agency.
     *
     * @param agency the agency
     */
    public void setAgency(String agency) {
		this.agency = agency;
	}

    /**
     * Gets agency name.
     *
     * @return the agency name
     */
    public String getAgencyName() {
		return this.agencyName;
	}

    /**
     * Sets agency name.
     *
     * @param agencyName the agency name
     */
    public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
	}

    /**
     * Gets sub biz type.
     *
     * @return the sub biz type
     */
    public String getSubBizType() {
		return this.subBizType;
	}

    /**
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

    /**
     * Gets sub operator.
     *
     * @return the sub operator
     */
    public String getSubOperator() {
		return this.subOperator;
	}

    /**
     * Sets sub operator.
     *
     * @param subOperator the sub operator
     */
    public void setSubOperator(String subOperator) {
		this.subOperator = subOperator;
	}

    /**
     * Gets sub operator name.
     *
     * @return the sub operator name
     */
    public String getSubOperatorName() {
		return this.subOperatorName;
	}

    /**
     * Sets sub operator name.
     *
     * @param subOperatorName the sub operator name
     */
    public void setSubOperatorName(String subOperatorName) {
		this.subOperatorName = subOperatorName;
	}

}
