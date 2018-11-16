package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实人认证初始化
 *
 * @author auto create
 * @since 1.0, 2017-09-04 11:18:49
 */
public class ZolozIdentificationCustomerCertifyInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 3472811438586388778L;

	/**
	 * 商户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 实人信息：姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 实人信息：证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 实人信息：证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用人脸引导页是否显示
	 */
	@ApiField("has_welcome_page")
	private Boolean hasWelcomePage;

	/**
	 * metainfo环境参数
	 */
	@ApiField("metainfo")
	private String metainfo;

	/**
	 * 通过terminal_pos确定端内或端外模式
	 */
	@ApiField("terminal_pos")
	private String terminalPos;

	/**
	 * 商户的用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets cert name.
     *
     * @return the cert name
     */
    public String getCertName() {
		return this.certName;
	}

    /**
     * Sets cert name.
     *
     * @param certName the cert name
     */
    public void setCertName(String certName) {
		this.certName = certName;
	}

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets cert type.
     *
     * @return the cert type
     */
    public String getCertType() {
		return this.certType;
	}

    /**
     * Sets cert type.
     *
     * @param certType the cert type
     */
    public void setCertType(String certType) {
		this.certType = certType;
	}

    /**
     * Gets has welcome page.
     *
     * @return the has welcome page
     */
    public Boolean getHasWelcomePage() {
		return this.hasWelcomePage;
	}

    /**
     * Sets has welcome page.
     *
     * @param hasWelcomePage the has welcome page
     */
    public void setHasWelcomePage(Boolean hasWelcomePage) {
		this.hasWelcomePage = hasWelcomePage;
	}

    /**
     * Gets metainfo.
     *
     * @return the metainfo
     */
    public String getMetainfo() {
		return this.metainfo;
	}

    /**
     * Sets metainfo.
     *
     * @param metainfo the metainfo
     */
    public void setMetainfo(String metainfo) {
		this.metainfo = metainfo;
	}

    /**
     * Gets terminal pos.
     *
     * @return the terminal pos
     */
    public String getTerminalPos() {
		return this.terminalPos;
	}

    /**
     * Sets terminal pos.
     *
     * @param terminalPos the terminal pos
     */
    public void setTerminalPos(String terminalPos) {
		this.terminalPos = terminalPos;
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
