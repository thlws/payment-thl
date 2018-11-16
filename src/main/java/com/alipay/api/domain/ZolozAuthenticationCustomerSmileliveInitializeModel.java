package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸初始化唤起zim
 *
 * @author auto create
 * @since 1.0, 2017-12-19 22:06:53
 */
public class ZolozAuthenticationCustomerSmileliveInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 2693547947783535217L;

	/**
	 * { "apdidToken": "设备指纹", "appName": "应用名称", "appVersion": "应用版本", "bioMetaInfo": "生物信息如2.3.0:3,-4" }
	 */
	@ApiField("zimmetainfo")
	private String zimmetainfo;

    /**
     * Gets zimmetainfo.
     *
     * @return the zimmetainfo
     */
    public String getZimmetainfo() {
		return this.zimmetainfo;
	}

    /**
     * Sets zimmetainfo.
     *
     * @param zimmetainfo the zimmetainfo
     */
    public void setZimmetainfo(String zimmetainfo) {
		this.zimmetainfo = zimmetainfo;
	}

}
