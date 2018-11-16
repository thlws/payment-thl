package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建AA收款
 *
 * @author auto create
 * @since 1.0, 2018-07-19 11:22:14
 */
public class AlipayFundTransAacollectBatchCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8459533953556313822L;

	/**
	 * 收款备注，显示在支付宝账单
	 */
	@ApiField("batch_memo")
	private String batchMemo;

	/**
	 * 渠道，由支付宝业务方提供值，目前只打印日志
    taobao:淘系过来的 
    alipay:钱包内的
    mini：小程序 
    other:其他来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 调用方扩充参数，按照Map<String,String>格式json
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 是否限定份数，true/false, 默认为不限定
	 */
	@ApiField("limit_items_total")
	private String limitItemsTotal;

	/**
	 * 单笔金额,平均后的金额
	 */
	@ApiField("pay_amount_single")
	private String payAmountSingle;

	/**
	 * 收款总金额，不限份数不传
	 */
	@ApiField("pay_amount_total")
	private String payAmountTotal;

	/**
	 * 当前支付宝userId，即收款方支付宝userId
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	/**
	 * 付款方支付宝uid列表，按照List<String>格式json
    每个uid生成一条BatchDetailModel
    限定份数时必传，且人数＝实际份数
	 */
	@ApiField("payer_user_ids")
	private String payerUserIds;

	/**
	 * 实际创建总笔数(若包括自己，这里为showitemsTotal-1),不限份数不传
	 */
	@ApiField("real_items_total")
	private String realItemsTotal;

	/**
	 * 显示总笔数(选择的人数)，不限份数不传
	 */
	@ApiField("show_items_total")
	private String showItemsTotal;

	/**
	 * 来源，如支付宝、小程序，涉及ctu属性
    钱包内淘宝求赞助:innerTBH5 
    钱包群收：innerBiz
    小程序收款：fromMini
	 */
	@ApiField("source")
	private String source;

    /**
     * Gets batch memo.
     *
     * @return the batch memo
     */
    public String getBatchMemo() {
		return this.batchMemo;
	}

    /**
     * Sets batch memo.
     *
     * @param batchMemo the batch memo
     */
    public void setBatchMemo(String batchMemo) {
		this.batchMemo = batchMemo;
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
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam() {
		return this.extParam;
	}

    /**
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

    /**
     * Gets limit items total.
     *
     * @return the limit items total
     */
    public String getLimitItemsTotal() {
		return this.limitItemsTotal;
	}

    /**
     * Sets limit items total.
     *
     * @param limitItemsTotal the limit items total
     */
    public void setLimitItemsTotal(String limitItemsTotal) {
		this.limitItemsTotal = limitItemsTotal;
	}

    /**
     * Gets pay amount single.
     *
     * @return the pay amount single
     */
    public String getPayAmountSingle() {
		return this.payAmountSingle;
	}

    /**
     * Sets pay amount single.
     *
     * @param payAmountSingle the pay amount single
     */
    public void setPayAmountSingle(String payAmountSingle) {
		this.payAmountSingle = payAmountSingle;
	}

    /**
     * Gets pay amount total.
     *
     * @return the pay amount total
     */
    public String getPayAmountTotal() {
		return this.payAmountTotal;
	}

    /**
     * Sets pay amount total.
     *
     * @param payAmountTotal the pay amount total
     */
    public void setPayAmountTotal(String payAmountTotal) {
		this.payAmountTotal = payAmountTotal;
	}

    /**
     * Gets payee user id.
     *
     * @return the payee user id
     */
    public String getPayeeUserId() {
		return this.payeeUserId;
	}

    /**
     * Sets payee user id.
     *
     * @param payeeUserId the payee user id
     */
    public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

    /**
     * Gets payer user ids.
     *
     * @return the payer user ids
     */
    public String getPayerUserIds() {
		return this.payerUserIds;
	}

    /**
     * Sets payer user ids.
     *
     * @param payerUserIds the payer user ids
     */
    public void setPayerUserIds(String payerUserIds) {
		this.payerUserIds = payerUserIds;
	}

    /**
     * Gets real items total.
     *
     * @return the real items total
     */
    public String getRealItemsTotal() {
		return this.realItemsTotal;
	}

    /**
     * Sets real items total.
     *
     * @param realItemsTotal the real items total
     */
    public void setRealItemsTotal(String realItemsTotal) {
		this.realItemsTotal = realItemsTotal;
	}

    /**
     * Gets show items total.
     *
     * @return the show items total
     */
    public String getShowItemsTotal() {
		return this.showItemsTotal;
	}

    /**
     * Sets show items total.
     *
     * @param showItemsTotal the show items total
     */
    public void setShowItemsTotal(String showItemsTotal) {
		this.showItemsTotal = showItemsTotal;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
	}

}
