package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务上下文包括环境信息和用户信息
 *
 * @author auto create
 * @since 1.0, 2018-09-18 10:50:24
 */
public class ServiceContext extends AlipayObject {

	private static final long serialVersionUID = 2122628798495972162L;

	/**
	 * 客户端IP
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 客户端UMID
	 */
	@ApiField("client_pcidguid")
	private String clientPcidguid;

	/**
	 * 服务器名
	 */
	@ApiField("server_name")
	private String serverName;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets client ip.
     *
     * @return the client ip
     */
    public String getClientIp() {
		return this.clientIp;
	}

    /**
     * Sets client ip.
     *
     * @param clientIp the client ip
     */
    public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

    /**
     * Gets client pcidguid.
     *
     * @return the client pcidguid
     */
    public String getClientPcidguid() {
		return this.clientPcidguid;
	}

    /**
     * Sets client pcidguid.
     *
     * @param clientPcidguid the client pcidguid
     */
    public void setClientPcidguid(String clientPcidguid) {
		this.clientPcidguid = clientPcidguid;
	}

    /**
     * Gets server name.
     *
     * @return the server name
     */
    public String getServerName() {
		return this.serverName;
	}

    /**
     * Sets server name.
     *
     * @param serverName the server name
     */
    public void setServerName(String serverName) {
		this.serverName = serverName;
	}

    /**
     * Gets session id.
     *
     * @return the session id
     */
    public String getSessionId() {
		return this.sessionId;
	}

    /**
     * Sets session id.
     *
     * @param sessionId the session id
     */
    public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
