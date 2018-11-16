package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FaceSearchUserInfo;
import com.alipay.api.domain.FaceSearchAnonymousUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.anonymousfacesearch.match response.
 *
 * @author auto create
 * @since 1.0, 2018-09-04 10:46:33
 */
public class ZolozAuthenticationCustomerAnonymousfacesearchMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4173183916442758313L;

	/** 
	 * 搜索到的人脸候选集
	 */
	@ApiListField("candidatelist")
	@ApiField("face_search_user_info")
	private List<FaceSearchUserInfo> candidatelist;

	/** 
	 * 人脸搜索找到的用户
	 */
	@ApiField("foundface")
	private FaceSearchUserInfo foundface;

	/** 
	 * 返回详细码
	 */
	@ApiField("retcodesub")
	private String retcodesub;

	/** 
	 * 操作成功
	 */
	@ApiField("retmessagesub")
	private String retmessagesub;

	/** 
	 * 返回账户信息:merchantid/merchantuid
	 */
	@ApiListField("userinfolist")
	@ApiField("face_search_anonymous_user_info")
	private List<FaceSearchAnonymousUserInfo> userinfolist;

    /**
     * Sets candidatelist.
     *
     * @param candidatelist the candidatelist
     */
    public void setCandidatelist(List<FaceSearchUserInfo> candidatelist) {
		this.candidatelist = candidatelist;
	}

    /**
     * Gets candidatelist.
     *
     * @return the candidatelist
     */
    public List<FaceSearchUserInfo> getCandidatelist( ) {
		return this.candidatelist;
	}

    /**
     * Sets foundface.
     *
     * @param foundface the foundface
     */
    public void setFoundface(FaceSearchUserInfo foundface) {
		this.foundface = foundface;
	}

    /**
     * Gets foundface.
     *
     * @return the foundface
     */
    public FaceSearchUserInfo getFoundface( ) {
		return this.foundface;
	}

    /**
     * Sets retcodesub.
     *
     * @param retcodesub the retcodesub
     */
    public void setRetcodesub(String retcodesub) {
		this.retcodesub = retcodesub;
	}

    /**
     * Gets retcodesub.
     *
     * @return the retcodesub
     */
    public String getRetcodesub( ) {
		return this.retcodesub;
	}

    /**
     * Sets retmessagesub.
     *
     * @param retmessagesub the retmessagesub
     */
    public void setRetmessagesub(String retmessagesub) {
		this.retmessagesub = retmessagesub;
	}

    /**
     * Gets retmessagesub.
     *
     * @return the retmessagesub
     */
    public String getRetmessagesub( ) {
		return this.retmessagesub;
	}

    /**
     * Sets userinfolist.
     *
     * @param userinfolist the userinfolist
     */
    public void setUserinfolist(List<FaceSearchAnonymousUserInfo> userinfolist) {
		this.userinfolist = userinfolist;
	}

    /**
     * Gets userinfolist.
     *
     * @return the userinfolist
     */
    public List<FaceSearchAnonymousUserInfo> getUserinfolist( ) {
		return this.userinfolist;
	}

}
