package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据条件查询推荐菜
 *
 * @author auto create
 * @since 1.0, 2017-07-03 14:41:41
 */
public class KoubeiMarketingDataDishdiagnoseBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5378792694729872592L;

	/**
	 * 查询菜品类型：001是明星菜品，002是潜力菜品，003是其他菜品（除明星菜品和潜力菜品之外的其他一律作为其他菜品 编号为003）。
2-	如果要查询所有的则传入999。具体的值可以通过koubei.marketing.data.dishdiagnosetype.batchquery来查询，同时会返回类型与说明
	 */
	@ApiField("item_diagnose_type")
	private String itemDiagnoseType;

	/**
	 * 从第一页开始，默认值1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小，默认值50，同时page_size*page_no最多条数是300条，查询请注意。超过后不会再返回数据。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询数据时间,最新数据是昨天的。T-1的数据，最大保留30天,格式：YYYYMMDD。比如20170103
	 */
	@ApiField("report_date")
	private String reportDate;

    /**
     * Gets item diagnose type.
     *
     * @return the item diagnose type
     */
    public String getItemDiagnoseType() {
		return this.itemDiagnoseType;
	}

    /**
     * Sets item diagnose type.
     *
     * @param itemDiagnoseType the item diagnose type
     */
    public void setItemDiagnoseType(String itemDiagnoseType) {
		this.itemDiagnoseType = itemDiagnoseType;
	}

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public Long getPageNo() {
		return this.pageNo;
	}

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
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
     * Gets report date.
     *
     * @return the report date
     */
    public String getReportDate() {
		return this.reportDate;
	}

    /**
     * Sets report date.
     *
     * @param reportDate the report date
     */
    public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
