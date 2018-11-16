package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子身份证生成用户码
 *
 * @author auto create
 * @since 1.0, 2018-06-25 15:27:41
 */
public class AlipayUserElectronicidUserbarcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6224392921661846283L;

	/**
	 * 机构方根据cert_id查到机构内部用户信息的唯一字符串。比如：身份证号+姓名 AES加密后的值；
	 */
	@ApiField("cert_id")
	private String certId;

	/**
	 * 二维码超时时间，单位秒
	 */
	@ApiField("expire_time")
	private Long expireTime;

    /**
     * Gets cert id.
     *
     * @return the cert id
     */
    public String getCertId() {
		return this.certId;
	}

    /**
     * Sets cert id.
     *
     * @param certId the cert id
     */
    public void setCertId(String certId) {
		this.certId = certId;
	}

    /**
     * Gets expire time.
     *
     * @return the expire time
     */
    public Long getExpireTime() {
		return this.expireTime;
	}

    /**
     * Sets expire time.
     *
     * @param expireTime the expire time
     */
    public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

}
