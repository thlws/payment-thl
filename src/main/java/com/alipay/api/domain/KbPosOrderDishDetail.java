package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑pos订单菜明细
 *
 * @author auto create
 * @since 1.0, 2018-09-04 11:54:26
 */
public class KbPosOrderDishDetail extends AlipayObject {

	private static final long serialVersionUID = 3855791432411673574L;

	/**
	 * 改价（单价），以元为单位，精度到分
	 */
	@ApiField("change_price")
	private String changePrice;

	/**
	 * 改价原因
	 */
	@ApiField("change_reason")
	private String changeReason;

	/**
	 * 菜谱ID
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜谱版本号，用时间戳实现（示例：date.getTime()）
	 */
	@ApiField("cook_version")
	private String cookVersion;

	/**
	 * 是否可以享受优惠
	 */
	@ApiField("discountable")
	private Boolean discountable;

	/**
	 * 菜品ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 菜品数量，≥1
	 */
	@ApiField("dish_num")
	private Long dishNum;

	/**
	 * 菜品单位
	 */
	@ApiField("dish_unit")
	private String dishUnit;

	/**
	 * 菜品明细版本号
	 */
	@ApiField("dish_version")
	private Long dishVersion;

	/**
	 * 扩展信息，json对象格式，key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否改价
	 */
	@ApiField("has_change")
	private Boolean hasChange;

	/**
	 * 是否是主明细，默认都是主明细。除了点套餐的时候，套餐本身这个菜作为主明细设置，套餐下的菜明细作为非主明细设置。
	 */
	@ApiField("main_flag")
	private Boolean mainFlag;

	/**
	 * 主明细id，套餐下的菜品对应的主明细id
	 */
	@ApiField("main_out_detail_no")
	private String mainOutDetailNo;

	/**
	 * 制作状态，取值约定：INIT-未制作，MAKE-已制作，SERVE-已上菜，REFUND-已退菜
	 */
	@ApiField("make_status")
	private String makeStatus;

	/**
	 * 会员价（单价），以元为单位，精度到分
	 */
	@ApiField("member_price")
	private String memberPrice;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 下单操作员ID
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 下单时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * pos本地订单菜明细流水号
	 */
	@ApiField("out_detail_no")
	private String outDetailNo;

	/**
	 * 做法信息，格式按照：做法1,做法2，对于有一般销售属性的菜会拼接一般销售属性信息，格式为：做法1,做法2,销售属性1,销售属性2
	 */
	@ApiField("practice_info")
	private String practiceInfo;

	/**
	 * 做法合计加价（单价），以元为单位，精度到分
	 */
	@ApiField("practice_price")
	private String practicePrice;

	/**
	 * 退菜原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退菜时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 催菜次数
	 */
	@ApiField("remind_time")
	private Long remindTime;

	/**
	 * 销售属性，使用Map<String,List<String>> salesProperties = JSONObject.parseObject(sales_properties,Map.class)转换
	 */
	@ApiField("sales_properties")
	private String salesProperties;

	/**
	 * 售价（单价），以元为单位，精度到分
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * 菜品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 菜品点菜序号
	 */
	@ApiField("sort")
	private Long sort;

	/**
	 * 规格中文名，没有规格时不需要填写
	 */
	@ApiField("spec_name")
	private String specName;

	/**
	 * 菜明细类型，SINGLE(单品)/SIDE(加料)/COMBO(套餐)/SINGLE_COMBO(套餐内单品)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户身份标识：手机号码、userId等等。如果是支付宝扫码点菜的，就是用户userId
	 */
	@ApiField("user_identity")
	private String userIdentity;

	/**
	 * 叫起状态，取值约定：WAIT-等待叫起，UP-已叫起
	 */
	@ApiField("wake_status")
	private String wakeStatus;

    /**
     * Gets change price.
     *
     * @return the change price
     */
    public String getChangePrice() {
		return this.changePrice;
	}

    /**
     * Sets change price.
     *
     * @param changePrice the change price
     */
    public void setChangePrice(String changePrice) {
		this.changePrice = changePrice;
	}

