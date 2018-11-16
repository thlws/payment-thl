package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 子订单明细
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class OrderDetail extends AlipayObject {

	private static final long serialVersionUID = 3459868912383225591L;

	/**
	 * 订单明细的应用唯一标识（16位纯数字），指商家的app_id。
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 对交易或商品的描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 订单包含的商品列表信息.Json格式.
其它说明详见：“商品明细说明”
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝只会在同步返回（包括跳转回商户网站）和异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 销售产品码，与支付宝签约的产品码名称
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 卖家支付宝用户ID。
如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 支持手机和Email格式,如果同时使用参数seller_logon_id和seller_id,以seller_id为准
	 */
	@ApiField("seller_logon_id")
	private String sellerLogonId;

	/**
	 * 商品的展示地址
	 */
	@ApiField("show_url")
	private String showUrl;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

    /**
     * Gets app id.
     *
     * @return the app id
     */
    public String getAppId() {
		return this.appId;
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
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
		return this.body;
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
     * Gets goods detail.
     *
     * @return the goods detail
     */
    public List<GoodsDetail> getGoodsDetail() {
		return this.goodsDetail;
	}

    /**
     * Sets goods detail.
     *
     * @param goodsDetail the goods detail
     */
    public void setGoodsDetail(List<GoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
		return this.outTradeNo;
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
     * Gets passback params.
     *
     * @return the passback params
     */
    public String getPassbackParams() {
		return this.passbackParams;
	}

    /**
     * Sets passback params.
     *
     * @param passbackParams the passback params
     */
    public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
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
     * Gets seller id.
     *
     * @return the seller id
     */
    public String getSellerId() {
		return this.sellerId;
	}

    /**
     * Sets seller id.
     *
     * @param sellerId the seller id
     */
    public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

    /**
     * Gets seller logon id.
     *
     * @return the seller logon id
     */
    public String getSellerLogonId() {
		return this.sellerLogonId;
	}

    /**
     * Sets seller logon id.
     *
     * @param sellerLogonId the seller logon id
     */
    public void setSellerLogonId(String sellerLogonId) {
		this.sellerLogonId = sellerLogonId;
	}

    /**
     * Gets show url.
     *
     * @return the show url
     */
    public String getShowUrl() {
		return this.showUrl;
	}

    /**
     * Sets show url.
     *
     * @param showUrl the show url
     */
    public void setShowUrl(String showUrl) {
		this.showUrl = showUrl;
	}

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject() {
		return this.subject;
	}

    /**
     * Sets subject.
     *
     * @param subject the subject
     */
    public void setSubject(String subject) {
		this.subject = subject;
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

}
