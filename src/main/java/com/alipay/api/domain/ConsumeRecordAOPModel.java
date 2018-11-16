package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消费记录信息-主记录
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:31:15
 */
public class ConsumeRecordAOPModel extends AlipayObject {

	private static final long serialVersionUID = 3428853683729796756L;

	/**
	 * 接入渠道
	 */
	@ApiField("access_channel")
	private String accessChannel;

	/**
	 * 扩展状态
	 */
	@ApiField("additional_status")
	private String additionalStatus;

	/**
	 * 用户下一步动作
	 */
	@ApiListField("biz_actions")
	@ApiField("string")
	private List<String> bizActions;

	/**
	 * 业务扩展流水号
	 */
	@ApiField("biz_extra_no")
	private String bizExtraNo;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_in_no")
	private String bizInNo;

	/**
	 * 业务备注
	 */
	@ApiField("biz_memo")
	private String bizMemo;

	/**
	 * 业务发起方
	 */
	@ApiField("biz_orig")
	private String bizOrig;

	/**
	 * 业务外部流水号
	 */
	@ApiField("biz_out_no")
	private String bizOutNo;

	/**
	 * 业务状态
	 */
	@ApiField("biz_state")
	private String bizState;

	/**
	 * 业务子类型
	 */
	@ApiField("biz_sub_type")
	private String bizSubType;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 自定义分类Id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 总费用
	 */
	@ApiField("consume_fee")
	private String consumeFee;

	/**
	 * 消费记录退款状态
	 */
	@ApiField("consume_refund_status")
	private String consumeRefundStatus;

	/**
	 * 来源
	 */
	@ApiField("consume_site")
	private String consumeSite;

	/**
	 * 消费记录状态
	 */
	@ApiField("consume_status")
	private String consumeStatus;

	/**
	 * 标题
	 */
	@ApiField("consume_title")
	private String consumeTitle;

	/**
	 * 消费记录类型
	 */
	@ApiField("consume_type")
	private String consumeType;

	/**
	 * 货币币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 消费记录永久删除时间
	 */
	@ApiField("delete_over_time")
	private Date deleteOverTime;

	/**
	 * 消费记录删除时间
	 */
	@ApiField("delete_time")
	private Date deleteTime;

	/**
	 * 消费记录删除标记
	 */
	@ApiField("delete_type")
	private String deleteType;

	/**
	 * 充退状态，可能为空，目前只针对交易业务有效
	 */
	@ApiField("depositback_status")
	private String depositbackStatus;

	/**
	 * 是否锁定标记
	 */
	@ApiField("flag_locked")
	private String flagLocked;

	/**
	 * 退款标记
	 */
	@ApiField("flag_refund")
	private String flagRefund;

	/**
	 * 业务数据创建时间
	 */
	@ApiField("gmt_biz_create")
	private Date gmtBizCreate;

	/**
	 * 业务数据最后更新时间
	 */
	@ApiField("gmt_biz_modified")
	private Date gmtBizModified;

	/**
	 * 消费记录创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 消费记录最后更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 收到付款时间（买家付款时间）
	 */
	@ApiField("gmt_receive_pay")
	private Date gmtReceivePay;

	/**
	 * 打款给卖家时间（卖家收款时间）
	 */
	@ApiField("gmt_send_pay")
	private Date gmtSendPay;

	/**
	 * 是否有资金明细
	 */
	@ApiField("has_fund_item")
	private Boolean hasFundItem;

	/**
	 * 是否有新资金明细(落地新流程交易的消费记录)
	 */
	@ApiField("has_new_fund_item")
	private Boolean hasNewFundItem;

	/**
	 * 收入/支出
	 */
	@ApiField("in_out")
	private String inOut;

	/**
	 * 对方卡号
	 */
	@ApiField("opposite_card_no")
	private String oppositeCardNo;

	/**
	 * 对方登录ID
	 */
	@ApiField("opposite_login_id")
	private String oppositeLoginId;

	/**
	 * 对方名称
	 */
	@ApiField("opposite_name")
	private String oppositeName;

	/**
	 * 对方昵称
	 */
	@ApiField("opposite_nick_name")
	private String oppositeNickName;

	/**
	 * 消费记录原标题
	 */
	@ApiField("orig_consume_title")
	private String origConsumeTitle;

