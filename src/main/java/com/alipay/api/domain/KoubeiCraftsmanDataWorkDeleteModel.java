package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 删除手艺人作品信息接口
 *
 * @author auto create
 * @since 1.0, 2017-10-11 20:35:42
 */
public class KoubeiCraftsmanDataWorkDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3367398377175496752L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；isv自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 口碑手艺人id。是创建手艺人接口koubei.craftsman.data.provider.create返回的craftsman_id，或通过查询手艺人信息接口koubei.craftsman.data.provider查询craftsman_id
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	/**
	 * 口碑手艺人作品id列表，通过查询手艺人作品信息接口koubei.craftsman.data.work.batchquery获取work_id
	 */
	@ApiListField("work_ids")
	@ApiField("string")
	private List<String> workIds;

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
     * Gets craftsman id.
     *
     * @return the craftsman id
     */
    public String getCraftsmanId() {
		return this.craftsmanId;
	}

    /**
     * Sets craftsman id.
     *
     * @param craftsmanId the craftsman id
     */
    public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}

    /**
     * Gets work ids.
     *
     * @return the work ids
     */
    public List<String> getWorkIds() {
		return this.workIds;
	}

    /**
     * Sets work ids.
     *
     * @param workIds the work ids
     */
    public void setWorkIds(List<String> workIds) {
		this.workIds = workIds;
	}

}
