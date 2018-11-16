package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员合作专区权益状态变更接口
 *
 * @author auto create
 * @since 1.0, 2017-06-15 15:43:50
 */
public class AlipayUserBenefitStatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 2721978499281184911L;

	/**
	 * 权益的ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * YES表示当前操作的是会员3.0权益，NO表示当前操作的是改版之前的权益
	 */
	@ApiField("benefit_new_flag")
	private String benefitNewFlag;

	/**
	 * 1:上线， 0:下线,  2:失效；
上线状态所有人可见，不可编辑；
下线状态白名单可见，可以编辑；
失效状态所有人不可见，不可编辑。
	 */
	@ApiField("benefit_status")
	private String benefitStatus;

    /**
     * Gets benefit id.
     *
     * @return the benefit id
     */
    public String getBenefitId() {
		return this.benefitId;
	}

    /**
     * Sets benefit id.
     *
     * @param benefitId the benefit id
     */
    public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

    /**
     * Gets benefit new flag.
     *
     * @return the benefit new flag
     */
    public String getBenefitNewFlag() {
		return this.benefitNewFlag;
	}

    /**
     * Sets benefit new flag.
     *
     * @param benefitNewFlag the benefit new flag
     */
    public void setBenefitNewFlag(String benefitNewFlag) {
		this.benefitNewFlag = benefitNewFlag;
	}

    /**
     * Gets benefit status.
     *
     * @return the benefit status
     */
    public String getBenefitStatus() {
		return this.benefitStatus;
	}

    /**
     * Sets benefit status.
     *
     * @param benefitStatus the benefit status
     */
    public void setBenefitStatus(String benefitStatus) {
		this.benefitStatus = benefitStatus;
	}

}
