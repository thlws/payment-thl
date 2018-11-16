package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DiscountDetail;
import com.alipay.api.domain.MCardDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.order.consult response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiTradeOrderConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7188611672174359562L;

	/** 
	 * 用户实付金额
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 优惠信息
	 */
	@ApiListField("discount_detail")
	@ApiField("discount_detail")
	private List<DiscountDetail> discountDetail;

	/** 
	 * 储值卡信息
	 */
	@ApiField("m_card_detail")
	private MCardDetail mCardDetail;

	/** 
	 * 请求中的request_id
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Sets buyer pay amount.
     *
     * @param buyerPayAmount the buyer pay amount
     */
    public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}

    /**
     * Gets buyer pay amount.
     *
     * @return the buyer pay amount
     */
    public String getBuyerPayAmount( ) {
		return this.buyerPayAmount;
	}

    /**
     * Sets discount detail.
     *
     * @param discountDetail the discount detail
     */
    public void setDiscountDetail(List<DiscountDetail> discountDetail) {
		this.discountDetail = discountDetail;
	}

    /**
     * Gets discount detail.
     *
     * @return the discount detail
     */
    public List<DiscountDetail> getDiscountDetail( ) {
		return this.discountDetail;
	}

    /**
     * Sets card detail.
     *
     * @param mCardDetail the m card detail
     */
    public void setmCardDetail(MCardDetail mCardDetail) {
		this.mCardDetail = mCardDetail;
	}

    /**
     * Gets card detail.
     *
     * @return the card detail
     */
    public MCardDetail getmCardDetail( ) {
		return this.mCardDetail;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId( ) {
		return this.requestId;
	}

}
