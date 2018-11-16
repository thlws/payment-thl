package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.recordexist.query response.
 *
 * @author auto create
 * @since 1.0, 2017-12-13 20:23:52
 */
public class AlipayUserCharityRecordexistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4374152132768367595L;

	/** 
	 * 是否有过捐赠记录(有:true,否:false)
	 */
	@ApiField("donation_tag")
	private Boolean donationTag;

    /**
     * Sets donation tag.
     *
     * @param donationTag the donation tag
     */
    public void setDonationTag(Boolean donationTag) {
		this.donationTag = donationTag;
	}

    /**
     * Gets donation tag.
     *
     * @return the donation tag
     */
    public Boolean getDonationTag( ) {
		return this.donationTag;
	}

}
