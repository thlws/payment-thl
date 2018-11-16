package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 流程实例
 *
 * @author auto create
 * @since 1.0, 2017-09-19 20:54:27
 */
public class BPOpenApiInstance extends AlipayObject {

	private static final long serialVersionUID = 8446595342719378733L;

	/**
	 * 业务上下文，JSON格式
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 创建人域账号
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 流程实例描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 创建到完成的毫秒数，未完结为0
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 完结时间,未完结时为空
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 最后更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 2088账号
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 最后更新人域账号
	 */
	@ApiField("modify_user")
	private String modifyUser;

	/**
	 * 流程配置名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父流程实例ID。用于描述父子流程
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 父流程实例所处的节点
	 */
	@ApiField("parent_node")
	private String parentNode;

	/**
	 * 优先级
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

	/**
	 * 前置流程ID。用于描述流程串联
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 前置流程从哪个节点发起的本流程
	 */
	@ApiField("source_node_name")
	private String sourceNodeName;

	/**
	 * 流程实例状态:CREATED,PROCESSING,COMPLETED,CANCELED
	 */
	@ApiField("state")
	private String state;

	/**
	 * 包含的任务列表
	 */
	@ApiListField("tasks")
	@ApiField("b_p_open_api_task")
	private List<BPOpenApiTask> tasks;

    /**
     * Gets biz context.
     *
     * @return the biz context
     */
    public String getBizContext() {
		return this.bizContext;
	}

    /**
     * Sets biz context.
     *
     * @param bizContext the biz context
     */
    public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets create user.
     *
     * @return the create user
     */
    public String getCreateUser() {
		return this.createUser;
	}

    /**
     * Sets create user.
     *
     * @param createUser the create user
     */
    public void setCreateUser(String createUser) {
		this.createUser = createUser;
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
     * Gets duration.
     *
     * @return the duration
     */
    public Long getDuration() {
		return this.duration;
	}

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(Long duration) {
		this.duration = duration;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public Date getGmtCreate() {
		return this.gmtCreate;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public Date getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public Date getGmtModified() {
		return this.gmtModified;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
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
     * Gets modify user.
     *
     * @return the modify user
     */
    public String getModifyUser() {
		return this.modifyUser;
	}

    /**
     * Sets modify user.
     *
     * @param modifyUser the modify user
     */
    public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
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
     * Gets parent id.
     *
     * @return the parent id
     */
    public String getParentId() {
		return this.parentId;
	}

    /**
     * Sets parent id.
     *
     * @param parentId the parent id
     */
    public void setParentId(String parentId) {
		this.parentId = parentId;
	}

    /**
     * Gets parent node.
     *
     * @return the parent node
     */
    public String getParentNode() {
		return this.parentNode;
	}

    /**
     * Sets parent node.
     *
     * @param parentNode the parent node
     */
    public void setParentNode(String parentNode) {
		this.parentNode = parentNode;
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
     * Gets source id.
     *
     * @return the source id
     */
    public String getSourceId() {
		return this.sourceId;
	}

    /**
     * Sets source id.
     *
     * @param sourceId the source id
     */
    public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
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
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
		return this.state;
	}

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
		this.state = state;
	}

    /**
     * Gets tasks.
     *
     * @return the tasks
     */
    public List<BPOpenApiTask> getTasks() {
		return this.tasks;
	}

    /**
     * Sets tasks.
     *
     * @param tasks the tasks
     */
    public void setTasks(List<BPOpenApiTask> tasks) {
		this.tasks = tasks;
	}

}
