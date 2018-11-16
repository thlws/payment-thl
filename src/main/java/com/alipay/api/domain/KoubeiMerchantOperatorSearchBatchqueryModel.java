package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 操作员批量分页查询
 *
 * @author auto create
 * @since 1.0, 2018-07-13 20:42:31
 */
public class KoubeiMerchantOperatorSearchBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1322442129657951575L;

	/**
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 当前页码，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * T - "已激活"
U - "已锁定"
W - "未激活"
	 */
	@ApiListField("status")
	@ApiField("string")
	private List<String> status;

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
		return this.authCode;
	}

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

    /**
     * Gets page num.
     *
     * @return the page num
     */
    public Long getPageNum() {
		return this.pageNum;
	}

    /**
     * Sets page num.
     *
     * @param pageNum the page num
     */
    public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public List<String> getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(List<String> status) {
		this.status = status;
	}

}
