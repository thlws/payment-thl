package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一收单报关接口
 *
 * @author auto create
 * @since 1.0, 2016-11-09 19:11:51
 */
public class AlipayTradeCustomsDeclareModel extends AlipayObject {

	private static final long serialVersionUID = 3283544592734541127L;

	/**
	 * 报关金额，单位为人民币“元”，精确到小数点后2位。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订购人身份信息
	 */
	@ApiField("buyer_info")
	private CustomsDeclareBuyerInfo buyerInfo;

	/**
	 * 海关编号（大小写皆可）。参见“ <a href="https://doc.open.alipay.com/docs/doc.htm?treeId=267&articleId=105883&docType=1">海关编号</a>”。
	 */
	@ApiField("customs_place")
	private String customsPlace;

	/**
	 * 商户控制本单是否拆单的报关参数。
仅当该参数传值为T或者t时，才会触发拆单。
	 */
	@ApiField("is_split")
	private String isSplit;

	/**
	 * 商户在海关备案的编号。
	 */
	@ApiField("merchant_customs_code")
	private String merchantCustomsCode;

	/**
	 * 商户海关备案名称。
	 */
	@ApiField("merchant_customs_name")
	private String merchantCustomsName;

	/**
	 * 报关流水号。商户生成的用于唯一标识一次报关操作的业务编号。
建议生成规则：yyyymmdd型8位日期拼接4位序列号。每个报关请求号仅允许传入：数字、英文字母、下划线”_”、短横线”－” 。长度6-32位前后不能有空格
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 拆单报关的商户子订单号。 用于区别拆单时不同子单。拆单时必须传入，否则会报INVALID_PARAMETER错误码。
	 */
	@ApiField("sub_out_biz_no")
	private String subOutBizNo;

	/**
	 * 支付宝交易号。该交易在支付宝系统中的交易流水号，最长64位。
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets buyer info.
     *
     * @return the buyer info
     */
    public CustomsDeclareBuyerInfo getBuyerInfo() {
		return this.buyerInfo;
	}

    /**
     * Sets buyer info.
     *
     * @param buyerInfo the buyer info
     */
    public void setBuyerInfo(CustomsDeclareBuyerInfo buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

    /**
     * Gets customs place.
     *
     * @return the customs place
     */
    public String getCustomsPlace() {
		return this.customsPlace;
	}

    /**
     * Sets customs place.
     *
     * @param customsPlace the customs place
     */
    public void setCustomsPlace(String customsPlace) {
		this.customsPlace = customsPlace;
	}

    /**
     * Gets is split.
     *
     * @return the is split
     */
    public String getIsSplit() {
		return this.isSplit;
	}

    /**
     * Sets is split.
     *
     * @param isSplit the is split
     */
    public void setIsSplit(String isSplit) {
		this.isSplit = isSplit;
	}

    /**
     * Gets merchant customs code.
     *
     * @return the merchant customs code
     */
    public String getMerchantCustomsCode() {
		return this.merchantCustomsCode;
	}

    /**
     * Sets merchant customs code.
     *
     * @param merchantCustomsCode the merchant customs code
     */
    public void setMerchantCustomsCode(String merchantCustomsCode) {
		this.merchantCustomsCode = merchantCustomsCode;
	}

    /**
     * Gets merchant customs name.
     *
     * @return the merchant customs name
     */
    public String getMerchantCustomsName() {
		return this.merchantCustomsName;
	}

    /**
     * Sets merchant customs name.
     *
     * @param merchantCustomsName the merchant customs name
     */
    public void setMerchantCustomsName(String merchantCustomsName) {
		this.merchantCustomsName = merchantCustomsName;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets sub out biz no.
     *
     * @return the sub out biz no
     */
    public String getSubOutBizNo() {
		return this.subOutBizNo;
	}

    /**
     * Sets sub out biz no.
     *
     * @param subOutBizNo the sub out biz no
     */
    public void setSubOutBizNo(String subOutBizNo) {
		this.subOutBizNo = subOutBizNo;
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
