package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ContactFollower;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.contact.follow.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-08-21 11:05:00
 */
public class AlipayOpenPublicContactFollowBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6674421826491215488L;

	/** 
	 * 联系人关注者列表
	 */
	@ApiListField("contact_follow_list")
	@ApiField("contact_follower")
	private List<ContactFollower> contactFollowList;

    /**
     * Sets contact follow list.
     *
     * @param contactFollowList the contact follow list
     */
    public void setContactFollowList(List<ContactFollower> contactFollowList) {
		this.contactFollowList = contactFollowList;
	}

    /**
     * Gets contact follow list.
     *
     * @return the contact follow list
     */
    public List<ContactFollower> getContactFollowList( ) {
		return this.contactFollowList;
	}

}
