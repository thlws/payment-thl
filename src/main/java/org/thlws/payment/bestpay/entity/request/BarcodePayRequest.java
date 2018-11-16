package org.thlws.payment.bestpay.entity.request;

/**
 * 电信天翼支付参数对象
 * Created by HanleyTang on 2018/1/5
 *
 * @author Hanley[hanley @thlws.com]
 * @version 1.0
 */
public class BarcodePayRequest {

	/**商户号	(必填)	length=30*/
	private String merchantId;
	
	/**子商户号	length=30*/
	private String subMerchantId;
	
	/**条形码号(必填)	 length=30*/
	private String barcode;
	
	/**订单号	(必填) length=30*/
	private String orderNo;
	
	/**订单请求交 易流水号(必填),由商户平台提供，支持纯数字、纯字母、字 母+数字组成，与订单号一致 （如果需要使 用条码退款业务，流水号必须为偶数位）*/
	private String orderReqNo;
	
	/**渠道(必填),默认填：05*/
	private String channel = "05";
	
	/**业务类型(必填), 默认填：0000001*/
	private String busiType = "0000001";
	
	/**订单日期(必填),由商户提供，长度14位，格式 yyyyMMddhhmmss (说明：该时间必须为 24小时制)*/
	private String orderDate;
	
	/**订单总金额(必填),length=10 单位：分。订单总金额 = 产品金额+附加金 额*/
	private String orderAmt;
	
	/**产品金额(必填), length=10*/
	private String productAmt;
	
	/**附加金额(必填),length=10*/
	private String attachAmt = "0";
	
	/**商品名称(必填),length=256*/
	private String goodsName;
	
	/**门店号(必填),length=10*/
	private String storeId;
	
	/**后台返回地址,商户提供的用于异步接收交易返回结果的后 台url，若不需要后台返回，可不填，若需要 后台返回，请保障地址可用*/
	private String backUrl;
	
	/**分账信息,length=256*/
	private String ledgerDetail;
	
	/**附加信息,length=128*/
	private String attach;
	
	/**MAC校验域(必填),采用标准的MD5算法，由商户实现， MD5 加密获得32位大写字符,无需调用者设值,依赖库会自动设置*/
	private String mac;
	
	/**商户自定义 终端号*/
	private String mchntTmNum;
	
	/**设备终端号*/
	private String deviceTmNum;

	/**
	 * Gets merchant id.
	 *
	 * @return the merchant id
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * Gets sub merchant id.
	 *
	 * @return the sub merchant id
	 */
	public String getSubMerchantId() {
		return subMerchantId;
	}

	/**
	 * Gets barcode.
	 *
	 * @return the barcode
	 */
	public String getBarcode() {
		return barcode;
	}

	/**
	 * Gets order no.
	 *
	 * @return the order no
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * Gets order req no.
	 *
	 * @return the order req no
	 */
	public String getOrderReqNo() {
		return orderReqNo;
	}

	/**
	 * Gets channel.
	 *
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * Gets busi type.
	 *
	 * @return the busi type
	 */
	public String getBusiType() {
		return busiType;
	}

	/**
	 * Gets order date.
	 *
	 * @return the order date
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * Gets order amt.
	 *
	 * @return the order amt
	 */
	public String getOrderAmt() {
		return orderAmt;
	}

	/**
	 * Gets product amt.
	 *
	 * @return the product amt
	 */
	public String getProductAmt() {
		return productAmt;
	}

	/**
	 * Gets attach amt.
	 *
	 * @return the attach amt
	 */
	public String getAttachAmt() {
		return attachAmt;
	}

	/**
	 * Gets goods name.
	 *
	 * @return the goods name
	 */
	public String getGoodsName() {
		return goodsName;
	}

	/**
	 * Gets store id.
	 *
	 * @return the store id
	 */
	public String getStoreId() {
		return storeId;
	}

	/**
	 * Gets back url.
	 *
	 * @return the back url
	 */
	public String getBackUrl() {
		return backUrl;
	}

	/**
	 * Gets ledger detail.
	 *
	 * @return the ledger detail
	 */
	public String getLedgerDetail() {
		return ledgerDetail;
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
	 * Gets mac.
	 *
	 * @return the mac
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * Gets mchnt tm num.
	 *
	 * @return the mchnt tm num
	 */
	public String getMchntTmNum() {
		return mchntTmNum;
	}

	/**
	 * Gets device tm num.
	 *
	 * @return the device tm num
	 */
	public String getDeviceTmNum() {
		return deviceTmNum;
	}

	/**
	 * Sets merchant id.
	 *
	 * @param merchantId the merchant id
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * Sets sub merchant id.
	 *
	 * @param subMerchantId the sub merchant id
	 */
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	/**
	 * Sets barcode.
	 *
	 * @param barcode the barcode
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	/**
	 * Sets order no.
	 *
	 * @param orderNo the order no
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * Sets order req no.
	 *
	 * @param orderReqNo the order req no
	 */
	public void setOrderReqNo(String orderReqNo) {
		this.orderReqNo = orderReqNo;
	}

	/**
	 * Sets channel.
	 *
	 * @param channel the channel
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * Sets busi type.
	 *
	 * @param busiType the busi type
	 */
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	/**
	 * Sets order date.
	 *
	 * @param orderDate the order date
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * Sets order amt.
	 *
	 * @param orderAmt the order amt
	 */
	public void setOrderAmt(String orderAmt) {
		this.orderAmt = orderAmt;
	}

	/**
	 * Sets product amt.
	 *
	 * @param productAmt the product amt
	 */
	public void setProductAmt(String productAmt) {
		this.productAmt = productAmt;
	}

	/**
	 * Sets attach amt.
	 *
	 * @param attachAmt the attach amt
	 */
	public void setAttachAmt(String attachAmt) {
		this.attachAmt = attachAmt;
	}

	/**
	 * Sets goods name.
	 *
	 * @param goodsName the goods name
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * Sets store id.
	 *
	 * @param storeId the store id
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	/**
	 * Sets back url.
	 *
	 * @param backUrl the back url
	 */
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	/**
	 * Sets ledger detail.
	 *
	 * @param ledgerDetail the ledger detail
	 */
	public void setLedgerDetail(String ledgerDetail) {
		this.ledgerDetail = ledgerDetail;
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
	 * Sets mac.
	 *
	 * @param mac the mac
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}

	/**
	 * Sets mchnt tm num.
	 *
	 * @param mchntTmNum the mchnt tm num
	 */
	public void setMchntTmNum(String mchntTmNum) {
		this.mchntTmNum = mchntTmNum;
	}

	/**
	 * Sets device tm num.
	 *
	 * @param deviceTmNum the device tm num
	 */
	public void setDeviceTmNum(String deviceTmNum) {
		this.deviceTmNum = deviceTmNum;
	}
	
	
}
