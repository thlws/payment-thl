package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付包卡包列表数据
 *
 * @author auto create
 * @since 1.0, 2018-01-02 10:51:31
 */
public class AlipayUserPassGrouplistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2543182692318742479L;

	/**
	 * 城市编码，国标码，如果need_shopinfo=true，必须传值
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 卡券分组标识，当前值：card（卡）、voucher（券）、ticket（票）、cert（证件）
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 是否需要店铺信息，true表需要，false或空表不需要
	 */
	@ApiField("need_shopinfo")
	private Boolean needShopinfo;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * pass有效状态: CURRENT：当前的, PAST：失效的
	 */
	@ApiField("time_status")
	private String timeStatus;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

    /**
     * Gets group type.
     *
     * @return the group type
     */
    public String getGroupType() {
		return this.groupType;
	}

    /**
     * Sets group type.
     *
     * @param groupType the group type
     */
    public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

    /**
     * Gets need shopinfo.
     *
     * @return the need shopinfo
     */
    public Boolean getNeedShopinfo() {
		return this.needShopinfo;
	}

    /**
     * Sets need shopinfo.
     *
     * @param needShopinfo the need shopinfo
     */
    public void setNeedShopinfo(Boolean needShopinfo) {
		this.needShopinfo = needShopinfo;
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

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets time status.
     *
     * @return the time status
     */
    public String getTimeStatus() {
		return this.timeStatus;
	}

    /**
     * Sets time status.
     *
     * @param timeStatus the time status
     */
    public void setTimeStatus(String timeStatus) {
		this.timeStatus = timeStatus;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
