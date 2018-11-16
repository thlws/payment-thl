package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分佣任务推广接口
 *
 * @author auto create
 * @since 1.0, 2017-02-15 10:06:08
 */
public class KoubeiAdvertCommissionMissionPromoteModel extends AlipayObject {

	private static final long serialVersionUID = 4651162155526859431L;

	/**
	 * 推广主键
identify_type=mission-值必须是任务ID
identify_type=voucher-值必须是券ID
	 */
	@ApiField("identify")
	private String identify;

	/**
	 * 推广主键类型
mission-任务
voucher-券
	 */
	@ApiField("identify_type")
	private String identifyType;

	/**
	 * 指定推广活动的名称
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets identify.
     *
     * @return the identify
     */
    public String getIdentify() {
		return this.identify;
	}

    /**
     * Sets identify.
     *
     * @param identify the identify
     */
    public void setIdentify(String identify) {
		this.identify = identify;
	}

    /**
     * Gets identify type.
     *
     * @return the identify type
     */
    public String getIdentifyType() {
		return this.identifyType;
	}

    /**
     * Sets identify type.
     *
     * @param identifyType the identify type
     */
    public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

}
