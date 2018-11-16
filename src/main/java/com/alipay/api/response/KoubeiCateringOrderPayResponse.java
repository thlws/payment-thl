package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.pay response.
 *
 * @author auto create
 * @since 1.0, 2017-05-09 20:50:09
 */
public class KoubeiCateringOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6336761379523183454L;

	/** 
	 * online_pay：表示在线买单跳转地址
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 该支付宝门店对应商家的partnerId号
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 支付宝门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 当前用户操作的桌码
	 */
	@ApiField("table_num")
	private String tableNum;

	/** 
	 * 当前操作用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType( ) {
		return this.bizType;
	}

    /**
     * Sets merchant pid.
     *
     * @param merchantPid the merchant pid
     */
    public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

    /**
     * Gets merchant pid.
     *
     * @return the merchant pid
     */
    public String getMerchantPid( ) {
		return this.merchantPid;
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
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId( ) {
		return this.shopId;
	}

    /**
     * Sets table num.
     *
     * @param tableNum the table num
     */
    public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}

    /**
     * Gets table num.
     *
     * @return the table num
     */
    public String getTableNum( ) {
		return this.tableNum;
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
