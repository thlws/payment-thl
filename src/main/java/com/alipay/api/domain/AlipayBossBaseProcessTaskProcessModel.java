package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 流程任务处理
 *
 * @author auto create
 * @since 1.0, 2017-09-19 20:53:21
 */
public class AlipayBossBaseProcessTaskProcessModel extends AlipayObject {

	private static final long serialVersionUID = 5514873667484137534L;

	/**
	 * 更新的业务上下文。和原有业务上下文同key覆盖，新增key新增。
	 */
	@ApiField("context")
	private String context;

	/**
	 * 处理幂等值，特别注意这个值的使用，不能依赖于流程中的任何值。
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	/**
	 * 处理备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 当前需要推进的节点
	 */
	@ApiField("node")
	private String node;

	/**
	 * 操作名称
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 当前处理人域账号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 更新的优先级。填写0则不更新，使用原值
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 流程全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

	/**
	 * 更新的子流程上下文。完全覆盖原值。若不需要覆盖，则传null
	 */
	@ApiListField("sub_contexts")
	@ApiField("string")
	private List<String> subContexts;

    /**
     * Gets context.
     *
     * @return the context
     */
    public String getContext() {
		return this.context;
	}

    /**
     * Sets context.
     *
     * @param context the context
     */
    public void setContext(String context) {
		this.context = context;
	}

    /**
     * Gets idempotent id.
     *
     * @return the idempotent id
     */
    public String getIdempotentId() {
		return this.idempotentId;
	}

    /**
     * Sets idempotent id.
     *
     * @param idempotentId the idempotent id
     */
    public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets node.
     *
     * @return the node
     */
    public String getNode() {
		return this.node;
	}

    /**
     * Sets node.
     *
     * @param node the node
     */
    public void setNode(String node) {
		this.node = node;
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
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
	}

    /**
     * Gets priority.
     *
     * @return the priority
     */
    public Long getPriority() {
		return this.priority;
	}

    /**
     * Sets priority.
     *
     * @param priority the priority
     */
    public void setPriority(Long priority) {
		this.priority = priority;
	}

    /**
     * Gets puid.
     *
     * @return the puid
     */
    public String getPuid() {
		return this.puid;
	}

    /**
     * Sets puid.
     *
     * @param puid the puid
     */
    public void setPuid(String puid) {
		this.puid = puid;
	}

    /**
     * Gets sub contexts.
     *
     * @return the sub contexts
     */
    public List<String> getSubContexts() {
		return this.subContexts;
	}

    /**
     * Sets sub contexts.
     *
     * @param subContexts the sub contexts
     */
    public void setSubContexts(List<String> subContexts) {
		this.subContexts = subContexts;
	}

}
