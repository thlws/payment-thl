package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险批单申请接口
 *
 * @author auto create
 * @since 1.0, 2018-07-11 15:23:06
 */
public class AlipayInsScenePolicyEndorseApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4543685134858341638L;

	/**
	 * 批单项列表
	 */
	@ApiListField("endorse_items")
	@ApiField("ins_endorse_item")
	private List<InsEndorseItem> endorseItems;

	/**
	 * 商户生成的批改请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 保单凭证号;蚂蚁保险平台生成的保单凭证号,用户可以通过此单号去保险公司查询保单信息.
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 批单来源
	 */
	@ApiField("source")
	private String source;

    /**
     * Gets endorse items.
     *
     * @return the endorse items
     */
    public List<InsEndorseItem> getEndorseItems() {
		return this.endorseItems;
	}

    /**
     * Sets endorse items.
     *
     * @param endorseItems the endorse items
     */
    public void setEndorseItems(List<InsEndorseItem> endorseItems) {
		this.endorseItems = endorseItems;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets policy no.
     *
     * @return the policy no
     */
    public String getPolicyNo() {
		return this.policyNo;
	}

    /**
     * Sets policy no.
     *
     * @param policyNo the policy no
     */
    public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
	}

}
