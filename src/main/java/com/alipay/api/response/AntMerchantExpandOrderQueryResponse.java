package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.order.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-08 14:40:00
 */
public class AntMerchantExpandOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6311148762526558185L;

	/** 
	 * 申请单创建时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/** 
	 * 商户角色id。审核通过后生成。间连商户或平台商二级商户业务中，本字段表示smid
	 */
	@ApiListField("ip_role_id")
	@ApiField("string")
	private List<String> ipRoleId;

	/** 
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 申请单状态。99:已完结;-1:失败;031:已提交审核
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets apply time.
     *
     * @param applyTime the apply time
     */
    public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

    /**
     * Gets apply time.
     *
     * @return the apply time
     */
    public Date getApplyTime( ) {
		return this.applyTime;
	}

    /**
     * Sets ip role id.
     *
     * @param ipRoleId the ip role id
     */
    public void setIpRoleId(List<String> ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

    /**
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public List<String> getIpRoleId( ) {
		return this.ipRoleId;
	}

    /**
     * Sets merchant name.
     *
     * @param merchantName the merchant name
     */
    public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

    /**
     * Gets merchant name.
     *
     * @return the merchant name
     */
    public String getMerchantName( ) {
		return this.merchantName;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}
