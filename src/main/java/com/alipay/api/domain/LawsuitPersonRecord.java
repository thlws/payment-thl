package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 个人涉诉记录
 *
 * @author auto create
 * @since 1.0, 2017-10-13 14:44:14
 */
public class LawsuitPersonRecord extends AlipayObject {

	private static final long serialVersionUID = 3674886248456712257L;

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
