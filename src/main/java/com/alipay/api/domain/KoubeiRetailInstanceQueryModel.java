package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户券查询接口
 *
 * @author auto create
 * @since 1.0, 2017-09-27 18:08:35
 */
public class KoubeiRetailInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8137949766116642681L;

	/**
	 * 券或者电子DM单（VOUCHER、DM），如果字段为空返回VOUCHER类型
	 */
	@ApiField("instance_type")
	private String instanceType;

	/**
	 * 当前页码，默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 一次请求返回的数据量，1~100整数，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

    /**
     * Gets instance type.
     *
     * @return the instance type
     */
    public String getInstanceType() {
		return this.instanceType;
	}

    /**
     * Sets instance type.
     *
     * @param instanceType the instance type
     */
    public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
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

}
