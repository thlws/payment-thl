package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.unicom.card.info.sync response.
 *
 * @author auto create
 * @since 1.0, 2017-01-13 12:34:33
 */
public class AlipayUserUnicomCardInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1276823677844846655L;

	/** 
	 * 业务处理结果 （成功: SUCCESS, 失败: FAIL, 重试: RETRY）
	 */
	@ApiField("card_sync_result")
	private String cardSyncResult;

	/** 
	 * 状态发生变更的用户的联通手机号码
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets card sync result.
     *
     * @param cardSyncResult the card sync result
     */
    public void setCardSyncResult(String cardSyncResult) {
		this.cardSyncResult = cardSyncResult;
	}

    /**
     * Gets card sync result.
     *
     * @return the card sync result
     */
    public String getCardSyncResult( ) {
		return this.cardSyncResult;
	}

    /**
     * Sets phone no.
     *
     * @param phoneNo the phone no
     */
    public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

    /**
     * Gets phone no.
     *
     * @return the phone no
     */
    public String getPhoneNo( ) {
		return this.phoneNo;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}
