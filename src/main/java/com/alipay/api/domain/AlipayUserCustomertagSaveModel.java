package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保存客户标签
 *
 * @author auto create
 * @since 1.0, 2018-08-29 16:56:13
 */
public class AlipayUserCustomertagSaveModel extends AlipayObject {

	private static final long serialVersionUID = 2674288443698327464L;

	/**
	 * 业务场景码。由支付宝产品经理分配，相当于存储标签的使用凭证。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 标签名字
	 */
	@ApiField("tag_name")
	private String tagName;

	/**
	 * 标签值，常见为T,F
	 */
	@ApiField("tag_value")
	private String tagValue;

	/**
	 * 支付宝会员uid
	 */
	@ApiField("user_id")
	private String userId;

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
     * Gets tag name.
     *
     * @return the tag name
     */
    public String getTagName() {
		return this.tagName;
	}

    /**
     * Sets tag name.
     *
     * @param tagName the tag name
     */
    public void setTagName(String tagName) {
		this.tagName = tagName;
	}

    /**
     * Gets tag value.
     *
     * @return the tag value
     */
    public String getTagValue() {
		return this.tagValue;
	}

    /**
     * Sets tag value.
     *
     * @param tagValue the tag value
     */
    public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
