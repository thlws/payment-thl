package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安全策略咨询服务输出
 *
 * @author auto create
 * @since 1.0, 2018-09-18 10:50:24
 */
public class AlipaySecurityRiskPolicyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1834635843295942741L;

	/**
	 * 风险类型：表示风险处理或风险咨询——process/advice
	 */
	@ApiField("risk_type")
	private String riskType;

	/**
	 * 安全场景参数
	 */
	@ApiField("security_scene")
	private SecurityScene securityScene;

	/**
	 * 服务上下文包括环境信息和用户信息
	 */
	@ApiField("service_context")
	private ServiceContext serviceContext;

    /**
     * Gets risk type.
     *
     * @return the risk type
     */
    public String getRiskType() {
		return this.riskType;
	}

    /**
     * Sets risk type.
     *
     * @param riskType the risk type
     */
    public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

    /**
     * Gets security scene.
     *
     * @return the security scene
     */
    public SecurityScene getSecurityScene() {
		return this.securityScene;
	}

    /**
     * Sets security scene.
     *
     * @param securityScene the security scene
     */
    public void setSecurityScene(SecurityScene securityScene) {
		this.securityScene = securityScene;
	}

    /**
     * Gets service context.
     *
     * @return the service context
     */
    public ServiceContext getServiceContext() {
		return this.serviceContext;
	}

    /**
     * Sets service context.
     *
     * @param serviceContext the service context
     */
    public void setServiceContext(ServiceContext serviceContext) {
		this.serviceContext = serviceContext;
	}

}
