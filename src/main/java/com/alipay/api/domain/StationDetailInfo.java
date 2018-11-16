package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 购票站点信息，包含站点名称，站点编码，站点外部编码
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class StationDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 1764792389148337792L;

	/**
	 * 站点编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 站点外部编码
	 */
	@ApiField("ext_code")
	private String extCode;

	/**
	 * 站点中文名称
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets ext code.
     *
     * @return the ext code
     */
    public String getExtCode() {
		return this.extCode;
	}

    /**
     * Sets ext code.
     *
     * @param extCode the ext code
     */
    public void setExtCode(String extCode) {
		this.extCode = extCode;
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

}
