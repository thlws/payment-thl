package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JfExportInstBillModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jfexport.instbill.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-02 15:06:35
 */
public class AlipayEbppJfexportInstbillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8352529493944742184L;

	/** 
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 业务类型英文名称
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * "utility_" + uniqId，缓存的账单的key，每次查询均保证唯一性，但是不保证幂等性，在创建时需要透传回支付宝这边。
	 */
	@ApiField("cache_key")
	private String cacheKey;

	/** 
	 * 出账机构英文简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 缴费模式:2-账单模式;4-缴清欠费模式;5-欠费自由缴模式。
	 */
	@ApiField("charge_mode")
	private String chargeMode;

	/** 
	 * 拓展字段，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 机构账单列表，如果有多条，只允许选择其中的一条进行支付。
	 */
	@ApiListField("inst_bills")
	@ApiField("jf_export_inst_bill_model")
	private List<JfExportInstBillModel> instBills;

	/** 
	 * 账单拥有者姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/** 
	 * 子业务类型英文简称
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

    /**
     * Sets bill key.
     *
     * @param billKey the bill key
     */
    public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

    /**
     * Gets bill key.
     *
     * @return the bill key
     */
    public String getBillKey( ) {
		return this.billKey;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType( ) {
		return this.bizType;
	}

    /**
     * Sets cache key.
     *
     * @param cacheKey the cache key
     */
    public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

    /**
     * Gets cache key.
     *
     * @return the cache key
     */
    public String getCacheKey( ) {
		return this.cacheKey;
	}

    /**
     * Sets charge inst.
     *
     * @param chargeInst the charge inst
     */
    public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

    /**
     * Gets charge inst.
     *
     * @return the charge inst
     */
    public String getChargeInst( ) {
		return this.chargeInst;
	}

    /**
     * Sets charge mode.
     *
     * @param chargeMode the charge mode
     */
    public void setChargeMode(String chargeMode) {
		this.chargeMode = chargeMode;
	}

    /**
     * Gets charge mode.
     *
     * @return the charge mode
     */
    public String getChargeMode( ) {
		return this.chargeMode;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField( ) {
		return this.extendField;
	}

    /**
     * Sets inst bills.
     *
     * @param instBills the inst bills
     */
    public void setInstBills(List<JfExportInstBillModel> instBills) {
		this.instBills = instBills;
	}

    /**
     * Gets inst bills.
     *
     * @return the inst bills
     */
    public List<JfExportInstBillModel> getInstBills( ) {
		return this.instBills;
	}

    /**
     * Sets owner name.
     *
     * @param ownerName the owner name
     */
    public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

    /**
     * Gets owner name.
     *
     * @return the owner name
     */
    public String getOwnerName( ) {
		return this.ownerName;
	}

    /**
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

    /**
     * Gets sub biz type.
     *
     * @return the sub biz type
     */
    public String getSubBizType( ) {
		return this.subBizType;
	}

}
