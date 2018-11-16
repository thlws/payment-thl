package org.thlws.payment.wechat.api;


/**
 * 微信官方支付相关API列表  <br>
 * @see <a href="https://pay.weixin.qq.com/guide/index.shtml">https://pay.weixin.qq.com/guide/index.shtml</a>
 * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/sl.html">https://pay.weixin.qq.com/wiki/doc/api/sl.html</a>
 * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/index.html">https://pay.weixin.qq.com/wiki/doc/api/index.html</a>
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
public interface WechatPayApi {

	/**
	 * 微信统一下单
	 */
	String pay_unifiedorder = "https://api.mch.weixin.qq.com/pay/unifiedorder";

	/**
	 * 微信退款,需使用p12证书
	 */
	String pay_refund = "https://api.mch.weixin.qq.com/secapi/pay/refund";

	/**
	 * 微信线下支付-[刷卡支付]
	 */
	String pay_micropay = "https://api.mch.weixin.qq.com/pay/micropay";

	/**
	 * 微信订单查询
	 */
	String pay_orderquery = "https://api.mch.weixin.qq.com/pay/orderquery";


	/**
	 * 微信用户openid查询
	 */
	String pay_openidquery = " https://api.mch.weixin.qq.com/tools/authcodetoopenid";


	/**
	 * 撤销订单,需使用p12证书
	 */
	String pay_reverse = "https://api.mch.weixin.qq.com/secapi/pay/reverse";


	/**微信关闭订单*/
	String close_order = "https://api.mch.weixin.qq.com/pay/closeorder";

	/**
	 * 新增个人微信收款
	 * 未使用
	 */
	String micro_mch_add = "https://api.mch.weixin.qq.com/secapi/mch/submchmanage?action=add";

	/**
	 * 查询个人微信收款人信息
	 * 未使用
	 */
	String micro_mch_qry = "https://api.mch.weixin.qq.com/secapi/mch/submchmanage?action=query";


}
