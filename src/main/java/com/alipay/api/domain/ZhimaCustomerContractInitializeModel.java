package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻可信电子合约初始化
 *
 * @author auto create
 * @since 1.0, 2017-10-26 17:38:16
 */
public class ZhimaCustomerContractInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 5792472157245665565L;

	/**
	 * 合约内容，必须是PDF文件流，BASE64编码
	 */
	@ApiField("contract_file")
	private String contractFile;

	/**
	 * 合约名称，会展示给签约方
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 芝麻认证产品码，示例值为真实的产品码
	 */
	@ApiField("product_code")
	private String productCode;

    /**
     * Gets contract file.
     *
     * @return the contract file
     */
    public String getContractFile() {
		return this.contractFile;
	}

    /**
     * Sets contract file.
     *
     * @param contractFile the contract file
     */
    public void setContractFile(String contractFile) {
		this.contractFile = contractFile;
	}

    /**
     * Gets contract name.
     *
     * @return the contract name
     */
    public String getContractName() {
		return this.contractName;
	}

    /**
     * Sets contract name.
     *
     * @param contractName the contract name
     */
    public void setContractName(String contractName) {
		this.contractName = contractName;
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

}
