package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建流程实例
 *
 * @author auto create
 * @since 1.0, 2017-09-19 20:53:33
 */
public class AlipayBossBaseProcessInstanceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5165619947371254152L;

	/**
	 * 加签内容
	 */
	@ApiListField("add_sign_content")
	@ApiField("b_p_open_api_add_sign_content")
	private List<BPOpenApiAddSignContent> addSignContent;

	/**
	 * 业务上下文，JSON格式
	 */
	@ApiField("context")
	private String context;

	/**
	 * 创建人的域账号
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 描述信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 2088账号
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 流程配置名称。需要先在流程平台配置流程
	 */
	@ApiField("name")
	private String name;

	/**
	 * 优先级，数字越大优先级越高，最大不超过29
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 流程全局唯一ID，和业务一一对应
	 */
	@ApiField("puid")
	private BPOpenApiPUID puid;

	/**
	 * 前置流程从哪个节点发起的本流程
	 */
	@ApiField("source_node_name")
	private String sourceNodeName;

	/**
	 * 前置流程的PUID。用于串连起两个流程
	 */
	@ApiField("source_puid")
	private String sourcePuid;

	/**
	 * 子流程的上下文。每一个上下文都使用JSON格式
	 */
	@ApiListField("sub_contexts")
	@ApiField("string")
	private List<String> subContexts;

    /**
     * Gets add sign content.
     *
     * @return the add sign content
     */
    public List<BPOpenApiAddSignContent> getAddSignContent() {
		return this.addSignContent;
	}

    /**
     * Sets add sign content.
     *
     * @param addSignContent the add sign content
     */
    public void setAddSignContent(List<BPOpenApiAddSignContent> addSignContent) {
		this.addSignContent = addSignContent;
	}

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
     * Gets creator.
     *
     * @return the creator
     */
    public String getCreator() {
		return this.creator;
	}

    /**
     * Sets creator.
     *
     * @param creator the creator
     */
    public void setCreator(String creator) {
		this.creator = creator;
	}

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
		return this.description;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
	}

    /**
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public String getIpRoleId() {
		return this.ipRoleId;
	}

    /**
     * Sets ip role id.
     *
     * @param ipRoleId the ip role id
     */
    public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
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
    public BPOpenApiPUID getPuid() {
		return this.puid;
	}

    /**
     * Sets puid.
     *
     * @param puid the puid
     */
    public void setPuid(BPOpenApiPUID puid) {
		this.puid = puid;
	}

    /**
     * Gets source node name.
     *
     * @return the source node name
     */
    public String getSourceNodeName() {
		return this.sourceNodeName;
	}

    /**
     * Sets source node name.
     *
     * @param sourceNodeName the source node name
     */
    public void setSourceNodeName(String sourceNodeName) {
		this.sourceNodeName = sourceNodeName;
	}

    /**
     * Gets source puid.
     *
     * @return the source puid
     */
    public String getSourcePuid() {
		return this.sourcePuid;
	}

    /**
     * Sets source puid.
     *
     * @param sourcePuid the source puid
     */
    public void setSourcePuid(String sourcePuid) {
		this.sourcePuid = sourcePuid;
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
