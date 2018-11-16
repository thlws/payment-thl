package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁车险服务核销
 *
 * @author auto create
 * @since 1.0, 2018-06-20 20:32:32
 */
public class AlipayInsAutoServiceCouponVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 2358343668367274196L;

	/**
	 * 业务扩展数据,根据核销服务类型不同，业务相关扩展数据以json格式返回,蚂蚁根据json格式解析。
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 蚂蚁内部券码ID,蚂蚁内部发送券时同步给服务商的唯一券码,服务商需要将蚂蚁内部券码和服务商自己的券码进行映射,引导核销阶段蚂蚁会将蚂蚁的这个券码传给服务商，服务商根据映射关系找到自己的券码进行核销,核销时需要将蚂蚁的券码也返回给蚂蚁。
	 */
	@ApiField("coupon_id")
	private String couponId;

	/**
	 * 核销事件类型,枚举包含如下三种值(00: 预约 01: 取消预约  10: 核销 )
用于用户线下预约，取消预约，核销服务时服务商将对应的动作同步给蚂蚁，方便在卡券中展示。
	 */
	@ApiField("event")
	private String event;

	/**
	 * 核销业务时间,服务核销的真正时间, 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("event_date")
	private String eventDate;

	/**
	 * 外部业务单号,唯一,券核销时的服务商的外部业务单号,幂等字段用于控制幂等。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 服务商券码ID, 服务商在核销用户的券码时候的唯一标识，该券码会和蚂蚁内部的券码有一一映射关系。
	 */
	@ApiField("sp_coupon_id")
	private String spCouponId;

	/**
	 * 蚂蚁会员ID
	 */
	@ApiField("user_id")
	private String userId;

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
     * Gets coupon id.
     *
     * @return the coupon id
     */
    public String getCouponId() {
		return this.couponId;
	}

    /**
     * Sets coupon id.
     *
     * @param couponId the coupon id
     */
    public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

    /**
     * Gets event.
     *
     * @return the event
     */
    public String getEvent() {
		return this.event;
	}

    /**
     * Sets event.
     *
     * @param event the event
     */
    public void setEvent(String event) {
		this.event = event;
	}

    /**
     * Gets event date.
     *
     * @return the event date
     */
    public String getEventDate() {
		return this.eventDate;
	}

    /**
     * Sets event date.
     *
     * @param eventDate the event date
     */
    public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
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
     * Gets sp coupon id.
     *
     * @return the sp coupon id
     */
    public String getSpCouponId() {
		return this.spCouponId;
	}

    /**
     * Sets sp coupon id.
     *
     * @param spCouponId the sp coupon id
     */
    public void setSpCouponId(String spCouponId) {
		this.spCouponId = spCouponId;
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
