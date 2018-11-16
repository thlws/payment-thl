package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询支付宝小区编号
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:14:53
 */
public class AlipayEcoCplifeCommunityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1539173743225367747L;

	/**
	 * 分页查询的当前页码数，分页从1开始计数。
该参数不传入的时候，默认为1。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询的每页最大数据条数，取值范围1-500。
不传该参数默认为200。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 如传入该参数，则返回指定状态的小区，支持的状态值：
PENDING_ONLINE 待上线
ONLINE - 上线
MAINTAIN - 维护中
OFFLINE - 下线

不传该值则默认返回所有状态的小区。
	 */
	@ApiField("status")
	private String status;

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
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