    /**
     * Gets change reason.
     *
     * @return the change reason
     */
    public String getChangeReason() {
		return this.changeReason;
	}

    /**
     * Sets change reason.
     *
     * @param changeReason the change reason
     */
    public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

    /**
     * Gets cook id.
     *
     * @return the cook id
     */
    public String getCookId() {
		return this.cookId;
	}

    /**
     * Sets cook id.
     *
     * @param cookId the cook id
     */
    public void setCookId(String cookId) {
		this.cookId = cookId;
	}

    /**
     * Gets cook version.
     *
     * @return the cook version
     */
    public String getCookVersion() {
		return this.cookVersion;
	}

    /**
     * Sets cook version.
     *
     * @param cookVersion the cook version
     */
    public void setCookVersion(String cookVersion) {
		this.cookVersion = cookVersion;
	}

    /**
     * Gets discountable.
     *
     * @return the discountable
     */
    public Boolean getDiscountable() {
		return this.discountable;
	}

    /**
     * Sets discountable.
     *
     * @param discountable the discountable
     */
    public void setDiscountable(Boolean discountable) {
		this.discountable = discountable;
	}

    /**
     * Gets dish id.
     *
     * @return the dish id
     */
    public String getDishId() {
		return this.dishId;
	}

    /**
     * Sets dish id.
     *
     * @param dishId the dish id
     */
    public void setDishId(String dishId) {
		this.dishId = dishId;
	}

    /**
     * Gets dish name.
     *
     * @return the dish name
     */
    public String getDishName() {
		return this.dishName;
	}

    /**
     * Sets dish name.
     *
     * @param dishName the dish name
     */
    public void setDishName(String dishName) {
		this.dishName = dishName;
	}

    /**
     * Gets dish num.
     *
     * @return the dish num
     */
    public Long getDishNum() {
		return this.dishNum;
	}

    /**
     * Sets dish num.
     *
     * @param dishNum the dish num
     */
    public void setDishNum(Long dishNum) {
		this.dishNum = dishNum;
	}

    /**
     * Gets dish unit.
     *
     * @return the dish unit
     */
    public String getDishUnit() {
		return this.dishUnit;
	}

    /**
     * Sets dish unit.
     *
     * @param dishUnit the dish unit
     */
    public void setDishUnit(String dishUnit) {
		this.dishUnit = dishUnit;
	}

    /**
     * Gets dish version.
     *
     * @return the dish version
     */
    public Long getDishVersion() {
		return this.dishVersion;
	}

