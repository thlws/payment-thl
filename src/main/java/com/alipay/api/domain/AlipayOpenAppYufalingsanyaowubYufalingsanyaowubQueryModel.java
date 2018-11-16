package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * yufalingsanyaowub
 *
 * @author auto create
 * @since 1.0, 2017-03-15 22:56:43
 */
public class AlipayOpenAppYufalingsanyaowubYufalingsanyaowubQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7237344881594185448L;

	/**
	 * yufaa
	 */
	@ApiField("yufaa")
	private String yufaa;

    /**
     * Gets yufaa.
     *
     * @return the yufaa
     */
    public String getYufaa() {
		return this.yufaa;
	}

    /**
     * Sets yufaa.
     *
     * @param yufaa the yufaa
     */
    public void setYufaa(String yufaa) {
		this.yufaa = yufaa;
	}

}
