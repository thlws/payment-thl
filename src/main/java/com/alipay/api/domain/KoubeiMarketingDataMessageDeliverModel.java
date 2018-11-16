package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一键营销商家中心PUSH消息接口
 *
 * @author auto create
 * @since 1.0, 2016-09-07 16:01:59
 */
public class KoubeiMarketingDataMessageDeliverModel extends AlipayObject {

	private static final long serialVersionUID = 1288994835683139428L;

	/**
	 * 消息内容，json格式， KEY值编号递增
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展信息， json格式，
key值：
REDIRECT_URL跳转地址; 
CHANNEL发送渠道，对应value值为：MSGBOX消息盒子，PUSH手机消息通知
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 消息业务类型
活动推荐消息：PROMO_RECOMMEND;
活动效果消息: PROMO_STAT
	 */
	@ApiField("msg_type")
	private String msgType;

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
		return this.content;
	}

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
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
     * Gets msg type.
     *
     * @return the msg type
     */
    public String getMsgType() {
		return this.msgType;
	}

    /**
     * Sets msg type.
     *
     * @param msgType the msg type
     */
    public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

}
