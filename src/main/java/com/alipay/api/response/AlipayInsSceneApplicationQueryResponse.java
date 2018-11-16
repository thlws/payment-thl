package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsPolicy;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-21 14:26:52
 */
public class AlipayInsSceneApplicationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1858242683941964268L;

	/** 
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	/** 
	 * 投保单状态;此状态用于判断投保流程的推进过程.INIT: 初始,UNDERWROTE:已核保, DECLINED:已拒保,CLOSED:已关闭, PAID:已付款,REFUND:已退款,ISSUED:已出单
	 */
	@ApiField("application_status")
	private String applicationStatus;

	/** 
	 * 交易操作流水号;用于跳支付宝收银台付款
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 商户生成的外部投保业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 保单;当投保单状态不是已出单,保单为空
	 */
	@ApiListField("policys")
	@ApiField("ins_policy")
	private List<InsPolicy> policys;

	/** 
	 * 支付交易订单号;用于跳支付宝收银台付款
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Sets application no.
     *
     * @param applicationNo the application no
     */
    public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

    /**
     * Gets application no.
     *
     * @return the application no
     */
    public String getApplicationNo( ) {
		return this.applicationNo;
	}

    /**
     * Sets application status.
     *
     * @param applicationStatus the application status
     */
    public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

    /**
     * Gets application status.
     *
     * @return the application status
     */
    public String getApplicationStatus( ) {
		return this.applicationStatus;
	}

    /**
     * Sets operation id.
     *
     * @param operationId the operation id
     */
    public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

    /**
     * Gets operation id.
     *
     * @return the operation id
     */
    public String getOperationId( ) {
		return this.operationId;
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
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo( ) {
		return this.outBizNo;
	}

    /**
     * Sets policys.
     *
     * @param policys the policys
     */
    public void setPolicys(List<InsPolicy> policys) {
		this.policys = policys;
	}

    /**
     * Gets policys.
     *
     * @return the policys
     */
    public List<InsPolicy> getPolicys( ) {
		return this.policys;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo( ) {
		return this.tradeNo;
	}

}
