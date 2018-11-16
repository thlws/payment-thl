package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 餐饮pos业务订单结账同步
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:30:38
 */
public class KoubeiCateringOrderBillApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3436363149345148342L;

	/**
	 * 应收金额
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 账单维度优惠明细，本期识别：
BILL_CHANGE—整单改价；
DISH_CHANGE—单品改价；
MEMBER_DISCOUNT—会员价优惠
	 */
	@ApiListField("discount_details")
	@ApiField("pos_discount_detail")
	private List<PosDiscountDetail> discountDetails;

	/**
	 * 账单菜列表，包含菜品的优免分摊金额（内部优惠+外部优惠）
	 */
	@ApiListField("dish_details")
	@ApiField("kb_pos_bill_dish_detail")
	private List<KbPosBillDishDetail> dishDetails;

	/**
	 * 扩展信息,json对象格式 ,key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否享受会员价
	 */
	@ApiField("member_flag")
	private Boolean memberFlag;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 付款金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 账单支付渠道信息
	 */
	@ApiListField("pay_channels")
	@ApiField("pos_bill_pay_channel")
	private List<PosBillPayChannel> payChannels;

	/**
	 * 就餐人员列表，以英文逗号","分隔
	 */
	@ApiField("people_list")
	private String peopleList;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

	/**
	 * 实收金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/**
	 * 结账时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("settle_time")
	private Date settleTime;

    /**
     * Gets bill amount.
     *
     * @return the bill amount
     */
    public String getBillAmount() {
		return this.billAmount;
	}

    /**
     * Sets bill amount.
     *
     * @param billAmount the bill amount
     */
    public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

    /**
     * Gets discount details.
     *
     * @return the discount details
     */
    public List<PosDiscountDetail> getDiscountDetails() {
		return this.discountDetails;
	}

    /**
     * Sets discount details.
     *
     * @param discountDetails the discount details
     */
    public void setDiscountDetails(List<PosDiscountDetail> discountDetails) {
		this.discountDetails = discountDetails;
	}

    /**
     * Gets dish details.
     *
     * @return the dish details
     */
    public List<KbPosBillDishDetail> getDishDetails() {
		return this.dishDetails;
	}

    /**
     * Sets dish details.
     *
     * @param dishDetails the dish details
     */
    public void setDishDetails(List<KbPosBillDishDetail> dishDetails) {
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
     * Gets member flag.
     *
     * @return the member flag
     */
    public Boolean getMemberFlag() {
		return this.memberFlag;
	}

    /**
     * Sets member flag.
     *
     * @param memberFlag the member flag
     */
    public void setMemberFlag(Boolean memberFlag) {
		this.memberFlag = memberFlag;
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
     * Gets pay amount.
     *
     * @return the pay amount
     */
    public String getPayAmount() {
		return this.payAmount;
	}

    /**
     * Sets pay amount.
     *
     * @param payAmount the pay amount
     */
    public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

    /**
     * Gets pay channels.
     *
     * @return the pay channels
     */
    public List<PosBillPayChannel> getPayChannels() {
		return this.payChannels;
	}

    /**
     * Sets pay channels.
     *
     * @param payChannels the pay channels
     */
    public void setPayChannels(List<PosBillPayChannel> payChannels) {
		this.payChannels = payChannels;
	}

    /**
     * Gets people list.
     *
     * @return the people list
     */
    public String getPeopleList() {
		return this.peopleList;
	}

    /**
     * Sets people list.
     *
     * @param peopleList the people list
     */
    public void setPeopleList(String peopleList) {
		this.peopleList = peopleList;
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
     * Gets receipt amount.
     *
     * @return the receipt amount
     */
    public String getReceiptAmount() {
		return this.receiptAmount;
	}

    /**
     * Sets receipt amount.
     *
     * @param receiptAmount the receipt amount
     */
    public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

    /**
     * Gets settle time.
     *
     * @return the settle time
     */
    public Date getSettleTime() {
		return this.settleTime;
	}

    /**
     * Sets settle time.
     *
     * @param settleTime the settle time
     */
    public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
	}

}
