package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单内容变更接口
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:27:00
 */
public class AlipayEcoMycarMaintainBizorderUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 5428765541159963135L;

	/**
	 * 预约确认时间yyyy-MM-dd HH:mm:ss。门店确认预约时间。门店确认后，预约流程生效，用户可到店服务。
	 */
	@ApiField("appoint_affirm_time")
	private String appointAffirmTime;

	/**
	 * 预约结束时间yyyy-MM-dd HH:mm:ss。用户选择的预约结束时间，用于判断用户是否在预约时间到店服务。
	 */
	@ApiField("appoint_end_time")
	private String appointEndTime;

	/**
	 * 预约开始时间yyyy-MM-dd HH:mm:ss，用户选择的预约开始时间，用于判断用户是否在预约时间到店服务。
	 */
	@ApiField("appoint_start_time")
	private String appointStartTime;

	/**
	 * 预约状态(0-待确认预约 1-确认预约)。有预约流程的订单，门店确认前为待确认预约，门店确认后为 确认预约。
	 */
	@ApiField("appoint_status")
	private Long appointStatus;

	/**
	 * 到店时间yyyy-MM-dd HH:mm:ss。 用户到店时间，用于判断用户是否在预约时间到店服务。
	 */
	@ApiField("arrive_time")
	private String arriveTime;

	/**
	 * 车主平台订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 服务项列表
	 */
	@ApiListField("order_server_list")
	@ApiField("maintain_biz_order")
	private List<MaintainBizOrder> orderServerList;

	/**
	 * 原始金额。服务原价累计后金额。服务项变更时，重新计算交易金额。金额单位(元)，保留两位小数。原始金额 = 服务原始价格 * 数量 + 商品售卖价格 * 数量
	 */
	@ApiField("original_cost")
	private String originalCost;

	/**
	 * 外部门店编号；更换门店下单是门店编号，适用于门店重新指派场景。
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 交易金额。服务项变更时，重新计算交易金额。金额单位(元)，保留两位小数。交易金额 = 服务售卖价格 * 数量 + 商品售卖价格 * 数量
	 */
	@ApiField("real_cost")
	private String realCost;

	/**
	 * 修改场景类型：
appoint_change: 变更预约时间，
appoint_affirm : 预约确认
shop_arrive :到店
service_change : 服务项修改
shop_change : 门店重新指派

变更预约时间（appoint_change）
涉及字段：appoint_start_time、 appoint_end_time
条件：订单未支付、已支付，未确定预约。

确认预约（appoint_affirm）
涉及字段：appoint_status、appoint_affirm_time
条件：订单已支付、未到店

确认到店（shop_arrive）
涉及字段：arrive_time
条件：订单已确定预约、服务未完成

服务项变更（service_change）
涉及字段：order_server_list、real_cost、original_cost
条件：开始保养，服务未完成

门店重新指派（shop_change）
涉及字段：out_shop_id
条件：服务未完成
	 */
	@ApiField("scene_type")
	private String sceneType;

    /**
     * Gets appoint affirm time.
     *
     * @return the appoint affirm time
     */
    public String getAppointAffirmTime() {
		return this.appointAffirmTime;
	}

    /**
     * Sets appoint affirm time.
     *
     * @param appointAffirmTime the appoint affirm time
     */
    public void setAppointAffirmTime(String appointAffirmTime) {
		this.appointAffirmTime = appointAffirmTime;
	}

    /**
     * Gets appoint end time.
     *
     * @return the appoint end time
     */
    public String getAppointEndTime() {
		return this.appointEndTime;
	}

    /**
     * Sets appoint end time.
     *
     * @param appointEndTime the appoint end time
     */
    public void setAppointEndTime(String appointEndTime) {
		this.appointEndTime = appointEndTime;
	}

    /**
     * Gets appoint start time.
     *
     * @return the appoint start time
     */
    public String getAppointStartTime() {
		return this.appointStartTime;
	}

    /**
     * Sets appoint start time.
     *
     * @param appointStartTime the appoint start time
     */
    public void setAppointStartTime(String appointStartTime) {
		this.appointStartTime = appointStartTime;
	}

    /**
     * Gets appoint status.
     *
     * @return the appoint status
     */
    public Long getAppointStatus() {
		return this.appointStatus;
	}

    /**
     * Sets appoint status.
     *
     * @param appointStatus the appoint status
     */
    public void setAppointStatus(Long appointStatus) {
		this.appointStatus = appointStatus;
	}

    /**
     * Gets arrive time.
     *
     * @return the arrive time
     */
    public String getArriveTime() {
		return this.arriveTime;
	}

    /**
     * Sets arrive time.
     *
     * @param arriveTime the arrive time
     */
    public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets order server list.
     *
     * @return the order server list
     */
    public List<MaintainBizOrder> getOrderServerList() {
		return this.orderServerList;
	}

    /**
     * Sets order server list.
     *
     * @param orderServerList the order server list
     */
    public void setOrderServerList(List<MaintainBizOrder> orderServerList) {
		this.orderServerList = orderServerList;
	}

    /**
     * Gets original cost.
     *
     * @return the original cost
     */
    public String getOriginalCost() {
		return this.originalCost;
	}

    /**
     * Sets original cost.
     *
     * @param originalCost the original cost
     */
    public void setOriginalCost(String originalCost) {
		this.originalCost = originalCost;
	}

    /**
     * Gets out shop id.
     *
     * @return the out shop id
     */
    public String getOutShopId() {
		return this.outShopId;
	}

    /**
     * Sets out shop id.
     *
     * @param outShopId the out shop id
     */
    public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

    /**
     * Gets real cost.
     *
     * @return the real cost
     */
    public String getRealCost() {
		return this.realCost;
	}

    /**
     * Sets real cost.
     *
     * @param realCost the real cost
     */
    public void setRealCost(String realCost) {
		this.realCost = realCost;
	}

    /**
     * Gets scene type.
     *
     * @return the scene type
     */
    public String getSceneType() {
		return this.sceneType;
	}

    /**
     * Sets scene type.
     *
     * @param sceneType the scene type
     */
    public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
