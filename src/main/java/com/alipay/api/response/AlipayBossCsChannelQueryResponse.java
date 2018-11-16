package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.cs.channel.query response.
 *
 * @author auto create
 * @since 1.0, 2016-02-23 20:04:44
 */
public class AlipayBossCsChannelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1634244824969158733L;

	/** 
	 * 平均通话时长
	 */
	@ApiField("att")
	private String att;

	/** 
	 * 备注
	 */
	@ApiField("comment")
	private String comment;

	/** 
	 * 接通率
	 */
	@ApiField("connection_rate")
	private String connectionRate;

	/** 
	 * 通话中人数
	 */
	@ApiField("curr_agent_talking")
	private String currAgentTalking;

	/** 
	 * 在线小二数
	 */
	@ApiField("curr_agents_logged_in")
	private String currAgentsLoggedIn;

	/** 
	 * 排队数
	 */
	@ApiField("curr_number_waiting_calls")
	private String currNumberWaitingCalls;

	/** 
	 * 小休人数
	 */
	@ApiField("current_not_ready_agents")
	private String currentNotReadyAgents;

	/** 
	 * 等待人数
	 */
	@ApiField("current_ready_agents")
	private String currentReadyAgents;

	/** 
	 * 主键
	 */
	@ApiField("row_key")
	private String rowKey;

	/** 
	 * 流入量
	 */
	@ApiField("visitor_inflow")
	private String visitorInflow;

	/** 
	 * 应答量
	 */
	@ApiField("visitor_response")
	private String visitorResponse;

	/** 
	 * 应答量[转接]
	 */
	@ApiField("visitor_response_transfer")
	private String visitorResponseTransfer;

    /**
     * Sets att.
     *
     * @param att the att
     */
    public void setAtt(String att) {
		this.att = att;
	}

    /**
     * Gets att.
     *
     * @return the att
     */
    public String getAtt( ) {
		return this.att;
	}

    /**
     * Sets comment.
     *
     * @param comment the comment
     */
    public void setComment(String comment) {
		this.comment = comment;
	}

    /**
     * Gets comment.
     *
     * @return the comment
     */
    public String getComment( ) {
		return this.comment;
	}

    /**
     * Sets connection rate.
     *
     * @param connectionRate the connection rate
     */
    public void setConnectionRate(String connectionRate) {
		this.connectionRate = connectionRate;
	}

    /**
     * Gets connection rate.
     *
     * @return the connection rate
     */
    public String getConnectionRate( ) {
		return this.connectionRate;
	}

    /**
     * Sets curr agent talking.
     *
     * @param currAgentTalking the curr agent talking
     */
    public void setCurrAgentTalking(String currAgentTalking) {
		this.currAgentTalking = currAgentTalking;
	}

    /**
     * Gets curr agent talking.
     *
     * @return the curr agent talking
     */
    public String getCurrAgentTalking( ) {
		return this.currAgentTalking;
	}

    /**
     * Sets curr agents logged in.
     *
     * @param currAgentsLoggedIn the curr agents logged in
     */
    public void setCurrAgentsLoggedIn(String currAgentsLoggedIn) {
		this.currAgentsLoggedIn = currAgentsLoggedIn;
	}

    /**
     * Gets curr agents logged in.
     *
     * @return the curr agents logged in
     */
    public String getCurrAgentsLoggedIn( ) {
		return this.currAgentsLoggedIn;
	}

    /**
     * Sets curr number waiting calls.
     *
     * @param currNumberWaitingCalls the curr number waiting calls
     */
    public void setCurrNumberWaitingCalls(String currNumberWaitingCalls) {
		this.currNumberWaitingCalls = currNumberWaitingCalls;
	}

    /**
     * Gets curr number waiting calls.
     *
     * @return the curr number waiting calls
     */
    public String getCurrNumberWaitingCalls( ) {
		return this.currNumberWaitingCalls;
	}

    /**
     * Sets current not ready agents.
     *
     * @param currentNotReadyAgents the current not ready agents
     */
    public void setCurrentNotReadyAgents(String currentNotReadyAgents) {
		this.currentNotReadyAgents = currentNotReadyAgents;
	}

    /**
     * Gets current not ready agents.
     *
     * @return the current not ready agents
     */
    public String getCurrentNotReadyAgents( ) {
		return this.currentNotReadyAgents;
	}

    /**
     * Sets current ready agents.
     *
     * @param currentReadyAgents the current ready agents
     */
    public void setCurrentReadyAgents(String currentReadyAgents) {
		this.currentReadyAgents = currentReadyAgents;
	}

    /**
     * Gets current ready agents.
     *
     * @return the current ready agents
     */
    public String getCurrentReadyAgents( ) {
		return this.currentReadyAgents;
	}

    /**
     * Sets row key.
     *
     * @param rowKey the row key
     */
    public void setRowKey(String rowKey) {
		this.rowKey = rowKey;
	}

    /**
     * Gets row key.
     *
     * @return the row key
     */
    public String getRowKey( ) {
		return this.rowKey;
	}

    /**
     * Sets visitor inflow.
     *
     * @param visitorInflow the visitor inflow
     */
    public void setVisitorInflow(String visitorInflow) {
		this.visitorInflow = visitorInflow;
	}

    /**
     * Gets visitor inflow.
     *
     * @return the visitor inflow
     */
    public String getVisitorInflow( ) {
		return this.visitorInflow;
	}

    /**
     * Sets visitor response.
     *
     * @param visitorResponse the visitor response
     */
    public void setVisitorResponse(String visitorResponse) {
		this.visitorResponse = visitorResponse;
	}

    /**
     * Gets visitor response.
     *
     * @return the visitor response
     */
    public String getVisitorResponse( ) {
		return this.visitorResponse;
	}

    /**
     * Sets visitor response transfer.
     *
     * @param visitorResponseTransfer the visitor response transfer
     */
    public void setVisitorResponseTransfer(String visitorResponseTransfer) {
		this.visitorResponseTransfer = visitorResponseTransfer;
	}

    /**
     * Gets visitor response transfer.
     *
     * @return the visitor response transfer
     */
    public String getVisitorResponseTransfer( ) {
		return this.visitorResponseTransfer;
	}

}
