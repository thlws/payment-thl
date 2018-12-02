package org.thlws.payment.wechat.entity.request;

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


    /**
     * Gets nonce str.
     *
     * @return the nonce str
     */
    public String getNonceStr() {
		return nonceStr;
	}

    /**
     * Gets open id.
     *
     * @return the open id
     */
    public String getOpenId() {
		return openId;
	}

    /**
     * Sets open id.
     *
     * @param openId the open id
     */
    public void setOpenId(String openId) {
		this.openId = openId;
	}

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
     * Gets notify url.
     *
     * @return the notify url
     */
    public String getNotifyUrl() {
		return notifyUrl;
	}

    /**
     * Sets notify url.
     *
     * @param notifyUrl the notify url
     */
    public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

    /**
     * Gets trade type.
     *
     * @return the trade type
     */
    public String getTradeType() {
		return tradeType;
	}

    /**
     * Sets trade type.
     *
     * @param tradeType the trade type
     */
    public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

    /**
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
		return body;
	}

    /**
     * Sets body.
     *
     * @param body the body
     */
    public void setBody(String body) {
		this.body = body;
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
     * Gets spbill create ip.
     *
     * @return the spbill create ip
     */
    public String getSpbillCreateIp() {
		return spbillCreateIp;
	}

    /**
     * Sets spbill create ip.
     *
     * @param spbillCreateIp the spbill create ip
     */
    public void setSpbillCreateIp(String spbillCreateIp) {
		this.spbillCreateIp = spbillCreateIp;
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
     * Gets detail.
     *
     * @return the detail
     */
    public String getDetail() {
		return detail;
	}

    /**
     * Sets detail.
     *
     * @param detail the detail
     */
    public void setDetail(String detail) {
		this.detail = detail;
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

    /**
     * Gets fee type.
     *
     * @return the fee type
     */
    public String getFeeType() {
		return feeType;
	}

    /**
     * Sets fee type.
     *
     * @param feeType the fee type
     */
    public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

    /**
     * Gets time start.
     *
     * @return the time start
     */
    public String getTimeStart() {
		return timeStart;
	}

    /**
     * Sets time start.
     *
     * @param timeStart the time start
     */
    public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

    /**
     * Gets time expire.
     *
     * @return the time expire
     */
    public String getTimeExpire() {
		return timeExpire;
	}

    /**
     * Sets time expire.
     *
     * @param timeExpire the time expire
     */
    public void setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
	}

    /**
     * Gets goods tag.
     *
     * @return the goods tag
     */
    public String getGoodsTag() {
		return goodsTag;
	}

    /**
     * Sets goods tag.
     *
     * @param goodsTag the goods tag
     */
    public void setGoodsTag(String goodsTag) {
		this.goodsTag = goodsTag;
	}

    /**
     * Gets device info.
     *
     * @return the device info
     */
    public String getDeviceInfo() {
		return deviceInfo;
	}

    /**
     * Sets device info.
     *
     * @param deviceInfo the device info
     */
    public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

    /**
     * Gets product id.
     *
     * @return the product id
     */
    public String getProductId() {
		return productId;
	}

    /**
     * Sets product id.
     *
     * @param productId the product id
     */
    public void setProductId(String productId) {
		this.productId = productId;
	}

    /**
     * Gets limit pay.
     *
     * @return the limit pay
     */
    public String getLimitPay() {
		return limitPay;
	}

    /**
     * Sets limit pay.
     *
     * @param limitPay the limit pay
     */
    public void setLimitPay(String limitPay) {
		this.limitPay = limitPay;
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

    /**
     * Gets sub open id.
     *
     * @return the sub open id
     */
    public String getSubOpenId() {
		return subOpenId;
	}

    /**
     * Sets sub open id.
     *
     * @param subOpenId the sub open id
     */
    public void setSubOpenId(String subOpenId) {
		this.subOpenId = subOpenId;
	}

    /**
     * Gets scene info.
     *
     * @return the scene info
     */
    public String getSceneInfo() {
		return sceneInfo;
	}

    /**
     * Sets scene info.
     *
     * @param sceneInfo the scene info
     */
    public void setSceneInfo(String sceneInfo) {
		this.sceneInfo = sceneInfo;
	}

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
}
