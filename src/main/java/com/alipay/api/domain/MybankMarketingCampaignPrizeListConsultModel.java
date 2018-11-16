package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 咨询可用奖品
 *
 * @author auto create
 * @since 1.0, 2018-02-07 12:00:22
 */
public class MybankMarketingCampaignPrizeListConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5731479265818261873L;

	/**
	 * 支付宝UID，2088开头
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务交易金额，单位元
	 */
	@ApiField("biz_amt")
	private String bizAmt;

	/**
	 * 咨询上下文，JSON结构
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 业务流水号，幂等控制，调用方生成
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务发起渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 银行参与者id，是在网商银行创建会员后生成的id，网商银行会员的唯一标识
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 银行参与者角色id，是在网商银行创建会员后生成的角色id，网商银行会员角色的唯一标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 业务产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 多种奖品类型批量咨询，英文逗号分隔
	 */
	@ApiField("type_list")
	private String typeList;

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId() {
		return this.alipayUserId;
	}

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets biz amt.
     *
     * @return the biz amt
     */
    public String getBizAmt() {
		return this.bizAmt;
	}

    /**
     * Sets biz amt.
     *
     * @param bizAmt the biz amt
     */
    public void setBizAmt(String bizAmt) {
		this.bizAmt = bizAmt;
	}

    /**
     * Gets biz context.
     *
     * @return the biz context
     */
    public String getBizContext() {
		return this.bizContext;
	}

    /**
     * Sets biz context.
     *
     * @param bizContext the biz context
     */
    public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

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
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannel() {
		return this.channel;
	}

    /**
     * Sets channel.
     *
     * @param channel the channel
     */
    public void setChannel(String channel) {
		this.channel = channel;
	}

    /**
     * Gets ip id.
     *
     * @return the ip id
     */
    public String getIpId() {
		return this.ipId;
	}

    /**
     * Sets ip id.
     *
     * @param ipId the ip id
     */
    public void setIpId(String ipId) {
		this.ipId = ipId;
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
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    /**
     * Gets type list.
     *
     * @return the type list
     */
    public String getTypeList() {
		return this.typeList;
	}

    /**
     * Sets type list.
     *
     * @param typeList the type list
     */
    public void setTypeList(String typeList) {
		this.typeList = typeList;
	}

}
