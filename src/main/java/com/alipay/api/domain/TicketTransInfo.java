package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证的流水信息
 *
 * @author auto create
 * @since 1.0, 2017-08-15 19:19:07
 */
public class TicketTransInfo extends AlipayObject {

	private static final long serialVersionUID = 2664498222216625574L;

	/**
	 * 流水创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 最后修改时间，也就是流水状态更新为成功的时间
	 */
	@ApiField("last_modify_time")
	private Date lastModifyTime;

	/**
	 * 凭证流水id
	 */
	@ApiField("ticket_trans_id")
	private String ticketTransId;

	/**
	 * 流水类型
	 */
	@ApiField("ticket_trans_type")
	private String ticketTransType;

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public Date getCreateTime() {
		return this.createTime;
	}

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

    /**
     * Gets last modify time.
     *
     * @return the last modify time
     */
    public Date getLastModifyTime() {
		return this.lastModifyTime;
	}

    /**
     * Sets last modify time.
     *
     * @param lastModifyTime the last modify time
     */
    public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

    /**
     * Gets ticket trans id.
     *
     * @return the ticket trans id
     */
    public String getTicketTransId() {
		return this.ticketTransId;
	}

    /**
     * Sets ticket trans id.
     *
     * @param ticketTransId the ticket trans id
     */
    public void setTicketTransId(String ticketTransId) {
		this.ticketTransId = ticketTransId;
	}

    /**
     * Gets ticket trans type.
     *
     * @return the ticket trans type
     */
    public String getTicketTransType() {
		return this.ticketTransType;
	}

    /**
     * Sets ticket trans type.
     *
     * @param ticketTransType the ticket trans type
     */
    public void setTicketTransType(String ticketTransType) {
		this.ticketTransType = ticketTransType;
	}

}
