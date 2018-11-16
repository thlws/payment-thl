package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.faceverify.match response.
 *
 * @author auto create
 * @since 1.0, 2018-03-02 16:11:12
 */
public class ZolozAuthenticationCustomerFaceverifyMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 3757157965758174483L;

	/** 
	 * 是否为攻击
	 */
	@ApiField("attack")
	private Boolean attack;

	/** 
	 * 人脸比对结果：成功或者失败
	 */
	@ApiField("result")
	private String result;

    /**
     * Sets attack.
     *
     * @param attack the attack
     */
    public void setAttack(Boolean attack) {
		this.attack = attack;
	}

    /**
     * Gets attack.
     *
     * @return the attack
     */
    public Boolean getAttack( ) {
		return this.attack;
	}

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult( ) {
		return this.result;
	}

}
