package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁通行证角色解绑
 *
 * @author auto create
 * @since 1.0, 2018-08-20 12:05:31
 */
public class AlipayUserAntpaasRoleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8512183191815515668L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 角色Id
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 被动建立关系的 会员来源业务平台类型。104-金融云平台，103-淘宝平台，102-保险平台
	 */
	@ApiField("join_rel_role_biz_platform")
	private String joinRelRoleBizPlatform;

	/**
	 * 主操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 角色关系类型，1-保险业务，2-金融云业务
	 */
	@ApiField("rel_biz_typ")
	private String relBizTyp;

    /**
     * Gets biz scene.
     *
     * @return the biz scene
     */
    public String getBizScene() {
		return this.bizScene;
	}

    /**
     * Sets biz scene.
     *
     * @param bizScene the biz scene
     */
    public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

    /**
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public String getIpRoleId() {
		return this.ipRoleId;
	}

    /**
     * Sets ip role id.
     *
     * @param ipRoleId the ip role id
     */
    public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

    /**
     * Gets join rel role biz platform.
     *
     * @return the join rel role biz platform
     */
    public String getJoinRelRoleBizPlatform() {
		return this.joinRelRoleBizPlatform;
	}

    /**
     * Sets join rel role biz platform.
     *
     * @param joinRelRoleBizPlatform the join rel role biz platform
     */
    public void setJoinRelRoleBizPlatform(String joinRelRoleBizPlatform) {
		this.joinRelRoleBizPlatform = joinRelRoleBizPlatform;
	}

    /**
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId() {
		return this.operatorId;
	}

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

    /**
     * Gets rel biz typ.
     *
     * @return the rel biz typ
     */
    public String getRelBizTyp() {
		return this.relBizTyp;
	}

    /**
     * Sets rel biz typ.
     *
     * @param relBizTyp the rel biz typ
     */
    public void setRelBizTyp(String relBizTyp) {
		this.relBizTyp = relBizTyp;
	}

}
