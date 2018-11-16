package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个体工商户经营者信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class OperatorInfo extends AlipayObject {

	private static final long serialVersionUID = 6534296676394749546L;

	/**
	 * 个体工商户经营者证件到期日，格式为YYYY-MM-DD
	 */
	@ApiField("operator_cert_indate")
	private String operatorCertIndate;

	/**
	 * 个体工商户经营者证件号码
	 */
	@ApiField("operator_cert_no")
	private String operatorCertNo;

	/**
	 * 个体工商户经营者证件照片背面图片（如证件类型为身份证则上传国徽面图片）
	 */
	@ApiField("operator_cert_pic_back")
	private String operatorCertPicBack;

	/**
	 * 个体工商户经营者证件正面照片（如证件类型为身份证则需要上传头像面图片）
	 */
	@ApiField("operator_cert_pic_front")
	private String operatorCertPicFront;

	/**
	 * 个体工商户经营者证件类型，支持传入的类型为：RESIDENT(居民身份证)括号中为每种类型的释义，不需要将括号中的内容当参数内容传入。
	 */
	@ApiField("operator_cert_type")
	private String operatorCertType;

	/**
	 * 张三
	 */
	@ApiField("operator_name")
	private String operatorName;

    /**
     * Gets operator cert indate.
     *
     * @return the operator cert indate
     */
    public String getOperatorCertIndate() {
		return this.operatorCertIndate;
	}

    /**
     * Sets operator cert indate.
     *
     * @param operatorCertIndate the operator cert indate
     */
    public void setOperatorCertIndate(String operatorCertIndate) {
		this.operatorCertIndate = operatorCertIndate;
	}

    /**
     * Gets operator cert no.
     *
     * @return the operator cert no
     */
    public String getOperatorCertNo() {
		return this.operatorCertNo;
	}

    /**
     * Sets operator cert no.
     *
     * @param operatorCertNo the operator cert no
     */
    public void setOperatorCertNo(String operatorCertNo) {
		this.operatorCertNo = operatorCertNo;
	}

    /**
     * Gets operator cert pic back.
     *
     * @return the operator cert pic back
     */
    public String getOperatorCertPicBack() {
		return this.operatorCertPicBack;
	}

    /**
     * Sets operator cert pic back.
     *
     * @param operatorCertPicBack the operator cert pic back
     */
    public void setOperatorCertPicBack(String operatorCertPicBack) {
		this.operatorCertPicBack = operatorCertPicBack;
	}

    /**
     * Gets operator cert pic front.
     *
     * @return the operator cert pic front
     */
    public String getOperatorCertPicFront() {
		return this.operatorCertPicFront;
	}

    /**
     * Sets operator cert pic front.
     *
     * @param operatorCertPicFront the operator cert pic front
     */
    public void setOperatorCertPicFront(String operatorCertPicFront) {
		this.operatorCertPicFront = operatorCertPicFront;
	}

    /**
     * Gets operator cert type.
     *
     * @return the operator cert type
     */
    public String getOperatorCertType() {
		return this.operatorCertType;
	}

    /**
     * Sets operator cert type.
     *
     * @param operatorCertType the operator cert type
     */
    public void setOperatorCertType(String operatorCertType) {
		this.operatorCertType = operatorCertType;
	}

    /**
     * Gets operator name.
     *
     * @return the operator name
     */
    public String getOperatorName() {
		return this.operatorName;
	}

    /**
     * Sets operator name.
     *
     * @param operatorName the operator name
     */
    public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

}
