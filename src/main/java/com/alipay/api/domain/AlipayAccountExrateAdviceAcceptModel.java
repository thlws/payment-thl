package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标准的兑换交易受理接口
 *
 * @author auto create
 * @since 1.0, 2016-05-13 15:15:53
 */
public class AlipayAccountExrateAdviceAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 7151935728527911723L;

	/**
	 * 交易请求对象内容
	 */
	@ApiField("advice")
	private AdviceVO advice;

    /**
     * Gets advice.
     *
     * @return the advice
     */
    public AdviceVO getAdvice() {
		return this.advice;
	}

    /**
     * Sets advice.
     *
     * @param advice the advice
     */
    public void setAdvice(AdviceVO advice) {
		this.advice = advice;
	}

}
