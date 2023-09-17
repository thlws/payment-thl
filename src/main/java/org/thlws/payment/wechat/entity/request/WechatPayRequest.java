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
 * 微信刷卡支付参数对象
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class WechatPayRequest {

	/**用户在公众号下标识*/
	@XmlElement(name="openid")
	private String openId           ;

	/**公众账号ID*/
	@XmlElement(name="appid")
	private String appId            ;

	/**商户号*/
	@XmlElement(name="mch_id")
	private String mchId           ;

	/**随机字符串	*/
	@XmlElement(name="nonce_str")
	private  final String nonceStr = ThlwsBeanUtil.getRandomString(32);

	/**签名*/
	@XmlElement(name="sign")
	private String sign             ;

	/**商品描述	*/
	@XmlElement(name="body")
	private String body             ;

	/**订单总金额*/
	@XmlElement(name="total_fee")
	private String totalFee        ;

	/**调用微信支付API的机器IP */
	@XmlElement(name="spbill_create_ip")
	private String spbillCreateIp ;

	/**商户订单号	*/
	@XmlElement(name="out_trade_no")
	private String outTradeNo		;

	/**
	 * 线下支付-[条码或者二维码信息]
	 * 条码或者二维码信息*/
	@XmlElement(name="auth_code")
	private String authCode		;

	/**商品详情*/
	@XmlElement(name="detail")
	private String detail			;

	/**附加数据,小微模式必须填写为 收款识别码	*/
	@XmlElement(name="attach")
	private String attach			;

	/**符合ISO 4217标准的三位字母代码，默认人民币：CNY*/
	@XmlElement(name="fee_type")
	private String feeType			;

	/**订单优惠标记*/
	@XmlElement(name="goods_tag")
	private String goodsTag		;

	/**设备号	*/
	@XmlElement(name="device_info")
	private String deviceInfo		;

	/**指定支付方式*/
	@XmlElement(name="limit_pay")
	private String limitPay		;

	/**子商户公众账号ID*/
	@XmlElement(name="sub_appid")
	private String subAppId		;

	/**子商户号,普通模式无需设置,子商户需设置子商户号,小微模式固定填1000077001	*/
	@XmlElement(name="sub_mch_id")
	private String subMchId		;

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
