package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商户同步电子发票至支付宝
 *
 * @author auto create
 * @since 1.0, 2018-07-02 10:28:32
 */
public class AlipayEbppInvoiceSycnModel extends AlipayObject {

	private static final long serialVersionUID = 4716719617957995581L;

	/**
	 * 同步发票信息模型
	 */
	@ApiListField("invoice_info")
	@ApiField("invoice_model_content")
	private List<InvoiceModelContent> invoiceInfo;

	/**
	 * 商户的品牌名称简称,该字段需要接入前向发票管家申请，
m_short_name+sub_m_short_name具有唯一约束
如：肯德基：KFC
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 支付宝为商户分配的商户门店简称，该字段需要接入前在发票管家申请
如：肯德基-杭州西湖区文一西路店：KFC-HZ-XH001
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

    /**
     * Gets invoice info.
     *
     * @return the invoice info
     */
    public List<InvoiceModelContent> getInvoiceInfo() {
		return this.invoiceInfo;
	}

    /**
     * Sets invoice info.
     *
     * @param invoiceInfo the invoice info
     */
    public void setInvoiceInfo(List<InvoiceModelContent> invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}

    /**
     * Gets short name.
     *
     * @return the short name
     */
    public String getmShortName() {
		return this.mShortName;
	}

    /**
     * Sets short name.
     *
     * @param mShortName the m short name
     */
    public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

    /**
     * Gets sub m short name.
     *
     * @return the sub m short name
     */
    public String getSubMShortName() {
		return this.subMShortName;
	}

    /**
     * Sets sub m short name.
     *
     * @param subMShortName the sub m short name
     */
    public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

}
