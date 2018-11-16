package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户互通产品查询接口
 *
 * @author auto create
 * @since 1.0, 2017-06-22 16:42:37
 */
public class AlipayUserCustomerIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 3271974751862588815L;

	/**
	 * 预留参数，用于商户区分同一appId下的不同业务场景。默认场景不用传。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 设备及环境信息
	 */
	@ApiField("device_info")
	private AlipayUserDeviceInfo deviceInfo;

	/**
	 * 预留业务扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 用户主体信息。要求AlipayUserPrincipalInfo中的user_id、mobile、email属性，有且只有一个非空。否则接口会忽略除去优先级最高的属性之外的其他属性。
	 */
	@ApiField("principal")
	private AlipayUserPrincipalInfo principal;

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets device info.
     *
     * @return the device info
     */
    public AlipayUserDeviceInfo getDeviceInfo() {
		return this.deviceInfo;
	}

    /**
     * Sets device info.
     *
     * @param deviceInfo the device info
     */
    public void setDeviceInfo(AlipayUserDeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
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
     * Gets principal.
     *
     * @return the principal
     */
    public AlipayUserPrincipalInfo getPrincipal() {
		return this.principal;
	}

    /**
     * Sets principal.
     *
     * @param principal the principal
     */
    public void setPrincipal(AlipayUserPrincipalInfo principal) {
		this.principal = principal;
	}

}
