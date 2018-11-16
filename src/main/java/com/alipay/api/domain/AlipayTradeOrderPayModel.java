package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 统一收单交易直接支付接口
 *
 * @author auto create
 * @since 1.0, 2018-07-09 23:01:19
 */
public class AlipayTradeOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 8237158794753142257L;

	/**
	 * 买家的支付宝用户id

注：
1.用于校验与已存交易中的买家是否相等
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付明细

目前支持的支付渠道为：
- offline_pos：本次买家使用的是pos刷卡支付

注：
各支付工具金额总和=订单总金额
	 */
	@ApiListField("buyer_pay_detail")
	@ApiField("buyer_pay_detail")
	private List<BuyerPayDetail> buyerPayDetail;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]

注：
1.用于校验与已存交易中的金额是否相等
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Gets buyer id.
     *
     * @return the buyer id
     */
    public String getBuyerId() {
		return this.buyerId;
	}

    /**
     * Sets buyer id.
     *
     * @param buyerId the buyer id
     */
    public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

    /**
     * Gets buyer pay detail.
     *
     * @return the buyer pay detail
     */
    public List<BuyerPayDetail> getBuyerPayDetail() {
		return this.buyerPayDetail;
	}

    /**
     * Sets buyer pay detail.
     *
     * @param buyerPayDetail the buyer pay detail
     */
    public void setBuyerPayDetail(List<BuyerPayDetail> buyerPayDetail) {
		this.buyerPayDetail = buyerPayDetail;
	}

    /**
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
