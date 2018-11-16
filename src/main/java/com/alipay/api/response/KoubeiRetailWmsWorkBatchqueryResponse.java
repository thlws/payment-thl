package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WorkListVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.work.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:21
 */
public class KoubeiRetailWmsWorkBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1862436366947582217L;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private String pageNo;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 查询条件下作业总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 作业列表
	 */
	@ApiListField("work_list")
	@ApiField("work_list_v_o")
	private List<WorkListVO> workList;

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public String getPageNo( ) {
		return this.pageNo;
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
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize( ) {
		return this.pageSize;
	}

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public Long getTotalCount( ) {
		return this.totalCount;
	}

    /**
     * Sets work list.
     *
     * @param workList the work list
     */
    public void setWorkList(List<WorkListVO> workList) {
		this.workList = workList;
	}

    /**
     * Gets work list.
     *
     * @return the work list
     */
    public List<WorkListVO> getWorkList( ) {
		return this.workList;
	}

}
