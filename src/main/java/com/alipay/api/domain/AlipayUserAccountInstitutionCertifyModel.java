package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户检测(机构名 + 支付宝外标）是否存在，如果存在返回对应的uid
 *
 * @author auto create
 * @since 1.0, 2017-02-10 10:27:11
 */
public class AlipayUserAccountInstitutionCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 5354656925463665316L;

	/**
	 * 描述机构的名称
	 */
	@ApiField("institution_name")
	private String institutionName;

	/**
	 * 登录号，可以是手机号码或者邮箱号码
	 */
	@ApiField("logon_id")
	private String logonId;

    /**
     * Gets institution name.
     *
     * @return the institution name
     */
    public String getInstitutionName() {
		return this.institutionName;
	}

    /**
     * Sets institution name.
     *
     * @param institutionName the institution name
     */
    public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

    /**
     * Gets logon id.
     *
     * @return the logon id
     */
    public String getLogonId() {
		return this.logonId;
	}

    /**
     * Sets logon id.
     *
     * @param logonId the logon id
     */
    public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
