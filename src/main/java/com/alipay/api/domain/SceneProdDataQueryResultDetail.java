package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融信息查询返回值
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:39:06
 */
public class SceneProdDataQueryResultDetail extends AlipayObject {

	private static final long serialVersionUID = 4821768978653743753L;

	/**
	 * 网商银行申请单号
	 */
	@ApiField("app_seqno")
	private String appSeqno;

	/**
	 * 机构需要查询的订单数据，
	 */
	@ApiField("result")
	private String result;

    /**
     * Gets app seqno.
     *
     * @return the app seqno
     */
    public String getAppSeqno() {
		return this.appSeqno;
	}

    /**
     * Sets app seqno.
     *
     * @param appSeqno the app seqno
     */
    public void setAppSeqno(String appSeqno) {
		this.appSeqno = appSeqno;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult() {
		return this.result;
	}

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

}
