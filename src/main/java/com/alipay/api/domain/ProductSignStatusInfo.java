package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户产品签约状态结果对象
 *
 * @author auto create
 * @since 1.0, 2018-07-09 10:31:09
 */
public class ProductSignStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 6124285931184234846L;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * none:未签约，表示还没有签约该产品
valid:已生效，表示合约已经生效，不需要再签约了
restrictValid:受限生效，表示合约已经生效，但是资料不全，功能受限
audit:审核中，已经有合约在审核中，请等待审核完成
waitConfirm:待商户确认协议，合约已经审核通过，需要商户确认后合约才生效
auditReject:审核未通过
invalid:合约失效，曾经签过合约，但已经失效了，可以重新发起签约
restrictInvalid:受限失效，受限合约失效了
	 */
	@ApiField("status")
	private String status;

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
     * Gets product name.
     *
     * @return the product name
     */
    public String getProductName() {
		return this.productName;
	}

    /**
     * Sets product name.
     *
     * @param productName the product name
     */
    public void setProductName(String productName) {
		this.productName = productName;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
