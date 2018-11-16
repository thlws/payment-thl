package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备安全芯片applet初始化
 *
 * @author auto create
 * @since 1.0, 2018-03-29 10:01:39
 */
public class AlipaySecurityProdSeAppletQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3563692588478434748L;

	/**
	 * 操作类型，唯一，传递tsm的具体操作，厂测程序提供
	 */
	@ApiField("opt_type")
	private Long optType;

	/**
	 * 基本参数，json数组传递，调用tsm时提供对应的参数，厂测程序提供
	 */
	@ApiField("param")
	private String param;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * se编号，唯一，用于tsm校验，厂测程序传入
	 */
	@ApiField("se_id")
	private String seId;

	/**
	 * se版本号，唯一，用于获取applet包对应版本的地址，厂测程序调用时传入
	 */
	@ApiField("se_version")
	private String seVersion;

	/**
	 * 子操作类型，用于调用tsm，厂测程序提供
	 */
	@ApiField("sub_opt_type")
	private Long subOptType;

    /**
     * Gets opt type.
     *
     * @return the opt type
     */
    public Long getOptType() {
		return this.optType;
	}

    /**
     * Sets opt type.
     *
     * @param optType the opt type
     */
    public void setOptType(Long optType) {
		this.optType = optType;
	}

    /**
     * Gets param.
     *
     * @return the param
     */
    public String getParam() {
		return this.param;
	}

    /**
     * Sets param.
     *
     * @param param the param
     */
    public void setParam(String param) {
		this.param = param;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets se id.
     *
     * @return the se id
     */
    public String getSeId() {
		return this.seId;
	}

    /**
     * Sets se id.
     *
     * @param seId the se id
     */
    public void setSeId(String seId) {
		this.seId = seId;
	}

    /**
     * Gets se version.
     *
     * @return the se version
     */
    public String getSeVersion() {
		return this.seVersion;
	}

    /**
     * Sets se version.
     *
     * @param seVersion the se version
     */
    public void setSeVersion(String seVersion) {
		this.seVersion = seVersion;
	}

    /**
     * Gets sub opt type.
     *
     * @return the sub opt type
     */
    public Long getSubOptType() {
		return this.subOptType;
	}

    /**
     * Sets sub opt type.
     *
     * @param subOptType the sub opt type
     */
    public void setSubOptType(Long subOptType) {
		this.subOptType = subOptType;
	}

}
