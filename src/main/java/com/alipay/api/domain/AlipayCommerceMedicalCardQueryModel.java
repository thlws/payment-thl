package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗机构根据用户userId查询该账户的医保卡相关信息
 *
 * @author auto create
 * @since 1.0, 2018-09-12 16:46:50
 */
public class AlipayCommerceMedicalCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6671151492282821911L;

	/**
	 * 支付授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 买家支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数字。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 卡颁发机构编号
	 */
	@ApiField("card_org_no")
	private String cardOrgNo;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 跳回的地址
	 */
	@ApiField("return_url")
	private String returnUrl;

	/**
	 * 支付场景
条码支付，取值：bar_code
声波支付，取值：wave_code
人脸支付，取值：face_code
	 */
	@ApiField("scene")
	private String scene;

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
		return this.authCode;
	}

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

    /**
     * Gets buyer id.
     *
     * @return the buyer id
     */
    public String getBuyerId() {
		return this.buyerId;
	}

    /**
     * Sets buyer id.
     *
     * @param buyerId the buyer id
     */
    public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

    /**
     * Gets card org no.
     *
     * @return the card org no
     */
    public String getCardOrgNo() {
		return this.cardOrgNo;
	}

    /**
     * Sets card org no.
     *
     * @param cardOrgNo the card org no
     */
    public void setCardOrgNo(String cardOrgNo) {
		this.cardOrgNo = cardOrgNo;
	}

    /**
     * Gets extend params.
     *
     * @return the extend params
     */
    public String getExtendParams() {
		return this.extendParams;
	}

    /**
     * Sets extend params.
     *
     * @param extendParams the extend params
     */
    public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

    /**
     * Gets return url.
     *
     * @return the return url
     */
    public String getReturnUrl() {
		return this.returnUrl;
	}

    /**
     * Sets return url.
     *
     * @param returnUrl the return url
     */
    public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public String getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(String scene) {
		this.scene = scene;
	}

}
