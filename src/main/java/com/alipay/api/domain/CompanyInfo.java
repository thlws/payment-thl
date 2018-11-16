package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业工商综合信息
 *
 * @author auto create
 * @since 1.0, 2017-10-13 14:33:12
 */
public class CompanyInfo extends AlipayObject {

	private static final long serialVersionUID = 6155116783717718213L;

	/**
	 * 企业历史变更信息
	 */
	@ApiListField("alter_list")
	@ApiField("ep_info")
	private List<EpInfo> alterList;

	/**
	 * 企业工商照面信息
	 */
	@ApiField("basic_info")
	private EpInfo basicInfo;

	/**
	 * 企业行政处罚信息
	 */
	@ApiListField("case_info_list")
	@ApiField("ep_info")
	private List<EpInfo> caseInfoList;

	/**
	 * 企业对外投资信息
	 */
	@ApiListField("entinv_list")
	@ApiField("ep_info")
	private List<EpInfo> entinvList;

	/**
	 * 企业法定代表人在其他公司任职信息
	 */
	@ApiListField("fr_position_list")
	@ApiField("ep_info")
	private List<EpInfo> frPositionList;

	/**
	 * 企业法定代表人对外投资信息
	 */
	@ApiListField("frinv_list")
	@ApiField("ep_info")
	private List<EpInfo> frinvList;

	/**
	 * 企业主要管理人员信息
	 */
	@ApiListField("person_list")
	@ApiField("ep_info")
	private List<EpInfo> personList;

	/**
	 * 企业股东及出资信息
	 */
	@ApiListField("share_holder_list")
	@ApiField("ep_info")
	private List<EpInfo> shareHolderList;

    /**
     * Gets alter list.
     *
     * @return the alter list
     */
    public List<EpInfo> getAlterList() {
		return this.alterList;
	}

    /**
     * Sets alter list.
     *
     * @param alterList the alter list
     */
    public void setAlterList(List<EpInfo> alterList) {
		this.alterList = alterList;
	}

    /**
     * Gets basic info.
     *
     * @return the basic info
     */
    public EpInfo getBasicInfo() {
		return this.basicInfo;
	}

    /**
     * Sets basic info.
     *
     * @param basicInfo the basic info
     */
    public void setBasicInfo(EpInfo basicInfo) {
		this.basicInfo = basicInfo;
	}

    /**
     * Gets case info list.
     *
     * @return the case info list
     */
    public List<EpInfo> getCaseInfoList() {
		return this.caseInfoList;
	}

    /**
     * Sets case info list.
     *
     * @param caseInfoList the case info list
     */
    public void setCaseInfoList(List<EpInfo> caseInfoList) {
		this.caseInfoList = caseInfoList;
	}

    /**
     * Gets entinv list.
     *
     * @return the entinv list
     */
    public List<EpInfo> getEntinvList() {
		return this.entinvList;
	}

    /**
     * Sets entinv list.
     *
     * @param entinvList the entinv list
     */
    public void setEntinvList(List<EpInfo> entinvList) {
		this.entinvList = entinvList;
	}

    /**
     * Gets fr position list.
     *
     * @return the fr position list
     */
    public List<EpInfo> getFrPositionList() {
		return this.frPositionList;
	}

    /**
     * Sets fr position list.
     *
     * @param frPositionList the fr position list
     */
    public void setFrPositionList(List<EpInfo> frPositionList) {
		this.frPositionList = frPositionList;
	}

    /**
     * Gets frinv list.
     *
     * @return the frinv list
     */
    public List<EpInfo> getFrinvList() {
		return this.frinvList;
	}

    /**
     * Sets frinv list.
     *
     * @param frinvList the frinv list
     */
    public void setFrinvList(List<EpInfo> frinvList) {
		this.frinvList = frinvList;
	}

    /**
     * Gets person list.
     *
     * @return the person list
     */
    public List<EpInfo> getPersonList() {
		return this.personList;
	}

    /**
     * Sets person list.
     *
     * @param personList the person list
     */
    public void setPersonList(List<EpInfo> personList) {
		this.personList = personList;
	}

    /**
     * Gets share holder list.
     *
     * @return the share holder list
     */
    public List<EpInfo> getShareHolderList() {
		return this.shareHolderList;
	}

    /**
     * Sets share holder list.
     *
     * @param shareHolderList the share holder list
     */
    public void setShareHolderList(List<EpInfo> shareHolderList) {
		this.shareHolderList = shareHolderList;
	}

}
