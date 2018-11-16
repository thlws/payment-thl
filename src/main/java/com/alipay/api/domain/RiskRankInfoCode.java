package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险评分infocode
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class RiskRankInfoCode extends AlipayObject {

	private static final long serialVersionUID = 3262949389871561792L;

	/**
	 * infocode
	 */
	@ApiField("code")
	private String code;

	/**
	 * 此infocode在总的得分中的贡献度
	 */
	@ApiField("contribution_degree")
	private Long contributionDegree;

	/**
	 * 风险描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 模型名称
	 */
	@ApiField("model_name")
	private String modelName;

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets contribution degree.
     *
     * @return the contribution degree
     */
    public Long getContributionDegree() {
		return this.contributionDegree;
	}

    /**
     * Sets contribution degree.
     *
     * @param contributionDegree the contribution degree
     */
    public void setContributionDegree(Long contributionDegree) {
		this.contributionDegree = contributionDegree;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets entity name.
     *
     * @return the entity name
     */
    public String getModelName() {
		return this.modelName;
	}

    /**
     * Sets entity name.
     *
     * @param modelName the entity name
     */
    public void setModelName(String modelName) {
		this.modelName = modelName;
	}

}
