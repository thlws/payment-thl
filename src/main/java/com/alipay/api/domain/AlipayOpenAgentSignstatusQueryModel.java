package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv查询商户某个产品的签约状态
 *
 * @author auto create
 * @since 1.0, 2018-07-11 15:35:25
 */
public class AlipayOpenAgentSignstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4767737785964596529L;

	/**
	 * isv要查询签约状态的商户账号，是支付宝账号pid（2088开头）
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * isv要查询商户签约状态的产品码，产品码是支付宝内部对产品的唯一标识
	 */
	@ApiListField("product_codes")
	@ApiField("string")
	private List<String> productCodes;

    /**
     * Gets pid.
     *
     * @return the pid
     */
    public String getPid() {
		return this.pid;
	}

    /**
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(String pid) {
		this.pid = pid;
	}

    /**
     * Gets product codes.
     *
     * @return the product codes
     */
    public List<String> getProductCodes() {
		return this.productCodes;
	}

    /**
     * Sets product codes.
     *
     * @param productCodes the product codes
     */
    public void setProductCodes(List<String> productCodes) {
		this.productCodes = productCodes;
	}

}
