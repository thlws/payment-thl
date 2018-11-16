package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商商家报名分页查询接口
 *
 * @author auto create
 * @since 1.0, 2017-02-20 13:51:20
 */
public class KoubeiMarketingCampaignRecruitApplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2861328572571524635L;

	/**
	 * 运营活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 分页号
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页大小,最大值200
	 */
	@ApiField("page_size")
	private String pageSize;

    /**
     * Gets camp id.
     *
     * @return the camp id
     */
    public String getCampId() {
		return this.campId;
	}

    /**
     * Sets camp id.
     *
     * @param campId the camp id
     */
    public void setCampId(String campId) {
		this.campId = campId;
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
