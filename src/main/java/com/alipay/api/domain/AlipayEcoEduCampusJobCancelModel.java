package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实习生职位下线接口
 *
 * @author auto create
 * @since 1.0, 2017-08-07 18:02:53
 */
public class AlipayEcoEduCampusJobCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1638418135387846315L;

	/**
	 * 职位来源方编码
	 */
	@ApiField("source_code")
	private String sourceCode;

	/**
	 * 职位在合作方的ID
	 */
	@ApiField("source_id")
	private String sourceId;

    /**
     * Gets source code.
     *
     * @return the source code
     */
    public String getSourceCode() {
		return this.sourceCode;
	}

    /**
     * Sets source code.
     *
     * @param sourceCode the source code
     */
    public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

    /**
     * Gets source id.
     *
     * @return the source id
     */
    public String getSourceId() {
		return this.sourceId;
	}

    /**
     * Sets source id.
     *
     * @param sourceId the source id
     */
    public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
