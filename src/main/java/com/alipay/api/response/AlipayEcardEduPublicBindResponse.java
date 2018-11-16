package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecard.edu.public.bind response.
 *
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:41
 */
public class AlipayEcardEduPublicBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 7125995825221724581L;

	/** 
	 * 机构编码
	 */
	@ApiField("agent_code")
	private String agentCode;

	/** 
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 成功
	 */
	@ApiField("return_code")
	private String returnCode;

    /**
     * Sets agent code.
     *
     * @param agentCode the agent code
     */
    public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

    /**
     * Gets agent code.
     *
     * @return the agent code
     */
    public String getAgentCode( ) {
		return this.agentCode;
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
     * Gets card no.
     *
     * @return the card no
     */
    public String getCardNo( ) {
		return this.cardNo;
	}

    /**
     * Sets return code.
     *
     * @param returnCode the return code
     */
    public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

    /**
     * Gets return code.
     *
     * @return the return code
     */
    public String getReturnCode( ) {
		return this.returnCode;
	}

}
