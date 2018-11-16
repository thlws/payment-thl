package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑凭证发码信息
 *
 * @author auto create
 * @since 1.0, 2018-04-27 22:31:57
 */
public class KbIsvMaCode extends AlipayObject {

	private static final long serialVersionUID = 1128327438274835557L;

	/**
	 * 凭证码值
	 */
	@ApiField("code")
	private String code;

	/**
	 * 码的可核销份数
	 */
	@ApiField("num")
	private String num;

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets num.
     *
     * @return the num
     */
    public String getNum() {
		return this.num;
	}

    /**
     * Sets num.
     *
     * @param num the num
     */
    public void setNum(String num) {
		this.num = num;
	}

}
