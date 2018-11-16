package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.promo.ticket.push response.
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:58
 */
public class AlipayEcoMycarPromoTicketPushResponse extends AlipayResponse {

	private static final long serialVersionUID = 2611299244748328463L;

	/** 
	 * 处理结果返回码
	 */
	@ApiField("sp_apply_no")
	private String spApplyNo;

    /**
     * Sets sp apply no.
     *
     * @param spApplyNo the sp apply no
     */
    public void setSpApplyNo(String spApplyNo) {
		this.spApplyNo = spApplyNo;
	}

    /**
     * Gets sp apply no.
     *
     * @return the sp apply no
     */
    public String getSpApplyNo( ) {
		return this.spApplyNo;
	}

}
