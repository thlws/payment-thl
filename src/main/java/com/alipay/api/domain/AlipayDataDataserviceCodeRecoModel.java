package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 改api为数立提供验证码识别服务。isv可以通过该接口，使用我们的图片识别能力。
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:26:43
 */
public class AlipayDataDataserviceCodeRecoModel extends AlipayObject {

	private static final long serialVersionUID = 5863421311599824393L;

	/**
	 * 参数配置：内容包括验证码之类，长度，是否可分割等
	 */
	@ApiField("config")
	private String config;

	/**
	 * 图片的内容(以base64位编码)，大小不超过10k
	 */
	@ApiField("content")
	private String content;

	/**
	 * 策略，目前有2种，机器识别与人工打码（机器：machine；人工打码：manual）
	 */
	@ApiField("strategy")
	private String strategy;

    /**
     * Gets config.
     *
     * @return the config
     */
    public String getConfig() {
		return this.config;
	}

    /**
     * Sets config.
     *
     * @param config the config
     */
    public void setConfig(String config) {
		this.config = config;
	}

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
		return this.content;
	}

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

    /**
     * Gets strategy.
     *
     * @return the strategy
     */
    public String getStrategy() {
		return this.strategy;
	}

    /**
     * Sets strategy.
     *
     * @param strategy the strategy
     */
    public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

}
