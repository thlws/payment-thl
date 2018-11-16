package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险查询用户的精简模型定义
 *
 * @author auto create
 * @since 1.0, 2018-07-18 13:53:51
 */
public class InsQueryPerson extends AlipayObject {

	private static final long serialVersionUID = 1492712481128242635L;

	/**
	 * 证件号码;如果渠道账号字段（channel_user_id）没填则本字段为必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型;如果渠道账号字段没填则必填 （该字段和cert_no为配对字段）
100:居民身份证;102:护照;103:军官证;104:士兵证;105:港澳居民往来内地通行证;106:台湾同胞往来大陆通行证;109:警官证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 渠道账号对应的uid;如果证件类型字段没填则本字段为必填
	 */
	@ApiField("channel_user_id")
	private String channelUserId;

	/**
	 * 渠道账号来源:
1:支付宝账号;
2:淘宝账号;
如果证件类型字段没填则必填。
和channel_user_id 配对
	 */
	@ApiField("channel_user_source")
	private String channelUserSource;

	/**
	 * 保单用户搜索的类型:
1：按照投保人搜索
2：按照受益人搜索 
3：按照被保人搜索
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets cert type.
     *
     * @return the cert type
     */
    public String getCertType() {
		return this.certType;
	}

    /**
     * Sets cert type.
     *
     * @param certType the cert type
     */
    public void setCertType(String certType) {
		this.certType = certType;
	}

    /**
     * Gets channel user id.
     *
     * @return the channel user id
     */
    public String getChannelUserId() {
		return this.channelUserId;
	}

    /**
     * Sets channel user id.
     *
     * @param channelUserId the channel user id
     */
    public void setChannelUserId(String channelUserId) {
		this.channelUserId = channelUserId;
	}

    /**
     * Gets channel user source.
     *
     * @return the channel user source
     */
    public String getChannelUserSource() {
		return this.channelUserSource;
	}

    /**
     * Sets channel user source.
     *
     * @param channelUserSource the channel user source
     */
    public void setChannelUserSource(String channelUserSource) {
		this.channelUserSource = channelUserSource;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
