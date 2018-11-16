package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商圈集卡数据保存接口
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:53:42
 */
public class KoubeiMarketingToolMallPointsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5655295384472519691L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 业务类型(目前只有点卡)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 渲染截止时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 卡片展示内容，卡片如果没有集的count设置为0，本次交易获取的卡片需设置is_new的值为true
	 */
	@ApiField("json_content")
	private String jsonContent;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * trade|lottery|system，表示为交易|领取礼包|系统调整
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 外部幂等id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * collecting|collectSuccess|finish字段中的一种
	 */
	@ApiField("state")
	private String state;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_id")
	private String tradeId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets activity id.
     *
     * @return the activity id
     */
    public String getActivityId() {
		return this.activityId;
	}

    /**
     * Sets activity id.
     *
     * @param activityId the activity id
     */
    public void setActivityId(String activityId) {
		this.activityId = activityId;
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
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public Date getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets json content.
     *
     * @return the json content
     */
    public String getJsonContent() {
		return this.jsonContent;
	}

    /**
     * Sets json content.
     *
     * @param jsonContent the json content
     */
    public void setJsonContent(String jsonContent) {
		this.jsonContent = jsonContent;
	}

    /**
     * Gets mall id.
     *
     * @return the mall id
     */
    public String getMallId() {
		return this.mallId;
	}

    /**
     * Sets mall id.
     *
     * @param mallId the mall id
     */
    public void setMallId(String mallId) {
		this.mallId = mallId;
	}

    /**
     * Gets operate.
     *
     * @return the operate
     */
    public String getOperate() {
		return this.operate;
	}

    /**
     * Sets operate.
     *
     * @param operate the operate
     */
    public void setOperate(String operate) {
		this.operate = operate;
	}

    /**
     * Gets out biz id.
     *
     * @return the out biz id
     */
    public String getOutBizId() {
		return this.outBizId;
	}

    /**
     * Sets out biz id.
     *
     * @param outBizId the out biz id
     */
    public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
		return this.state;
	}

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
		this.state = state;
	}

    /**
     * Gets trade id.
     *
     * @return the trade id
     */
    public String getTradeId() {
		return this.tradeId;
	}

    /**
     * Sets trade id.
     *
     * @param tradeId the trade id
     */
    public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
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
