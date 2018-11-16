package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件同步补偿接口
 *
 * @author auto create
 * @since 1.0, 2017-09-22 11:13:38
 */
public class AlipayEbppInvoiceFileSyncRetryModel extends AlipayObject {

	private static final long serialVersionUID = 5879688846236931431L;

	/**
	 * 发票代码
	 */
	@ApiField("einv_code")
	private String einvCode;

	/**
	 * 发票号码
	 */
	@ApiField("einv_no")
	private String einvNo;

	/**
	 * 文件下载链接，在is_url_replace为true的时候，该字段必填
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 是否需要替换文件下载链接
	 */
	@ApiField("is_url_replace")
	private Boolean isUrlReplace;

	/**
	 * 商户简称，userId未传的时候，该字段必填
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 外部交易流水号，userId未传的情况下，该字段必填
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 蚂蚁统一会员ID，该字段未传的情况下，商户简称和外部交易流水号必填
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets einv code.
     *
     * @return the einv code
     */
    public String getEinvCode() {
		return this.einvCode;
	}

    /**
     * Sets einv code.
     *
     * @param einvCode the einv code
     */
    public void setEinvCode(String einvCode) {
		this.einvCode = einvCode;
	}

    /**
     * Gets einv no.
     *
     * @return the einv no
     */
    public String getEinvNo() {
		return this.einvNo;
	}

    /**
     * Sets einv no.
     *
     * @param einvNo the einv no
     */
    public void setEinvNo(String einvNo) {
		this.einvNo = einvNo;
	}

    /**
     * Gets file url.
     *
     * @return the file url
     */
    public String getFileUrl() {
		return this.fileUrl;
	}

    /**
     * Sets file url.
     *
     * @param fileUrl the file url
     */
    public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

    /**
     * Gets is url replace.
     *
     * @return the is url replace
     */
    public Boolean getIsUrlReplace() {
		return this.isUrlReplace;
	}

    /**
     * Sets is url replace.
     *
     * @param isUrlReplace the is url replace
     */
    public void setIsUrlReplace(Boolean isUrlReplace) {
		this.isUrlReplace = isUrlReplace;
	}

    /**
     * Gets short name.
     *
     * @return the short name
     */
    public String getmShortName() {
		return this.mShortName;
	}

    /**
     * Sets short name.
     *
     * @param mShortName the m short name
     */
    public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
