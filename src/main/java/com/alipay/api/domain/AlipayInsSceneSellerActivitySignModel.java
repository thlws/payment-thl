package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户加入活动签约
 *
 * @author auto create
 * @since 1.0, 2017-10-27 18:12:46
 */
public class AlipayInsSceneSellerActivitySignModel extends AlipayObject {

	private static final long serialVersionUID = 4256584488831828375L;

	/**
	 * 关于签约的附加信息
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 渠道账号对应的uid，如果证据类型字段没填则必填
	 */
	@ApiField("channel_account_id")
	private String channelAccountId;

	/**
	 * 渠道账号类型,如果证据类型字段没填则必填1:支付宝账号 2:淘宝账号
	 */
	@ApiField("channel_account_type")
	private Long channelAccountType;

	/**
	 * 标准产品编号
	 */
	@ApiField("sp_code")
	private String spCode;

    /**
     * Gets biz data.
     *
     * @return the biz data
     */
    public String getBizData() {
		return this.bizData;
	}

    /**
     * Sets biz data.
     *
     * @param bizData the biz data
     */
    public void setBizData(String bizData) {
		this.bizData = bizData;
	}

    /**
     * Gets channel account id.
     *
     * @return the channel account id
     */
    public String getChannelAccountId() {
		return this.channelAccountId;
	}

    /**
     * Sets channel account id.
     *
     * @param channelAccountId the channel account id
     */
    public void setChannelAccountId(String channelAccountId) {
		this.channelAccountId = channelAccountId;
	}

    /**
     * Gets channel account type.
     *
     * @return the channel account type
     */
    public Long getChannelAccountType() {
		return this.channelAccountType;
	}

    /**
     * Sets channel account type.
     *
     * @param channelAccountType the channel account type
     */
    public void setChannelAccountType(Long channelAccountType) {
		this.channelAccountType = channelAccountType;
	}

    /**
     * Gets sp code.
     *
     * @return the sp code
     */
    public String getSpCode() {
		return this.spCode;
	}

    /**
     * Sets sp code.
     *
     * @param spCode the sp code
     */
    public void setSpCode(String spCode) {
		this.spCode = spCode;
	}

}
