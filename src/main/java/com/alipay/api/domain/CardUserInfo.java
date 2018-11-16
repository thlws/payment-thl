package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 持卡人信息
 *
 * @author auto create
 * @since 1.0, 2017-06-07 13:29:46
 */
public class CardUserInfo extends AlipayObject {

	private static final long serialVersionUID = 5355493255389727941L;

	/**
	 * 用户唯一标识, 根据user_id_type类型来定 （目前暂支持支付宝userId）

支付宝userId说明：支付宝用户号是以2088开头的16位纯数字组成
	 */
	@ApiField("user_uni_id")
	private String userUniId;

	/**
	 * ID类型：UID， 即传值UID即可
	 */
	@ApiField("user_uni_id_type")
	private String userUniIdType;

    /**
     * Gets user uni id.
     *
     * @return the user uni id
     */
    public String getUserUniId() {
		return this.userUniId;
	}

    /**
     * Sets user uni id.
     *
     * @param userUniId the user uni id
     */
    public void setUserUniId(String userUniId) {
		this.userUniId = userUniId;
	}

    /**
     * Gets user uni id type.
     *
     * @return the user uni id type
     */
    public String getUserUniIdType() {
		return this.userUniIdType;
	}

    /**
     * Sets user uni id type.
     *
     * @param userUniIdType the user uni id type
     */
    public void setUserUniIdType(String userUniIdType) {
		this.userUniIdType = userUniIdType;
	}

}
