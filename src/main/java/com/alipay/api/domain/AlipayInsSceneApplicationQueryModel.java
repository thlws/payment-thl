package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单查询
 *
 * @author auto create
 * @since 1.0, 2018-06-21 14:26:52
 */
public class AlipayInsSceneApplicationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5762783894484525746L;

	/**
	 * 投保订单号;当商户生成的外部投保业务号不传时则必传
	 */
	@ApiField("application_no")
	private String applicationNo;

	/**
	 * 商户生成的外部投保业务号;当投保订单号不传时必传
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品编码;当投保订单号不传时必传.
	 */
	@ApiField("prod_code")
	private String prodCode;

    /**
     * Gets application no.
     *
     * @return the application no
     */
    public String getApplicationNo() {
		return this.applicationNo;
	}

    /**
     * Sets application no.
     *
     * @param applicationNo the application no
     */
    public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets prod code.
     *
     * @return the prod code
     */
    public String getProdCode() {
		return this.prodCode;
	}

    /**
     * Sets prod code.
     *
     * @param prodCode the prod code
     */
    public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
