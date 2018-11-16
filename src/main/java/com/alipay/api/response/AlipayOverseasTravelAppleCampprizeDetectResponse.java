package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrizeLiteInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.apple.campprize.detect response.
 *
 * @author auto create
 * @since 1.0, 2018-08-17 17:40:00
 */
public class AlipayOverseasTravelAppleCampprizeDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 3524712442822879162L;

	/** 
	 * 奖品简要信息列表，一定不为null，但是size可以为0
	 */
	@ApiListField("prizes")
	@ApiField("prize_lite_info")
	private List<PrizeLiteInfo> prizes;

    /**
     * Sets prizes.
     *
     * @param prizes the prizes
     */
    public void setPrizes(List<PrizeLiteInfo> prizes) {
		this.prizes = prizes;
	}

    /**
     * Gets prizes.
     *
     * @return the prizes
     */
    public List<PrizeLiteInfo> getPrizes( ) {
		return this.prizes;
	}

}
