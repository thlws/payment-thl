package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据OpenId获取UserId
 *
 * @author auto create
 * @since 1.0, 2016-02-19 20:04:41
 */
public class AlipayPlatformUseridGetModel extends AlipayObject {

	private static final long serialVersionUID = 2738496652461892868L;

	/**
	 * openId的列表
	 */
	@ApiListField("open_ids")
	@ApiField("string")
	private List<String> openIds;

    /**
     * Gets open ids.
     *
     * @return the open ids
     */
    public List<String> getOpenIds() {
		return this.openIds;
	}

    /**
     * Sets open ids.
     *
     * @param openIds the open ids
     */
    public void setOpenIds(List<String> openIds) {
		this.openIds = openIds;
	}

}