	/**
	 * 本方卡号
	 */
	@ApiField("owner_card_no")
	private String ownerCardNo;

	/**
	 * 本方客户ID
	 */
	@ApiField("owner_customer_id")
	private String ownerCustomerId;

	/**
	 * 本方登录ID
	 */
	@ApiField("owner_login_id")
	private String ownerLoginId;

	/**
	 * 本方名称
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 本方昵称
	 */
	@ApiField("owner_nick")
	private String ownerNick;

	/**
	 * 合作伙伴ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 创建渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 代付人&亲密付人姓名
	 */
	@ApiField("peerpayer_real_name")
	private String peerpayerRealName;

	/**
	 * 产品码
	 */
	@ApiField("product")
	private String product;

	/**
	 * 最后一次退款金额
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 服务费
	 */
	@ApiField("service_fee")
	private String serviceFee;

	/**
	 * 多次成功退款总金额
	 */
	@ApiField("total_refund_fee")
	private String totalRefundFee;

	/**
	 * 交易来源
	 */
	@ApiField("trade_from")
	private String tradeFrom;

    /**
     * Gets access channel.
     *
     * @return the access channel
     */
    public String getAccessChannel() {
		return this.accessChannel;
	}

    /**
     * Sets access channel.
     *
     * @param accessChannel the access channel
     */
    public void setAccessChannel(String accessChannel) {
		this.accessChannel = accessChannel;
	}

    /**
     * Gets additional status.
     *
     * @return the additional status
     */
    public String getAdditionalStatus() {
		return this.additionalStatus;
	}

    /**
     * Sets additional status.
     *
     * @param additionalStatus the additional status
     */
    public void setAdditionalStatus(String additionalStatus) {
		this.additionalStatus = additionalStatus;
	}

    /**
     * Gets biz actions.
     *
     * @return the biz actions
     */
    public List<String> getBizActions() {
		return this.bizActions;
	}

    /**
     * Sets biz actions.
     *
     * @param bizActions the biz actions
     */
    public void setBizActions(List<String> bizActions) {
		this.bizActions = bizActions;
	}

    /**
     * Gets biz extra no.
     *
     * @return the biz extra no
     */
    public String getBizExtraNo() {
		return this.bizExtraNo;
	}

    /**
     * Sets biz extra no.
     *
     * @param bizExtraNo the biz extra no
     */
    public void setBizExtraNo(String bizExtraNo) {
		this.bizExtraNo = bizExtraNo;
	}

    /**
     * Gets biz in no.
     *
     * @return the biz in no
     */
    public String getBizInNo() {
		return this.bizInNo;
	}

    /**
     * Sets biz in no.
     *
     * @param bizInNo the biz in no
     */
    public void setBizInNo(String bizInNo) {
		this.bizInNo = bizInNo;
	}

    /**
     * Gets biz memo.
     *
     * @return the biz memo
     */
    public String getBizMemo() {
		return this.bizMemo;
	}

    /**
     * Sets biz memo.
     *
     * @param bizMemo the biz memo
     */
    public void setBizMemo(String bizMemo) {
		this.bizMemo = bizMemo;
	}

    /**
     * Gets biz orig.
     *
     * @return the biz orig
     */
    public String getBizOrig() {
		return this.bizOrig;
	}

    /**
     * Sets biz orig.
     *
     * @param bizOrig the biz orig
     */
    public void setBizOrig(String bizOrig) {
		this.bizOrig = bizOrig;
	}

    /**
     * Gets biz out no.
     *
     * @return the biz out no
     */
    public String getBizOutNo() {
		return this.bizOutNo;
	}

    /**
     * Sets biz out no.
     *
     * @param bizOutNo the biz out no
     */
    public void setBizOutNo(String bizOutNo) {
		this.bizOutNo = bizOutNo;
	}

    /**
     * Gets biz state.
     *
     * @return the biz state
     */
    public String getBizState() {
		return this.bizState;
	}

    /**
     * Sets biz state.
     *
     * @param bizState the biz state
     */
    public void setBizState(String bizState) {
		this.bizState = bizState;
	}

    /**
     * Gets biz sub type.
     *
     * @return the biz sub type
     */
    public String getBizSubType() {
		return this.bizSubType;
	}

