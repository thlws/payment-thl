package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.groups.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:15:36
 */
public class AlipaySocialBaseChatGroupsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7743239923682264775L;

	/** 
	 * 群信息列表
	 */
	@ApiListField("group_infos")
	@ApiField("group_info")
	private List<GroupInfo> groupInfos;

	/** 
	 * 是否有更多
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 同步的key，下一次分页获取使用
	 */
	@ApiField("last_key")
	private Long lastKey;

    /**
     * Sets group infos.
     *
     * @param groupInfos the group infos
     */
    public void setGroupInfos(List<GroupInfo> groupInfos) {
		this.groupInfos = groupInfos;
	}

    /**
     * Gets group infos.
     *
     * @return the group infos
     */
    public List<GroupInfo> getGroupInfos( ) {
		return this.groupInfos;
	}

    /**
     * Sets has more.
     *
     * @param hasMore the has more
     */
    public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

    /**
     * Gets has more.
     *
     * @return the has more
     */
    public Boolean getHasMore( ) {
		return this.hasMore;
	}

    /**
     * Sets last key.
     *
     * @param lastKey the last key
     */
    public void setLastKey(Long lastKey) {
		this.lastKey = lastKey;
	}

    /**
     * Gets last key.
     *
     * @return the last key
     */
    public Long getLastKey( ) {
		return this.lastKey;
	}

}
