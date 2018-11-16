package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关系的扩展信息
 *
 * @author auto create
 * @since 1.0, 2017-08-18 16:52:40
 */
public class ExtraInfoVO extends AlipayObject {

	private static final long serialVersionUID = 8566318863658945698L;

	/**
	 * 是否是taomaomao好友关系
	 */
	@ApiField("maomao_friend")
	private Boolean maomaoFriend;

	/**
	 * 是否注册taomaomao游戏
	 */
	@ApiField("maomao_register")
	private Boolean maomaoRegister;

	/**
	 * 支付宝对应的taobao_id
	 */
	@ApiField("taobao_id")
	private String taobaoId;

    /**
     * Gets maomao friend.
     *
     * @return the maomao friend
     */
    public Boolean getMaomaoFriend() {
		return this.maomaoFriend;
	}

    /**
     * Sets maomao friend.
     *
     * @param maomaoFriend the maomao friend
     */
    public void setMaomaoFriend(Boolean maomaoFriend) {
		this.maomaoFriend = maomaoFriend;
	}

    /**
     * Gets maomao register.
     *
     * @return the maomao register
     */
    public Boolean getMaomaoRegister() {
		return this.maomaoRegister;
	}

    /**
     * Sets maomao register.
     *
     * @param maomaoRegister the maomao register
     */
    public void setMaomaoRegister(Boolean maomaoRegister) {
		this.maomaoRegister = maomaoRegister;
	}

    /**
     * Gets taobao id.
     *
     * @return the taobao id
     */
    public String getTaobaoId() {
		return this.taobaoId;
	}

    /**
     * Sets taobao id.
     *
     * @param taobaoId the taobao id
     */
    public void setTaobaoId(String taobaoId) {
		this.taobaoId = taobaoId;
	}

}
