package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.modify response.
 *
 * @author auto create
 * @since 1.0, 2017-12-18 14:58:00
 */
public class AlipayOpenPublicLifeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3215529271554825766L;

	/** 
	 * 修改时间。
	 */
	@ApiField("modify_time")
	private String modifyTime;

	/** 
	 * 生活号id，用于表示此生活号唯一性
	 */
	@ApiField("public_id")
	private String publicId;

    /**
     * Sets modify time.
     *
     * @param modifyTime the modify time
     */
    public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

    /**
     * Gets modify time.
     *
     * @return the modify time
     */
    public String getModifyTime( ) {
		return this.modifyTime;
	}

    /**
     * Sets public id.
     *
     * @param publicId the public id
     */
    public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

    /**
     * Gets public id.
     *
     * @return the public id
     */
    public String getPublicId( ) {
		return this.publicId;
	}

}
