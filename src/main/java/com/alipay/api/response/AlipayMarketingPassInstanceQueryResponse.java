package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PassInstanceDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.pass.instance.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-31 22:14:05
 */
public class AlipayMarketingPassInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5229175533668964573L;

	/** 
	 * 卡券实例列表
	 */
	@ApiListField("instance_list")
	@ApiField("pass_instance_detail")
	private List<PassInstanceDetail> instanceList;

	/** 
	 * 当前查询的页码，页码从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 当前查询的每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 卡券实例总数
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 按page_size分页的总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

    /**
     * Sets instance list.
     *
     * @param instanceList the instance list
     */
    public void setInstanceList(List<PassInstanceDetail> instanceList) {
		this.instanceList = instanceList;
	}

    /**
     * Gets instance list.
     *
     * @return the instance list
     */
    public List<PassInstanceDetail> getInstanceList( ) {
		return this.instanceList;
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
     * Gets page num.
     *
     * @return the page num
     */
    public Long getPageNum( ) {
		return this.pageNum;
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
     * Sets total.
     *
     * @param total the total
     */
    public void setTotal(Long total) {
		this.total = total;
	}

    /**
     * Gets total.
     *
     * @return the total
     */
    public Long getTotal( ) {
		return this.total;
	}

    /**
     * Sets total page.
     *
     * @param totalPage the total page
     */
    public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

    /**
     * Gets total page.
     *
     * @return the total page
     */
    public Long getTotalPage( ) {
		return this.totalPage;
	}

}
