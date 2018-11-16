package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.user.web.initialize response.
 *
 * @author auto create
 * @since 1.0, 2018-07-31 12:02:23
 */
public class ZolozIdentificationUserWebInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1816195182211422464L;

	/** 
	 * 扩展结果
	 */
	@ApiField("extern_info")
	private String externInfo;

	/** 
	 * 刷脸认证的唯一标识
	 */
	@ApiField("zim_id")
	private String zimId;

    /**
     * Sets extern info.
     *
     * @param externInfo the extern info
     */
    public void setExternInfo(String externInfo) {
		this.externInfo = externInfo;
	}

    /**
     * Gets extern info.
     *
     * @return the extern info
     */
    public String getExternInfo( ) {
		return this.externInfo;
	}

    /**
     * Sets zim id.
     *
     * @param zimId the zim id
     */
    public void setZimId(String zimId) {
		this.zimId = zimId;
	}

    /**
     * Gets zim id.
     *
     * @return the zim id
     */
    public String getZimId( ) {
		return this.zimId;
	}

}
