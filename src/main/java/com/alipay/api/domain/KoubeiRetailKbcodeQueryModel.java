package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消行业口碑码查询接口
 *
 * @author auto create
 * @since 1.0, 2017-09-13 10:34:04
 */
public class KoubeiRetailKbcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5511299741215178391L;

	/**
	 * 创建码接口返回的批次id，如果不填写则查询这个带运营商户下所有开放接口生成的码
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 当前页码（大于0的整数），默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页返回的记录数（1~100的整数），默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

    /**
     * Gets batch id.
     *
     * @return the batch id
     */
    public String getBatchId() {
		return this.batchId;
	}

    /**
     * Sets batch id.
     *
     * @param batchId the batch id
     */
    public void setBatchId(String batchId) {
		this.batchId = batchId;
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
