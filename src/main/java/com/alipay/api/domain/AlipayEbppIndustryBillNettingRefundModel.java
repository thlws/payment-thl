package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业业务订单轧差退款
 *
 * @author auto create
 * @since 1.0, 2018-09-14 14:28:50
 */
public class AlipayEbppIndustryBillNettingRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2851812921168893441L;

	/**
	 * 支付宝流水号。
	 */
	@ApiField("alipay_bill_no")
	private String alipayBillNo;

	/**
	 * 扩展字段，一系列键值对属性列表，示例只是个形式，具体的Key-Value需要根据具体业务另行约定。
无特别约定时，此字段不必传。
	 */
	@ApiListField("industry_extend_field_list")
	@ApiField("industry_extend_field")
	private List<IndustryExtendField> industryExtendFieldList;

	/**
	 * 退款备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 退款金额，单位：元
不可超过创单时的金额。
如果scene是TOTAL_FAILURE，则强制要求全额轧差退款，不支持部分轧差退款。
	 */
	@ApiField("netting_amount")
	private String nettingAmount;

	/**
	 * 退款场景，不同场景由不同策略处理。
PARTIALLY_DONE：业务上部分失败导致轧差退款
TOTAL_FAILURE：完全失败导致的轧差退款
	 */
	@ApiField("scene")
	private String scene;

    /**
     * Gets alipay bill no.
     *
     * @return the alipay bill no
     */
    public String getAlipayBillNo() {
		return this.alipayBillNo;
	}

    /**
     * Sets alipay bill no.
     *
     * @param alipayBillNo the alipay bill no
     */
    public void setAlipayBillNo(String alipayBillNo) {
		this.alipayBillNo = alipayBillNo;
	}

    /**
     * Gets industry extend field list.
     *
     * @return the industry extend field list
     */
    public List<IndustryExtendField> getIndustryExtendFieldList() {
		return this.industryExtendFieldList;
	}

    /**
     * Sets industry extend field list.
     *
     * @param industryExtendFieldList the industry extend field list
     */
    public void setIndustryExtendFieldList(List<IndustryExtendField> industryExtendFieldList) {
		this.industryExtendFieldList = industryExtendFieldList;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets netting amount.
     *
     * @return the netting amount
     */
    public String getNettingAmount() {
		return this.nettingAmount;
	}

    /**
     * Sets netting amount.
     *
     * @param nettingAmount the netting amount
     */
    public void setNettingAmount(String nettingAmount) {
		this.nettingAmount = nettingAmount;
	}

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public String getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(String scene) {
		this.scene = scene;
	}

}
