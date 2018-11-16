package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询券模板列表
 *
 * @author auto create
 * @since 1.0, 2018-06-20 18:10:24
 */
public class AlipayMarketingVoucherTemplatelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7422792595326423526L;

	/**
	 * 模板创建结束时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_end_time")
	private Date createEndTime;

	/**
	 * 模板创建开始时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_start_time")
	private Date createStartTime;

	/**
	 * 页码，必须为大于0的整数， 1表示第一页，2表示第2页，依次类推。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录条数，必须为大于0的整数，最大值为30
	 */
	@ApiField("page_size")
	private Long pageSize;

    /**
     * Gets create end time.
     *
     * @return the create end time
     */
    public Date getCreateEndTime() {
		return this.createEndTime;
	}

    /**
     * Sets create end time.
     *
     * @param createEndTime the create end time
     */
    public void setCreateEndTime(Date createEndTime) {
		this.createEndTime = createEndTime;
	}

    /**
     * Gets create start time.
     *
     * @return the create start time
     */
    public Date getCreateStartTime() {
		return this.createStartTime;
	}

    /**
     * Sets create start time.
     *
     * @param createStartTime the create start time
     */
    public void setCreateStartTime(Date createStartTime) {
		this.createStartTime = createStartTime;
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
