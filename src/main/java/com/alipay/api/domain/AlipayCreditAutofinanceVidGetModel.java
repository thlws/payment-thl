package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取汽车金融核身使用的ID
 *
 * @author auto create
 * @since 1.0, 2016-10-17 16:44:36
 */
public class AlipayCreditAutofinanceVidGetModel extends AlipayObject {

	private static final long serialVersionUID = 6543647584845913181L;

	/**
	 * 机构编号
	 */
	@ApiField("orgcode")
	private String orgcode;

	/**
	 * 支付宝账号数字ID
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 当前安装的支付宝钱包版本号
	 */
	@ApiField("version")
	private String version;

    /**
     * Gets orgcode.
     *
     * @return the orgcode
     */
    public String getOrgcode() {
		return this.orgcode;
	}

    /**
     * Sets orgcode.
     *
     * @param orgcode the orgcode
     */
    public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

    /**
     * Gets uid.
     *
     * @return the uid
     */
    public String getUid() {
		return this.uid;
	}

    /**
     * Sets uid.
     *
     * @param uid the uid
     */
    public void setUid(String uid) {
		this.uid = uid;
	}

    /**
     * Gets version.
     *
     * @return the version
     */
    public String getVersion() {
		return this.version;
	}

    /**
     * Sets version.
     *
     * @param version the version
     */
    public void setVersion(String version) {
		this.version = version;
	}

}
