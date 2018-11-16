package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洗车保养订单物流
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:48:53
 */
public class MaintainBizOrderExpress extends AlipayObject {

	private static final long serialVersionUID = 4434342229898233193L;

	/**
	 * 创建时间，物流子订单创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 物流公司编号。支付宝支付物流公司编号。具体查看 
支付宝支持物流公司编码
	 */
	@ApiField("express_code")
	private String expressCode;

	/**
	 * 物流单号， ISV上传商品物流单号，用于物流流水的查询。
	 */
	@ApiField("express_no")
	private String expressNo;

	/**
	 * 订单发货地址。记录订单发货的详细地址。省^^^市^^^区^^^详细地址。
	 */
	@ApiField("sender_addr")
	private String senderAddr;

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public String getCreateTime() {
		return this.createTime;
	}

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

    /**
     * Gets express code.
     *
     * @return the express code
     */
    public String getExpressCode() {
		return this.expressCode;
	}

    /**
     * Sets express code.
     *
     * @param expressCode the express code
     */
    public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}

    /**
     * Gets express no.
     *
     * @return the express no
     */
    public String getExpressNo() {
		return this.expressNo;
	}

    /**
     * Sets express no.
     *
     * @param expressNo the express no
     */
    public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

    /**
     * Gets sender addr.
     *
     * @return the sender addr
     */
    public String getSenderAddr() {
		return this.senderAddr;
	}

    /**
     * Sets sender addr.
     *
     * @param senderAddr the sender addr
     */
    public void setSenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}

}
