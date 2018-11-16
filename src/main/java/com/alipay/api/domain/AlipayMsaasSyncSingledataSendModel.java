package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步数据到支付宝等APP
 *
 * @author auto create
 * @since 1.0, 2017-12-27 16:41:15
 */
public class AlipayMsaasSyncSingledataSendModel extends AlipayObject {

	private static final long serialVersionUID = 2397714278841741682L;

	/**
	 * 支持的最大客户端app版本号
	 */
	@ApiField("app_max_version")
	private String appMaxVersion;

	/**
	 * 支持的最小客户端app版本号
	 */
	@ApiField("app_min_version")
	private String appMinVersion;

	/**
	 * base64编码后的二进制业务数据，与payload二选一
	 */
	@ApiField("binary_payload")
	private String binaryPayload;

	/**
	 * 透传至客户端的业务自定义标签属性
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/**
	 * 业务场景标识，需要申请，文档：https://lark.alipay.com/team-sync/sync/biztype
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 参考文档：https://lark.alipay.com/team-sync/sync/server-down
	 */
	@ApiField("client_app")
	private String clientApp;

	/**
	 * 希望接收数据的移动设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 是否需要立即推送给客户端app，默认为true
	 */
	@ApiField("immediate_sync")
	private Boolean immediateSync;

	/**
	 * 根据申请bizType决定，用户维度业务填写userId, 设备维度填写utdid
	 */
	@ApiField("link_token")
	private String linkToken;

	/**
	 * 指定接收数据的客户端os类型
	 */
	@ApiField("os_type")
	private String osType;

	/**
	 * 字符型业务数据体，与binary_payload二选一
	 */
	@ApiField("payload")
	private String payload;

	/**
	 * 业务数据唯一标识，无特殊要求，主要用做幂等控制
	 */
	@ApiField("third_msg_id")
	private String thirdMsgId;

	/**
	 * 业务数据生效的结束时间
	 */
	@ApiField("valid_end")
	private Date validEnd;

	/**
	 * 业务数据生效的起始时间
	 */
	@ApiField("valid_start")
	private Date validStart;

    /**
     * Gets app max version.
     *
     * @return the app max version
     */
    public String getAppMaxVersion() {
		return this.appMaxVersion;
	}

    /**
     * Sets app max version.
     *
     * @param appMaxVersion the app max version
     */
    public void setAppMaxVersion(String appMaxVersion) {
		this.appMaxVersion = appMaxVersion;
	}

    /**
     * Gets app min version.
     *
     * @return the app min version
     */
    public String getAppMinVersion() {
		return this.appMinVersion;
	}

    /**
     * Sets app min version.
     *
     * @param appMinVersion the app min version
     */
    public void setAppMinVersion(String appMinVersion) {
		this.appMinVersion = appMinVersion;
	}

    /**
     * Gets binary payload.
     *
     * @return the binary payload
     */
    public String getBinaryPayload() {
		return this.binaryPayload;
	}

    /**
     * Sets binary payload.
     *
     * @param binaryPayload the binary payload
     */
    public void setBinaryPayload(String binaryPayload) {
		this.binaryPayload = binaryPayload;
	}

    /**
     * Gets biz tag.
     *
     * @return the biz tag
     */
    public String getBizTag() {
		return this.bizTag;
	}

    /**
     * Sets biz tag.
     *
     * @param bizTag the biz tag
     */
    public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
	}

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
     * Gets client app.
     *
     * @return the client app
     */
    public String getClientApp() {
		return this.clientApp;
	}

    /**
     * Sets client app.
     *
     * @param clientApp the client app
     */
    public void setClientApp(String clientApp) {
		this.clientApp = clientApp;
	}

    /**
     * Gets device id.
     *
     * @return the device id
     */
    public String getDeviceId() {
		return this.deviceId;
	}

    /**
     * Sets device id.
     *
     * @param deviceId the device id
     */
    public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

    /**
     * Gets immediate sync.
     *
     * @return the immediate sync
     */
    public Boolean getImmediateSync() {
		return this.immediateSync;
	}

    /**
     * Sets immediate sync.
     *
     * @param immediateSync the immediate sync
     */
    public void setImmediateSync(Boolean immediateSync) {
		this.immediateSync = immediateSync;
	}

    /**
     * Gets link token.
     *
     * @return the link token
     */
    public String getLinkToken() {
		return this.linkToken;
	}

    /**
     * Sets link token.
     *
     * @param linkToken the link token
     */
    public void setLinkToken(String linkToken) {
		this.linkToken = linkToken;
	}

    /**
     * Gets os type.
     *
     * @return the os type
     */
    public String getOsType() {
		return this.osType;
	}

    /**
     * Sets os type.
     *
     * @param osType the os type
     */
    public void setOsType(String osType) {
		this.osType = osType;
	}

    /**
     * Gets payload.
     *
     * @return the payload
     */
    public String getPayload() {
		return this.payload;
	}

    /**
     * Sets payload.
     *
     * @param payload the payload
     */
    public void setPayload(String payload) {
		this.payload = payload;
	}

    /**
     * Gets third msg id.
     *
     * @return the third msg id
     */
    public String getThirdMsgId() {
		return this.thirdMsgId;
	}

    /**
     * Sets third msg id.
     *
     * @param thirdMsgId the third msg id
     */
    public void setThirdMsgId(String thirdMsgId) {
		this.thirdMsgId = thirdMsgId;
	}

    /**
     * Gets valid end.
     *
     * @return the valid end
     */
    public Date getValidEnd() {
		return this.validEnd;
	}

    /**
     * Sets valid end.
     *
     * @param validEnd the valid end
     */
    public void setValidEnd(Date validEnd) {
		this.validEnd = validEnd;
	}

    /**
     * Gets valid start.
     *
     * @return the valid start
     */
    public Date getValidStart() {
		return this.validStart;
	}

    /**
     * Sets valid start.
     *
     * @param validStart the valid start
     */
    public void setValidStart(Date validStart) {
		this.validStart = validStart;
	}

}
