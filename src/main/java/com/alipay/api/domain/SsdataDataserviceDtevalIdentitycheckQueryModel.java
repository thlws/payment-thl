package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上数用户信息核对身份查询接口
 *
 * @author auto create
 * @since 1.0, 2017-04-28 16:58:05
 */
public class SsdataDataserviceDtevalIdentitycheckQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4138729363684131619L;

	/**
	 * 工单流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 采集到的身份证号
	 */
	@ApiField("col_cert_no")
	private String colCertNo;

	/**
	 * 采集到的手机号码
	 */
	@ApiField("col_mobile")
	private String colMobile;

	/**
	 * 采集到的姓名
	 */
	@ApiField("col_user_name")
	private String colUserName;

	/**
	 * 额外参数
	 */
	@ApiField("ext_map")
	private String extMap;

	/**
	 * 实际身份证号
	 */
	@ApiField("real_cert_no")
	private String realCertNo;

	/**
	 * 实际手机号号码
	 */
	@ApiField("real_mobile")
	private String realMobile;

	/**
	 * 实际姓名
	 */
	@ApiField("real_user_name")
	private String realUserName;

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo() {
		return this.bizNo;
	}

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets col cert no.
     *
     * @return the col cert no
     */
    public String getColCertNo() {
		return this.colCertNo;
	}

    /**
     * Sets col cert no.
     *
     * @param colCertNo the col cert no
     */
    public void setColCertNo(String colCertNo) {
		this.colCertNo = colCertNo;
	}

    /**
     * Gets col mobile.
     *
     * @return the col mobile
     */
    public String getColMobile() {
		return this.colMobile;
	}

    /**
     * Sets col mobile.
     *
     * @param colMobile the col mobile
     */
    public void setColMobile(String colMobile) {
		this.colMobile = colMobile;
	}

    /**
     * Gets col user name.
     *
     * @return the col user name
     */
    public String getColUserName() {
		return this.colUserName;
	}

    /**
     * Sets col user name.
     *
     * @param colUserName the col user name
     */
    public void setColUserName(String colUserName) {
		this.colUserName = colUserName;
	}

    /**
     * Gets ext map.
     *
     * @return the ext map
     */
    public String getExtMap() {
		return this.extMap;
	}

    /**
     * Sets ext map.
     *
     * @param extMap the ext map
     */
    public void setExtMap(String extMap) {
		this.extMap = extMap;
	}

    /**
     * Gets real cert no.
     *
     * @return the real cert no
     */
    public String getRealCertNo() {
		return this.realCertNo;
	}

    /**
     * Sets real cert no.
     *
     * @param realCertNo the real cert no
     */
    public void setRealCertNo(String realCertNo) {
		this.realCertNo = realCertNo;
	}

    /**
     * Gets real mobile.
     *
     * @return the real mobile
     */
    public String getRealMobile() {
		return this.realMobile;
	}

    /**
     * Sets real mobile.
     *
     * @param realMobile the real mobile
     */
    public void setRealMobile(String realMobile) {
		this.realMobile = realMobile;
	}

    /**
     * Gets real user name.
     *
     * @return the real user name
     */
    public String getRealUserName() {
		return this.realUserName;
	}

    /**
     * Sets real user name.
     *
     * @param realUserName the real user name
     */
    public void setRealUserName(String realUserName) {
		this.realUserName = realUserName;
	}

}
