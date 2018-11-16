package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应链金融-交易库存出库
 *
 * @author auto create
 * @since 1.0, 2018-02-08 14:58:30
 */
public class MybankCreditSupplychainInventoryOutApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6737318723796451241L;

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
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 幂等编号，用于幂等控制，格式：机构ipRoleId_yyyymmddhhmmss_8位uniqId
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * FACTORING：保理，PREPAYMENT：预付融资，CREDITPAY：信任付
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
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
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
