package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 餐饮pos业务订单修改
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:30:41
 */
public class KoubeiCateringOrderInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4667811793429497827L;

	/**
	 * 触发订单更新的操作类型，比如:
加菜：ADD_DISH；
减菜：SUBSTRACT_DISH；
转台：SWITCH_TABLE；
菜状态变迁：DISH_STATUS_CHANGE
订单信息更新(比如服务费等)：ORDER_MODIFY
其他：OTHER
	 */
	@ApiField("action")
	private String action;

	/**
	 * 订单最新菜明细列表
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
	 * 其他杂费,以元为单位,精确到分
	 */
	@ApiField("other_amount")
	private String otherAmount;

	/**
	 * 打包费,以元为单位,精确到分
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
	 * 服务费,以元为单位,精确到分
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/**
	 * 取餐号码,示例: 桌号:04,令牌:13,取餐号
:5100,配送 :2018012912312312321( 比如饿了么订单号)
	 */
	@ApiField("take_no")
	private String takeNo;

    /**
     * Gets action.
     *
     * @return the action
     */
    public String getAction() {
		return this.action;
	}

    /**
     * Sets action.
     *
     * @param action the action
     */
    public void setAction(String action) {
		this.action = action;
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

}
