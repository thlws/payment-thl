package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 操作员角色关系批量绑定接口
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:52:48
 */
public class KoubeiMerchantOperatorRolerelationBindModel extends AlipayObject {

	private static final long serialVersionUID = 7588977579127649639L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；isv自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 操作员id列表
	 */
	@ApiListField("operator_ids")
	@ApiField("string")
	private List<String> operatorIds;

	/**
	 * 角色id
	 */
	@ApiField("role_id")
	private String roleId;

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
		return this.authCode;
	}

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

    /**
     * Gets operator ids.
     *
     * @return the operator ids
     */
    public List<String> getOperatorIds() {
		return this.operatorIds;
	}

    /**
     * Sets operator ids.
     *
     * @param operatorIds the operator ids
     */
    public void setOperatorIds(List<String> operatorIds) {
		this.operatorIds = operatorIds;
	}

    /**
     * Gets role id.
     *
     * @return the role id
     */
    public String getRoleId() {
		return this.roleId;
	}

    /**
     * Sets role id.
     *
     * @param roleId the role id
     */
    public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
