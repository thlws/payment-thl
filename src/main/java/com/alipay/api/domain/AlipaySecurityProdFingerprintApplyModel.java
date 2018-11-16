package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指纹注册
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:53:47
 */
public class AlipaySecurityProdFingerprintApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3379466867823343635L;

	/**
	 * IFAA协议的版本，目前为2.0
	 */
	@ApiField("ifaa_version")
	private String ifaaVersion;

	/**
	 * ifaf_message:注册阶段客户端返回的协议体数据，对应《IFAA本地免密技术规范》中的IFAFMessage，内容中包含客户端的校验数据。
	 */
	@ApiField("ifaf_message")
	private String ifafMessage;

	/**
	 * 外部业务号，商户的业务单据号，用于核对与问题排查。原则上来说需要保持唯一性。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * IFAA协议客户端静态信息，调用IFAA客户端SDK接口获取secData，透传至本参数。此参数是为了兼容IFAA1.0而设计的，接入方可根据是否需要接入IFAA1.0来决定是否要传(只接入IFAA2.0不需要传)
	 */
	@ApiField("sec_data")
	private String secData;

    /**
     * Gets ifaa version.
     *
     * @return the ifaa version
     */
    public String getIfaaVersion() {
		return this.ifaaVersion;
	}

    /**
     * Sets ifaa version.
     *
     * @param ifaaVersion the ifaa version
     */
    public void setIfaaVersion(String ifaaVersion) {
		this.ifaaVersion = ifaaVersion;
	}

    /**
     * Gets ifaf message.
     *
     * @return the ifaf message
     */
    public String getIfafMessage() {
		return this.ifafMessage;
	}

    /**
     * Sets ifaf message.
     *
     * @param ifafMessage the ifaf message
     */
    public void setIfafMessage(String ifafMessage) {
		this.ifafMessage = ifafMessage;
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
     * Gets sec data.
     *
     * @return the sec data
     */
    public String getSecData() {
		return this.secData;
	}

    /**
     * Sets sec data.
     *
     * @param secData the sec data
     */
    public void setSecData(String secData) {
		this.secData = secData;
	}

}
