package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 游泳场馆水质数据回流接口
 *
 * @author auto create
 * @since 1.0, 2018-06-01 14:16:18
 */
public class KoubeiServindustryNatatoriumWaterqualityUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7822634248118444562L;

	/**
	 * ISV的插件ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 游泳馆当前时间人数
	 */
	@ApiField("current_num")
	private Long currentNum;

	/**
	 * 当前场馆内人数更新时间
	 */
	@ApiField("currentnum_update_time")
	private Date currentnumUpdateTime;

	/**
	 * 外部ID,水质信息在ISV的系统中的主键,方便关联数据,非必填
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 浸脚消毒池游离性余氯是否合格,枚举(unqualified=不合格,qualified=合格)
ISV通过浸脚消毒池游离性余氯和浸脚消毒池游离性余氯标准算出
	 */
	@ApiField("footpool_cl_qualified")
	private String footpoolClQualified;

	/**
	 * 浸脚消毒池游离性余氯,(单位:mg/L)
精确到小数点后两位,取值大于等于0
	 */
	@ApiField("footpool_cl_remain")
	private String footpoolClRemain;

	/**
	 * 浸脚消毒池游离性余氯标准,方括号标识闭区间,圆括号表示开区间,第一个数字表示下限,第二个数字表示上限,数字精确到小数点后两位,数字取值大于等于0,且下限小于等于上限
	 */
	@ApiField("footpool_cl_remain_standard")
	private String footpoolClRemainStandard;

	/**
	 * 游泳馆可容纳最大人数，为正整数
	 */
	@ApiField("limit_num")
	private Long limitNum;

	/**
	 * 泳池游离性余氯是否合格,枚举(unqualified=不合格,qualified=合格)
ISV通过泳池游离性余氯和泳池游离性余氯标准算出
	 */
	@ApiField("mainpool_cl_qualified")
	private String mainpoolClQualified;

	/**
	 * 泳池游离性余氯,(单位:mg/L)
精确到小数点后两位,取值大于等于0
	 */
	@ApiField("mainpool_cl_remain")
	private String mainpoolClRemain;

	/**
	 * 泳池游离性余氯标准,方括号标识闭区间,圆括号表示开区间,第一个数字表示下限,第二个数字表示上限,数字精确到小数点后两位,数字取值大于等于0,且下限小于等于上限
	 */
	@ApiField("mainpool_cl_remain_standard")
	private String mainpoolClRemainStandard;

	/**
	 * 游泳池容积(单位:吨), 精确到小数点后两位,大于0
	 */
	@ApiField("pool_volume")
	private String poolVolume;

	/**
	 * 游泳池水质数据备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 请求ID,唯一的请求ID,用于幂等控制
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 口碑店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 游泳池换水量(单位:吨), 精确到小数点后两位,大于0
	 */
	@ApiField("water_change")
	private String waterChange;

	/**
	 * 7日平均换水率(单位:%), 精确到小数点后两位,取值大于等于0,小于等于100
	 */
	@ApiField("water_change_percent")
	private String waterChangePercent;

	/**
	 * 7日平均换水率是否合格,枚举(unqualified=不合格,qualified=合格)
ISV根据7天换水率和7天换水率标准计算得出
	 */
	@ApiField("water_change_qualified")
	private String waterChangeQualified;

	/**
	 * 7日平均换水率标准,方括号表示闭区间,圆括号表示开区间,第一个数字表示下限,第二个数字表示上限,两个数字用英文逗号分隔,数字精确到小数点后两位,取值大于等于0小于等于100,且下限小于等于上限
	 */
	@ApiField("water_change_standard")
	private String waterChangeStandard;

	/**
	 * 水质监测时间
	 */
	@ApiField("water_check_time")
	private Date waterCheckTime;

	/**
	 * 游泳池水的PH值,精确到小数点后两位
	 */
	@ApiField("water_ph")
	private String waterPh;

	/**
	 * 游泳池水PH值是否合格,枚举(unqualified=不合格,qualified=合格)
ISV通过游泳池水PH值和PH值标准算出
	 */
	@ApiField("water_ph_qualified")
	private String waterPhQualified;

	/**
	 * 游泳池水PH值标准,方括号表示闭区间,圆括号表示开区间,第一个数字表示下限,第二个数字表示上限,数字精确到小数点后两位,且下限小于等于上限
	 */
	@ApiField("water_ph_standard")
	private String waterPhStandard;

	/**
	 * 水质是否合格,枚举(unqualified=不合格,qualified=合格)
ISV通过所有水质标准计算得出，全部合格才能合格
	 */
	@ApiField("water_qualified")
	private String waterQualified;

	/**
	 * 当前水温(单位:℃),精确到小数点后两位
	 */
	@ApiField("water_temperature")
	private String waterTemperature;

	/**
	 * 水温是否合格,枚举(unqualified=不合格,qualified=合格)
ISV根据当前水温和水温标准计算得出
	 */
	@ApiField("water_temperature_qualified")
	private String waterTemperatureQualified;

	/**
	 * 水温标准,方括号标识闭区间,圆括号表示开区间,第一个数字表示下限,第二个数字表示下限,数字精确到小数点后两位,且下限小于等于上限,单位:℃
	 */
	@ApiField("water_temperature_standard")
	private String waterTemperatureStandard;

	/**
	 * 水质更新时间,会根据这个时间给游泳馆店铺打标
	 */
	@ApiField("water_update_time")
	private Date waterUpdateTime;

    /**
     * Gets commodity id.
     *
     * @return the commodity id
     */
    public String getCommodityId() {
		return this.commodityId;
	}

    /**
     * Sets commodity id.
     *
     * @param commodityId the commodity id
     */
    public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

    /**
     * Gets current num.
     *
     * @return the current num
     */
    public Long getCurrentNum() {
		return this.currentNum;
	}

    /**
     * Sets current num.
     *
     * @param currentNum the current num
     */
    public void setCurrentNum(Long currentNum) {
		this.currentNum = currentNum;
	}

    /**
     * Gets currentnum update time.
     *
     * @return the currentnum update time
     */
    public Date getCurrentnumUpdateTime() {
		return this.currentnumUpdateTime;
	}

    /**
     * Sets currentnum update time.
     *
     * @param currentnumUpdateTime the currentnum update time
     */
    public void setCurrentnumUpdateTime(Date currentnumUpdateTime) {
		this.currentnumUpdateTime = currentnumUpdateTime;
	}

    /**
     * Gets external id.
     *
     * @return the external id
     */
    public String getExternalId() {
		return this.externalId;
	}

    /**
     * Sets external id.
     *
     * @param externalId the external id
     */
    public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

    /**
     * Gets footpool cl qualified.
     *
     * @return the footpool cl qualified
     */
    public String getFootpoolClQualified() {
		return this.footpoolClQualified;
	}

    /**
     * Sets footpool cl qualified.
     *
     * @param footpoolClQualified the footpool cl qualified
     */
    public void setFootpoolClQualified(String footpoolClQualified) {
		this.footpoolClQualified = footpoolClQualified;
	}

    /**
     * Gets footpool cl remain.
     *
     * @return the footpool cl remain
     */
    public String getFootpoolClRemain() {
		return this.footpoolClRemain;
	}

    /**
     * Sets footpool cl remain.
     *
     * @param footpoolClRemain the footpool cl remain
     */
    public void setFootpoolClRemain(String footpoolClRemain) {
		this.footpoolClRemain = footpoolClRemain;
	}

    /**
     * Gets footpool cl remain standard.
     *
     * @return the footpool cl remain standard
     */
    public String getFootpoolClRemainStandard() {
		return this.footpoolClRemainStandard;
	}

    /**
     * Sets footpool cl remain standard.
     *
     * @param footpoolClRemainStandard the footpool cl remain standard
     */
    public void setFootpoolClRemainStandard(String footpoolClRemainStandard) {
		this.footpoolClRemainStandard = footpoolClRemainStandard;
	}

    /**
     * Gets limit num.
     *
     * @return the limit num
     */
    public Long getLimitNum() {
		return this.limitNum;
	}

    /**
     * Sets limit num.
     *
     * @param limitNum the limit num
     */
    public void setLimitNum(Long limitNum) {
		this.limitNum = limitNum;
	}

    /**
     * Gets mainpool cl qualified.
     *
     * @return the mainpool cl qualified
     */
    public String getMainpoolClQualified() {
		return this.mainpoolClQualified;
	}

    /**
     * Sets mainpool cl qualified.
     *
     * @param mainpoolClQualified the mainpool cl qualified
     */
    public void setMainpoolClQualified(String mainpoolClQualified) {
		this.mainpoolClQualified = mainpoolClQualified;
	}

    /**
     * Gets mainpool cl remain.
     *
     * @return the mainpool cl remain
     */
    public String getMainpoolClRemain() {
		return this.mainpoolClRemain;
	}

    /**
     * Sets mainpool cl remain.
     *
     * @param mainpoolClRemain the mainpool cl remain
     */
    public void setMainpoolClRemain(String mainpoolClRemain) {
		this.mainpoolClRemain = mainpoolClRemain;
	}

    /**
     * Gets mainpool cl remain standard.
     *
     * @return the mainpool cl remain standard
     */
    public String getMainpoolClRemainStandard() {
		return this.mainpoolClRemainStandard;
	}

    /**
     * Sets mainpool cl remain standard.
     *
     * @param mainpoolClRemainStandard the mainpool cl remain standard
     */
    public void setMainpoolClRemainStandard(String mainpoolClRemainStandard) {
		this.mainpoolClRemainStandard = mainpoolClRemainStandard;
	}

    /**
     * Gets pool volume.
     *
     * @return the pool volume
     */
    public String getPoolVolume() {
		return this.poolVolume;
	}

    /**
     * Sets pool volume.
     *
     * @param poolVolume the pool volume
     */
    public void setPoolVolume(String poolVolume) {
		this.poolVolume = poolVolume;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets water change.
     *
     * @return the water change
     */
    public String getWaterChange() {
		return this.waterChange;
	}

    /**
     * Sets water change.
     *
     * @param waterChange the water change
     */
    public void setWaterChange(String waterChange) {
		this.waterChange = waterChange;
	}

    /**
     * Gets water change percent.
     *
     * @return the water change percent
     */
    public String getWaterChangePercent() {
		return this.waterChangePercent;
	}

    /**
     * Sets water change percent.
     *
     * @param waterChangePercent the water change percent
     */
    public void setWaterChangePercent(String waterChangePercent) {
		this.waterChangePercent = waterChangePercent;
	}

    /**
     * Gets water change qualified.
     *
     * @return the water change qualified
     */
    public String getWaterChangeQualified() {
		return this.waterChangeQualified;
	}

    /**
     * Sets water change qualified.
     *
     * @param waterChangeQualified the water change qualified
     */
    public void setWaterChangeQualified(String waterChangeQualified) {
		this.waterChangeQualified = waterChangeQualified;
	}

    /**
     * Gets water change standard.
     *
     * @return the water change standard
     */
    public String getWaterChangeStandard() {
		return this.waterChangeStandard;
	}

    /**
     * Sets water change standard.
     *
     * @param waterChangeStandard the water change standard
     */
    public void setWaterChangeStandard(String waterChangeStandard) {
		this.waterChangeStandard = waterChangeStandard;
	}

    /**
     * Gets water check time.
     *
     * @return the water check time
     */
    public Date getWaterCheckTime() {
		return this.waterCheckTime;
	}

    /**
     * Sets water check time.
     *
     * @param waterCheckTime the water check time
     */
    public void setWaterCheckTime(Date waterCheckTime) {
		this.waterCheckTime = waterCheckTime;
	}

    /**
     * Gets water ph.
     *
     * @return the water ph
     */
    public String getWaterPh() {
		return this.waterPh;
	}

    /**
     * Sets water ph.
     *
     * @param waterPh the water ph
     */
    public void setWaterPh(String waterPh) {
		this.waterPh = waterPh;
	}

    /**
     * Gets water ph qualified.
     *
     * @return the water ph qualified
     */
    public String getWaterPhQualified() {
		return this.waterPhQualified;
	}

    /**
     * Sets water ph qualified.
     *
     * @param waterPhQualified the water ph qualified
     */
    public void setWaterPhQualified(String waterPhQualified) {
		this.waterPhQualified = waterPhQualified;
	}

    /**
     * Gets water ph standard.
     *
     * @return the water ph standard
     */
    public String getWaterPhStandard() {
		return this.waterPhStandard;
	}

    /**
     * Sets water ph standard.
     *
     * @param waterPhStandard the water ph standard
     */
    public void setWaterPhStandard(String waterPhStandard) {
		this.waterPhStandard = waterPhStandard;
	}

    /**
     * Gets water qualified.
     *
     * @return the water qualified
     */
    public String getWaterQualified() {
		return this.waterQualified;
	}

    /**
     * Sets water qualified.
     *
     * @param waterQualified the water qualified
     */
    public void setWaterQualified(String waterQualified) {
		this.waterQualified = waterQualified;
	}

    /**
     * Gets water temperature.
     *
     * @return the water temperature
     */
    public String getWaterTemperature() {
		return this.waterTemperature;
	}

    /**
     * Sets water temperature.
     *
     * @param waterTemperature the water temperature
     */
    public void setWaterTemperature(String waterTemperature) {
		this.waterTemperature = waterTemperature;
	}

    /**
     * Gets water temperature qualified.
     *
     * @return the water temperature qualified
     */
    public String getWaterTemperatureQualified() {
		return this.waterTemperatureQualified;
	}

    /**
     * Sets water temperature qualified.
     *
     * @param waterTemperatureQualified the water temperature qualified
     */
    public void setWaterTemperatureQualified(String waterTemperatureQualified) {
		this.waterTemperatureQualified = waterTemperatureQualified;
	}

    /**
     * Gets water temperature standard.
     *
     * @return the water temperature standard
     */
    public String getWaterTemperatureStandard() {
		return this.waterTemperatureStandard;
	}

    /**
     * Sets water temperature standard.
     *
     * @param waterTemperatureStandard the water temperature standard
     */
    public void setWaterTemperatureStandard(String waterTemperatureStandard) {
		this.waterTemperatureStandard = waterTemperatureStandard;
	}

    /**
     * Gets water update time.
     *
     * @return the water update time
     */
    public Date getWaterUpdateTime() {
		return this.waterUpdateTime;
	}

    /**
     * Sets water update time.
     *
     * @param waterUpdateTime the water update time
     */
    public void setWaterUpdateTime(Date waterUpdateTime) {
		this.waterUpdateTime = waterUpdateTime;
	}

}
