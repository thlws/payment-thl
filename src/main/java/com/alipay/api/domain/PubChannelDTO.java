package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模板投放渠道
 *
 * @author auto create
 * @since 1.0, 2017-08-21 19:56:28
 */
public class PubChannelDTO extends AlipayObject {

	private static final long serialVersionUID = 1372615857419387725L;

	/**
	 * 扩展信息，无需配置
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 1、SHOP_DETAIL:店铺详情页 
2、PAYMENT_RESULT: 支付成功页（支付成功页暂不支持）
	 */
	@ApiField("pub_channel")
	private String pubChannel;

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
     * Gets pub channel.
     *
     * @return the pub channel
     */
    public String getPubChannel() {
		return this.pubChannel;
	}

    /**
     * Sets pub channel.
     *
     * @param pubChannel the pub channel
     */
    public void setPubChannel(String pubChannel) {
		this.pubChannel = pubChannel;
	}

}
