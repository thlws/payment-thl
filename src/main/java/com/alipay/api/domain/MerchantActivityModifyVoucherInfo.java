package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品券可修改字段模型
 *
 * @author auto create
 * @since 1.0, 2018-07-06 17:36:54
 */
public class MerchantActivityModifyVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 4254164799759445145L;

	/**
	 * 券logo
券logo最大字符数不能超过64
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 使用须知
券使用须知最大字符数不能超过256
	 */
	@ApiField("user_introductions")
	private String userIntroductions;

	/**
	 * 领取后, 第几天失效
valid_time_type=RELATIVE时有效且必填
只允许增加领取后可用天数
	 */
	@ApiField("valid_days_range_to")
	private Long validDaysRangeTo;

	/**
	 * 有效期截止时间
valid_time_type=FIXED时有效且必填
券有效结束时间格式必须为yyyy-MM-dd HH:mm:ss
只允许延长固定时间的结束时间（支持到分）
	 */
	@ApiField("valid_time_range_to")
	private String validTimeRangeTo;

	/**
	 * 有效期类型：
枚举值：RELATIVE/FIXED
	 */
	@ApiField("valid_time_type")
	private String validTimeType;

    /**
     * Gets logo.
     *
     * @return the logo
     */
    public String getLogo() {
		return this.logo;
	}

    /**
     * Sets logo.
     *
     * @param logo the logo
     */
    public void setLogo(String logo) {
		this.logo = logo;
	}

    /**
     * Gets user introductions.
     *
     * @return the user introductions
     */
    public String getUserIntroductions() {
		return this.userIntroductions;
	}

    /**
     * Sets user introductions.
     *
     * @param userIntroductions the user introductions
     */
    public void setUserIntroductions(String userIntroductions) {
		this.userIntroductions = userIntroductions;
	}

    /**
     * Gets valid days range to.
     *
     * @return the valid days range to
     */
    public Long getValidDaysRangeTo() {
		return this.validDaysRangeTo;
	}

    /**
     * Sets valid days range to.
     *
     * @param validDaysRangeTo the valid days range to
     */
    public void setValidDaysRangeTo(Long validDaysRangeTo) {
		this.validDaysRangeTo = validDaysRangeTo;
	}

    /**
     * Gets valid time range to.
     *
     * @return the valid time range to
     */
    public String getValidTimeRangeTo() {
		return this.validTimeRangeTo;
	}

    /**
     * Sets valid time range to.
     *
     * @param validTimeRangeTo the valid time range to
     */
    public void setValidTimeRangeTo(String validTimeRangeTo) {
		this.validTimeRangeTo = validTimeRangeTo;
	}

    /**
     * Gets valid time type.
     *
     * @return the valid time type
     */
    public String getValidTimeType() {
		return this.validTimeType;
	}

    /**
     * Sets valid time type.
     *
     * @param validTimeType the valid time type
     */
    public void setValidTimeType(String validTimeType) {
		this.validTimeType = validTimeType;
	}

}
