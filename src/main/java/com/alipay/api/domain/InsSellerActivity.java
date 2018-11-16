package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关于查询出的签约产品的详细信息
 *
 * @author auto create
 * @since 1.0, 2017-10-27 18:12:30
 */
public class InsSellerActivity extends AlipayObject {

	private static final long serialVersionUID = 2631278473177533236L;

	/**
	 * 关于签约的附加业务信息
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 签约时间
	 */
	@ApiField("join_time")
	private Date joinTime;

	/**
	 * 状态：1:加入 2:退出 3:清退
	 */
	@ApiField("status")
	private Long status;

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
     * Gets join time.
     *
     * @return the join time
     */
    public Date getJoinTime() {
		return this.joinTime;
	}

    /**
     * Sets join time.
     *
     * @param joinTime the join time
     */
    public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public Long getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Long status) {
		this.status = status;
	}

}
