package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基于识别创建蚂蚁通行证，即创建匿名用户Id
 *
 * @author auto create
 * @since 1.0, 2018-08-20 12:05:23
 */
public class AlipayUserAntpaasTokenidentityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1387939532911492665L;

	/**
	 * 业务Id，如新零售场景下创建匿名淘宝账户时的品牌商Id。
如果该值为空，则底层创建匿名账户时以 biz_scene + mobile 进行幂等
如果该值非空，则底层创建匿名账户Id时以 biz_scene + mobile + biz_id 进行幂等。
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务域场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 额外附加信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 附加信息Id，如淘宝虚拟账号Id
	 */
	@ApiField("ext_info_id")
	private String extInfoId;

	/**
	 * 手机号码，1864234324324
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 1-企业 2-个人
	 */
	@ApiField("user_type")
	private String userType;

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

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
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets ext info id.
     *
     * @return the ext info id
     */
    public String getExtInfoId() {
		return this.extInfoId;
	}

    /**
     * Sets ext info id.
     *
     * @param extInfoId the ext info id
     */
    public void setExtInfoId(String extInfoId) {
		this.extInfoId = extInfoId;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets user type.
     *
     * @return the user type
     */
    public String getUserType() {
		return this.userType;
	}

    /**
     * Sets user type.
     *
     * @param userType the user type
     */
    public void setUserType(String userType) {
		this.userType = userType;
	}

}
