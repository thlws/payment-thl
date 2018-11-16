package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约参与者选择器，根据参与者查询合约编号
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class ArrangementInvolvedPartyQuerier extends AlipayObject {

	private static final long serialVersionUID = 8852376452858927798L;

	/**
	 * 参与者id
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 用户uid/参与者角色id
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 参与者角色类型，为空时表示所有类型都查询.
可选值：01 甲方 11 乙方 21丙方
	 */
	@ApiField("ip_type")
	private String ipType;

    /**
     * Gets ip id.
     *
     * @return the ip id
     */
    public String getIpId() {
		return this.ipId;
	}

    /**
     * Sets ip id.
     *
     * @param ipId the ip id
     */
    public void setIpId(String ipId) {
		this.ipId = ipId;
	}

    /**
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public String getIpRoleId() {
		return this.ipRoleId;
	}

    /**
     * Sets ip role id.
     *
     * @param ipRoleId the ip role id
     */
    public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

    /**
     * Gets ip type.
     *
     * @return the ip type
     */
    public String getIpType() {
		return this.ipType;
	}

    /**
     * Sets ip type.
     *
     * @param ipType the ip type
     */
    public void setIpType(String ipType) {
		this.ipType = ipType;
	}

}
