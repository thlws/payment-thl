package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EduStudentInfoShareResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.studentinfo.share response.
 *
 * @author auto create
 * @since 1.0, 2016-07-19 14:49:22
 */
public class AlipayCommerceEducateStudentinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 3769741715721743768L;

	/** 
	 * 学生信息
	 */
	@ApiField("student_info_share_result")
	private EduStudentInfoShareResult studentInfoShareResult;

    /**
     * Sets student info share result.
     *
     * @param studentInfoShareResult the student info share result
     */
    public void setStudentInfoShareResult(EduStudentInfoShareResult studentInfoShareResult) {
		this.studentInfoShareResult = studentInfoShareResult;
	}

    /**
     * Gets student info share result.
     *
     * @return the student info share result
     */
    public EduStudentInfoShareResult getStudentInfoShareResult( ) {
		return this.studentInfoShareResult;
	}

}
