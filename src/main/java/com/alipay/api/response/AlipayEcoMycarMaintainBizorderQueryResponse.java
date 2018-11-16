package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MaintainBizOrderExpress;
import com.alipay.api.domain.MaintainBizOrderGoods;
import com.alipay.api.domain.MaintainBizOrderServer;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.bizorder.query response.
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:48:53
 */
public class AlipayEcoMycarMaintainBizorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3159454132916582642L;

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
	 * ISV订单状态文案，由ISV上传自己订单的状态，用于订单数据的匹配和对账。
	 */
	@ApiField("biz_status_txt")
	private String bizStatusTxt;

	/** 
	 * 订单类型，1：洗车，2：保养，4:4s店
	 */
	@ApiField("biz_type")
	private Long bizType;

	/** 
	 * 车主平台我的爱车ID。可通过接口查询爱车详情。 请链接 alipay.eco.mycar.dataservice.maintainvehicle.share接口。
	 */
	@ApiField("car_id")
	private String carId;

	/** 
	 * 订单创建时间yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private String createTime;

	/** 
	 * 有商品需要配置，并且ISV已经发货，生成物流子订单
	 */
	@ApiListField("order_express_list")
	@ApiField("maintain_biz_order_express")
	private List<MaintainBizOrderExpress> orderExpressList;

	/** 
	 * 带商户的订单会显示
	 */
	@ApiListField("order_goods_list")
	@ApiField("maintain_biz_order_goods")
	private List<MaintainBizOrderGoods> orderGoodsList;

	/** 
	 * 车主平台返回的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 有服务子订单时返回
	 */
	@ApiListField("order_server_list")
	@ApiField("maintain_biz_order_server")
	private List<MaintainBizOrderServer> orderServerList;

	/** 
	 * 车主平台业务订单状态
1-未支付；
4-已关闭；
6-支付完成；
7-已出库；
8-已收货； 
11-服务开始；
55-服务完成/已核销；
56-订单完成；
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/** 
	 * 原始金额,服务原价累计后金额。金额单位(元)，保留两位小数
原始金额 = 服务原始价格 * 数量 + 商品售卖价格 * 数量
	 */
	@ApiField("original_cost")
	private String originalCost;

	/** 
	 * ISV业务订单号，ISV上传订单场景，由业务方保证唯一。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 外部门店编号；订单创建时对应的门店的外部编号。门店在创建时，上传的ISV端唯一标示。
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/** 
	 * 支付时间yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 交易金额， 下单时实际支付金额。金额单位(元)，保留两位小数。
交易金额 = 服务售卖价格 * 数量 + 商品售卖价格 * 数量
	 */
	@ApiField("real_cost")
	private String realCost;

	/** 
	 * 车主平台门店编号
	 */
	@ApiField("shop_id")
	private Long shopId;

	/** 
	 * 下单时对应门店的车主平台门店名称。门店主名称(子门店名称)。
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 最后修改时间yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("update_time")
	private String updateTime;

	/** 
	 * 支付宝用户Uid
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets appoint affirm time.
     *
     * @param appointAffirmTime the appoint affirm time
     */
    public void setAppointAffirmTime(String appointAffirmTime) {
		this.appointAffirmTime = appointAffirmTime;
	}

    /**
     * Gets appoint affirm time.
     *
     * @return the appoint affirm time
     */
    public String getAppointAffirmTime( ) {
		return this.appointAffirmTime;
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
     * Gets appoint end time.
     *
     * @return the appoint end time
     */
    public String getAppointEndTime( ) {
		return this.appointEndTime;
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
     * Gets appoint start time.
     *
     * @return the appoint start time
     */
    public String getAppointStartTime( ) {
		return this.appointStartTime;
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
     * Gets appoint status.
     *
     * @return the appoint status
     */
    public Long getAppointStatus( ) {
		return this.appointStatus;
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
     * Gets arrive time.
     *
     * @return the arrive time
     */
    public String getArriveTime( ) {
		return this.arriveTime;
	}

    /**
     * Sets biz status txt.
     *
     * @param bizStatusTxt the biz status txt
     */
    public void setBizStatusTxt(String bizStatusTxt) {
		this.bizStatusTxt = bizStatusTxt;
	}

    /**
     * Gets biz status txt.
     *
     * @return the biz status txt
     */
    public String getBizStatusTxt( ) {
		return this.bizStatusTxt;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public Long getBizType( ) {
		return this.bizType;
	}

    /**
     * Sets car id.
     *
     * @param carId the car id
     */
    public void setCarId(String carId) {
		this.carId = carId;
	}

    /**
     * Gets car id.
     *
     * @return the car id
     */
    public String getCarId( ) {
		return this.carId;
	}

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public String getCreateTime( ) {
		return this.createTime;
	}

    /**
     * Sets order express list.
     *
     * @param orderExpressList the order express list
     */
    public void setOrderExpressList(List<MaintainBizOrderExpress> orderExpressList) {
		this.orderExpressList = orderExpressList;
	}

    /**
     * Gets order express list.
     *
     * @return the order express list
     */
    public List<MaintainBizOrderExpress> getOrderExpressList( ) {
		return this.orderExpressList;
	}

    /**
     * Sets order goods list.
     *
     * @param orderGoodsList the order goods list
     */
    public void setOrderGoodsList(List<MaintainBizOrderGoods> orderGoodsList) {
		this.orderGoodsList = orderGoodsList;
	}

    /**
     * Gets order goods list.
     *
     * @return the order goods list
     */
    public List<MaintainBizOrderGoods> getOrderGoodsList( ) {
		return this.orderGoodsList;
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
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo( ) {
		return this.orderNo;
	}

    /**
     * Sets order server list.
     *
     * @param orderServerList the order server list
     */
    public void setOrderServerList(List<MaintainBizOrderServer> orderServerList) {
		this.orderServerList = orderServerList;
	}

    /**
     * Gets order server list.
     *
     * @return the order server list
     */
    public List<MaintainBizOrderServer> getOrderServerList( ) {
		return this.orderServerList;
	}

    /**
     * Sets order status.
     *
     * @param orderStatus the order status
     */
    public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}

    /**
     * Gets order status.
     *
     * @return the order status
     */
    public Long getOrderStatus( ) {
		return this.orderStatus;
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
     * Gets original cost.
     *
     * @return the original cost
     */
    public String getOriginalCost( ) {
		return this.originalCost;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo( ) {
		return this.outOrderNo;
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
     * Gets out shop id.
     *
     * @return the out shop id
     */
    public String getOutShopId( ) {
		return this.outShopId;
	}

    /**
     * Sets pay time.
     *
     * @param payTime the pay time
     */
    public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

    /**
     * Gets pay time.
     *
     * @return the pay time
     */
    public String getPayTime( ) {
		return this.payTime;
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
     * Gets real cost.
     *
     * @return the real cost
     */
    public String getRealCost( ) {
		return this.realCost;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public Long getShopId( ) {
		return this.shopId;
	}

    /**
     * Sets shop name.
     *
     * @param shopName the shop name
     */
    public void setShopName(String shopName) {
		this.shopName = shopName;
	}

    /**
     * Gets shop name.
     *
     * @return the shop name
     */
    public String getShopName( ) {
		return this.shopName;
	}

    /**
     * Sets update time.
     *
     * @param updateTime the update time
     */
    public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

    /**
     * Gets update time.
     *
     * @return the update time
     */
    public String getUpdateTime( ) {
		return this.updateTime;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}
