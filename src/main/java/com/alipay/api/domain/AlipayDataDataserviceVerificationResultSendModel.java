package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 验证结果反馈
 *
 * @author auto create
 * @since 1.0, 2018-01-29 16:50:13
 */
public class AlipayDataDataserviceVerificationResultSendModel extends AlipayObject {

	private static final long serialVersionUID = 2411457295196127956L;

	/**
	 * 部署单记录id
	 */
	@ApiField("record_id")
	private Long recordId;

	/**
	 * 验证结果列表
	 */
	@ApiListField("result_items")
	@ApiField("dx_verify_result_item")
	private List<DxVerifyResultItem> resultItems;

    /**
     * Gets record id.
     *
     * @return the record id
     */
    public Long getRecordId() {
		return this.recordId;
	}

    /**
     * Sets record id.
     *
     * @param recordId the record id
     */
    public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

    /**
     * Gets result items.
     *
     * @return the result items
     */
    public List<DxVerifyResultItem> getResultItems() {
		return this.resultItems;
	}

    /**
     * Sets result items.
     *
     * @param resultItems the result items
     */
    public void setResultItems(List<DxVerifyResultItem> resultItems) {
		this.resultItems = resultItems;
	}

}
