package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预发03150725
 *
 * @author auto create
 * @since 1.0, 2017-07-25 09:12:04
 */
public class AlipayOpenAppYufanlingsanyaowuYufalingsanyaowuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6477467288927694864L;

	/**
	 * 省份编码，国标码
	 */
	@ApiListField("province_code")
	@ApiField("string")
	private List<String> provinceCode;

    /**
     * Gets province code.
     *
     * @return the province code
     */
    public List<String> getProvinceCode() {
		return this.provinceCode;
	}

    /**
     * Sets province code.
     *
     * @param provinceCode the province code
     */
    public void setProvinceCode(List<String> provinceCode) {
		this.provinceCode = provinceCode;
	}

}
