package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流程任务
 *
 * @author auto create
 * @since 1.0, 2017-09-19 20:54:27
 */
public class BPOpenApiTask extends AlipayObject {

	private static final long serialVersionUID = 1841397895131167236L;

	/**
	 * 处理地址
	 */
	@ApiField("deal_url")
	private String dealUrl;

	/**
	 * 详情展示地址
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 审批节点中文显示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 操作时间
	 */
	@ApiField("gmt_operate")
	private String gmtOperate;

	/**
	 * 处理备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 审批节点code
	 */
	@ApiField("name")
	private String name;

	/**
	 * 点击的操作按钮
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 可点击的操作
	 */
	@ApiField("operate_transition")
	private String operateTransition;

	/**
	 * 处理人域账号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 处理人花名
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 加签类型
	 */
	@ApiField("sign_type")
	private String signType;

	/**
	 * 状态:CREATED,TAKEN,TEMP_SAVE,COMPLETED,CANCELED
	 */
	@ApiField("state")
	private String state;

	/**
	 * 节点类型：UserTask，SystemTask
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets deal url.
     *
     * @return the deal url
     */
    public String getDealUrl() {
		return this.dealUrl;
	}

    /**
     * Sets deal url.
     *
     * @param dealUrl the deal url
     */
    public void setDealUrl(String dealUrl) {
		this.dealUrl = dealUrl;
	}

    /**
     * Gets detail url.
     *
     * @return the detail url
     */
    public String getDetailUrl() {
		return this.detailUrl;
	}

    /**
     * Sets detail url.
     *
     * @param detailUrl the detail url
     */
    public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

    /**
     * Gets display name.
     *
     * @return the display name
     */
    public String getDisplayName() {
		return this.displayName;
	}

    /**
     * Sets display name.
     *
     * @param displayName the display name
     */
    public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

    /**
     * Gets gmt operate.
     *
     * @return the gmt operate
     */
    public String getGmtOperate() {
		return this.gmtOperate;
	}

    /**
     * Sets gmt operate.
     *
     * @param gmtOperate the gmt operate
     */
    public void setGmtOperate(String gmtOperate) {
		this.gmtOperate = gmtOperate;
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
     * Gets operate transition.
     *
     * @return the operate transition
     */
    public String getOperateTransition() {
		return this.operateTransition;
	}

    /**
     * Sets operate transition.
     *
     * @param operateTransition the operate transition
     */
    public void setOperateTransition(String operateTransition) {
		this.operateTransition = operateTransition;
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
     * Gets operator name.
     *
     * @return the operator name
     */
    public String getOperatorName() {
		return this.operatorName;
	}

    /**
     * Sets operator name.
     *
     * @param operatorName the operator name
     */
    public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

    /**
     * Gets sign type.
     *
     * @return the sign type
     */
    public String getSignType() {
		return this.signType;
	}

    /**
     * Sets sign type.
     *
     * @param signType the sign type
     */
    public void setSignType(String signType) {
		this.signType = signType;
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
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
