package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险营销活动发奖接口
 *
 * @author auto create
 * @since 1.0, 2017-12-14 18:04:02
 */
public class AlipayInsMarketingCampaignPrizeSendModel extends AlipayObject {

	private static final long serialVersionUID = 3647229455298836488L;

	/**
	 * 账户id，如支付宝userId：2088102161835009
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 账号类型
	 */
	@ApiField("account_type")
	private Long accountType;

	/**
	 * 营销保险活动Id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 发奖规则因子
	 */
	@ApiListField("factors")
	@ApiField("ins_mkt_factor_d_t_o")
	private List<InsMktFactorDTO> factors;

	/**
	 * 发奖接口幂等字段
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 请求流水Id
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Gets account id.
     *
     * @return the account id
     */
    public String getAccountId() {
		return this.accountId;
	}

    /**
     * Sets account id.
     *
     * @param accountId the account id
     */
    public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

    /**
     * Gets account type.
     *
     * @return the account type
     */
    public Long getAccountType() {
		return this.accountType;
	}

    /**
     * Sets account type.
     *
     * @param accountType the account type
     */
    public void setAccountType(Long accountType) {
		this.accountType = accountType;
	}

    /**
     * Gets campaign id.
     *
     * @return the campaign id
     */
    public String getCampaignId() {
		return this.campaignId;
	}

    /**
     * Sets campaign id.
     *
     * @param campaignId the campaign id
     */
    public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

    /**
     * Gets factors.
     *
     * @return the factors
     */
    public List<InsMktFactorDTO> getFactors() {
		return this.factors;
	}

    /**
     * Sets factors.
     *
     * @param factors the factors
     */
    public void setFactors(List<InsMktFactorDTO> factors) {
		this.factors = factors;
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
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
