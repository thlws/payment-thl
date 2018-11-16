package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品操作接口
 *
 * @author auto create
 * @since 1.0, 2017-06-06 11:40:36
 */
public class KoubeiItemStateModel extends AlipayObject {

	private static final long serialVersionUID = 1531638735692817977L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，有效期24小时；
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 口碑体系内部商品的唯一标识，后续的增删改查接口都使用该ID作为主键
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作上下文 ISV角色操作时必填；其他角色不需填写
	 */
	@ApiField("operation_context")
	private KoubeiOperationContext operationContext;

	/**
	 * 支持英文字母和数字，由开发者自行定义（不允许重复），在商品notify消息中也会带有该参数，以此标明本次notify消息是对哪个请求的回应
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 控制商品的售卖状态，RESUME：恢复售卖；PAUSE：暂停售卖,C端不可见;
	 */
	@ApiField("state_type")
	private String stateType;

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
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets operation context.
     *
     * @return the operation context
     */
    public KoubeiOperationContext getOperationContext() {
		return this.operationContext;
	}

    /**
     * Sets operation context.
     *
     * @param operationContext the operation context
     */
    public void setOperationContext(KoubeiOperationContext operationContext) {
		this.operationContext = operationContext;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets state type.
     *
     * @return the state type
     */
    public String getStateType() {
		return this.stateType;
	}

    /**
     * Sets state type.
     *
     * @param stateType the state type
     */
    public void setStateType(String stateType) {
		this.stateType = stateType;
	}

}
