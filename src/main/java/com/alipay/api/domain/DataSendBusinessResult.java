package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据发送业务处理结果信息
 *
 * @author auto create
 * @since 1.0, 2018-01-03 11:52:37
 */
public class DataSendBusinessResult extends AlipayObject {

	private static final long serialVersionUID = 8778927162458253115L;

	/**
	 * 数据发送业务处理结果码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 数据发送业务处理结果描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

    /**
     * Gets biz code.
     *
     * @return the biz code
     */
    public String getBizCode() {
		return this.bizCode;
	}

    /**
     * Sets biz code.
     *
     * @param bizCode the biz code
     */
    public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

    /**
     * Gets biz msg.
     *
     * @return the biz msg
     */
    public String getBizMsg() {
		return this.bizMsg;
	}

    /**
     * Sets biz msg.
     *
     * @param bizMsg the biz msg
     */
    public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}

}
