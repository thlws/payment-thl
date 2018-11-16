package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券模板创建信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class VoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 6145298455416482229L;

	/**
	 * 是否可转赠。默认true
	 */
	@ApiField("can_give_friend")
	private Boolean canGiveFriend;

	/**
	 * 使用规则
	 */
	@ApiField("use_rule")
	private UseRuleInfo useRule;

	/**
	 * 有效期
	 */
	@ApiField("valid_date")
	private ValidDateInfo validDate;

	/**
	 * 券详情描述
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券背景图。该值调用接口:alipay.offline.material.image.upload生成
	 */
	@ApiField("voucher_img")
	private String voucherImg;

	/**
	 * logo图片id。该值调用接口:alipay.offline.material.image.upload生成
	 */
	@ApiField("voucher_logo")
	private String voucherLogo;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券上的详情描述信息
	 */
	@ApiListField("voucher_terms")
	@ApiField("voucher_term_info")
	private List<VoucherTermInfo> voucherTerms;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

    /**
     * Gets can give friend.
     *
     * @return the can give friend
     */
    public Boolean getCanGiveFriend() {
		return this.canGiveFriend;
	}

    /**
     * Sets can give friend.
     *
     * @param canGiveFriend the can give friend
     */
    public void setCanGiveFriend(Boolean canGiveFriend) {
		this.canGiveFriend = canGiveFriend;
	}

    /**
     * Gets use rule.
     *
     * @return the use rule
     */
    public UseRuleInfo getUseRule() {
		return this.useRule;
	}

    /**
     * Sets use rule.
     *
     * @param useRule the use rule
     */
    public void setUseRule(UseRuleInfo useRule) {
		this.useRule = useRule;
	}

    /**
     * Gets valid date.
     *
     * @return the valid date
     */
    public ValidDateInfo getValidDate() {
		return this.validDate;
	}

    /**
     * Sets valid date.
     *
     * @param validDate the valid date
     */
    public void setValidDate(ValidDateInfo validDate) {
		this.validDate = validDate;
	}

    /**
     * Gets voucher desc.
     *
     * @return the voucher desc
     */
    public String getVoucherDesc() {
		return this.voucherDesc;
	}

    /**
     * Sets voucher desc.
     *
     * @param voucherDesc the voucher desc
     */
    public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

    /**
     * Gets voucher img.
     *
     * @return the voucher img
     */
    public String getVoucherImg() {
		return this.voucherImg;
	}

    /**
     * Sets voucher img.
     *
     * @param voucherImg the voucher img
     */
    public void setVoucherImg(String voucherImg) {
		this.voucherImg = voucherImg;
	}

    /**
     * Gets voucher logo.
     *
     * @return the voucher logo
     */
    public String getVoucherLogo() {
		return this.voucherLogo;
	}

    /**
     * Sets voucher logo.
     *
     * @param voucherLogo the voucher logo
     */
    public void setVoucherLogo(String voucherLogo) {
		this.voucherLogo = voucherLogo;
	}

    /**
     * Gets voucher name.
     *
     * @return the voucher name
     */
    public String getVoucherName() {
		return this.voucherName;
	}

    /**
     * Sets voucher name.
     *
     * @param voucherName the voucher name
     */
    public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

    /**
     * Gets voucher terms.
     *
     * @return the voucher terms
     */
    public List<VoucherTermInfo> getVoucherTerms() {
		return this.voucherTerms;
	}

    /**
     * Sets voucher terms.
     *
     * @param voucherTerms the voucher terms
     */
    public void setVoucherTerms(List<VoucherTermInfo> voucherTerms) {
		this.voucherTerms = voucherTerms;
	}

    /**
     * Gets voucher type.
     *
     * @return the voucher type
     */
    public String getVoucherType() {
		return this.voucherType;
	}

    /**
     * Sets voucher type.
     *
     * @param voucherType the voucher type
     */
    public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
