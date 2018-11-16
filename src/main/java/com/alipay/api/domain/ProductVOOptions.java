package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品查询维度选项
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ProductVOOptions extends AlipayObject {

	private static final long serialVersionUID = 3135327236155511494L;

	/**
	 * 是否包括产品条件组信息，默认为false
	 */
	@ApiField("include_condition_group")
	private Boolean includeConditionGroup;

	/**
	 * 是否包括产品基本信息，默认为false
	 */
	@ApiField("include_prod_base")
	private Boolean includeProdBase;

	/**
	 * 是否包括产品参与者信息，默认为false
	 */
	@ApiField("include_prod_ip")
	private Boolean includeProdIp;

	/**
	 * 是否包括产品区域信息
	 */
	@ApiField("include_prod_lo")
	private Boolean includeProdLo;

	/**
	 * 是否包括产品外标信息
	 */
	@ApiField("include_prod_mark")
	private Boolean includeProdMark;

	/**
	 * 产品关联关系
	 */
	@ApiField("include_prod_rel")
	private String includeProdRel;

	/**
	 * 是否包括产品资源项信息
	 */
	@ApiField("include_prod_ri")
	private Boolean includeProdRi;

    /**
     * Gets include condition group.
     *
     * @return the include condition group
     */
    public Boolean getIncludeConditionGroup() {
		return this.includeConditionGroup;
	}

    /**
     * Sets include condition group.
     *
     * @param includeConditionGroup the include condition group
     */
    public void setIncludeConditionGroup(Boolean includeConditionGroup) {
		this.includeConditionGroup = includeConditionGroup;
	}

    /**
     * Gets include prod base.
     *
     * @return the include prod base
     */
    public Boolean getIncludeProdBase() {
		return this.includeProdBase;
	}

    /**
     * Sets include prod base.
     *
     * @param includeProdBase the include prod base
     */
    public void setIncludeProdBase(Boolean includeProdBase) {
		this.includeProdBase = includeProdBase;
	}

    /**
     * Gets include prod ip.
     *
     * @return the include prod ip
     */
    public Boolean getIncludeProdIp() {
		return this.includeProdIp;
	}

    /**
     * Sets include prod ip.
     *
     * @param includeProdIp the include prod ip
     */
    public void setIncludeProdIp(Boolean includeProdIp) {
		this.includeProdIp = includeProdIp;
	}

    /**
     * Gets include prod lo.
     *
     * @return the include prod lo
     */
    public Boolean getIncludeProdLo() {
		return this.includeProdLo;
	}

    /**
     * Sets include prod lo.
     *
     * @param includeProdLo the include prod lo
     */
    public void setIncludeProdLo(Boolean includeProdLo) {
		this.includeProdLo = includeProdLo;
	}

    /**
     * Gets include prod mark.
     *
     * @return the include prod mark
     */
    public Boolean getIncludeProdMark() {
		return this.includeProdMark;
	}

    /**
     * Sets include prod mark.
     *
     * @param includeProdMark the include prod mark
     */
    public void setIncludeProdMark(Boolean includeProdMark) {
		this.includeProdMark = includeProdMark;
	}

    /**
     * Gets include prod rel.
     *
     * @return the include prod rel
     */
    public String getIncludeProdRel() {
		return this.includeProdRel;
	}

    /**
     * Sets include prod rel.
     *
     * @param includeProdRel the include prod rel
     */
    public void setIncludeProdRel(String includeProdRel) {
		this.includeProdRel = includeProdRel;
	}

    /**
     * Gets include prod ri.
     *
     * @return the include prod ri
     */
    public Boolean getIncludeProdRi() {
		return this.includeProdRi;
	}

    /**
     * Sets include prod ri.
     *
     * @param includeProdRi the include prod ri
     */
    public void setIncludeProdRi(Boolean includeProdRi) {
		this.includeProdRi = includeProdRi;
	}

}
