package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户根据需要调用该接口查询小区房屋信息列表。
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:17:57
 */
public class AlipayEcoCplifeRoominfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5788175728488393893L;

	/**
	 * 传入该小区在支付宝社区物业平台中的唯一编号，通过小区创建和查询接口获取。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 分页查询的页码数，分页从1开始计数。该参数不传入的时候，默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询的每页最大数据条数。默认为200
	 */
	@ApiField("page_size")
	private Long pageSize;

    /**
     * Gets community id.
     *
     * @return the community id
     */
    public String getCommunityId() {
		return this.communityId;
	}

    /**
     * Sets community id.
     *
     * @param communityId the community id
     */
    public void setCommunityId(String communityId) {
		this.communityId = communityId;
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
