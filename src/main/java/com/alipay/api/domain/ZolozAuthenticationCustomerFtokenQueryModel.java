package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸ftoken查询消费接口
 *
 * @author auto create
 * @since 1.0, 2018-07-20 00:30:44
 */
public class ZolozAuthenticationCustomerFtokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8382735161863914689L;

	/**
	 * 1、1：1人脸验证能力
2、1：n人脸搜索能力（支付宝uid入库）
3、1：n人脸搜索能力（支付宝手机号入库）
4、手机号和人脸识别综合能力
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 人脸产品拓展参数
	 */
	@ApiField("ext_info")
	private FaceExtInfo extInfo;

	/**
	 * 人脸token
	 */
	@ApiField("ftoken")
	private String ftoken;

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public FaceExtInfo getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(FaceExtInfo extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets ftoken.
     *
     * @return the ftoken
     */
    public String getFtoken() {
		return this.ftoken;
	}

    /**
     * Sets ftoken.
     *
     * @param ftoken the ftoken
     */
    public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

}
