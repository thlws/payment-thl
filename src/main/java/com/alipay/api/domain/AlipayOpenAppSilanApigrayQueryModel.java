package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 思蓝测试api灰度Zone接口
 *
 * @author auto create
 * @since 1.0, 2018-07-12 14:11:43
 */
public class AlipayOpenAppSilanApigrayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2267659746365771855L;

	/**
	 * param
	 */
	@ApiField("param_1")
	private String param1;

    /**
     * Gets param 1.
     *
     * @return the param 1
     */
    public String getParam1() {
		return this.param1;
	}

    /**
     * Sets param 1.
     *
     * @param param1 the param 1
     */
    public void setParam1(String param1) {
		this.param1 = param1;
	}

}
