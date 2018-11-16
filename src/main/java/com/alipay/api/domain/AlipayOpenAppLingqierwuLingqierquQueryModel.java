package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 零七二五
 *
 * @author auto create
 * @since 1.0, 2017-07-25 08:39:52
 */
public class AlipayOpenAppLingqierwuLingqierquQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4247571371935233442L;

	/**
	 * 12
	 */
	@ApiListField("test")
	@ApiField("string")
	private List<String> test;

    /**
     * Gets test.
     *
     * @return the test
     */
    public List<String> getTest() {
		return this.test;
	}

    /**
     * Sets test.
     *
     * @param test the test
     */
    public void setTest(List<String> test) {
		this.test = test;
	}

}
