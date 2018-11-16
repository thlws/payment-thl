package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * （快捷投保）生成专区二维码
 *
 * @author auto create
 * @since 1.0, 2017-10-24 10:29:59
 */
public class AlipayInsCooperationRegionQrcodeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5661549556881945476L;

	/**
	 * 保险代理人在保险公司的惟一ID，数据来自保险公司内部管理系统
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 代理人姓名
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 代理人手机号码
	 */
	@ApiField("agent_phone")
	private String agentPhone;

	/**
	 * 保险公司在蚂蚁保险平台的惟一ID，由蚂蚁保险平台分配。
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 产品编码列表，蚂蚁保险平台会为每个产品分配一个唯一的产品编码
	 */
	@ApiListField("prod_code_list")
	@ApiField("string")
	private List<String> prodCodeList;

	/**
	 * 专区在保险公司的惟一ID，数据来自保险公司内部管理系统
	 */
	@ApiField("region_id")
	private String regionId;

	/**
	 * 专区名称，会作为机构保险号首页的专区名称做展示
	 */
	@ApiField("region_name")
	private String regionName;

    /**
     * Gets agent id.
     *
     * @return the agent id
     */
    public String getAgentId() {
		return this.agentId;
	}

    /**
     * Sets agent id.
     *
     * @param agentId the agent id
     */
    public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

    /**
     * Gets agent name.
     *
     * @return the agent name
     */
    public String getAgentName() {
		return this.agentName;
	}

    /**
     * Sets agent name.
     *
     * @param agentName the agent name
     */
    public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

    /**
     * Gets agent phone.
     *
     * @return the agent phone
     */
    public String getAgentPhone() {
		return this.agentPhone;
	}

    /**
     * Sets agent phone.
     *
     * @param agentPhone the agent phone
     */
    public void setAgentPhone(String agentPhone) {
		this.agentPhone = agentPhone;
	}

    /**
     * Gets inst id.
     *
     * @return the inst id
     */
    public String getInstId() {
		return this.instId;
	}

    /**
     * Sets inst id.
     *
     * @param instId the inst id
     */
    public void setInstId(String instId) {
		this.instId = instId;
	}

    /**
     * Gets prod code list.
     *
     * @return the prod code list
     */
    public List<String> getProdCodeList() {
		return this.prodCodeList;
	}

    /**
     * Sets prod code list.
     *
     * @param prodCodeList the prod code list
     */
    public void setProdCodeList(List<String> prodCodeList) {
		this.prodCodeList = prodCodeList;
	}

    /**
     * Gets region id.
     *
     * @return the region id
     */
    public String getRegionId() {
		return this.regionId;
	}

    /**
     * Sets region id.
     *
     * @param regionId the region id
     */
    public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

    /**
     * Gets region name.
     *
     * @return the region name
     */
    public String getRegionName() {
		return this.regionName;
	}

    /**
     * Sets region name.
     *
     * @param regionName the region name
     */
    public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

}
