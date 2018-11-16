package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.findata.operator.userinfo.certify response.
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:44:05
 */
public class SsdataFindataOperatorUserinfoCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7139337225126255884L;

	/** 
	 * 系统业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 返回的表单key值
	 */
	@ApiListField("form_list")
	@ApiField("string")
	private List<String> formList;

	/** 
	 * 商户系统的业务流水号
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo( ) {
		return this.bizNo;
	}

    /**
     * Sets form list.
     *
     * @param formList the form list
     */
    public void setFormList(List<String> formList) {
		this.formList = formList;
	}

    /**
     * Gets form list.
     *
     * @return the form list
     */
    public List<String> getFormList( ) {
		return this.formList;
	}

    /**
     * Sets org biz no.
     *
     * @param orgBizNo the org biz no
     */
    public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}

    /**
     * Gets org biz no.
     *
     * @return the org biz no
     */
    public String getOrgBizNo( ) {
		return this.orgBizNo;
	}

}
