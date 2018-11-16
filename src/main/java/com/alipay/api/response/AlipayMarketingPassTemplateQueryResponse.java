package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PassTemplateDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.pass.template.query response.
 *
 * @author auto create
 * @since 1.0, 2018-02-01 00:37:15
 */
public class AlipayMarketingPassTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5221737898932265873L;

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
	 * 卡券模板总数
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 按page_size分页的总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 卡券模板列表
	 */
	@ApiListField("tpl_list")
	@ApiField("pass_template_detail")
	private List<PassTemplateDetail> tplList;

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

    /**
     * Sets tpl list.
     *
     * @param tplList the tpl list
     */
    public void setTplList(List<PassTemplateDetail> tplList) {
		this.tplList = tplList;
	}

    /**
     * Gets tpl list.
     *
     * @return the tpl list
     */
    public List<PassTemplateDetail> getTplList( ) {
		return this.tplList;
	}

}
