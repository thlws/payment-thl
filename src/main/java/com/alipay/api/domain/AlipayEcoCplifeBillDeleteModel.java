package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 删除已上传的物业费账单数据
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:12:18
 */
public class AlipayEcoCplifeBillDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4467393262255632244L;

	/**
	 * 指定小区下待删除的物业费账单应收明细条目ID列表，一次最多删除1000条，如果明细条目已被支付或在支付中，则无法被删除。接口会返回无法删除的明细条目ID列表。
	 */
	@ApiListField("bill_entry_id_list")
	@ApiField("string")
	private List<String> billEntryIdList;

	/**
	 * 支付宝社区小区统一编号，必须在物业账号名下存在。
	 */
	@ApiField("community_id")
	private String communityId;

    /**
     * Gets bill entry id list.
     *
     * @return the bill entry id list
     */
    public List<String> getBillEntryIdList() {
		return this.billEntryIdList;
	}

    /**
     * Sets bill entry id list.
     *
     * @param billEntryIdList the bill entry id list
     */
    public void setBillEntryIdList(List<String> billEntryIdList) {
		this.billEntryIdList = billEntryIdList;
	}

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

}
