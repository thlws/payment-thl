package org.thlws.payment.alipay.entity.request;

import com.alipay.trade.model.GoodsDetail;
import org.thlws.utils.JsonUtil;

import java.io.Serializable;
import java.util.List;


/**
 * 支付宝扫码支付,用户打开支付宝APP扫描Qrcode
 *
 * @author hanley @thlws.com
 *  2018 /11/16
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

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
		return outTradeNo;
	}

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject() {
		return subject;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return totalAmount;
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
     * Gets undiscountable amount.
     *
     * @return the undiscountable amount
     */
    public String getUndiscountableAmount() {
		return undiscountableAmount;
	}

    /**
     * Gets seller id.
     *
     * @return the seller id
     */
    public String getSellerId() {
		return sellerId;
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
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId() {
		return operatorId;
	}

    /**
     * Gets goods detail list.
     *
     * @return the goods detail list
     */
    public List<GoodsDetail> getGoodsDetailList() {
		return goodsDetailList;
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
     * Sets subject.
     *
     * @param subject the subject
     */
    public void setSubject(String subject) {
		this.subject = subject;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
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
     * Sets undiscountable amount.
     *
     * @param undiscountableAmount the undiscountable amount
     */
    public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
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
     * Sets body.
     *
     * @param body the body
     */
    public void setBody(String body) {
		this.body = body;
	}

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

    /**
     * Sets goods detail list.
     *
     * @param goodsDetailList the goods detail list
     */
    public void setGoodsDetailList(List<GoodsDetail> goodsDetailList) {
		this.goodsDetailList = goodsDetailList;
	}

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
	
}
