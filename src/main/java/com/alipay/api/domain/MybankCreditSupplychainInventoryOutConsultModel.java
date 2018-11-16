package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应链金融-交易出库咨询
 *
 * @author auto create
 * @since 1.0, 2018-07-28 01:11:28
 */
public class MybankCreditSupplychainInventoryOutConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3711886819279733313L;

	/**
	 * 贷款合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 资产列表
	 */
	@ApiListField("asset_info_list")
	@ApiField("inventory_info")
	private List<InventoryInfo> assetInfoList;

	/**
	 * 客户身份信息，在预付融资中代表的是买家的身份
	 */
	@ApiField("customer")
	private Member customer;

	/**
	 * 扩展字段，在特定场景下必填
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * FACTORING：保理，PREPAYMENT：预付融资，CREDITPAY：信任付，UN_TRADE_SCENE：非交易出库
	 */
	@ApiField("trade_type")
	private String tradeType;

    /**
     * Gets ar no.
     *
     * @return the ar no
     */
    public String getArNo() {
		return this.arNo;
	}

    /**
     * Sets ar no.
     *
     * @param arNo the ar no
     */
    public void setArNo(String arNo) {
		this.arNo = arNo;
	}

    /**
     * Gets asset info list.
     *
     * @return the asset info list
     */
    public List<InventoryInfo> getAssetInfoList() {
		return this.assetInfoList;
	}

    /**
     * Sets asset info list.
     *
     * @param assetInfoList the asset info list
     */
    public void setAssetInfoList(List<InventoryInfo> assetInfoList) {
		this.assetInfoList = assetInfoList;
	}

    /**
     * Gets customer.
     *
     * @return the customer
     */
    public Member getCustomer() {
		return this.customer;
	}

    /**
     * Sets customer.
     *
     * @param customer the customer
     */
    public void setCustomer(Member customer) {
		this.customer = customer;
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
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
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
     * Gets sale pd code.
     *
     * @return the sale pd code
     */
    public String getSalePdCode() {
		return this.salePdCode;
	}

    /**
     * Sets sale pd code.
     *
     * @param salePdCode the sale pd code
     */
    public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

    /**
     * Gets trade type.
     *
     * @return the trade type
     */
    public String getTradeType() {
		return this.tradeType;
	}

    /**
     * Sets trade type.
     *
     * @param tradeType the trade type
     */
    public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
