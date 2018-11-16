package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成短连接开放接口
 *
 * @author auto create
 * @since 1.0, 2017-10-13 10:38:17
 */
public class AlipayMarketingEncodeShortlinkCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2414788922541399356L;

	/**
	 * biz_identifier通过向mobilecodec系统申请，由mobilecodec系统分配，每个调用者一般指一个商家会有一个唯一值。
	 */
	@ApiField("biz_identifier")
	private String bizIdentifier;

	/**
	 * encode_url 是需要改写成短连接的长连接，需要urlEncode
	 */
	@ApiField("encode_url")
	private String encodeUrl;

	/**
	 * 单个短连接有效期，不填是配置申请时默认的值，可以小于等于配置申请时的值，但不能大于，否则会返回配置不一致错误
	 */
	@ApiField("timeout")
	private String timeout;

    /**
     * Gets biz identifier.
     *
     * @return the biz identifier
     */
    public String getBizIdentifier() {
		return this.bizIdentifier;
	}

    /**
     * Sets biz identifier.
     *
     * @param bizIdentifier the biz identifier
     */
    public void setBizIdentifier(String bizIdentifier) {
		this.bizIdentifier = bizIdentifier;
	}

    /**
     * Gets encode url.
     *
     * @return the encode url
     */
    public String getEncodeUrl() {
		return this.encodeUrl;
	}

    /**
     * Sets encode url.
     *
     * @param encodeUrl the encode url
     */
    public void setEncodeUrl(String encodeUrl) {
		this.encodeUrl = encodeUrl;
	}

    /**
     * Gets timeout.
     *
     * @return the timeout
     */
    public String getTimeout() {
		return this.timeout;
	}

    /**
     * Sets timeout.
     *
     * @param timeout the timeout
     */
    public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

}
