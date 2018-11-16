package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核实流程签名
 *
 * @author auto create
 * @since 1.0, 2017-11-09 19:34:36
 */
public class AlipayBossBaseProcessSignVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 6597464692111819633L;

	/**
	 * 流程唯一ID
	 */
	@ApiField("puid")
	private String puid;

	/**
	 * mnotify签名直接回传
	 */
	@ApiField("sign_content")
	private String signContent;

    /**
     * Gets puid.
     *
     * @return the puid
     */
    public String getPuid() {
		return this.puid;
	}

    /**
     * Sets puid.
     *
     * @param puid the puid
     */
    public void setPuid(String puid) {
		this.puid = puid;
	}

    /**
     * Gets sign content.
     *
     * @return the sign content
     */
    public String getSignContent() {
		return this.signContent;
	}

    /**
     * Sets sign content.
     *
     * @param signContent the sign content
     */
    public void setSignContent(String signContent) {
		this.signContent = signContent;
	}

}
