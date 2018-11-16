package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动指标查询
 *
 * @author auto create
 * @since 1.0, 2017-09-29 15:07:40
 */
public class KoubeiMarketingDataIndicatorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8842294278544167187L;

	/**
	 * 开始日期,格式:yyyyMMdd
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 业务类型，可选值有六个
1，MemberQuery 商户会员数据查询
2，MemberQueryByStore 门店会员数据查询
3，TradeQuery 商户交易数据查询
4，TradeQueryByStore 门店交易数据查询
5，CampaignQuery 商户活动数据查询
6，CampaignQueryByStore 门店活动数据查询
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 结束日期 格式:yyyyMMdd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * camp_id：为活动ID
sort_field：为排序指标KEY
sort_type：ASC表示升序,DESC表示降序
store_Ids：为门店ID，多个门店使用逗号分隔
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 当前页数，默认为1
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页记录数,不能超过50，默认为20
	 */
	@ApiField("page_size")
	private String pageSize;

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
    public String getPageNum() {
		return this.pageNum;
	}

    /**
     * Sets page num.
     *
     * @param pageNum the page num
     */
    public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
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

}
