package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改手艺人作品信息接口
 *
 * @author auto create
 * @since 1.0, 2017-10-11 20:35:51
 */
public class KoubeiCraftsmanDataWorkModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7581419719763764532L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；isv自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 作品标题。不能出现网络敏感词，异步审核，审核不通过会删除作品。不会回调isv
	 */
	@ApiField("title")
	private String title;

	/**
	 * 口碑手艺人作品id，通过查询手艺人作品信息接口koubei.craftsman.data.work.batchquery获取work_id
	 */
	@ApiField("work_id")
	private String workId;

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
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

    /**
     * Gets work id.
     *
     * @return the work id
     */
    public String getWorkId() {
		return this.workId;
	}

    /**
     * Sets work id.
     *
     * @param workId the work id
     */
    public void setWorkId(String workId) {
		this.workId = workId;
	}

}
