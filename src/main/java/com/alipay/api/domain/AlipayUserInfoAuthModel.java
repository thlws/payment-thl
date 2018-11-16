package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户登陆授权
 *
 * @author auto create
 * @since 1.0, 2016-12-13 17:20:12
 */
public class AlipayUserInfoAuthModel extends AlipayObject {

	private static final long serialVersionUID = 2413575334961251169L;

	/**
	 * 接口权限值，目前只支持auth_user和auth_base两个值。
auth_base：以auth_base为scope发起的网页授权，是用来获取进入页面的用户的userId的，并且是静默授权并自动跳转到回调页的。用户感知的就是直接进入了回调页（通常是业务页面）。
auth_user：以auth_user为scope发起的网页授权，是用来获取用户的基本信息的（比如头像、昵称等）。但这种授权需要用户手动同意，用户同意后，就可在授权后获取到该用户的基本信息。
	 */
	@ApiListField("scopes")
	@ApiField("string")
	private List<String> scopes;

	/**
	 * 商户自定义参数，用户授权后，重定向到redirect_uri时会原样回传给商户。 为防止CSRF攻击，建议开发者请求授权时传入state参数，该参数要做到既不可预测，又可以证明客户端和当前第三方网站的登录认证状态存在关联。
只允许base64字符（长度小于等于100）
	 */
	@ApiField("state")
	private String state;

    /**
     * Gets scopes.
     *
     * @return the scopes
     */
    public List<String> getScopes() {
		return this.scopes;
	}

    /**
     * Sets scopes.
     *
     * @param scopes the scopes
     */
    public void setScopes(List<String> scopes) {
		this.scopes = scopes;
	}

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
		return this.state;
	}

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
		this.state = state;
	}

}
