package org.thlws.payment.alipay.entity.request;

import com.alipay.trade.model.GoodsDetail;
import org.thlws.utils.JsonUtil;

import java.io.Serializable;
import java.util.List;


/**
 * 支付宝扫码支付,用户打开支付宝APP扫描Qrcode
 * @author hanley@thlws.com
 * @date 2018/11/16
 */
public class AlipayQrcodeRequest implements Serializable{

	private static final long serialVersionUID = 7943982676695868533L;

	/** (必填) 商户网站订单系统中唯一订单号，64个字符以内*/
	private String outTradeNo;

	/** (必填) 订单标题*/
	private String subject;

	/**(必填) 订单总金额*/
	private String totalAmount;

	/** (必填) 商户门店编号*/
	private String storeId;

	/**(可选) 订单不可打折金额*/
	private String undiscountableAmount = "0";

	/**(可选)卖家支付宝账号ID*/
	private String sellerId = "";

	/**订单描述*/
	private String body;

	/**(可选) 商户操作员编号*/
	private String operatorId;
	
	private List<GoodsDetail> goodsDetailList;

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public String getSubject() {
		return subject;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public String getStoreId() {
		return storeId;
	}

	public String getUndiscountableAmount() {
		return undiscountableAmount;
	}

	public String getSellerId() {
		return sellerId;
	}

	public String getBody() {
		return body;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public List<GoodsDetail> getGoodsDetailList() {
		return goodsDetailList;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public void setGoodsDetailList(List<GoodsDetail> goodsDetailList) {
		this.goodsDetailList = goodsDetailList;
	}

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
	
}
