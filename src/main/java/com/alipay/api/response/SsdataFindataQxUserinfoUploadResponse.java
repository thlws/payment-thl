package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.findata.qx.userinfo.upload response.
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:44:13
 */
public class SsdataFindataQxUserinfoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8191231932186718319L;

	/** 
	 * 系统生成的业务唯一标识，用于标识商户的一笔业务
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 返回的表单key值列表，不同的运营商有不同的参数要求
phoneNo：手机号,servicePassword：服务密码,smsCode：短信验证码
capath:图片验证码,name:姓名,certNo:身份证
	 */
	@ApiListField("form_list")
	@ApiField("string")
	private List<String> formList;

	/** 
	 * 商户业务流水号，如果商户有传入，则原样返回。如果商户没有传入，则有系统生成返回
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
