package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * asd
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:09
 */
public class ZhimaMerchantTestPracticeModel extends AlipayObject {

	private static final long serialVersionUID = 2181524498715311612L;

	/**
	 * a d
	 */
	@ApiListField("add")
	@ApiField("string")
	private List<String> add;

	/**
	 * zzz
	 */
	@ApiField("xxxx")
	private XXXXsdasdasd xxxx;

    /**
     * Gets add.
     *
     * @return the add
     */
    public List<String> getAdd() {
		return this.add;
	}

    /**
     * Sets add.
     *
     * @param add the add
     */
    public void setAdd(List<String> add) {
		this.add = add;
	}

    /**
     * Gets xxxx.
     *
     * @return the xxxx
     */
    public XXXXsdasdasd getXxxx() {
		return this.xxxx;
	}

    /**
     * Sets xxxx.
     *
     * @param xxxx the xxxx
     */
    public void setXxxx(XXXXsdasdasd xxxx) {
		this.xxxx = xxxx;
	}

}
