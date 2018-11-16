package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员积分场景
 *
 * @author auto create
 * @since 1.0, 2018-05-23 20:58:14
 */
public class MemberPointsScene extends AlipayObject {

	private static final long serialVersionUID = 1159525877893747837L;

	/**
	 * 用户兑换的内容。
type：VOUCHER(券)
type为券时，ids返回的是券ID。
	 */
	@ApiField("exchange_info")
	private PointsExchangeInfo exchangeInfo;

	/**
	 * 口碑订单号
	 */
	@ApiField("kb_trade_no")
	private String kbTradeNo;

	/**
	 * 综合体ID
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 变化时间：格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("modify_time")
	private String modifyTime;

	/**
	 * 积分变化类型
ADD：增加
DECR：减少
REVERSAL：冲正
	 */
	@ApiField("oper_type")
	private String operType;

	/**
	 * 外部交易号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 积分余额
	 */
	@ApiField("points_balance")
	private Long pointsBalance;

    /**
     * Gets exchange info.
     *
     * @return the exchange info
     */
    public PointsExchangeInfo getExchangeInfo() {
		return this.exchangeInfo;
	}

    /**
     * Sets exchange info.
     *
     * @param exchangeInfo the exchange info
     */
    public void setExchangeInfo(PointsExchangeInfo exchangeInfo) {
		this.exchangeInfo = exchangeInfo;
	}

    /**
     * Gets kb trade no.
     *
     * @return the kb trade no
     */
    public String getKbTradeNo() {
		return this.kbTradeNo;
	}

    /**
     * Sets kb trade no.
     *
     * @param kbTradeNo the kb trade no
     */
    public void setKbTradeNo(String kbTradeNo) {
		this.kbTradeNo = kbTradeNo;
	}

    /**
     * Gets mall id.
     *
     * @return the mall id
     */
    public String getMallId() {
		return this.mallId;
	}

    /**
     * Sets mall id.
     *
     * @param mallId the mall id
     */
    public void setMallId(String mallId) {
		this.mallId = mallId;
	}

    /**
     * Gets modify time.
     *
     * @return the modify time
     */
    public String getModifyTime() {
		return this.modifyTime;
	}

    /**
     * Sets modify time.
     *
     * @param modifyTime the modify time
     */
    public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

    /**
     * Gets oper type.
     *
     * @return the oper type
     */
    public String getOperType() {
		return this.operType;
	}

    /**
     * Sets oper type.
     *
     * @param operType the oper type
     */
    public void setOperType(String operType) {
		this.operType = operType;
	}

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
     * Gets points balance.
     *
     * @return the points balance
     */
    public Long getPointsBalance() {
		return this.pointsBalance;
	}

    /**
     * Sets points balance.
     *
     * @param pointsBalance the points balance
     */
    public void setPointsBalance(Long pointsBalance) {
		this.pointsBalance = pointsBalance;
	}

}
