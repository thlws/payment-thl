package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户场景合作咨询
 *
 * @author auto create
 * @since 1.0, 2018-06-14 19:33:25
 */
public class AlipayUserSceneCooperationConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5192341866244947398L;

	/**
	 * 人传人场景码。如果商户需要接入人传人活动建立邀请关系，则需要设置此参数表示人传人场景。当前所有接入人传人的商户统一使用 CommerceService
	 */
	@ApiField("invite_scene")
	private String inviteScene;

	/**
	 * 商户用来标识自己的合作方ID，可用于人传人下级渠道多级返奖
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 用来标识商户实体，可以是商户的支付宝用户ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 用户主体信息。要求AlipayUserPrincipalInfo中的user_id、mobile(不加国家码)、email属性，有且只有一个非空。否则接口会忽略除去优先级最高的属性之外的其他属性。user_id优先级最高，mobile次之，email最后
	 */
	@ApiField("principal")
	private AlipayUserPrincipalInfo principal;

	/**
	 * 商户的场景定义，需要支付宝对接入场景进行配置。
	 */
	@ApiField("scene")
	private String scene;

    /**
     * Gets invite scene.
     *
     * @return the invite scene
     */
    public String getInviteScene() {
		return this.inviteScene;
	}

    /**
     * Sets invite scene.
     *
     * @param inviteScene the invite scene
     */
    public void setInviteScene(String inviteScene) {
		this.inviteScene = inviteScene;
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
     * Gets pid.
     *
     * @return the pid
     */
    public String getPid() {
		return this.pid;
	}

    /**
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(String pid) {
		this.pid = pid;
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

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public String getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(String scene) {
		this.scene = scene;
	}

}
