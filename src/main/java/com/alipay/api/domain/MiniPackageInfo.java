package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序功能包模型
 *
 * @author auto create
 * @since 1.0, 2017-12-20 10:42:45
 */
public class MiniPackageInfo extends AlipayObject {

	private static final long serialVersionUID = 3777161478851277286L;

	/**
	 * 功能包文档地址
	 */
	@ApiField("doc_url")
	private String docUrl;

	/**
	 * 功能包描述
	 */
	@ApiField("package_desc")
	private String packageDesc;

	/**
	 * 功能包名称
	 */
	@ApiField("package_name")
	private String packageName;

	/**
	 * 功能包开通方式，"APPLY", "申请开通"；"ORDER", "签约开通"；"DEFAULT", "默认开通"
	 */
	@ApiField("package_open_type")
	private String packageOpenType;

	/**
	 * 功能包签约状态，"valid", "已生效"；"audit", "签约中"；"invalid", "已失效"；"none", "未签约"
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets doc url.
     *
     * @return the doc url
     */
    public String getDocUrl() {
		return this.docUrl;
	}

    /**
     * Sets doc url.
     *
     * @param docUrl the doc url
     */
    public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}

    /**
     * Gets package desc.
     *
     * @return the package desc
     */
    public String getPackageDesc() {
		return this.packageDesc;
	}

    /**
     * Sets package desc.
     *
     * @param packageDesc the package desc
     */
    public void setPackageDesc(String packageDesc) {
		this.packageDesc = packageDesc;
	}

    /**
     * Gets package name.
     *
     * @return the package name
     */
    public String getPackageName() {
		return this.packageName;
	}

    /**
     * Sets package name.
     *
     * @param packageName the package name
     */
    public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

    /**
     * Gets package open type.
     *
     * @return the package open type
     */
    public String getPackageOpenType() {
		return this.packageOpenType;
	}

    /**
     * Sets package open type.
     *
     * @param packageOpenType the package open type
     */
    public void setPackageOpenType(String packageOpenType) {
		this.packageOpenType = packageOpenType;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