    /**
     * Sets dish version.
     *
     * @param dishVersion the dish version
     */
    public void setDishVersion(Long dishVersion) {
		this.dishVersion = dishVersion;
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
     * Gets has change.
     *
     * @return the has change
     */
    public Boolean getHasChange() {
		return this.hasChange;
	}

    /**
     * Sets has change.
     *
     * @param hasChange the has change
     */
    public void setHasChange(Boolean hasChange) {
		this.hasChange = hasChange;
	}

    /**
     * Gets main flag.
     *
     * @return the main flag
     */
    public Boolean getMainFlag() {
		return this.mainFlag;
	}

    /**
     * Sets main flag.
     *
     * @param mainFlag the main flag
     */
    public void setMainFlag(Boolean mainFlag) {
		this.mainFlag = mainFlag;
	}

    /**
     * Gets main out detail no.
     *
     * @return the main out detail no
     */
    public String getMainOutDetailNo() {
		return this.mainOutDetailNo;
	}

    /**
     * Sets main out detail no.
     *
     * @param mainOutDetailNo the main out detail no
     */
    public void setMainOutDetailNo(String mainOutDetailNo) {
		this.mainOutDetailNo = mainOutDetailNo;
	}

    /**
     * Gets make status.
     *
     * @return the make status
     */
    public String getMakeStatus() {
		return this.makeStatus;
	}

    /**
     * Sets make status.
     *
     * @param makeStatus the make status
     */
    public void setMakeStatus(String makeStatus) {
		this.makeStatus = makeStatus;
	}

    /**
     * Gets member price.
     *
     * @return the member price
     */
    public String getMemberPrice() {
		return this.memberPrice;
	}

    /**
     * Sets member price.
     *
     * @param memberPrice the member price
     */
    public void setMemberPrice(String memberPrice) {
		this.memberPrice = memberPrice;
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
     * Gets out detail no.
     *
     * @return the out detail no
     */
    public String getOutDetailNo() {
		return this.outDetailNo;
	}

    /**
     * Sets out detail no.
     *
     * @param outDetailNo the out detail no
     */
    public void setOutDetailNo(String outDetailNo) {
		this.outDetailNo = outDetailNo;
	}

    /**
     * Gets practice info.
     *
     * @return the practice info
     */
    public String getPracticeInfo() {
		return this.practiceInfo;
	}

    /**
     * Sets practice info.
     *
     * @param practiceInfo the practice info
     */
    public void setPracticeInfo(String practiceInfo) {
		this.practiceInfo = practiceInfo;
	}

    /**
     * Gets practice price.
     *
     * @return the practice price
     */
    public String getPracticePrice() {
		return this.practicePrice;
	}

    /**
     * Sets practice price.
     *
     * @param practicePrice the practice price
     */
    public void setPracticePrice(String practicePrice) {
		this.practicePrice = practicePrice;
	}

    /**
     * Gets refund reason.
     *
     * @return the refund reason
     */
    public String getRefundReason() {
		return this.refundReason;
	}

    /**
     * Sets refund reason.
     *
     * @param refundReason the refund reason
     */
    public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

    /**
     * Gets refund time.
     *
     * @return the refund time
     */
    public Date getRefundTime() {
		return this.refundTime;
	}

    /**
     * Sets refund time.
     *
     * @param refundTime the refund time
     */
    public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

    /**
     * Gets remind time.
     *
     * @return the remind time
     */
    public Long getRemindTime() {
		return this.remindTime;
	}

    /**
     * Sets remind time.
     *
     * @param remindTime the remind time
     */
    public void setRemindTime(Long remindTime) {
		this.remindTime = remindTime;
	}

    /**
     * Gets sales properties.
     *
     * @return the sales properties
     */
    public String getSalesProperties() {
		return this.salesProperties;
	}

    /**
     * Sets sales properties.
     *
     * @param salesProperties the sales properties
     */
    public void setSalesProperties(String salesProperties) {
		this.salesProperties = salesProperties;
	}

    /**
     * Gets sell price.
     *
     * @return the sell price
     */
    public String getSellPrice() {
		return this.sellPrice;
	}

    /**
     * Sets sell price.
     *
     * @param sellPrice the sell price
     */
    public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

    /**
     * Gets sku id.
     *
     * @return the sku id
     */
    public String getSkuId() {
		return this.skuId;
	}

    /**
     * Sets sku id.
     *
     * @param skuId the sku id
     */
    public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

    /**
     * Gets sort.
     *
     * @return the sort
     */
    public Long getSort() {
		return this.sort;
	}

    /**
     * Sets sort.
     *
     * @param sort the sort
     */
    public void setSort(Long sort) {
		this.sort = sort;
	}

    /**
     * Gets spec name.
     *
     * @return the spec name
     */
    public String getSpecName() {
		return this.specName;
	}

    /**
     * Sets spec name.
     *
     * @param specName the spec name
     */
    public void setSpecName(String specName) {
		this.specName = specName;
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

    /**
     * Gets user identity.
     *
     * @return the user identity
     */
    public String getUserIdentity() {
		return this.userIdentity;
	}

    /**
     * Sets user identity.
     *
     * @param userIdentity the user identity
     */
    public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}

    /**
     * Gets wake status.
     *
     * @return the wake status
     */
    public String getWakeStatus() {
		return this.wakeStatus;
	}

    /**
     * Sets wake status.
     *
     * @param wakeStatus the wake status
     */
    public void setWakeStatus(String wakeStatus) {
		this.wakeStatus = wakeStatus;
	}

}
