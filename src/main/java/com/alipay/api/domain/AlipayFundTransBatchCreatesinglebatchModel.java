package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 如果有创建AA收款，江湖救急等业务场景的话，可以调用该接口进行批次单据的创建
 *
 * @author auto create
 * @since 1.0, 2016-10-27 16:40:29
 */
public class AlipayFundTransBatchCreatesinglebatchModel extends AlipayObject {

	private static final long serialVersionUID = 8648495167165835132L;

	/**
	 * 批次的创建说明，如收款理由等。注：字符长度不能超过24；字符串中不能含有特殊字符（比如emoji等）
	 */
	@ApiField("batch_memo")
	private String batchMemo;

	/**
	 * 业务类型,目前支持下面三种业务类型， (AA收款 :aa, 江湖救急 :support , 活动收款:general)，
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 创建者id（该id为用户的支付宝id，需要调用方自己进行转换传入）
	 */
	@ApiField("create_user_id")
	private String createUserId;

	/**
	 * 扩展参数,目前淘系会传商品类目过来key=categoryNo。注：长度不可超过100; 数据格式需要为map<String,String>的json串
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 单笔金额，单位为元。注： AA收款为平均后的金额；活动收款为单笔金额； 江湖救急不填写
	 */
	@ApiField("pay_amount_single")
	private String payAmountSingle;

	/**
	 * 总金额，单位为元。注：AA为收款总金额；活动收款为份数和单笔金额的积；江湖救急为目标金额
	 */
	@ApiField("pay_amount_total")
	private String payAmountTotal;

	/**
	 * 实际要创建的笔数。注：AA包括自己这里为show_items_total-1；活动收款为填写的份数;江湖救急不填写
	 */
	@ApiField("real_items_total")
	private String realItemsTotal;

	/**
	 * 显示的总笔数。注：AA收款为选择的人数；活动收款为填写的份数；江湖救急不填写
	 */
	@ApiField("show_items_total")
	private String showItemsTotal;

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
     * Gets create user id.
     *
     * @return the create user id
     */
    public String getCreateUserId() {
		return this.createUserId;
	}

    /**
     * Sets create user id.
     *
     * @param createUserId the create user id
     */
    public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
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

}
