package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜谱模型
 *
 * @author auto create
 * @since 1.0, 2018-09-14 14:32:11
 */
public class KbdishCookInfo extends AlipayObject {

	private static final long serialVersionUID = 4384325522911489869L;

	/**
	 * 区域
	 */
	@ApiField("area")
	private String area;

	/**
	 * 渠道    eatin堂食，takeout外卖,paipai 扫码,kbb2c 口碑点餐
	 */
	@ApiField("cook_channel")
	private String cookChannel;

	/**
	 * 扩展字典,json串
	 */
	@ApiField("cook_ext_content")
	private String cookExtContent;

	/**
	 * 菜谱id
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜谱名称
	 */
	@ApiField("cook_name")
	private String cookName;

	/**
	 * 版本号
	 */
	@ApiField("cook_version")
	private String cookVersion;

	/**
	 * 操作员
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 时间区间日期结束
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 时间区间截止 闭区间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 数据的创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 数据的修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 口碑菜谱明细
	 */
	@ApiListField("kb_cook_detail_list")
	@ApiField("kbdish_cook_detail_info")
	private List<KbdishCookDetailInfo> kbCookDetailList;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 时间约束类型 forever:永久;  week:按周，每周周几 month:按月,每月几号.
如果操作的是菜谱，非空必传。如果是操作门店或者挂明细，可为空
	 */
	@ApiField("period_type")
	private String periodType;

	/**
	 * 时间控制值,如果选的week, 值 1,2,3,4 ; 如果选择month 1,11,31 ; 如果选择永久，为空
	 */
	@ApiField("period_value")
	private String periodValue;

	/**
	 * 菜谱描述
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * 门店列表
	 */
	@ApiListField("shop_list")
	@ApiField("string")
	private List<String> shopList;

	/**
	 * yazuo,meituan,ele获取，新增的时候必输。
	 */
	@ApiField("source_from")
	private String sourceFrom;

	/**
	 * 控制的日期区间开始
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 时间控制 到分  闭区间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	/**
	 * 操作员
	 */
	@ApiField("update_user")
	private String updateUser;

    /**
     * Gets area.
     *
     * @return the area
     */
    public String getArea() {
		return this.area;
	}

    /**
     * Sets area.
     *
     * @param area the area
     */
    public void setArea(String area) {
		this.area = area;
	}

    /**
     * Gets cook channel.
     *
     * @return the cook channel
     */
    public String getCookChannel() {
		return this.cookChannel;
	}

    /**
     * Sets cook channel.
     *
     * @param cookChannel the cook channel
     */
    public void setCookChannel(String cookChannel) {
		this.cookChannel = cookChannel;
	}

    /**
     * Gets cook ext content.
     *
     * @return the cook ext content
     */
    public String getCookExtContent() {
		return this.cookExtContent;
	}

    /**
     * Sets cook ext content.
     *
     * @param cookExtContent the cook ext content
     */
    public void setCookExtContent(String cookExtContent) {
		this.cookExtContent = cookExtContent;
	}

    /**
     * Gets cook id.
     *
     * @return the cook id
     */
    public String getCookId() {
		return this.cookId;
	}

    /**
     * Sets cook id.
     *
     * @param cookId the cook id
     */
    public void setCookId(String cookId) {
		this.cookId = cookId;
	}

    /**
     * Gets cook name.
     *
     * @return the cook name
     */
    public String getCookName() {
		return this.cookName;
	}

    /**
     * Sets cook name.
     *
     * @param cookName the cook name
     */
    public void setCookName(String cookName) {
		this.cookName = cookName;
	}

    /**
     * Gets cook version.
     *
     * @return the cook version
     */
    public String getCookVersion() {
		return this.cookVersion;
	}

    /**
     * Sets cook version.
     *
     * @param cookVersion the cook version
     */
    public void setCookVersion(String cookVersion) {
		this.cookVersion = cookVersion;
	}

    /**
     * Gets create user.
     *
     * @return the create user
     */
    public String getCreateUser() {
		return this.createUser;
	}

    /**
     * Sets create user.
     *
     * @param createUser the create user
     */
    public void setCreateUser(String createUser) {
		this.createUser = createUser;
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
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public String getGmtCreate() {
		return this.gmtCreate;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public String getGmtModified() {
		return this.gmtModified;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

    /**
     * Gets kb cook detail list.
     *
     * @return the kb cook detail list
     */
    public List<KbdishCookDetailInfo> getKbCookDetailList() {
		return this.kbCookDetailList;
	}

    /**
     * Sets kb cook detail list.
     *
     * @param kbCookDetailList the kb cook detail list
     */
    public void setKbCookDetailList(List<KbdishCookDetailInfo> kbCookDetailList) {
		this.kbCookDetailList = kbCookDetailList;
	}

    /**
     * Gets merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId() {
		return this.merchantId;
	}

    /**
     * Sets merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

    /**
     * Gets period type.
     *
     * @return the period type
     */
    public String getPeriodType() {
		return this.periodType;
	}

    /**
     * Sets period type.
     *
     * @param periodType the period type
     */
    public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

    /**
     * Gets period value.
     *
     * @return the period value
     */
    public String getPeriodValue() {
		return this.periodValue;
	}

    /**
     * Sets period value.
     *
     * @param periodValue the period value
     */
    public void setPeriodValue(String periodValue) {
		this.periodValue = periodValue;
	}

    /**
     * Gets remarks.
     *
     * @return the remarks
     */
    public String getRemarks() {
		return this.remarks;
	}

    /**
     * Sets remarks.
     *
     * @param remarks the remarks
     */
    public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

    /**
     * Gets shop list.
     *
     * @return the shop list
     */
    public List<String> getShopList() {
		return this.shopList;
	}

    /**
     * Sets shop list.
     *
     * @param shopList the shop list
     */
    public void setShopList(List<String> shopList) {
		this.shopList = shopList;
	}

    /**
     * Gets source from.
     *
     * @return the source from
     */
    public String getSourceFrom() {
		return this.sourceFrom;
	}

    /**
     * Sets source from.
     *
     * @param sourceFrom the source from
     */
    public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public String getStartDate() {
		return this.startDate;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public String getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets update user.
     *
     * @return the update user
     */
    public String getUpdateUser() {
		return this.updateUser;
	}

    /**
     * Sets update user.
     *
     * @param updateUser the update user
     */
    public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
