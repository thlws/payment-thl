package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 集中式房源同步
 *
 * @author auto create
 * @since 1.0, 2018-06-20 10:37:58
 */
public class AlipayEcoRenthouseRoomConcentrationSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7789841921373471119L;

	/**
	 * 阿里短号
	 */
	@ApiField("ali_short_num")
	private String aliShortNum;

	/**
	 * 总计房间数量
	 */
	@ApiField("all_room_num")
	private Long allRoomNum;

	/**
	 * 户型-房
数值范围：1-26
	 */
	@ApiField("bedroom_count")
	private Long bedroomCount;

	/**
	 * 可租房间数量，为0时该房型不在前端展示。此字段不为空时，rent_status字段失效
	 */
	@ApiField("can_rent_num")
	private Long canRentNum;

	/**
	 * 可入住时间YYYY-MM-DD。大于今日，且小于等于185天
	 */
	@ApiField("checkin_time")
	private Date checkinTime;

	/**
	 * 小区同步请求号
	 */
	@ApiField("comm_req_id")
	private String commReqId;

	/**
	 * 佣金
	 */
	@ApiField("commission")
	private String commission;

	/**
	 * 佣金类型（p：百分比，m：金额）
	 */
	@ApiField("commission_type")
	private String commissionType;

	/**
	 * 小区Code和小区请求号必输入其一
小区Code，详见文档
http://ecopublic.oss-cn-hangzhou.aliyuncs.com/eco/tpmogo/CommunityInfos/CommunityInfos.xls
	 */
	@ApiField("community_code")
	private String communityCode;

	/**
	 * 费用说明
	 */
	@ApiField("fee_remark")
	private String feeRemark;

	/**
	 * 所在楼层
	 */
	@ApiField("floor_count")
	private Long floorCount;

	/**
	 * 押金	
数值范围：0-￥420000.00
	 */
	@ApiField("foregift_amount")
	private String foregiftAmount;

	/**
	 * 免押金开始时间 YYYY-MM-dd
	 */
	@ApiField("free_begin_date")
	private Date freeBeginDate;

	/**
	 * 免押金结束时间 YYYY-MM-dd
	 */
	@ApiField("free_end_date")
	private Date freeEndDate;

	/**
	 * 通过"文件上传"接口返回的房源图片url路径。房间照片可录入0~10张,目前仅支持jpg、png、jpeg格式
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 房源描述
字符串，最大字符长度400
	 */
	@ApiField("intro")
	private String intro;

	/**
	 * 集中式最高价格，支持小数点后面2位。
新增时必输字段，修改时如果不转值则以上次接口调用值为准。
	 */
	@ApiField("max_amount")
	private String maxAmount;

	/**
	 * 集中式房源最大押金
	 */
	@ApiField("max_deposit_amount")
	private String maxDepositAmount;

	/**
	 * 可签约至YYYY-MM-DD
	 */
	@ApiField("max_lease_time")
	private String maxLeaseTime;

	/**
	 * 多少天起可租
	 */
	@ApiField("min_rent_days")
	private Long minRentDays;

	/**
	 * 公寓别名
是否必须:（新增）是/（修改）否
	 */
	@ApiField("nickname")
	private String nickname;

	/**
	 * 其它费用
	 */
	@ApiListField("other_amount")
	@ApiField("eco_renthouse_other_amount")
	private List<EcoRenthouseOtherAmount> otherAmount;

	/**
	 * 管家姓名
	 */
	@ApiField("owners_name")
	private String ownersName;

	/**
	 * 管家电话
手机号码，必须为400开头
	 */
	@ApiField("owners_tel")
	private String ownersTel;

	/**
	 * 户型-厅
数值范围：0-10
	 */
	@ApiField("parlor_count")
	private Long parlorCount;

	/**
	 * 付款方式（1：付一，2：付二）
	 */
	@ApiField("pay_type")
	private Long payType;

	/**
	 * 付款方式列表，包括上述单独传递的付款方式。如果2种都传递，默认覆盖单独传递的付款方式。
	 */
	@ApiListField("pay_type_list")
	@ApiField("eco_cen_renthousepay_type_list")
	private List<EcoCenRenthousepayTypeList> payTypeList;

	/**
	 * 出租状态	
数值范围：1未租、2已租
	 */
	@ApiField("rent_status")
	private Long rentStatus;

	/**
	 * 出租类型	1：整租，2：合租
	 */
	@ApiField("rent_type")
	private Long rentType;

	/**
	 * 租金	
数值范围：￥100.00 - ￥35000.00 ，支持小数点后面2位
	 */
	@ApiField("room_amount")
	private String roomAmount;

	/**
	 * 房间面积
数值范围：5.00㎡-300.00㎡，支持小数点后面2位
	 */
	@ApiField("room_area")
	private String roomArea;

	/**
	 * KA内部存储的房源编号
	 */
	@ApiField("room_code")
	private String roomCode;

	/**
	 * 物品配置(房间)
2:空调;3:热水器;4:洗衣机;5:冰箱;6:电视;7:微波炉;8:燃气灶;9:抽油烟机;10:电磁炉;11:床;11:WIFI;12:书桌;13:衣柜;14:沙发;15:阳台;
	 */
	@ApiListField("room_configs")
	@ApiField("string")
	private List<String> roomConfigs;

	/**
	 * 集中式房间列表
	 */
	@ApiListField("room_info_list")
	@ApiField("eco_renthouse_room_info_list")
	private List<EcoRenthouseRoomInfoList> roomInfoList;

	/**
	 * 房间最大面积
	 */
	@ApiField("room_max_area")
	private String roomMaxArea;

	/**
	 * 房源初始上下架状态
上架状态租房平台会展示该房间信息，下架状态反之
	 */
	@ApiField("room_status")
	private Long roomStatus;

	/**
	 * 房源对应的店铺编号
	 */
	@ApiField("room_store_no")
	private String roomStoreNo;

	/**
	 * 户型-卫
数值范围：0-10
	 */
	@ApiField("toilet_count")
	private Long toiletCount;

	/**
	 * 房屋总楼层
	 */
	@ApiField("total_floor_count")
	private Long totalFloorCount;

    /**
     * Gets ali short num.
     *
     * @return the ali short num
     */
    public String getAliShortNum() {
		return this.aliShortNum;
	}

    /**
     * Sets ali short num.
     *
     * @param aliShortNum the ali short num
     */
    public void setAliShortNum(String aliShortNum) {
		this.aliShortNum = aliShortNum;
	}

    /**
     * Gets all room num.
     *
     * @return the all room num
     */
    public Long getAllRoomNum() {
		return this.allRoomNum;
	}

    /**
     * Sets all room num.
     *
     * @param allRoomNum the all room num
     */
    public void setAllRoomNum(Long allRoomNum) {
		this.allRoomNum = allRoomNum;
	}

    /**
     * Gets bedroom count.
     *
     * @return the bedroom count
     */
    public Long getBedroomCount() {
		return this.bedroomCount;
	}

    /**
     * Sets bedroom count.
     *
     * @param bedroomCount the bedroom count
     */
    public void setBedroomCount(Long bedroomCount) {
		this.bedroomCount = bedroomCount;
	}

    /**
     * Gets can rent num.
     *
     * @return the can rent num
     */
    public Long getCanRentNum() {
		return this.canRentNum;
	}

    /**
     * Sets can rent num.
     *
     * @param canRentNum the can rent num
     */
    public void setCanRentNum(Long canRentNum) {
		this.canRentNum = canRentNum;
	}

    /**
     * Gets checkin time.
     *
     * @return the checkin time
     */
    public Date getCheckinTime() {
		return this.checkinTime;
	}

    /**
     * Sets checkin time.
     *
     * @param checkinTime the checkin time
     */
    public void setCheckinTime(Date checkinTime) {
		this.checkinTime = checkinTime;
	}

    /**
     * Gets comm req id.
     *
     * @return the comm req id
     */
    public String getCommReqId() {
		return this.commReqId;
	}

    /**
     * Sets comm req id.
     *
     * @param commReqId the comm req id
     */
    public void setCommReqId(String commReqId) {
		this.commReqId = commReqId;
	}

    /**
     * Gets commission.
     *
     * @return the commission
     */
    public String getCommission() {
		return this.commission;
	}

    /**
     * Sets commission.
     *
     * @param commission the commission
     */
    public void setCommission(String commission) {
		this.commission = commission;
	}

    /**
     * Gets commission type.
     *
     * @return the commission type
     */
    public String getCommissionType() {
		return this.commissionType;
	}

    /**
     * Sets commission type.
     *
     * @param commissionType the commission type
     */
    public void setCommissionType(String commissionType) {
		this.commissionType = commissionType;
	}

    /**
     * Gets community code.
     *
     * @return the community code
     */
    public String getCommunityCode() {
		return this.communityCode;
	}

    /**
     * Sets community code.
     *
     * @param communityCode the community code
     */
    public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}

    /**
     * Gets fee remark.
     *
     * @return the fee remark
     */
    public String getFeeRemark() {
		return this.feeRemark;
	}

    /**
     * Sets fee remark.
     *
     * @param feeRemark the fee remark
     */
    public void setFeeRemark(String feeRemark) {
		this.feeRemark = feeRemark;
	}

    /**
     * Gets floor count.
     *
     * @return the floor count
     */
    public Long getFloorCount() {
		return this.floorCount;
	}

    /**
     * Sets floor count.
     *
     * @param floorCount the floor count
     */
    public void setFloorCount(Long floorCount) {
		this.floorCount = floorCount;
	}

    /**
     * Gets foregift amount.
     *
     * @return the foregift amount
     */
    public String getForegiftAmount() {
		return this.foregiftAmount;
	}

    /**
     * Sets foregift amount.
     *
     * @param foregiftAmount the foregift amount
     */
    public void setForegiftAmount(String foregiftAmount) {
		this.foregiftAmount = foregiftAmount;
	}

    /**
     * Gets free begin date.
     *
     * @return the free begin date
     */
    public Date getFreeBeginDate() {
		return this.freeBeginDate;
	}

    /**
     * Sets free begin date.
     *
     * @param freeBeginDate the free begin date
     */
    public void setFreeBeginDate(Date freeBeginDate) {
		this.freeBeginDate = freeBeginDate;
	}

    /**
     * Gets free end date.
     *
     * @return the free end date
     */
    public Date getFreeEndDate() {
		return this.freeEndDate;
	}

    /**
     * Sets free end date.
     *
     * @param freeEndDate the free end date
     */
    public void setFreeEndDate(Date freeEndDate) {
		this.freeEndDate = freeEndDate;
	}

    /**
     * Gets images.
     *
     * @return the images
     */
    public List<String> getImages() {
		return this.images;
	}

    /**
     * Sets images.
     *
     * @param images the images
     */
    public void setImages(List<String> images) {
		this.images = images;
	}

    /**
     * Gets intro.
     *
     * @return the intro
     */
    public String getIntro() {
		return this.intro;
	}

    /**
     * Sets intro.
     *
     * @param intro the intro
     */
    public void setIntro(String intro) {
		this.intro = intro;
	}

    /**
     * Gets max amount.
     *
     * @return the max amount
     */
    public String getMaxAmount() {
		return this.maxAmount;
	}

    /**
     * Sets max amount.
     *
     * @param maxAmount the max amount
     */
    public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}

    /**
     * Gets max deposit amount.
     *
     * @return the max deposit amount
     */
    public String getMaxDepositAmount() {
		return this.maxDepositAmount;
	}

    /**
     * Sets max deposit amount.
     *
     * @param maxDepositAmount the max deposit amount
     */
    public void setMaxDepositAmount(String maxDepositAmount) {
		this.maxDepositAmount = maxDepositAmount;
	}

    /**
     * Gets max lease time.
     *
     * @return the max lease time
     */
    public String getMaxLeaseTime() {
		return this.maxLeaseTime;
	}

    /**
     * Sets max lease time.
     *
     * @param maxLeaseTime the max lease time
     */
    public void setMaxLeaseTime(String maxLeaseTime) {
		this.maxLeaseTime = maxLeaseTime;
	}

    /**
     * Gets min rent days.
     *
     * @return the min rent days
     */
    public Long getMinRentDays() {
		return this.minRentDays;
	}

    /**
     * Sets min rent days.
     *
     * @param minRentDays the min rent days
     */
    public void setMinRentDays(Long minRentDays) {
		this.minRentDays = minRentDays;
	}

    /**
     * Gets nickname.
     *
     * @return the nickname
     */
    public String getNickname() {
		return this.nickname;
	}

    /**
     * Sets nickname.
     *
     * @param nickname the nickname
     */
    public void setNickname(String nickname) {
		this.nickname = nickname;
	}

    /**
     * Gets other amount.
     *
     * @return the other amount
     */
    public List<EcoRenthouseOtherAmount> getOtherAmount() {
		return this.otherAmount;
	}

    /**
     * Sets other amount.
     *
     * @param otherAmount the other amount
     */
    public void setOtherAmount(List<EcoRenthouseOtherAmount> otherAmount) {
		this.otherAmount = otherAmount;
	}

    /**
     * Gets owners name.
     *
     * @return the owners name
     */
    public String getOwnersName() {
		return this.ownersName;
	}

    /**
     * Sets owners name.
     *
     * @param ownersName the owners name
     */
    public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}

    /**
     * Gets owners tel.
     *
     * @return the owners tel
     */
    public String getOwnersTel() {
		return this.ownersTel;
	}

    /**
     * Sets owners tel.
     *
     * @param ownersTel the owners tel
     */
    public void setOwnersTel(String ownersTel) {
		this.ownersTel = ownersTel;
	}

    /**
     * Gets parlor count.
     *
     * @return the parlor count
     */
    public Long getParlorCount() {
		return this.parlorCount;
	}

    /**
     * Sets parlor count.
     *
     * @param parlorCount the parlor count
     */
    public void setParlorCount(Long parlorCount) {
		this.parlorCount = parlorCount;
	}

    /**
     * Gets pay type.
     *
     * @return the pay type
     */
    public Long getPayType() {
		return this.payType;
	}

    /**
     * Sets pay type.
     *
     * @param payType the pay type
     */
    public void setPayType(Long payType) {
		this.payType = payType;
	}

    /**
     * Gets pay type list.
     *
     * @return the pay type list
     */
    public List<EcoCenRenthousepayTypeList> getPayTypeList() {
		return this.payTypeList;
	}

    /**
     * Sets pay type list.
     *
     * @param payTypeList the pay type list
     */
    public void setPayTypeList(List<EcoCenRenthousepayTypeList> payTypeList) {
		this.payTypeList = payTypeList;
	}

    /**
     * Gets rent status.
     *
     * @return the rent status
     */
    public Long getRentStatus() {
		return this.rentStatus;
	}

    /**
     * Sets rent status.
     *
     * @param rentStatus the rent status
     */
    public void setRentStatus(Long rentStatus) {
		this.rentStatus = rentStatus;
	}

    /**
     * Gets rent type.
     *
     * @return the rent type
     */
    public Long getRentType() {
		return this.rentType;
	}

    /**
     * Sets rent type.
     *
     * @param rentType the rent type
     */
    public void setRentType(Long rentType) {
		this.rentType = rentType;
	}

    /**
     * Gets room amount.
     *
     * @return the room amount
     */
    public String getRoomAmount() {
		return this.roomAmount;
	}

    /**
     * Sets room amount.
     *
     * @param roomAmount the room amount
     */
    public void setRoomAmount(String roomAmount) {
		this.roomAmount = roomAmount;
	}

    /**
     * Gets room area.
     *
     * @return the room area
     */
    public String getRoomArea() {
		return this.roomArea;
	}

    /**
     * Sets room area.
     *
     * @param roomArea the room area
     */
    public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

    /**
     * Gets room code.
     *
     * @return the room code
     */
    public String getRoomCode() {
		return this.roomCode;
	}

    /**
     * Sets room code.
     *
     * @param roomCode the room code
     */
    public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

    /**
     * Gets room configs.
     *
     * @return the room configs
     */
    public List<String> getRoomConfigs() {
		return this.roomConfigs;
	}

    /**
     * Sets room configs.
     *
     * @param roomConfigs the room configs
     */
    public void setRoomConfigs(List<String> roomConfigs) {
		this.roomConfigs = roomConfigs;
	}

    /**
     * Gets room info list.
     *
     * @return the room info list
     */
    public List<EcoRenthouseRoomInfoList> getRoomInfoList() {
		return this.roomInfoList;
	}

    /**
     * Sets room info list.
     *
     * @param roomInfoList the room info list
     */
    public void setRoomInfoList(List<EcoRenthouseRoomInfoList> roomInfoList) {
		this.roomInfoList = roomInfoList;
	}

    /**
     * Gets room max area.
     *
     * @return the room max area
     */
    public String getRoomMaxArea() {
		return this.roomMaxArea;
	}

    /**
     * Sets room max area.
     *
     * @param roomMaxArea the room max area
     */
    public void setRoomMaxArea(String roomMaxArea) {
		this.roomMaxArea = roomMaxArea;
	}

    /**
     * Gets room status.
     *
     * @return the room status
     */
    public Long getRoomStatus() {
		return this.roomStatus;
	}

    /**
     * Sets room status.
     *
     * @param roomStatus the room status
     */
    public void setRoomStatus(Long roomStatus) {
		this.roomStatus = roomStatus;
	}

    /**
     * Gets room store no.
     *
     * @return the room store no
     */
    public String getRoomStoreNo() {
		return this.roomStoreNo;
	}

    /**
     * Sets room store no.
     *
     * @param roomStoreNo the room store no
     */
    public void setRoomStoreNo(String roomStoreNo) {
		this.roomStoreNo = roomStoreNo;
	}

    /**
     * Gets toilet count.
     *
     * @return the toilet count
     */
    public Long getToiletCount() {
		return this.toiletCount;
	}

    /**
     * Sets toilet count.
     *
     * @param toiletCount the toilet count
     */
    public void setToiletCount(Long toiletCount) {
		this.toiletCount = toiletCount;
	}

    /**
     * Gets total floor count.
     *
     * @return the total floor count
     */
    public Long getTotalFloorCount() {
		return this.totalFloorCount;
	}

    /**
     * Sets total floor count.
     *
     * @param totalFloorCount the total floor count
     */
    public void setTotalFloorCount(Long totalFloorCount) {
		this.totalFloorCount = totalFloorCount;
	}

}
