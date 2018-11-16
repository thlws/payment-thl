package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜谱分页类型
 *
 * @author auto create
 * @since 1.0, 2018-07-12 11:25:11
 */
public class PaginationCook extends AlipayObject {

	private static final long serialVersionUID = 5724859471576296743L;

	/**
	 * 出参列表
	 */
	@ApiListField("list")
	@ApiField("kbdish_cook_info")
	private List<KbdishCookInfo> list;

	/**
	 * 表示当前页数
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 表示每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 总条数
	 */
	@ApiField("total_count")
	private String totalCount;

	/**
	 * 总页数
	 */
	@ApiField("total_page")
	private String totalPage;

    /**
     * Gets list.
     *
     * @return the list
     */
    public List<KbdishCookInfo> getList() {
		return this.list;
	}

    /**
     * Sets list.
     *
     * @param list the list
     */
    public void setList(List<KbdishCookInfo> list) {
		this.list = list;
	}

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public String getPageNo() {
		return this.pageNo;
	}

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public String getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public String getTotalCount() {
		return this.totalCount;
	}

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total page.
     *
     * @return the total page
     */
    public String getTotalPage() {
		return this.totalPage;
	}

    /**
     * Sets total page.
     *
     * @param totalPage the total page
     */
    public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}

}