    /**
     * Sets biz sub type.
     *
     * @param bizSubType the biz sub type
     */
    public void setBizSubType(String bizSubType) {
		this.bizSubType = bizSubType;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets category id.
     *
     * @return the category id
     */
    public String getCategoryId() {
		return this.categoryId;
	}

    /**
     * Sets category id.
     *
     * @param categoryId the category id
     */
    public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

    /**
     * Gets consume fee.
     *
     * @return the consume fee
     */
    public String getConsumeFee() {
		return this.consumeFee;
	}

    /**
     * Sets consume fee.
     *
     * @param consumeFee the consume fee
     */
    public void setConsumeFee(String consumeFee) {
		this.consumeFee = consumeFee;
	}

    /**
     * Gets consume refund status.
     *
     * @return the consume refund status
     */
    public String getConsumeRefundStatus() {
		return this.consumeRefundStatus;
	}

    /**
     * Sets consume refund status.
     *
     * @param consumeRefundStatus the consume refund status
     */
    public void setConsumeRefundStatus(String consumeRefundStatus) {
		this.consumeRefundStatus = consumeRefundStatus;
	}

    /**
     * Gets consume site.
     *
     * @return the consume site
     */
    public String getConsumeSite() {
		return this.consumeSite;
	}

    /**
     * Sets consume site.
     *
     * @param consumeSite the consume site
     */
    public void setConsumeSite(String consumeSite) {
		this.consumeSite = consumeSite;
	}

    /**
     * Gets consume status.
     *
     * @return the consume status
     */
    public String getConsumeStatus() {
		return this.consumeStatus;
	}

    /**
     * Sets consume status.
     *
     * @param consumeStatus the consume status
     */
    public void setConsumeStatus(String consumeStatus) {
		this.consumeStatus = consumeStatus;
	}

    /**
     * Gets consume title.
     *
     * @return the consume title
     */
    public String getConsumeTitle() {
		return this.consumeTitle;
	}

    /**
     * Sets consume title.
     *
     * @param consumeTitle the consume title
     */
    public void setConsumeTitle(String consumeTitle) {
		this.consumeTitle = consumeTitle;
	}

    /**
     * Gets consume type.
     *
     * @return the consume type
     */
    public String getConsumeType() {
		return this.consumeType;
	}

    /**
     * Sets consume type.
     *
     * @param consumeType the consume type
     */
    public void setConsumeType(String consumeType) {
		this.consumeType = consumeType;
	}

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
		return this.currency;
	}

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
		this.currency = currency;
	}

    /**
     * Gets delete over time.
     *
     * @return the delete over time
     */
    public Date getDeleteOverTime() {
		return this.deleteOverTime;
	}

    /**
     * Sets delete over time.
     *
     * @param deleteOverTime the delete over time
     */
    public void setDeleteOverTime(Date deleteOverTime) {
		this.deleteOverTime = deleteOverTime;
	}

    /**
     * Gets delete time.
     *
     * @return the delete time
     */
    public Date getDeleteTime() {
		return this.deleteTime;
	}

    /**
     * Sets delete time.
     *
     * @param deleteTime the delete time
     */
    public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

    /**
     * Gets delete type.
     *
     * @return the delete type
     */
    public String getDeleteType() {
		return this.deleteType;
	}

    /**
     * Sets delete type.
     *
     * @param deleteType the delete type
     */
    public void setDeleteType(String deleteType) {
		this.deleteType = deleteType;
	}

    /**
     * Gets depositback status.
     *
     * @return the depositback status
     */
    public String getDepositbackStatus() {
		return this.depositbackStatus;
	}

    /**
     * Sets depositback status.
     *
     * @param depositbackStatus the depositback status
     */
    public void setDepositbackStatus(String depositbackStatus) {
		this.depositbackStatus = depositbackStatus;
	}

    /**
     * Gets flag locked.
     *
     * @return the flag locked
     */
    public String getFlagLocked() {
		return this.flagLocked;
	}

    /**
     * Sets flag locked.
     *
     * @param flagLocked the flag locked
     */
    public void setFlagLocked(String flagLocked) {
		this.flagLocked = flagLocked;
	}

    /**
     * Gets flag refund.
     *
     * @return the flag refund
     */
    public String getFlagRefund() {
		return this.flagRefund;
	}

    /**
     * Sets flag refund.
     *
     * @param flagRefund the flag refund
     */
    public void setFlagRefund(String flagRefund) {
		this.flagRefund = flagRefund;
	}

    /**
     * Gets gmt biz create.
     *
     * @return the gmt biz create
     */
    public Date getGmtBizCreate() {
		return this.gmtBizCreate;
	}

    /**
     * Sets gmt biz create.
     *
     * @param gmtBizCreate the gmt biz create
     */
    public void setGmtBizCreate(Date gmtBizCreate) {
		this.gmtBizCreate = gmtBizCreate;
	}

    /**
     * Gets gmt biz modified.
     *
     * @return the gmt biz modified
     */
    public Date getGmtBizModified() {
		return this.gmtBizModified;
	}

    /**
     * Sets gmt biz modified.
     *
     * @param gmtBizModified the gmt biz modified
     */
    public void setGmtBizModified(Date gmtBizModified) {
		this.gmtBizModified = gmtBizModified;
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
     * Gets gmt receive pay.
     *
     * @return the gmt receive pay
     */
    public Date getGmtReceivePay() {
		return this.gmtReceivePay;
	}

    /**
     * Sets gmt receive pay.
     *
     * @param gmtReceivePay the gmt receive pay
     */
    public void setGmtReceivePay(Date gmtReceivePay) {
		this.gmtReceivePay = gmtReceivePay;
	}

    /**
     * Gets gmt send pay.
     *
     * @return the gmt send pay
     */
    public Date getGmtSendPay() {
		return this.gmtSendPay;
	}

    /**
     * Sets gmt send pay.
     *
     * @param gmtSendPay the gmt send pay
     */
    public void setGmtSendPay(Date gmtSendPay) {
		this.gmtSendPay = gmtSendPay;
	}

    /**
     * Gets has fund item.
     *
     * @return the has fund item
     */
    public Boolean getHasFundItem() {
		return this.hasFundItem;
	}

    /**
     * Sets has fund item.
     *
     * @param hasFundItem the has fund item
     */
    public void setHasFundItem(Boolean hasFundItem) {
		this.hasFundItem = hasFundItem;
	}

    /**
     * Gets has new fund item.
     *
     * @return the has new fund item
     */
    public Boolean getHasNewFundItem() {
		return this.hasNewFundItem;
	}

    /**
     * Sets has new fund item.
     *
     * @param hasNewFundItem the has new fund item
     */
    public void setHasNewFundItem(Boolean hasNewFundItem) {
		this.hasNewFundItem = hasNewFundItem;
	}

    /**
     * Gets in out.
     *
     * @return the in out
     */
    public String getInOut() {
		return this.inOut;
	}

    /**
     * Sets in out.
     *
     * @param inOut the in out
     */
    public void setInOut(String inOut) {
		this.inOut = inOut;
	}

    /**
     * Gets opposite card no.
     *
     * @return the opposite card no
     */
    public String getOppositeCardNo() {
		return this.oppositeCardNo;
	}

    /**
     * Sets opposite card no.
     *
     * @param oppositeCardNo the opposite card no
     */
    public void setOppositeCardNo(String oppositeCardNo) {
		this.oppositeCardNo = oppositeCardNo;
	}

    /**
     * Gets opposite login id.
     *
     * @return the opposite login id
     */
    public String getOppositeLoginId() {
		return this.oppositeLoginId;
	}

    /**
     * Sets opposite login id.
     *
     * @param oppositeLoginId the opposite login id
     */
    public void setOppositeLoginId(String oppositeLoginId) {
		this.oppositeLoginId = oppositeLoginId;
	}

    /**
     * Gets opposite name.
     *
     * @return the opposite name
     */
    public String getOppositeName() {
		return this.oppositeName;
	}

    /**
     * Sets opposite name.
     *
     * @param oppositeName the opposite name
     */
    public void setOppositeName(String oppositeName) {
		this.oppositeName = oppositeName;
	}

    /**
     * Gets opposite nick name.
     *
     * @return the opposite nick name
     */
    public String getOppositeNickName() {
		return this.oppositeNickName;
	}

    /**
     * Sets opposite nick name.
     *
     * @param oppositeNickName the opposite nick name
     */
    public void setOppositeNickName(String oppositeNickName) {
		this.oppositeNickName = oppositeNickName;
	}

    /**
     * Gets orig consume title.
     *
     * @return the orig consume title
     */
    public String getOrigConsumeTitle() {
		return this.origConsumeTitle;
	}

    /**
     * Sets orig consume title.
     *
     * @param origConsumeTitle the orig consume title
     */
    public void setOrigConsumeTitle(String origConsumeTitle) {
		this.origConsumeTitle = origConsumeTitle;
	}

    /**
     * Gets owner card no.
     *
     * @return the owner card no
     */
    public String getOwnerCardNo() {
		return this.ownerCardNo;
	}

    /**
     * Sets owner card no.
     *
     * @param ownerCardNo the owner card no
     */
    public void setOwnerCardNo(String ownerCardNo) {
		this.ownerCardNo = ownerCardNo;
	}

    /**
     * Gets owner customer id.
     *
     * @return the owner customer id
     */
    public String getOwnerCustomerId() {
		return this.ownerCustomerId;
	}

    /**
     * Sets owner customer id.
     *
     * @param ownerCustomerId the owner customer id
     */
    public void setOwnerCustomerId(String ownerCustomerId) {
		this.ownerCustomerId = ownerCustomerId;
	}

    /**
     * Gets owner login id.
     *
     * @return the owner login id
     */
    public String getOwnerLoginId() {
		return this.ownerLoginId;
	}

    /**
     * Sets owner login id.
     *
     * @param ownerLoginId the owner login id
     */
    public void setOwnerLoginId(String ownerLoginId) {
		this.ownerLoginId = ownerLoginId;
	}

    /**
     * Gets owner name.
     *
     * @return the owner name
     */
    public String getOwnerName() {
		return this.ownerName;
	}

    /**
     * Sets owner name.
     *
     * @param ownerName the owner name
     */
    public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

    /**
     * Gets owner nick.
     *
     * @return the owner nick
     */
    public String getOwnerNick() {
		return this.ownerNick;
	}

    /**
     * Sets owner nick.
     *
     * @param ownerNick the owner nick
     */
    public void setOwnerNick(String ownerNick) {
		this.ownerNick = ownerNick;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets pay channel.
     *
     * @return the pay channel
     */
    public String getPayChannel() {
		return this.payChannel;
	}

    /**
     * Sets pay channel.
     *
     * @param payChannel the pay channel
     */
    public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

    /**
     * Gets peerpayer real name.
     *
     * @return the peerpayer real name
     */
    public String getPeerpayerRealName() {
		return this.peerpayerRealName;
	}

    /**
     * Sets peerpayer real name.
     *
     * @param peerpayerRealName the peerpayer real name
     */
    public void setPeerpayerRealName(String peerpayerRealName) {
		this.peerpayerRealName = peerpayerRealName;
	}

    /**
     * Gets product.
     *
     * @return the product
     */
    public String getProduct() {
		return this.product;
	}

    /**
     * Sets product.
     *
     * @param product the product
     */
    public void setProduct(String product) {
		this.product = product;
	}

    /**
     * Gets refund fee.
     *
     * @return the refund fee
     */
    public String getRefundFee() {
		return this.refundFee;
	}

    /**
     * Sets refund fee.
     *
     * @param refundFee the refund fee
     */
    public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

    /**
     * Gets service fee.
     *
     * @return the service fee
     */
    public String getServiceFee() {
		return this.serviceFee;
	}

    /**
     * Sets service fee.
     *
     * @param serviceFee the service fee
     */
    public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

    /**
     * Gets total refund fee.
     *
     * @return the total refund fee
     */
    public String getTotalRefundFee() {
		return this.totalRefundFee;
	}

    /**
     * Sets total refund fee.
     *
     * @param totalRefundFee the total refund fee
     */
    public void setTotalRefundFee(String totalRefundFee) {
		this.totalRefundFee = totalRefundFee;
	}

    /**
     * Gets trade from.
     *
     * @return the trade from
     */
    public String getTradeFrom() {
		return this.tradeFrom;
	}

    /**
     * Sets trade from.
     *
     * @param tradeFrom the trade from
     */
    public void setTradeFrom(String tradeFrom) {
		this.tradeFrom = tradeFrom;
	}

}
