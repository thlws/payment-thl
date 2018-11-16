package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ZhubUidTelPair;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.ftoken.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-20 00:40:00
 */
public class ZolozAuthenticationCustomerFtokenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7898819934686938369L;

	/** 
	 * 图片base64 encodeString
	 */
	@ApiField("authimg_base_64")
	private String authimgBase64;

	/** 
	 * 支付宝uid
	 */
	@ApiField("uid")
	private String uid;

	/** 
	 * 用户名和手机号信息返回的列表
	 */
	@ApiListField("uid_tel_pair_list")
	@ApiField("zhub_uid_tel_pair")
	private List<ZhubUidTelPair> uidTelPairList;

    /**
     * Sets authimg base 64.
     *
     * @param authimgBase64 the authimg base 64
     */
    public void setAuthimgBase64(String authimgBase64) {
		this.authimgBase64 = authimgBase64;
	}

    /**
     * Gets authimg base 64.
     *
     * @return the authimg base 64
     */
    public String getAuthimgBase64( ) {
		return this.authimgBase64;
	}

    /**
     * Sets uid.
     *
     * @param uid the uid
     */
    public void setUid(String uid) {
		this.uid = uid;
	}

    /**
     * Gets uid.
     *
     * @return the uid
     */
    public String getUid( ) {
		return this.uid;
	}

    /**
     * Sets uid tel pair list.
     *
     * @param uidTelPairList the uid tel pair list
     */
    public void setUidTelPairList(List<ZhubUidTelPair> uidTelPairList) {
		this.uidTelPairList = uidTelPairList;
	}

    /**
     * Gets uid tel pair list.
     *
     * @return the uid tel pair list
     */
    public List<ZhubUidTelPair> getUidTelPairList( ) {
		return this.uidTelPairList;
	}

}
