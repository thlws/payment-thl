package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改已上传的物业费账单数据
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:15:11
 */
public class AlipayEcoCplifeBillModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6554646849322863151L;

	/**
	 * 待修改的物业费账单应收明细条目列表，一次最多修改1000条明细条目。如果明细条目已被支付或在支付中，则无法被修改。接口会返回无法修改的明细条目ID列表。
	 */
	@ApiListField("bill_entry_list")
	@ApiField("c_p_bill_modify_set")
	private List<CPBillModifySet> billEntryList;

	/**
	 * 支付宝社区小区统一编号，必须在物业账号名下存在。
	 */
	@ApiField("community_id")
	private String communityId;

    /**
     * Gets bill entry list.
     *
     * @return the bill entry list
     */
    public List<CPBillModifySet> getBillEntryList() {
		return this.billEntryList;
	}

    /**
     * Sets bill entry list.
     *
     * @param billEntryList the bill entry list
     */
    public void setBillEntryList(List<CPBillModifySet> billEntryList) {
		this.billEntryList = billEntryList;
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
