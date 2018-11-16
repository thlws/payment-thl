package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合作渠道可通过该接口补登扣款取消请求，以帮助支付宝将用户的资金退给用户
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:20
 */
public class AlipayCommerceCityfacilitatorDepositCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8488977214772425221L;

	/**
	 * 扩展字段，传递撤销的终端信息，原因等
	 */
	@ApiField("biz_info_ext")
	private String bizInfoExt;

	/**
	 * 充值卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 交通卡卡类型，一个城市只有一个固定的值
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 撤销时间
	 */
	@ApiField("operate_time")
	private String operateTime;

	/**
	 * 商户的交易号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Gets biz info ext.
     *
     * @return the biz info ext
     */
    public String getBizInfoExt() {
		return this.bizInfoExt;
	}

    /**
     * Sets biz info ext.
     *
     * @param bizInfoExt the biz info ext
     */
    public void setBizInfoExt(String bizInfoExt) {
		this.bizInfoExt = bizInfoExt;
	}

    /**
     * Gets card no.
     *
     * @return the card no
     */
    public String getCardNo() {
		return this.cardNo;
	}

    /**
     * Sets card no.
     *
     * @param cardNo the card no
     */
    public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

    /**
     * Gets card type.
     *
     * @return the card type
     */
    public String getCardType() {
		return this.cardType;
	}

    /**
     * Sets card type.
     *
     * @param cardType the card type
     */
    public void setCardType(String cardType) {
		this.cardType = cardType;
	}

    /**
     * Gets operate time.
     *
     * @return the operate time
     */
    public String getOperateTime() {
		return this.operateTime;
	}

    /**
     * Sets operate time.
     *
     * @param operateTime the operate time
     */
    public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
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
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
