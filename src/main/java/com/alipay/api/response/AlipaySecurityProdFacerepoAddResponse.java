package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.facerepo.add response.
 *
 * @author auto create
 * @since 1.0, 2016-06-30 08:29:39
 */
public class AlipaySecurityProdFacerepoAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6462246786178964673L;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 对此次插入人脸库分组的人脸id标识
	 */
	@ApiField("face_id")
	private String faceId;

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo( ) {
		return this.extInfo;
	}

    /**
     * Sets face id.
     *
     * @param faceId the face id
     */
    public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

    /**
     * Gets face id.
     *
     * @return the face id
     */
    public String getFaceId( ) {
		return this.faceId;
	}

}
