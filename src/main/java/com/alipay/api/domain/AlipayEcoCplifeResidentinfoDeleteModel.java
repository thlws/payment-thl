package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 删除物业小区住户信息
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:18:10
 */
public class AlipayEcoCplifeResidentinfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1597811627686581613L;

	/**
	 * 待删除的住户所在的小区ID(支付宝平台统一小区ID标识)
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 待删除住户在物业系统中的唯一标示,一次至多传入200条用户ID
	 */
	@ApiListField("out_resident_id_set")
	@ApiField("string")
	private List<String> outResidentIdSet;

    /**
     * Gets community id.
     *
     * @return the community id
     */
    public String getCommunityId() {
		return this.communityId;
	}

    /**
     * Sets community id.
     *
     * @param communityId the community id
     */
    public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

    /**
     * Gets out resident id set.
     *
     * @return the out resident id set
     */
    public List<String> getOutResidentIdSet() {
		return this.outResidentIdSet;
	}

    /**
     * Sets out resident id set.
     *
     * @param outResidentIdSet the out resident id set
     */
    public void setOutResidentIdSet(List<String> outResidentIdSet) {
		this.outResidentIdSet = outResidentIdSet;
	}

}
