package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上传用户信息
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:44:13
 */
public class SsdataFindataQxUserinfoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5344915346815641465L;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * C端用户身份证号码
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 商户业务流水号，有商户的系统生成的商户业务唯一标识，如果不传，则有上数系统生成一个32位的商户业务流水号并返回
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

	/**
	 * C端用户手机号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * C端用户姓名
	 */
	@ApiField("user_name")
	private String userName;

    /**
     * Gets ext params.
     *
     * @return the ext params
     */
    public String getExtParams() {
		return this.extParams;
	}

    /**
     * Sets ext params.
     *
     * @param extParams the ext params
     */
    public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

    /**
     * Gets id card no.
     *
     * @return the id card no
     */
    public String getIdCardNo() {
		return this.idCardNo;
	}

    /**
     * Sets id card no.
     *
     * @param idCardNo the id card no
     */
    public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

    /**
     * Gets org biz no.
     *
     * @return the org biz no
     */
    public String getOrgBizNo() {
		return this.orgBizNo;
	}

    /**
     * Sets org biz no.
     *
     * @param orgBizNo the org biz no
     */
    public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
		return this.phone;
	}

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
		this.phone = phone;
	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
		return this.userName;
	}

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

}
