package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * createQrCodeProcessor
 *
 * @author auto create
 * @since 1.0, 2016-08-10 17:27:01
 */
public class AlipayOpenPublicQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5638196541757244549L;

	/**
	 * 服务窗创建带参二维码接口，开发者自定义信息
	 */
	@ApiField("code_info")
	private CodeInfo codeInfo;

	/**
	 * 二维码类型，目前只支持两种类型：
TEMP：临时的（默认）；
PERM：永久的
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 临时码过期时间，以秒为单位，最大不超过1800秒；
永久码置空
	 */
	@ApiField("expire_second")
	private String expireSecond;

	/**
	 * 二维码中间是否显示服务窗logo，Y：显示；N：不显示（默认）
	 */
	@ApiField("show_logo")
	private String showLogo;

    /**
     * Gets code info.
     *
     * @return the code info
     */
    public CodeInfo getCodeInfo() {
		return this.codeInfo;
	}

    /**
     * Sets code info.
     *
     * @param codeInfo the code info
     */
    public void setCodeInfo(CodeInfo codeInfo) {
		this.codeInfo = codeInfo;
	}

    /**
     * Gets code type.
     *
     * @return the code type
     */
    public String getCodeType() {
		return this.codeType;
	}

    /**
     * Sets code type.
     *
     * @param codeType the code type
     */
    public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

    /**
     * Gets expire second.
     *
     * @return the expire second
     */
    public String getExpireSecond() {
		return this.expireSecond;
	}

    /**
     * Sets expire second.
     *
     * @param expireSecond the expire second
     */
    public void setExpireSecond(String expireSecond) {
		this.expireSecond = expireSecond;
	}

    /**
     * Gets show logo.
     *
     * @return the show logo
     */
    public String getShowLogo() {
		return this.showLogo;
	}

    /**
     * Sets show logo.
     *
     * @param showLogo the show logo
     */
    public void setShowLogo(String showLogo) {
		this.showLogo = showLogo;
	}

}
