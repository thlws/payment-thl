package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * to蚂蚁消息接口
 *
 * @author auto create
 * @since 1.0, 2018-03-08 17:44:40
 */
public class AlipayOpenAppSmgMsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 7865815673258626551L;

	/**
	 * 5555
	 */
	@ApiField("numberone")
	private String numberone;

	/**
	 * 22
	 */
	@ApiField("numbertowe")
	private String numbertowe;

    /**
     * Gets numberone.
     *
     * @return the numberone
     */
    public String getNumberone() {
		return this.numberone;
	}

    /**
     * Sets numberone.
     *
     * @param numberone the numberone
     */
    public void setNumberone(String numberone) {
		this.numberone = numberone;
	}

    /**
     * Gets numbertowe.
     *
     * @return the numbertowe
     */
    public String getNumbertowe() {
		return this.numbertowe;
	}

    /**
     * Sets numbertowe.
     *
     * @param numbertowe the numbertowe
     */
    public void setNumbertowe(String numbertowe) {
		this.numbertowe = numbertowe;
	}

}
