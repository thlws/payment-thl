package org.thlws.payment.wechat.entity.response;

import org.thlws.payment.wechat.entity.WechatResponse;
import org.thlws.utils.JsonUtil;

/**
 * 微信支付异步通知返回POJO
 *
 * @author Hanley Tang | hanley@thlws.com
 * @version 1.0
 */
public class NotifyResponse  extends WechatResponse {

	private String appid           ;
	private String mch_id          ;
	private String nonce_str       ;
	private String sign            ;

	private String openid          ;
	private String trade_type      ;
	private String is_subscribe	   ;
	private String bank_type;
	private String total_fee;
	private String cash_fee;
	private String transaction_id;
	private String out_trade_no;
	private String time_end;


	private String device_info;

	private String sub_appid;
	private String sub_mch_id;
	private String sub_openid;
	private String sub_is_subscribe;
	private String fee_type;
	private String cash_fee_type;
	private String coupon_fee;
	private String coupon_count;
//	private String coupon_id_n;// spec
//	private String coupon_fee_n;//spec
	private String attach;

    private String coupon_fee_0;
	private String coupon_fee_1;
	private String coupon_fee_2;

	/**
	 * Gets coupon fee 0.
	 *
	 * @return the coupon fee 0
	 */
	public String getCoupon_fee_0() {
		return coupon_fee_0;
	}

	/**
	 * Sets coupon fee 0.
	 *
	 * @param coupon_fee_0 the coupon fee 0
	 */
	public void setCoupon_fee_0(String coupon_fee_0) {
		this.coupon_fee_0 = coupon_fee_0;
	}

	/**
	 * Gets coupon fee 1.
	 *
	 * @return the coupon fee 1
	 */
	public String getCoupon_fee_1() {
		return coupon_fee_1;
	}

	/**
	 * Sets coupon fee 1.
	 *
	 * @param coupon_fee_1 the coupon fee 1
	 */
	public void setCoupon_fee_1(String coupon_fee_1) {
		this.coupon_fee_1 = coupon_fee_1;
	}

	/**
	 * Gets coupon fee 2.
	 *
	 * @return the coupon fee 2
	 */
	public String getCoupon_fee_2() {
		return coupon_fee_2;
	}

	/**
	 * Sets coupon fee 2.
	 *
	 * @param coupon_fee_2 the coupon fee 2
	 */
	public void setCoupon_fee_2(String coupon_fee_2) {
		this.coupon_fee_2 = coupon_fee_2;
	}

	/**
	 * Gets coupon id 0.
	 *
	 * @return the coupon id 0
	 */
	public String getCoupon_id_0() {
		return coupon_id_0;
	}

	/**
	 * Sets coupon id 0.
	 *
	 * @param coupon_id_0 the coupon id 0
	 */
	public void setCoupon_id_0(String coupon_id_0) {
		this.coupon_id_0 = coupon_id_0;
	}

	/**
	 * Gets coupon id 1.
	 *
	 * @return the coupon id 1
	 */
	public String getCoupon_id_1() {
		return coupon_id_1;
	}

	/**
	 * Sets coupon id 1.
	 *
	 * @param coupon_id_1 the coupon id 1
	 */
	public void setCoupon_id_1(String coupon_id_1) {
		this.coupon_id_1 = coupon_id_1;
	}

	/**
	 * Gets coupon id 2.
	 *
	 * @return the coupon id 2
	 */
	public String getCoupon_id_2() {
		return coupon_id_2;
	}

	/**
	 * Sets coupon id 2.
	 *
	 * @param coupon_id_2 the coupon id 2
	 */
	public void setCoupon_id_2(String coupon_id_2) {
		this.coupon_id_2 = coupon_id_2;
	}

	private String coupon_id_0;
	private String coupon_id_1;
	private String coupon_id_2;


	/**
	 * Instantiates a new Notify response.
	 */
	public NotifyResponse() {
	}


	/**
	 * Gets appid.
	 *
	 * @return the appid
	 */
	public String getAppid() {
		return appid;
	}

	/**
	 * Sets appid.
	 *
	 * @param appid the appid
	 */
	public void setAppid(String appid) {
		this.appid = appid;
	}

	/**
	 * Gets mch id.
	 *
	 * @return the mch id
	 */
	public String getMch_id() {
		return mch_id;
	}

