package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户品牌配置模型
 *
 * @author auto create
 * @since 1.0, 2018-07-02 10:31:06
 */
public class MerchantBaseEnterOpenModel extends AlipayObject {

	private static final long serialVersionUID = 6595488275441452158L;

	/**
	 * 商户logo文件流信息，该字段为文件流经base64编码后得到的字符串。
	 */
	@ApiField("logo_info")
	private String logoInfo;

	/**
	 * 商户品牌全称。
	 */
	@ApiField("m_name")
	private String mName;

	/**
	 * 商户品牌简称，只能由大写字母、下划线、数字组成，且必须以大写字母开头。
	 */
	@ApiField("m_short_name")
	private String mShortName;

    /**
     * Gets logo info.
     *
     * @return the logo info
     */
    public String getLogoInfo() {
		return this.logoInfo;
	}

    /**
     * Sets logo info.
     *
     * @param logoInfo the logo info
     */
    public void setLogoInfo(String logoInfo) {
		this.logoInfo = logoInfo;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getmName() {
		return this.mName;
	}

    /**
     * Sets name.
     *
     * @param mName the m name
     */
    public void setmName(String mName) {
		this.mName = mName;
	}

    /**
     * Gets short name.
     *
     * @return the short name
     */
    public String getmShortName() {
		return this.mShortName;
	}

    /**
     * Sets short name.
     *
     * @param mShortName the m short name
     */
    public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

}
