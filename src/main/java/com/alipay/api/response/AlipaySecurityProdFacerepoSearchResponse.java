package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.facerepo.search response.
 *
 * @author auto create
 * @since 1.0, 2016-06-30 08:29:21
 */
public class AlipaySecurityProdFacerepoSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 1849491282152568315L;

	/** 
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 从入参指定的人脸库分组中搜索出来的相似度最高的人脸id
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
