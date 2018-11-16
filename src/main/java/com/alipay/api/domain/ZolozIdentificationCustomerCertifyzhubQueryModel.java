package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸服务的结果查询(一体化)
 *
 * @author auto create
 * @since 1.0, 2018-09-16 10:03:19
 */
public class ZolozIdentificationCustomerCertifyzhubQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4298523911379918572L;

	/**
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 0：匿名注册  1：匿名认证   2：实名认证
	 */
	@ApiField("face_type")
	private Long faceType;

	/**
	 * 是否需要返回人脸图片
	 */
	@ApiField("need_img")
	private Boolean needImg;

	/**
	 * zimId，用于查询认证结果
	 */
	@ApiField("zim_id")
	private String zimId;

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
     * Gets face type.
     *
     * @return the face type
     */
    public Long getFaceType() {
		return this.faceType;
	}

    /**
     * Sets face type.
     *
     * @param faceType the face type
     */
    public void setFaceType(Long faceType) {
		this.faceType = faceType;
	}

    /**
     * Gets need img.
     *
     * @return the need img
     */
    public Boolean getNeedImg() {
		return this.needImg;
	}

    /**
     * Sets need img.
     *
     * @param needImg the need img
     */
    public void setNeedImg(Boolean needImg) {
		this.needImg = needImg;
	}

    /**
     * Gets zim id.
     *
     * @return the zim id
     */
    public String getZimId() {
		return this.zimId;
	}

    /**
     * Sets zim id.
     *
     * @param zimId the zim id
     */
    public void setZimId(String zimId) {
		this.zimId = zimId;
	}

}
