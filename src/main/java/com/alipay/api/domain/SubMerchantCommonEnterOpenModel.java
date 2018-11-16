package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户门店公共信息模型
 *
 * @author auto create
 * @since 1.0, 2018-07-20 14:21:27
 */
public class SubMerchantCommonEnterOpenModel extends AlipayObject {

	private static final long serialVersionUID = 2172646841478646211L;

	/**
	 * 扩展字段，为json字符串格式；入驻支付即开票的产品，需要传入用户白名单的时候，由此字段传入
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * 商户门店入驻的产品码,QRCODE_MERCHANT_OPEN:企业自建-扫码开票，INVOICE_RETURN:企业自建-发票回传，INVOICE_EXPENSE:发票报销，PAYMENT_OPEN:支付即开票。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户门店所属的服务方简称。
	 */
	@ApiField("s_short_name")
	private String sShortName;

    /**
     * Gets extend fields.
     *
     * @return the extend fields
     */
    public String getExtendFields() {
		return this.extendFields;
	}

    /**
     * Sets extend fields.
     *
     * @param extendFields the extend fields
     */
    public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

    /**
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    /**
     * Gets short name.
     *
     * @return the short name
     */
    public String getsShortName() {
		return this.sShortName;
	}

    /**
     * Sets short name.
     *
     * @param sShortName the s short name
     */
    public void setsShortName(String sShortName) {
		this.sShortName = sShortName;
	}

}
