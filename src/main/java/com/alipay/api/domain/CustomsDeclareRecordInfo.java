package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报关记录详情数据结构
 *
 * @author auto create
 * @since 1.0, 2016-11-09 19:11:58
 */
public class CustomsDeclareRecordInfo extends AlipayObject {

	private static final long serialVersionUID = 2542497625936678193L;

	/**
	 * 支付宝报关流水号。
	 */
	@ApiField("alipay_declare_no")
	private String alipayDeclareNo;

	/**
	 * 报关金额，单位为人民币“元”，精确到小数点后2位。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 此记录所报关的海关编号，参见“海关编号”。
	 */
	@ApiField("customs_place")
	private String customsPlace;

	/**
	 * 发起报关后，海关返回回执中的结果码。目前只有总署的报关，并且总署回执接收成功的请求才会返回此参数
2：电子口岸申报中
3：发送海关成功
4：发送海关失败
100：海关退单
399：海关审结
小于0的数字：表示处理异常回执
   注意：
支付宝原样返回海关返回的数据，参数值以海关的定义为准。
	 */
	@ApiField("customs_result_code")
	private String customsResultCode;

	/**
	 * 发起报关后，海关返回回执中的结果描述信息。目前只有总署报关，并且总署成功返回回执的时候会有此值
	 */
	@ApiField("customs_result_info")
	private String customsResultInfo;

	/**
	 * 发起报关后，海关返回回执的时间，格式为：yyyyMMddHHmmss。目前只有总署报关，并且总署成功返回回执的时候才会有此参数。
	 */
	@ApiField("customs_result_return_time")
	private String customsResultReturnTime;

	/**
	 * T: 拆单；F：非拆单。当请求没有拆单或者请求传入的is_split=F时，不会返回此参数。
	 */
	@ApiField("is_split")
	private String isSplit;

	/**
	 * 报关记录状态最后更新时间
	 */
	@ApiField("last_modified_time")
	private String lastModifiedTime;

	/**
	 * 备注说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户在海关备案的编号。
	 */
	@ApiField("merchant_customs_code")
	private String merchantCustomsCode;

	/**
	 * 商户海关备案名称
	 */
	@ApiField("merchant_customs_name")
	private String merchantCustomsName;

	/**
	 * 报关请求号。商户端报关请求号，对应入参中的某条报关请求号。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 该报关单当前的状态：
-	ws等待发送海关
-	sending已提交发送海关
-	succ 海关返回受理成功
	 */
	@ApiField("status")
	private String status;

	/**
	 * 拆单子订单号。如果报关请求没有请求拆单则不会返回此参数。
	 */
	@ApiField("sub_out_biz_no")
	private String subOutBizNo;

	/**
	 * 支付宝推送到海关的支付单据号。针对拆单的报关，这个单据号不等于支付宝原始交易号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Gets alipay declare no.
     *
     * @return the alipay declare no
     */
    public String getAlipayDeclareNo() {
		return this.alipayDeclareNo;
	}

    /**
     * Sets alipay declare no.
     *
     * @param alipayDeclareNo the alipay declare no
     */
    public void setAlipayDeclareNo(String alipayDeclareNo) {
		this.alipayDeclareNo = alipayDeclareNo;
	}

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
     * Gets customs result code.
     *
     * @return the customs result code
     */
    public String getCustomsResultCode() {
		return this.customsResultCode;
	}

    /**
     * Sets customs result code.
     *
     * @param customsResultCode the customs result code
     */
    public void setCustomsResultCode(String customsResultCode) {
		this.customsResultCode = customsResultCode;
	}

    /**
     * Gets customs result info.
     *
     * @return the customs result info
     */
    public String getCustomsResultInfo() {
		return this.customsResultInfo;
	}

    /**
     * Sets customs result info.
     *
     * @param customsResultInfo the customs result info
     */
    public void setCustomsResultInfo(String customsResultInfo) {
		this.customsResultInfo = customsResultInfo;
	}

    /**
     * Gets customs result return time.
     *
     * @return the customs result return time
     */
    public String getCustomsResultReturnTime() {
		return this.customsResultReturnTime;
	}

    /**
     * Sets customs result return time.
     *
     * @param customsResultReturnTime the customs result return time
     */
    public void setCustomsResultReturnTime(String customsResultReturnTime) {
		this.customsResultReturnTime = customsResultReturnTime;
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
     * Gets last modified time.
     *
     * @return the last modified time
     */
    public String getLastModifiedTime() {
		return this.lastModifiedTime;
	}

    /**
     * Sets last modified time.
     *
     * @param lastModifiedTime the last modified time
     */
    public void setLastModifiedTime(String lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
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
