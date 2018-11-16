package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放渠道
 *
 * @author auto create
 * @since 1.0, 2017-09-30 11:21:19
 */
public class PublishChannel extends AlipayObject {

	private static final long serialVersionUID = 4363887666957336139L;

	/**
	 * 当type为MERCHANT_CROWD时，config需填入口令送的密码和图片，样例如下："config":"{\"PASSWORD\":\"口令送密码\",\"BACKGROUND_LOGO\":\"1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC\"}"
	 */
	@ApiField("config")
	private String config;

	/**
	 * 扩展信息，无需配置
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 渠道名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 渠道类型，目前支持以下类型
QR_CODE：二维码投放
SHORT_LINK：短连接投放
SHOP_DETAIL：店铺页投放
PAYMENT_RESULT：支付成功页
MERCHANT_CROWD：口令送
URL_WITH_TOKEN：外部发奖活动，只有活动类型为DIRECT_SEND时才支持
EXTERNAL：外部投放，口碑需要感知任何投放内容
	 */
	@ApiField("type")
	private String type;

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
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
