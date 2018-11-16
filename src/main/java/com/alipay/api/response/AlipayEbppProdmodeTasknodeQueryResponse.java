package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.tasknode.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:55:32
 */
public class AlipayEbppProdmodeTasknodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6798254337991443536L;

	/** 
	 * 是否可以编辑所有
	 */
	@ApiField("is_edit_all")
	private String isEditAll;

	/** 
	 * 编辑结算部分
	 */
	@ApiField("is_edit_fund")
	private String isEditFund;

	/** 
	 * 审批节点编码
	 */
	@ApiField("node_code")
	private String nodeCode;

	/** 
	 * 任务状态描述
	 */
	@ApiField("node_name")
	private String nodeName;

	/** 
	 * 拒绝理由
	 */
	@ApiField("reject")
	private String reject;

	/** 
	 * 拒绝时间
	 */
	@ApiField("reject_time")
	private String rejectTime;

    /**
     * Sets is edit all.
     *
     * @param isEditAll the is edit all
     */
    public void setIsEditAll(String isEditAll) {
		this.isEditAll = isEditAll;
	}

    /**
     * Gets is edit all.
     *
     * @return the is edit all
     */
    public String getIsEditAll( ) {
		return this.isEditAll;
	}

    /**
     * Sets is edit fund.
     *
     * @param isEditFund the is edit fund
     */
    public void setIsEditFund(String isEditFund) {
		this.isEditFund = isEditFund;
	}

    /**
     * Gets is edit fund.
     *
     * @return the is edit fund
     */
    public String getIsEditFund( ) {
		return this.isEditFund;
	}

    /**
     * Sets node code.
     *
     * @param nodeCode the node code
     */
    public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

    /**
     * Gets node code.
     *
     * @return the node code
     */
    public String getNodeCode( ) {
		return this.nodeCode;
	}

    /**
     * Sets node name.
     *
     * @param nodeName the node name
     */
    public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

    /**
     * Gets node name.
     *
     * @return the node name
     */
    public String getNodeName( ) {
		return this.nodeName;
	}

    /**
     * Sets reject.
     *
     * @param reject the reject
     */
    public void setReject(String reject) {
		this.reject = reject;
	}

    /**
     * Gets reject.
     *
     * @return the reject
     */
    public String getReject( ) {
		return this.reject;
	}

    /**
     * Sets reject time.
     *
     * @param rejectTime the reject time
     */
    public void setRejectTime(String rejectTime) {
		this.rejectTime = rejectTime;
	}

    /**
     * Gets reject time.
     *
     * @return the reject time
     */
    public String getRejectTime( ) {
		return this.rejectTime;
	}

}
