package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险受托代扣签约
 *
 * @author auto create
 * @since 1.0, 2016-10-28 10:29:11
 */
public class AlipayInsMarketingSellerSignModel extends AlipayObject {

	private static final long serialVersionUID = 7596691927261965756L;

	/**
	 * 商户生成的外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品编码；由蚂蚁保险平台分配，商户通过该产品编码投保特定的保险产品（如饿了么外卖延误险)
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private InsPerson seller;

	/**
	 * 签约的用户支付宝id
	 */
	@ApiField("sign_alipay_id")
	private String signAlipayId;

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets prod code.
     *
     * @return the prod code
     */
    public String getProdCode() {
		return this.prodCode;
	}

    /**
     * Sets prod code.
     *
     * @param prodCode the prod code
     */
    public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

    /**
     * Gets seller.
     *
     * @return the seller
     */
    public InsPerson getSeller() {
		return this.seller;
	}

    /**
     * Sets seller.
     *
     * @param seller the seller
     */
    public void setSeller(InsPerson seller) {
		this.seller = seller;
	}

    /**
     * Gets sign alipay id.
     *
     * @return the sign alipay id
     */
    public String getSignAlipayId() {
		return this.signAlipayId;
	}

    /**
     * Sets sign alipay id.
     *
     * @param signAlipayId the sign alipay id
     */
    public void setSignAlipayId(String signAlipayId) {
		this.signAlipayId = signAlipayId;
	}

}
