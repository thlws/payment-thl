package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸1:N服务入库接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:13
 */
public class AlipaySecurityProdFacerepoAddModel extends AlipayObject {

	private static final long serialVersionUID = 1231325828712795548L;

	/**
	 * 商户的业务单据号，用于核对与问题排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 人脸图片字节数组进行Base64编码后的字符串
	 */
	@ApiField("face_str")
	private String faceStr;

	/**
	 * 人脸库分组。每个商户可以使用多个人脸库分组，人脸搜索时会在指定的人脸库分组中搜索
	 */
	@ApiField("group_id")
	private String groupId;

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
     * Gets face str.
     *
     * @return the face str
     */
    public String getFaceStr() {
		return this.faceStr;
	}

    /**
     * Sets face str.
     *
     * @param faceStr the face str
     */
    public void setFaceStr(String faceStr) {
		this.faceStr = faceStr;
	}

    /**
     * Gets group id.
     *
     * @return the group id
     */
    public String getGroupId() {
		return this.groupId;
	}

    /**
     * Sets group id.
     *
     * @param groupId the group id
     */
    public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
