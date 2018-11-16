package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户经营数据查询接口
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:53:07
 */
public class KoubeiMarketingDataMallIndicatorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6143187495916717329L;

	/**
	 * 开始日期,格式:yyyyMMdd
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 业务类型，目前可选值有5个
1，mallIndustryMemberStatistics	商户会员统计信息
2，mallIndustryTradeStatistics	行业交易统计信息
3，mallIndustryEventStatistics	行业活动统计信息
4，mallIndustryInfo	最新的行业维表信息
5，mallIndustryConsumptionStatistics	MALL消费能力统计信息
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 结束日期,格式:yyyyMMdd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * camp_id：为活动ID
order_by：为排序指标KEY，目前只支持文档中给出的例子字段
order_type：ASC表示升序,DESC表示降序
cate_1_ids：为门店ID，多个门店使用逗号分隔
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 当前页数，默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录数,不能超过50。默认为20
	 */
	@ApiField("page_size")
	private Long pageSize;

    /**
     * Gets begin date.
     *
     * @return the begin date
     */
    public String getBeginDate() {
		return this.beginDate;
	}

    /**
     * Sets begin date.
     *
     * @param beginDate the begin date
     */
    public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets end date.
     *
     * @return the end date
     */
    public String getEndDate() {
		return this.endDate;
	}

    /**
     * Sets end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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
