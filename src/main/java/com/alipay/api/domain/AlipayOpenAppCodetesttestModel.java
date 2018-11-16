package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一对外错误码测试测试
 *
 * @author auto create
 * @since 1.0, 2016-05-11 19:51:24
 */
public class AlipayOpenAppCodetesttestModel extends AlipayObject {

	private static final long serialVersionUID = 3699968588835224155L;

	/**
	 * 测试参数1
	 */
	@ApiField("testparam")
	private String testparam;

	/**
	 * 测试测试
	 */
	@ApiField("testtestparam")
	private String testtestparam;

    /**
     * Gets testparam.
     *
     * @return the testparam
     */
    public String getTestparam() {
		return this.testparam;
	}

    /**
     * Sets testparam.
     *
     * @param testparam the testparam
     */
    public void setTestparam(String testparam) {
		this.testparam = testparam;
	}

    /**
     * Gets testtestparam.
     *
     * @return the testtestparam
     */
    public String getTesttestparam() {
		return this.testtestparam;
	}

    /**
     * Sets testtestparam.
     *
     * @param testtestparam the testtestparam
     */
    public void setTesttestparam(String testtestparam) {
		this.testtestparam = testtestparam;
	}

}
