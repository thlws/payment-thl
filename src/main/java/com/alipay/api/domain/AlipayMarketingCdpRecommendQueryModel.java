package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部应用根据用户当前地理位置查询附近商家信息
 *
 * @author auto create
 * @since 1.0, 2017-08-18 15:36:04
 */
public class AlipayMarketingCdpRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2845666155516914152L;

	/**
	 * 广告标识码
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * 扩展信息，传json格式的字符串，包含longitude=经度；latitude=纬度；deviceId=设备标识
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 支付宝账户
	 */
	@ApiField("logon_id")
	private String logonId;

    /**
     * Gets ad code.
     *
     * @return the ad code
     */
    public String getAdCode() {
		return this.adCode;
	}

    /**
     * Sets ad code.
     *
     * @param adCode the ad code
     */
    public void setAdCode(String adCode) {
		this.adCode = adCode;
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
     * Gets logon id.
     *
     * @return the logon id
     */
    public String getLogonId() {
		return this.logonId;
	}

    /**
     * Sets logon id.
     *
     * @param logonId the logon id
     */
    public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
