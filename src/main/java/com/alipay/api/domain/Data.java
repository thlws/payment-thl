package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用于查询用户数据
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class Data extends AlipayObject {

	private static final long serialVersionUID = 1833674427638399776L;

	/**
	 * 用户id列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

    /**
     * Gets user id list.
     *
     * @return the user id list
     */
    public List<String> getUserIdList() {
		return this.userIdList;
	}

    /**
     * Sets user id list.
     *
     * @param userIdList the user id list
     */
    public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
