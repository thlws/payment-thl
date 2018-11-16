package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取全息链接
 *
 * @author auto create
 * @since 1.0, 2017-10-30 20:09:26
 */
public class SsdataFindataQxLinkQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4719568579739828884L;

	/**
	 * 预留扩展
	 */
	@ApiField("ext_param")
	private String extParam;

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
	 * 用户在操作上数的H5过程中，如果需要跳转到商户的自定义H5，则传递需要跳转的链接地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * C端用户姓名
	 */
	@ApiField("user_name")
	private String userName;

    /**
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam() {
		return this.extParam;
	}

    /**
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(String extParam) {
		this.extParam = extParam;
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
     * Gets redirect url.
     *
     * @return the redirect url
     */
    public String getRedirectUrl() {
		return this.redirectUrl;
	}

    /**
     * Sets redirect url.
     *
     * @param redirectUrl the redirect url
     */
    public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
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
