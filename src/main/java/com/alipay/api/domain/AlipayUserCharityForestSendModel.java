package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 森林能量发放接口
 *
 * @author auto create
 * @since 1.0, 2018-07-13 16:50:42
 */
public class AlipayUserCharityForestSendModel extends AlipayObject {

	private static final long serialVersionUID = 8553479134354496588L;

	/**
	 * 唯一单据号，用于发能量幂等控制
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 能量值，最小1g，最大100kg（100,000），不能有小数
	 */
	@ApiField("energy")
	private Long energy;

	/**
	 * 能量气泡类型
	 */
	@ApiField("energy_type")
	private String energyType;

	/**
	 * 业务来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用户的支付宝账户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo() {
		return this.bizNo;
	}

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz time.
     *
     * @return the biz time
     */
    public Date getBizTime() {
		return this.bizTime;
	}

    /**
     * Sets biz time.
     *
     * @param bizTime the biz time
     */
    public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

    /**
     * Gets energy.
     *
     * @return the energy
     */
    public Long getEnergy() {
		return this.energy;
	}

    /**
     * Sets energy.
     *
     * @param energy the energy
     */
    public void setEnergy(Long energy) {
		this.energy = energy;
	}

    /**
     * Gets energy type.
     *
     * @return the energy type
     */
    public String getEnergyType() {
		return this.energyType;
	}

    /**
     * Sets energy type.
     *
     * @param energyType the energy type
     */
    public void setEnergyType(String energyType) {
		this.energyType = energyType;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
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
