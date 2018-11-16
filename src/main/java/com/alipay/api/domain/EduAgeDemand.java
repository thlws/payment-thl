package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兼职平台贴子年龄
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:22:14
 */
public class EduAgeDemand extends AlipayObject {

	private static final long serialVersionUID = 5273585976312655427L;

	/**
	 * 结束年龄
	 */
	@ApiField("age_end")
	private String ageEnd;

	/**
	 * 开始年龄
	 */
	@ApiField("age_start")
	private String ageStart;

    /**
     * Gets age end.
     *
     * @return the age end
     */
    public String getAgeEnd() {
		return this.ageEnd;
	}

    /**
     * Sets age end.
     *
     * @param ageEnd the age end
     */
    public void setAgeEnd(String ageEnd) {
		this.ageEnd = ageEnd;
	}

    /**
     * Gets age start.
     *
     * @return the age start
     */
    public String getAgeStart() {
		return this.ageStart;
	}

    /**
     * Sets age start.
     *
     * @param ageStart the age start
     */
    public void setAgeStart(String ageStart) {
		this.ageStart = ageStart;
	}

}
