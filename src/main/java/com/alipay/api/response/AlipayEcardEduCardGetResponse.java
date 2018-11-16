package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduOneCardDepositCardQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecard.edu.card.get response.
 *
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:45
 */
public class AlipayEcardEduCardGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4187195275269248426L;

	/** 
	 * 用户是否首次充值标记
	 */
	@ApiField("first_deposit_flag")
	private Boolean firstDepositFlag;

	/** 
	 * 校园一卡通历史充值卡信息查询结果对象
	 */
	@ApiListField("onecard")
	@ApiField("edu_one_card_deposit_card_query_result")
	private List<EduOneCardDepositCardQueryResult> onecard;

    /**
     * Sets first deposit flag.
     *
     * @param firstDepositFlag the first deposit flag
     */
    public void setFirstDepositFlag(Boolean firstDepositFlag) {
		this.firstDepositFlag = firstDepositFlag;
	}

    /**
     * Gets first deposit flag.
     *
     * @return the first deposit flag
     */
    public Boolean getFirstDepositFlag( ) {
		return this.firstDepositFlag;
	}

    /**
     * Sets onecard.
     *
     * @param onecard the onecard
     */
    public void setOnecard(List<EduOneCardDepositCardQueryResult> onecard) {
		this.onecard = onecard;
	}

    /**
     * Gets onecard.
     *
     * @return the onecard
     */
    public List<EduOneCardDepositCardQueryResult> getOnecard( ) {
		return this.onecard;
	}

}
