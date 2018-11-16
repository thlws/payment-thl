package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.validate response.
 *
 * @author auto create
 * @since 1.0, 2014-06-12 17:15:32
 */
public class AlipayUserValidateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6493883951735211542L;

	/** 
	 * 支付宝userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * true标识通过认证.false标识没有
	 */
	@ApiField("certified")
	private String certified;

	/** 
	 * 隐藏的真实姓名，如 *三(张三)
	 */
	@ApiField("real_name")
	private String realName;

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

    /**
     * Sets certified.
     *
     * @param certified the certified
     */
    public void setCertified(String certified) {
		this.certified = certified;
	}

    /**
     * Gets certified.
     *
     * @return the certified
     */
    public String getCertified( ) {
		return this.certified;
	}

    /**
     * Sets real name.
     *
     * @param realName the real name
     */
    public void setRealName(String realName) {
		this.realName = realName;
	}

    /**
     * Gets real name.
     *
     * @return the real name
     */
    public String getRealName( ) {
		return this.realName;
	}

}
