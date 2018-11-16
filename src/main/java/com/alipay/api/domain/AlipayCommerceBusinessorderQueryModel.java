package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业务记录查询接口
 *
 * @author auto create
 * @since 1.0, 2018-06-01 16:06:49
 */
public class AlipayCommerceBusinessorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8617524746737668172L;

	/**
	 * 查询办事记录的时间区间中的开始时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 查询办事记录的时间区间中的结束时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * isv的appid
	 */
	@ApiField("isv_appid")
	private String isvAppid;

	/**
	 * 分页查询的起始页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页查询的每页数据量
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 查询的办事记录所属服务展台（如城市服务为CITY_SERVICE，车主平台为MYCAR_SERVICE等）
	 */
	@ApiField("platform_type")
	private String platformType;

	/**
	 * 办事记录状态列表
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	/**
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets begin time.
     *
     * @return the begin time
     */
    public String getBeginTime() {
		return this.beginTime;
	}

    /**
     * Sets begin time.
     *
     * @param beginTime the begin time
     */
    public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public String getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets isv appid.
     *
     * @return the isv appid
     */
    public String getIsvAppid() {
		return this.isvAppid;
	}

    /**
     * Sets isv appid.
     *
     * @param isvAppid the isv appid
     */
    public void setIsvAppid(String isvAppid) {
		this.isvAppid = isvAppid;
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

    /**
     * Gets platform type.
     *
     * @return the platform type
     */
    public String getPlatformType() {
		return this.platformType;
	}

    /**
     * Sets platform type.
     *
     * @param platformType the platform type
     */
    public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

    /**
     * Gets status list.
     *
     * @return the status list
     */
    public List<String> getStatusList() {
		return this.statusList;
	}

    /**
     * Sets status list.
     *
     * @param statusList the status list
     */
    public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
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
