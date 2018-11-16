package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询是否在支付宝公益捐赠的接口
 *
 * @author auto create
 * @since 1.0, 2017-12-13 20:21:12
 */
public class AlipayUserCharityRecordexistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6372994288524785442L;

	/**
	 * 公益的业务类型(缺省是所有类型)
	 */
	@ApiField("biz_type")
	private Long bizType;

	/**
	 * 捐赠记录的结束时间（默认是查询当前自然年一年的记录）
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 捐赠记录的开始时间（默认是查询当前自然年一年的记录）
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public Long getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public Date getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(Date startTime) {
		this.startTime = startTime;
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
