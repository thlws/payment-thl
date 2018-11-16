package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.facepay.upload response.
 *
 * @author auto create
 * @since 1.0, 2017-03-04 12:55:28
 */
public class AlipaySecurityProdFacepayUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5633566267839315272L;

	/** 
	 * 人脸支付token。即商户在本接口提交的用户人脸图片对应的token，通过此token串联后续调用
	 */
	@ApiField("ftoken")
	private String ftoken;

	/** 
	 * 用户标识提示。例如提示用户输入手机号时，可返回用户手机号的前7位。当此项为空时，说明在热点人脸库中没有搜索成功，需要用户填写其标识的全部位；当此项不为空时，说明在热点人脸库中成功匹配，客户端需要给用户展示标识提示位，由用户补全剩余位
	 */
	@ApiField("user_auth_id_hint")
	private String userAuthIdHint;

	/** 
	 * 用户标识类型。目前支持手机号码，即mobile
	 */
	@ApiField("user_auth_id_type")
	private String userAuthIdType;

    /**
     * Sets ftoken.
     *
     * @param ftoken the ftoken
     */
    public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

    /**
     * Gets ftoken.
     *
     * @return the ftoken
     */
    public String getFtoken( ) {
		return this.ftoken;
	}

    /**
     * Sets user auth id hint.
     *
     * @param userAuthIdHint the user auth id hint
     */
    public void setUserAuthIdHint(String userAuthIdHint) {
		this.userAuthIdHint = userAuthIdHint;
	}

    /**
     * Gets user auth id hint.
     *
     * @return the user auth id hint
     */
    public String getUserAuthIdHint( ) {
		return this.userAuthIdHint;
	}

    /**
     * Sets user auth id type.
     *
     * @param userAuthIdType the user auth id type
     */
    public void setUserAuthIdType(String userAuthIdType) {
		this.userAuthIdType = userAuthIdType;
	}

    /**
     * Gets user auth id type.
     *
     * @return the user auth id type
     */
    public String getUserAuthIdType( ) {
		return this.userAuthIdType;
	}

}
