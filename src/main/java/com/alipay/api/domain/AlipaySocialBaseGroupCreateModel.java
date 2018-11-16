package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝建群
 *
 * @author auto create
 * @since 1.0, 2016-08-25 10:46:34
 */
public class AlipaySocialBaseGroupCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4295676774621156286L;

	/**
	 * 业务方传入的唯一id，做为幂等使用
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 群的业务类型，目前只能为0
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 建群时初始化的群设置
	 */
	@ApiField("group_settings")
	private GroupSetting groupSettings;

	/**
	 * 建群的时候，群主的userid
	 */
	@ApiField("master_id")
	private String masterId;

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo() {
		return this.bizNo;
	}

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets group settings.
     *
     * @return the group settings
     */
    public GroupSetting getGroupSettings() {
		return this.groupSettings;
	}

    /**
     * Sets group settings.
     *
     * @param groupSettings the group settings
     */
    public void setGroupSettings(GroupSetting groupSettings) {
		this.groupSettings = groupSettings;
	}

    /**
     * Gets master id.
     *
     * @return the master id
     */
    public String getMasterId() {
		return this.masterId;
	}

    /**
     * Sets master id.
     *
     * @param masterId the master id
     */
    public void setMasterId(String masterId) {
		this.masterId = masterId;
	}

}
