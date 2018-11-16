package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InstanceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.instance.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-27 18:08:35
 */
public class KoubeiRetailInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5633561284535437119L;

	/** 
	 * 商户维度券或者DM信息列表
	 */
	@ApiListField("instance_list")
	@ApiField("instance_info")
	private List<InstanceInfo> instanceList;

	/** 
	 * 返回的总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

    /**
     * Sets instance list.
     *
     * @param instanceList the instance list
     */
    public void setInstanceList(List<InstanceInfo> instanceList) {
		this.instanceList = instanceList;
	}

    /**
     * Gets instance list.
     *
     * @return the instance list
     */
    public List<InstanceInfo> getInstanceList( ) {
		return this.instanceList;
	}

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public Long getTotalCount( ) {
		return this.totalCount;
	}

}
