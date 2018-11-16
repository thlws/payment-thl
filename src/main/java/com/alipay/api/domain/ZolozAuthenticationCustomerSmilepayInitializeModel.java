package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸初始化唤起zim
 *
 * @author auto create
 * @since 1.0, 2017-12-25 22:31:34
 */
public class ZolozAuthenticationCustomerSmilepayInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7762312649972823282L;

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
