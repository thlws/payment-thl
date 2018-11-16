package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保额选项
 *
 * @author auto create
 * @since 1.0, 2017-10-26 22:41:52
 */
public class InsOption extends AlipayObject {

	private static final long serialVersionUID = 2314324241559497789L;

	/**
	 * 保额key
	 */
	@ApiField("coverage")
	private String coverage;

	/**
	 * 保额value
	 */
	@ApiField("coverage_text")
	private String coverageText;

    /**
     * Gets coverage.
     *
     * @return the coverage
     */
    public String getCoverage() {
		return this.coverage;
	}

    /**
     * Sets coverage.
     *
     * @param coverage the coverage
     */
    public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

    /**
     * Gets coverage text.
     *
     * @return the coverage text
     */
    public String getCoverageText() {
		return this.coverageText;
	}

    /**
     * Sets coverage text.
     *
     * @param coverageText the coverage text
     */
    public void setCoverageText(String coverageText) {
		this.coverageText = coverageText;
	}

}
