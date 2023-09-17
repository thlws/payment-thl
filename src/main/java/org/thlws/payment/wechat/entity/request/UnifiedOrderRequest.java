package org.thlws.payment.wechat.entity.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;
import org.thlws.utils.ThlwsBeanUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/***
 * 微信统一下单参数对象
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class UnifiedOrderRequest {

	/**
	 * 用户标识<br>
	 * trade_type=JSAPI，此参数必传，用户在主商户appid下的唯一标识。openid和sub_openid可以选传其中之一，如果选择传sub_openid,则必须传sub_appid
	 * not required	openid和sub_openid可以选传其中之一
	 * */
	@XmlElement(name="openid")
	private String openId           ;	

	/**公众账号ID*/
	@XmlElement(name="appid")
	private String appId            ;

	/**商户号	*/
	@XmlElement(name="mch_id")
	private String mchId           ;

	/**通知地址*/
	@XmlElement(name="notify_url")
	private String notifyUrl       ;

	/**JSAPI，NATIVE，APP*/
	@XmlElement(name="trade_type")
	private String tradeType       ;

	/**随机字符串,默认生成,无需设置 小于等于32*/
	@XmlElement(name="nonce_str")
	private String nonceStr = ThlwsBeanUtil.getRandomString(32);


	/**商品描述
	 * <pre>
	 * 商品描述交易字段格式根据不同的应用场景按照以下格式：
	 （1）PC网站——传入浏览器打开的网站主页title名-实际商品名称，例如：腾讯充值中心-QQ会员充值；
	 （2） 公众号——传入公众号名称-实际商品名称，例如：腾讯形象店- image-QQ公仔；
	 （3） H5——应用在浏览器网页上的场景，传入浏览器打开的移动网页的主页title名-实际商品名称，例如：腾讯充值中心-QQ会员充值；
	 （4） 线下门店——门店品牌名-城市分店名-实际商品名称，例如： image形象店-深圳腾大- QQ公仔）
	 （5） APP——需传入应用市场上的APP名字-实际商品名称，天天爱消除-游戏充值。
	 * </pre>
	 * */
	@XmlElement(name="body")
	private String body             ;

	/**订单总金额*/
	@XmlElement(name="total_fee")
	private String totalFee        ;

	/**APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP*/
	@XmlElement(name="spbill_create_ip")
	private String spbillCreateIp ;

	/**商户订单号*/
	@XmlElement(name="out_trade_no")
	private String outTradeNo		;

	/**商品详情*/
	@XmlElement(name="detail")
	private String detail			;

	/**附加数据,小微模式必须填写为 收款识别码	*/
	@XmlElement(name="attach")
	private String attach			;

	/**符合ISO 4217标准的三位字母代码，默认人民币：CNY*/
	@XmlElement(name="fee_type")
	private String feeType			;

	/**订单生成时间*/
	@XmlElement(name="time_start")
	private String timeStart		;

	/**订单失效时间*/
	@XmlElement(name="time_expire")
	private String timeExpire		;

	/**订单优惠标记*/
	@XmlElement(name="goods_tag")
	private String goodsTag		;

	/**设备号*/
	@XmlElement(name="device_info")
	private String deviceInfo		;

	/**商品ID*/
	@XmlElement(name="product_id")
	private String productId		;

	/**指定支付方式*/
	@XmlElement(name="limit_pay")
	private String limitPay		;

	/**子商户公众账号ID*/
	@XmlElement(name="sub_appid")
	private String subAppId		;

	/**
	 * not required
	 * 子商户号,普通模式无需设置,子商户需设置子商户号,小微模式固定填1000077001	*/
	@XmlElement(name="sub_mch_id")
	private String subMchId		;

	/**
	 *  not required	openid和sub_openid可以选传其中之一
	 * 用户子标识*/
	@XmlElement(name="sub_openid")
	private String subOpenId		;

	/**
	 * 场景信息
	 * <p>
	 *     该字段用于上报场景信息，目前支持上报实际门店信息。
	 *     该字段为JSON数据格式，示例代码
	 *     <code>{"store_info":{"id": "门店ID","name": "名称","area_code": "编码","address": "地址" }}</code>
	 * </p>
	 * <br>
	 * <span style="color:red">该栏位必须为JSON数据格式</span>
	 * <code>
	 *     scene_info = WStoreInfo.create("19871008","我们的店","21980","阆中市");
	 * </code>
	 * <br>
	 * {@link org.thlws.payment.wechat.entity.extra.WStoreInfo}
	 * */
	@XmlElement(name="scene_info")
	private String sceneInfo;


	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
}
