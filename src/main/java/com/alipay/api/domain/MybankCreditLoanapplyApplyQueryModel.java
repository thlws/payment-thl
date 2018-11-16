package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户申贷记录查询
 *
 * @author auto create
 * @since 1.0, 2018-07-12 11:27:07
 */
public class MybankCreditLoanapplyApplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8435467952774182814L;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 扩展查询参数
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 客户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 子申请单编号
	 */
	@ApiField("subapply_no")
	private String subapplyNo;

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets cert type.
     *
     * @return the cert type
     */
    public String getCertType() {
		return this.certType;
	}

    /**
     * Sets cert type.
     *
     * @param certType the cert type
     */
    public void setCertType(String certType) {
		this.certType = certType;
	}

    /**
     * Gets ext params.
     *
     * @return the ext params
     */
    public String getExtParams() {
		return this.extParams;
	}

    /**
     * Sets ext params.
     *
     * @param extParams the ext params
     */
    public void setExtParams(String extParams) {
		this.extParams = extParams;
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

    /**
     * Gets subapply no.
     *
     * @return the subapply no
     */
    public String getSubapplyNo() {
		return this.subapplyNo;
	}

    /**
     * Sets subapply no.
     *
     * @param subapplyNo the subapply no
     */
    public void setSubapplyNo(String subapplyNo) {
		this.subapplyNo = subapplyNo;
	}

}
