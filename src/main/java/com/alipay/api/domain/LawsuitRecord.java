package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业涉诉记录
 *
 * @author auto create
 * @since 1.0, 2017-10-13 14:44:26
 */
public class LawsuitRecord extends AlipayObject {

	private static final long serialVersionUID = 7297569367975849321L;

	/**
	 * 案件流程列表
	 */
	@ApiListField("ajlc_list")
	@ApiField("ep_info")
	private List<EpInfo> ajlcList;

	/**
	 * 曝光台列表
	 */
	@ApiListField("bgt_list")
	@ApiField("ep_info")
	private List<EpInfo> bgtList;

	/**
	 * 裁判文书列表
	 */
	@ApiListField("cpws_list")
	@ApiField("ep_info")
	private List<EpInfo> cpwsList;

	/**
	 * 法院公告列表
	 */
	@ApiListField("fygg_list")
	@ApiField("ep_info")
	private List<EpInfo> fyggList;

	/**
	 * 开庭公告列表
	 */
	@ApiListField("ktgg_list")
	@ApiField("ep_info")
	private List<EpInfo> ktggList;

	/**
	 * 失信公告列表
	 */
	@ApiListField("sxgg_list")
	@ApiField("ep_info")
	private List<EpInfo> sxggList;

	/**
	 * 执行公告列表
	 */
	@ApiListField("zxgg_list")
	@ApiField("ep_info")
	private List<EpInfo> zxggList;

    /**
     * Gets ajlc list.
     *
     * @return the ajlc list
     */
    public List<EpInfo> getAjlcList() {
		return this.ajlcList;
	}

    /**
     * Sets ajlc list.
     *
     * @param ajlcList the ajlc list
     */
    public void setAjlcList(List<EpInfo> ajlcList) {
		this.ajlcList = ajlcList;
	}

    /**
     * Gets bgt list.
     *
     * @return the bgt list
     */
    public List<EpInfo> getBgtList() {
		return this.bgtList;
	}

    /**
     * Sets bgt list.
     *
     * @param bgtList the bgt list
     */
    public void setBgtList(List<EpInfo> bgtList) {
		this.bgtList = bgtList;
	}

    /**
     * Gets cpws list.
     *
     * @return the cpws list
     */
    public List<EpInfo> getCpwsList() {
		return this.cpwsList;
	}

    /**
     * Sets cpws list.
     *
     * @param cpwsList the cpws list
     */
    public void setCpwsList(List<EpInfo> cpwsList) {
		this.cpwsList = cpwsList;
	}

    /**
     * Gets fygg list.
     *
     * @return the fygg list
     */
    public List<EpInfo> getFyggList() {
		return this.fyggList;
	}

    /**
     * Sets fygg list.
     *
     * @param fyggList the fygg list
     */
    public void setFyggList(List<EpInfo> fyggList) {
		this.fyggList = fyggList;
	}

    /**
     * Gets ktgg list.
     *
     * @return the ktgg list
     */
    public List<EpInfo> getKtggList() {
		return this.ktggList;
	}

    /**
     * Sets ktgg list.
     *
     * @param ktggList the ktgg list
     */
    public void setKtggList(List<EpInfo> ktggList) {
		this.ktggList = ktggList;
	}

    /**
     * Gets sxgg list.
     *
     * @return the sxgg list
     */
    public List<EpInfo> getSxggList() {
		return this.sxggList;
	}

    /**
     * Sets sxgg list.
     *
     * @param sxggList the sxgg list
     */
    public void setSxggList(List<EpInfo> sxggList) {
		this.sxggList = sxggList;
	}

    /**
     * Gets zxgg list.
     *
     * @return the zxgg list
     */
    public List<EpInfo> getZxggList() {
		return this.zxggList;
	}

    /**
     * Sets zxgg list.
     *
     * @param zxggList the zxgg list
     */
    public void setZxggList(List<EpInfo> zxggList) {
		this.zxggList = zxggList;
	}

}
