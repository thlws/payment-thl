package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 某自然人担任 法人/股东/主要管理人员 的企业信息
 *
 * @author auto create
 * @since 1.0, 2017-10-13 14:33:23
 */
public class CompanyRole extends AlipayObject {

	private static final long serialVersionUID = 1393739642335567479L;

	/**
	 * 自然人担任企业法人的企业信息
	 */
	@ApiListField("ry_pos_fr_list")
	@ApiField("ep_info")
	private List<EpInfo> ryPosFrList;

	/**
	 * 自然人担任股东的企业信息
	 */
	@ApiListField("ry_pos_sha_list")
	@ApiField("ep_info")
	private List<EpInfo> ryPosShaList;

	/**
	 * 自然人担任主要管理人员的企业信息
	 */
	@ApiListField("share_holder_list")
	@ApiField("ep_info")
	private List<EpInfo> shareHolderList;

    /**
     * Gets ry pos fr list.
     *
     * @return the ry pos fr list
     */
    public List<EpInfo> getRyPosFrList() {
		return this.ryPosFrList;
	}

    /**
     * Sets ry pos fr list.
     *
     * @param ryPosFrList the ry pos fr list
     */
    public void setRyPosFrList(List<EpInfo> ryPosFrList) {
		this.ryPosFrList = ryPosFrList;
	}

    /**
     * Gets ry pos sha list.
     *
     * @return the ry pos sha list
     */
    public List<EpInfo> getRyPosShaList() {
		return this.ryPosShaList;
	}

    /**
     * Sets ry pos sha list.
     *
     * @param ryPosShaList the ry pos sha list
     */
    public void setRyPosShaList(List<EpInfo> ryPosShaList) {
		this.ryPosShaList = ryPosShaList;
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