	/**
	 * Sets mch id.
	 *
	 * @param mch_id the mch id
	 */
	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}

	/**
	 * Gets nonce str.
	 *
	 * @return the nonce str
	 */
	public String getNonce_str() {
		return nonce_str;
	}

	/**
	 * Sets nonce str.
	 *
	 * @param nonce_str the nonce str
	 */
	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}

	/**
	 * Gets sign.
	 *
	 * @return the sign
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * Sets sign.
	 *
	 * @param sign the sign
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * Gets openid.
	 *
	 * @return the openid
	 */
	public String getOpenid() {
		return openid;
	}

	/**
	 * Sets openid.
	 *
	 * @param openid the openid
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	/**
	 * Gets trade type.
	 *
	 * @return the trade type
	 */
	public String getTrade_type() {
		return trade_type;
	}

	/**
	 * Sets trade type.
	 *
	 * @param trade_type the trade type
	 */
	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}

	/**
	 * Gets is subscribe.
	 *
	 * @return the is subscribe
	 */
	public String getIs_subscribe() {
		return is_subscribe;
	}

	/**
	 * Sets is subscribe.
	 *
	 * @param is_subscribe the is subscribe
	 */
	public void setIs_subscribe(String is_subscribe) {
		this.is_subscribe = is_subscribe;
	}

	/**
	 * Gets bank type.
	 *
	 * @return the bank type
	 */
	public String getBank_type() {
		return bank_type;
	}

	/**
	 * Sets bank type.
	 *
	 * @param bank_type the bank type
	 */
	public void setBank_type(String bank_type) {
		this.bank_type = bank_type;
	}

	/**
	 * Gets total fee.
	 *
	 * @return the total fee
	 */
	public String getTotal_fee() {
		return total_fee;
	}

	/**
	 * Sets total fee.
	 *
	 * @param total_fee the total fee
	 */
	public void setTotal_fee(String total_fee) {
		this.total_fee = total_fee;
	}

	/**
	 * Gets cash fee.
	 *
	 * @return the cash fee
	 */
	public String getCash_fee() {
		return cash_fee;
	}

	/**
	 * Sets cash fee.
	 *
	 * @param cash_fee the cash fee
	 */
	public void setCash_fee(String cash_fee) {
		this.cash_fee = cash_fee;
	}

	/**
	 * Gets transaction id.
	 *
	 * @return the transaction id
	 */
	public String getTransaction_id() {
		return transaction_id;
	}

	/**
	 * Sets transaction id.
	 *
	 * @param transaction_id the transaction id
	 */
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	/**
	 * Gets out trade no.
	 *
	 * @return the out trade no
	 */
	public String getOut_trade_no() {
		return out_trade_no;
	}

	/**
	 * Sets out trade no.
	 *
	 * @param out_trade_no the out trade no
	 */
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	/**
	 * Gets time end.
	 *
	 * @return the time end
	 */
	public String getTime_end() {
		return time_end;
	}

	/**
	 * Sets time end.
	 *
	 * @param time_end the time end
	 */
	public void setTime_end(String time_end) {
		this.time_end = time_end;
	}

	/**
	 * Gets device info.
	 *
	 * @return the device info
	 */
	public String getDevice_info() {
		return device_info;
	}

	/**
	 * Sets device info.
	 *
	 * @param device_info the device info
	 */
	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}

	/**
	 * Gets sub appid.
	 *
	 * @return the sub appid
	 */
	public String getSub_appid() {
		return sub_appid;
	}

	/**
	 * Sets sub appid.
	 *
	 * @param sub_appid the sub appid
	 */
	public void setSub_appid(String sub_appid) {
		this.sub_appid = sub_appid;
	}

	/**
	 * Gets sub mch id.
	 *
	 * @return the sub mch id
	 */
	public String getSub_mch_id() {
		return sub_mch_id;
	}

	/**
	 * Sets sub mch id.
	 *
	 * @param sub_mch_id the sub mch id
	 */
	public void setSub_mch_id(String sub_mch_id) {
		this.sub_mch_id = sub_mch_id;
	}

	/**
	 * Gets sub openid.
	 *
	 * @return the sub openid
	 */
	public String getSub_openid() {
		return sub_openid;
	}

	/**
	 * Sets sub openid.
	 *
	 * @param sub_openid the sub openid
	 */
	public void setSub_openid(String sub_openid) {
		this.sub_openid = sub_openid;
	}

	/**
	 * Gets sub is subscribe.
	 *
	 * @return the sub is subscribe
	 */
	public String getSub_is_subscribe() {
		return sub_is_subscribe;
	}

	/**
	 * Sets sub is subscribe.
	 *
	 * @param sub_is_subscribe the sub is subscribe
	 */
	public void setSub_is_subscribe(String sub_is_subscribe) {
		this.sub_is_subscribe = sub_is_subscribe;
	}

	/**
	 * Gets fee type.
	 *
	 * @return the fee type
	 */
	public String getFee_type() {
		return fee_type;
	}

	/**
	 * Sets fee type.
	 *
	 * @param fee_type the fee type
	 */
	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}

	/**
	 * Gets cash fee type.
	 *
	 * @return the cash fee type
	 */
	public String getCash_fee_type() {
		return cash_fee_type;
	}

	/**
	 * Sets cash fee type.
	 *
	 * @param cash_fee_type the cash fee type
	 */
	public void setCash_fee_type(String cash_fee_type) {
		this.cash_fee_type = cash_fee_type;
	}

	/**
	 * Gets coupon fee.
	 *
	 * @return the coupon fee
	 */
	public String getCoupon_fee() {
		return coupon_fee;
	}

	/**
	 * Sets coupon fee.
	 *
	 * @param coupon_fee the coupon fee
	 */
	public void setCoupon_fee(String coupon_fee) {
		this.coupon_fee = coupon_fee;
	}

	/**
	 * Gets coupon count.
	 *
	 * @return the coupon count
	 */
	public String getCoupon_count() {
		return coupon_count;
	}

	/**
	 * Sets coupon count.
	 *
	 * @param coupon_count the coupon count
	 */
	public void setCoupon_count(String coupon_count) {
		this.coupon_count = coupon_count;
	}

	/**
	 * Gets attach.
	 *
	 * @return the attach
	 */
	public String getAttach() {
		return attach;
	}

	/**
	 * Sets attach.
	 *
	 * @param attach the attach
	 */
	public void setAttach(String attach) {
		this.attach = attach;
	}

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
}
