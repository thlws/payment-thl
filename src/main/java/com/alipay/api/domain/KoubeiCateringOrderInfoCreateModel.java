package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 餐饮pos业务订单创建
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:30:55
 */
public class KoubeiCateringOrderInfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1372968149454525276L;

	/**
	 * 商户业务类型：DINNER-正餐、SNACK-快餐
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 订单渠道：ISV，ElEME
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 就餐类型：FOR_HERE—堂食、TAKE_OUT-外卖、TO_GO-外带
	 */
	@ApiField("dinner_type")
	private String dinnerType;

	/**
	 * 订单菜明细列表
	 */
	@ApiListField("dish_details")
	@ApiField("kb_pos_order_dish_detail")
	private List<KbPosOrderDishDetail> dishDetails;

	/**
	 * 扩展信息，json对象格式，key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 开台操作员ID
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 点餐方式：POS-pos点餐、SCAN-扫码点菜、PLATFORM-平台(外卖类的)
	 */
	@ApiField("order_style")
	private String orderStyle;

	/**
	 * 下单时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 原反结订单的设备号
	 */
	@ApiField("org_dv_sn")
	private String orgDvSn;

	/**
	 * 原反结订单的pos本地订单号
	 */
	@ApiField("org_out_biz_no")
	private String orgOutBizNo;

	/**
	 * 其他杂费，以元为单位，精确到分
	 */
	@ApiField("other_amount")
	private String otherAmount;

	/**
	 * 打包费，以元为单位，精确到分
	 */
	@ApiField("packing_amount")
	private String packingAmount;

	/**
	 * 用餐人数
	 */
	@ApiField("people_num")
	private Long peopleNum;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

	/**
	 * 服务费，以元为单位，精确到分
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/**
	 * 口碑体系内的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 开台时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("table_time")
	private Date tableTime;

	/**
	 * 取餐号码，示例：
桌号：04，令牌：13，取餐号：5100，配送：2018012912312312321（比如饿了么订单号）
	 */
	@ApiField("take_no")
	private String takeNo;

	/**
	 * 取餐类型：TABLE-桌号，TOKEN-令牌，NO-取餐号，DISPATCH-配送（仅针对外卖）
	 */
	@ApiField("take_style")
	private String takeStyle;

    /**
     * Gets business type.
     *
     * @return the business type
     */
    public String getBusinessType() {
		return this.businessType;
	}

    /**
     * Sets business type.
     *
     * @param businessType the business type
     */
    public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

    /**
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannel() {
		return this.channel;
	}

    /**
     * Sets channel.
     *
     * @param channel the channel
     */
    public void setChannel(String channel) {
		this.channel = channel;
	}

    /**
     * Gets dinner type.
     *
     * @return the dinner type
     */
    public String getDinnerType() {
		return this.dinnerType;
	}

    /**
     * Sets dinner type.
     *
     * @param dinnerType the dinner type
     */
    public void setDinnerType(String dinnerType) {
		this.dinnerType = dinnerType;
	}

    /**
     * Gets dish details.
     *
     * @return the dish details
     */
    public List<KbPosOrderDishDetail> getDishDetails() {
		return this.dishDetails;
	}

    /**
     * Sets dish details.
     *
     * @param dishDetails the dish details
     */
    public void setDishDetails(List<KbPosOrderDishDetail> dishDetails) {
		this.dishDetails = dishDetails;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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
     * Gets order style.
     *
     * @return the order style
     */
    public String getOrderStyle() {
		return this.orderStyle;
	}

    /**
     * Sets order style.
     *
     * @param orderStyle the order style
     */
    public void setOrderStyle(String orderStyle) {
		this.orderStyle = orderStyle;
	}

    /**
     * Gets order time.
     *
     * @return the order time
     */
    public Date getOrderTime() {
		return this.orderTime;
	}

    /**
     * Sets order time.
     *
     * @param orderTime the order time
     */
    public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

    /**
     * Gets org dv sn.
     *
     * @return the org dv sn
     */
    public String getOrgDvSn() {
		return this.orgDvSn;
	}

    /**
     * Sets org dv sn.
     *
     * @param orgDvSn the org dv sn
     */
    public void setOrgDvSn(String orgDvSn) {
		this.orgDvSn = orgDvSn;
	}

    /**
     * Gets org out biz no.
     *
     * @return the org out biz no
     */
    public String getOrgOutBizNo() {
		return this.orgOutBizNo;
	}

    /**
     * Sets org out biz no.
     *
     * @param orgOutBizNo the org out biz no
     */
    public void setOrgOutBizNo(String orgOutBizNo) {
		this.orgOutBizNo = orgOutBizNo;
	}

    /**
     * Gets other amount.
     *
     * @return the other amount
     */
    public String getOtherAmount() {
		return this.otherAmount;
	}

    /**
     * Sets other amount.
     *
     * @param otherAmount the other amount
     */
    public void setOtherAmount(String otherAmount) {
		this.otherAmount = otherAmount;
	}

    /**
     * Gets packing amount.
     *
     * @return the packing amount
     */
    public String getPackingAmount() {
		return this.packingAmount;
	}

    /**
     * Sets packing amount.
     *
     * @param packingAmount the packing amount
     */
    public void setPackingAmount(String packingAmount) {
		this.packingAmount = packingAmount;
	}

    /**
     * Gets people num.
     *
     * @return the people num
     */
    public Long getPeopleNum() {
		return this.peopleNum;
	}

    /**
     * Sets people num.
     *
     * @param peopleNum the people num
     */
    public void setPeopleNum(Long peopleNum) {
		this.peopleNum = peopleNum;
	}

    /**
     * Gets pos order key.
     *
     * @return the pos order key
     */
    public PosOrderKey getPosOrderKey() {
		return this.posOrderKey;
	}

    /**
     * Sets pos order key.
     *
     * @param posOrderKey the pos order key
     */
    public void setPosOrderKey(PosOrderKey posOrderKey) {
		this.posOrderKey = posOrderKey;
	}

    /**
     * Gets service amount.
     *
     * @return the service amount
     */
    public String getServiceAmount() {
		return this.serviceAmount;
	}

    /**
     * Sets service amount.
     *
     * @param serviceAmount the service amount
     */
    public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets table time.
     *
     * @return the table time
     */
    public Date getTableTime() {
		return this.tableTime;
	}

    /**
     * Sets table time.
     *
     * @param tableTime the table time
     */
    public void setTableTime(Date tableTime) {
		this.tableTime = tableTime;
	}

    /**
     * Gets take no.
     *
     * @return the take no
     */
    public String getTakeNo() {
		return this.takeNo;
	}

    /**
     * Sets take no.
     *
     * @param takeNo the take no
     */
    public void setTakeNo(String takeNo) {
		this.takeNo = takeNo;
	}

    /**
     * Gets take style.
     *
     * @return the take style
     */
    public String getTakeStyle() {
		return this.takeStyle;
	}

    /**
     * Sets take style.
     *
     * @param takeStyle the take style
     */
    public void setTakeStyle(String takeStyle) {
		this.takeStyle = takeStyle;
	}

}
