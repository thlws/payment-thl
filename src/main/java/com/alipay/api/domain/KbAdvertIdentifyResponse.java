package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统主键结果
 *
 * @author auto create
 * @since 1.0, 2018-03-19 19:29:41
 */
public class KbAdvertIdentifyResponse extends AlipayObject {

	private static final long serialVersionUID = 8134478879336981626L;

	/**
	 * 根据benefit_type，确定ID含义
SINGLE_VOUCHER时，benefit_ids为券ID
	 */
	@ApiListField("benefit_ids")
	@ApiField("string")
	private List<String> benefitIds;

	/**
	 * 发放权益类型
SINGLE_VOUCHER：单券
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 返回码
success: 成功
invalid-arguments: 无效参数
retry-exception: 异常请重试
isv.user-already-get-voucher：用户已经领过该券，同时券状态为有效
isv.item_inventory_not_enough:优惠领光了
isv.item_not_in_this_shop_sales:不是该商家的优惠，不能领取
isv.voucher_activity_not_started:活动未开始
isv.voucher_activity_expired:活动已结束
isv.crowd_limit_not_match_error:暂无领取资格，详情请咨询商家
isv.member_crowd_limit_not_match_error:会员专属，请先注册会员
	 */
	@ApiField("code")
	private String code;

	/**
	 * JSON格式数据，alipass_url为打开钱包的地址
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 主键的值
	 */
	@ApiField("identify")
	private String identify;

	/**
	 * 主键类型
	 */
	@ApiField("identify_type")
	private String identifyType;

    /**
     * Gets benefit ids.
     *
     * @return the benefit ids
     */
    public List<String> getBenefitIds() {
		return this.benefitIds;
	}

    /**
     * Sets benefit ids.
     *
     * @param benefitIds the benefit ids
     */
    public void setBenefitIds(List<String> benefitIds) {
		this.benefitIds = benefitIds;
	}

    /**
     * Gets benefit type.
     *
     * @return the benefit type
     */
    public String getBenefitType() {
		return this.benefitType;
	}

    /**
     * Sets benefit type.
     *
     * @param benefitType the benefit type
     */
    public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

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

}
