package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销权益发放接口
 *
 * @author auto create
 * @since 1.0, 2017-02-23 21:17:32
 */
public class AlipayInsSceneCouponSendModel extends AlipayObject {

	private static final long serialVersionUID = 5375162378157586449L;

	/**
	 * 渠道账号对应的uid;如果证件类型字段没填则必填
	 */
	@ApiField("channel_user_id")
	private String channelUserId;

	/**
	 * 渠道账号来源;1:支付宝账号 2:淘宝账号;如果证件类型字段没填则必填
	 */
	@ApiField("channel_user_source")
	private String channelUserSource;

	/**
	 * 活动维度id;
商户PID值
	 */
	@ApiField("dimension_id")
	private String dimensionId;

	/**
	 * 活动维度;
GOODS:淘宝商品,ANT_PID:蚂蚁商户PID
	 */
	@ApiField("dimension_type")
	private String dimensionType;

	/**
	 * 市场类型;
TAOBAO:淘宝平台,ANT: 蚂蚁平台
	 */
	@ApiField("market_type")
	private String marketType;

	/**
	 * 商户生成的外部业务号,必须保证唯一，幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 服务场景;
propertyPaySuccess:蚂蚁物业支付成功页面
	 */
	@ApiField("service_scenario")
	private String serviceScenario;

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
     * Gets dimension id.
     *
     * @return the dimension id
     */
    public String getDimensionId() {
		return this.dimensionId;
	}

    /**
     * Sets dimension id.
     *
     * @param dimensionId the dimension id
     */
    public void setDimensionId(String dimensionId) {
		this.dimensionId = dimensionId;
	}

    /**
     * Gets dimension type.
     *
     * @return the dimension type
     */
    public String getDimensionType() {
		return this.dimensionType;
	}

    /**
     * Sets dimension type.
     *
     * @param dimensionType the dimension type
     */
    public void setDimensionType(String dimensionType) {
		this.dimensionType = dimensionType;
	}

    /**
     * Gets market type.
     *
     * @return the market type
     */
    public String getMarketType() {
		return this.marketType;
	}

    /**
     * Sets market type.
     *
     * @param marketType the market type
     */
    public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets service scenario.
     *
     * @return the service scenario
     */
    public String getServiceScenario() {
		return this.serviceScenario;
	}

    /**
     * Sets service scenario.
     *
     * @param serviceScenario the service scenario
     */
    public void setServiceScenario(String serviceScenario) {
		this.serviceScenario = serviceScenario;
	}

}
