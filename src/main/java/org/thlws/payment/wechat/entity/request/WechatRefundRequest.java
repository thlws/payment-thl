package org.thlws.payment.wechat.entity.request;

import org.thlws.utils.JsonUtil;
import org.thlws.utils.ThlwsBeanUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/***
 * 微信退款参数对象
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class WechatRefundRequest {

	//如下为必须参数

	/**公众账号ID*/
	@XmlElement(name="appid")
	private String appId            ;

	/**商户号*/
	@XmlElement(name="mch_id")
	private String mchId           ;

	/**随机字符串*/
	@XmlElement(name="nonce_str")
	final private String nonceStr  = ThlwsBeanUtil.getRandomString(32);      ;

	/**商户退款单号*/
	@XmlElement(name="out_refund_no")
	private String outRefundNo     ;

	/**订单总金额*/
	@XmlElement(name="total_fee")
	private String totalFee        ;

	/**申请退款金额*/
	@XmlElement(name="refund_fee")
	private String refundFee       ;

	//transaction_id&out_trade_no二选一

	/**微信订单号*/
	@XmlElement(name="transaction_id")
	private String transactionId   ;

	/**商户订单号*/
	@XmlElement(name="out_trade_no")
	private String outTradeNo     ;
	
	//如下参数可选

	/**货币种类 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY*/
	@XmlElement(name="refund_fee_type")
	private String refundFeeType  ;

	/**退款原因*/
	@XmlElement(name="refund_desc")
	private String refundDesc;

	/**
	 * 退款资金来源
	 * <pre>
	 *     仅针对老资金流商户使用 REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款（默认使用未结算资金退款）
	 		REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款
	 * </pre>
	 * */
	@XmlElement(name="refund_account")
	private String refundAccount;

	/**子商户公众账号ID*/
	@XmlElement(name="sub_appid")
	private String subAppId;

	/**子商户号*/
	@XmlElement(name="sub_mch_id")
	private String subMchId;

    /**
     * Instantiates a new Wechat refund request.
     */
    public WechatRefundRequest(){}


    /**
     * Gets app id.
     *
     * @return the app id
     */
    public String getAppId() {
		return appId;
	}

    /**
     * Sets app id.
     *
     * @param appId the app id
     */
    public void setAppId(String appId) {
		this.appId = appId;
	}

    /**
     * Gets mch id.
     *
     * @return the mch id
     */
    public String getMchId() {
		return mchId;
	}

    /**
     * Sets mch id.
     *
     * @param mchId the mch id
     */
    public void setMchId(String mchId) {
		this.mchId = mchId;
	}

    /**
     * Gets out refund no.
     *
     * @return the out refund no
     */
    public String getOutRefundNo() {
		return outRefundNo;
	}

    /**
     * Sets out refund no.
     *
     * @param outRefundNo the out refund no
     */
    public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

    /**
     * Gets total fee.
     *
     * @return the total fee
     */
    public String getTotalFee() {
		return totalFee;
	}

    /**
     * Sets total fee.
     *
     * @param totalFee the total fee
     */
    public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

    /**
     * Gets refund fee.
     *
     * @return the refund fee
     */
    public String getRefundFee() {
		return refundFee;
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
     * Gets transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId() {
		return transactionId;
	}

    /**
     * Sets transaction id.
     *
     * @param transactionId the transaction id
     */
    public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
		return outTradeNo;
	}

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

    /**
     * Gets refund fee type.
     *
     * @return the refund fee type
     */
    public String getRefundFeeType() {
		return refundFeeType;
	}

    /**
     * Sets refund fee type.
     *
     * @param refundFeeType the refund fee type
     */
    public void setRefundFeeType(String refundFeeType) {
		this.refundFeeType = refundFeeType;
	}

    /**
     * Gets refund desc.
     *
     * @return the refund desc
     */
    public String getRefundDesc() {
		return refundDesc;
	}

    /**
     * Sets refund desc.
     *
     * @param refundDesc the refund desc
     */
    public void setRefundDesc(String refundDesc) {
		this.refundDesc = refundDesc;
	}

    /**
     * Gets refund account.
     *
     * @return the refund account
     */
    public String getRefundAccount() {
		return refundAccount;
	}

    /**
     * Sets refund account.
     *
     * @param refundAccount the refund account
     */
    public void setRefundAccount(String refundAccount) {
		this.refundAccount = refundAccount;
	}

    /**
     * Gets sub app id.
     *
     * @return the sub app id
     */
    public String getSubAppId() {
		return subAppId;
	}

    /**
     * Sets sub app id.
     *
     * @param subAppId the sub app id
     */
    public void setSubAppId(String subAppId) {
		this.subAppId = subAppId;
	}

    /**
     * Gets sub mch id.
     *
     * @return the sub mch id
     */
    public String getSubMchId() {
		return subMchId;
	}

    /**
     * Sets sub mch id.
     *
     * @param subMchId the sub mch id
     */
    public void setSubMchId(String subMchId) {
		this.subMchId = subMchId;
	}

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
}
