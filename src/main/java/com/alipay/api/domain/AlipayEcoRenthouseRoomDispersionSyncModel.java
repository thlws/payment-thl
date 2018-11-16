package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分散式(整租/合租)房源同步
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:48:52
 */
public class AlipayEcoRenthouseRoomDispersionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3532834516122919634L;

	/**
	 * 阿里短号
	 */
	@ApiField("ali_short_num")
	private String aliShortNum;

	/**
	 * 户型-房
数值范围：1-26
	 */
	@ApiField("bedroom_count")
	private Long bedroomCount;

	/**
	 * 可入住时间YYYY-MM-DD。大于今日，且小于等于185天
	 */
	@ApiField("checkin_time")
	private String checkinTime;

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
小区Code,详见文档
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
	 * 公寓面积	数值范围：5.00㎡-300.00㎡，支持小数点后面2位
	 */
	@ApiField("flat_area")
	private String flatArea;

	/**
	 * 门牌-栋（楼号）
	 */
	@ApiField("flat_building")
	private String flatBuilding;

	/**
	 * 分散式合租公共区域物品配置，分散式整租不用设置
1:WIFI;3:热水器;4:洗衣机;5:冰箱;6:电视;7:微波炉;8:燃气灶;9:抽油烟机;10:电磁炉;14:沙发;
	 */
	@ApiListField("flat_configs")
	@ApiField("string")
	private List<String> flatConfigs;

	/**
	 * 门牌-单元
	 */
	@ApiField("flat_unit")
	private String flatUnit;

	/**
	 * 所在楼层
	 */
	@ApiField("floor_count")
	private Long floorCount;

	/**
	 * 押金	数值范围：0-￥420000.00
	 */
	@ApiField("foregift_amount")
	private String foregiftAmount;

	/**
	 * 免押金开始时间 YYYY-MM-dd
	 */
	@ApiField("free_begin_date")
	private String freeBeginDate;

	/**
	 * 免押金结束时间 YYYY-MM-dd
	 */
	@ApiField("free_end_date")
	private String freeEndDate;

	/**
	 * 通过"文件上传"接口返回的房源图片url路径。房间照片可录入0~10张,目前仅支持jpg、png、jpeg格式
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 房源描述
	 */
	@ApiField("intro")
	private String intro;

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
	 * 管家手机号码，必须为400开头
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
	 * 付款方式-付	
1：付一，2：付二
	 */
	@ApiField("pay_type")
	private Long payType;

	/**
	 * 付款方式列表，包括上述单独传递的付款方式。如果2种都传递，默认覆盖单独传递的付款方式。
	 */
	@ApiListField("pay_type_list")
	@ApiField("eco_dis_renthousepay_type_list")
	private List<EcoDisRenthousepayTypeList> payTypeList;

	/**
	 * 出租状态	数值范围：1未租、2已租
	 */
	@ApiField("rent_status")
	private Long rentStatus;

	/**
	 * 出租类型	1：整租，2：合租
	 */
	@ApiField("rent_type")
	private Long rentType;

	/**
	 * 租金	数值范围：￥100.00 - ￥35000.00 ，支持小数点后面2位
	 */
	@ApiField("room_amount")
	private String roomAmount;

	/**
	 * 房间面积	数值范围：5.00㎡-300.00㎡，支持小数点后面2位
	 */
	@ApiField("room_area")
	private String roomArea;

	/**
	 * KA内部存储的房源编号
	 */
	@ApiField("room_code")
	private Long roomCode;

	/**
	 * 分散式房间物品配置：
分散式整租房间配置
2:空调;3:热水器;4:洗衣机;5:冰箱;6:电视;7:微波炉;8:燃气灶;9:抽油烟机;10:电磁炉;11:床;11:WIFI;12:书桌;13:衣柜;14:沙发;15:阳台;
分散式合租房间配置
2:空调;6:电视;11:床;12:书桌;13:衣柜;15:阳台;16:独卫;
	 */
	@ApiListField("room_configs")
	@ApiField("string")
	private List<String> roomConfigs;

	/**
	 * 分散式合租房间内对应每个卧室朝向
根据rent_type区分是否必填，合租必填，整租否。
	 */
	@ApiField("room_face")
	private Long roomFace;

	/**
	 * 分散式合租房间内对应每个卧室名称。A_Z字母之一表示。
根据rent_type区分是否必填，合租必填，整租否。
	 */
	@ApiField("room_name")
	private String roomName;

	/**
	 * 门牌-室
	 */
	@ApiField("room_num")
	private String roomNum;

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
	private String totalFloorCount;

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
     * Gets checkin time.
     *
     * @return the checkin time
     */
    public String getCheckinTime() {
		return this.checkinTime;
	}

    /**
     * Sets checkin time.
     *
     * @param checkinTime the checkin time
     */
    public void setCheckinTime(String checkinTime) {
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
     * Gets flat area.
     *
     * @return the flat area
     */
    public String getFlatArea() {
		return this.flatArea;
	}

    /**
     * Sets flat area.
     *
     * @param flatArea the flat area
     */
    public void setFlatArea(String flatArea) {
		this.flatArea = flatArea;
	}

    /**
     * Gets flat building.
     *
     * @return the flat building
     */
    public String getFlatBuilding() {
		return this.flatBuilding;
	}

    /**
     * Sets flat building.
     *
     * @param flatBuilding the flat building
     */
    public void setFlatBuilding(String flatBuilding) {
		this.flatBuilding = flatBuilding;
	}

    /**
     * Gets flat configs.
     *
     * @return the flat configs
     */
    public List<String> getFlatConfigs() {
		return this.flatConfigs;
	}

    /**
     * Sets flat configs.
     *
     * @param flatConfigs the flat configs
     */
    public void setFlatConfigs(List<String> flatConfigs) {
		this.flatConfigs = flatConfigs;
	}

    /**
     * Gets flat unit.
     *
     * @return the flat unit
     */
    public String getFlatUnit() {
		return this.flatUnit;
	}

    /**
     * Sets flat unit.
     *
     * @param flatUnit the flat unit
     */
    public void setFlatUnit(String flatUnit) {
		this.flatUnit = flatUnit;
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
    public String getFreeBeginDate() {
		return this.freeBeginDate;
	}

    /**
     * Sets free begin date.
     *
     * @param freeBeginDate the free begin date
     */
    public void setFreeBeginDate(String freeBeginDate) {
		this.freeBeginDate = freeBeginDate;
	}

    /**
     * Gets free end date.
     *
     * @return the free end date
     */
    public String getFreeEndDate() {
		return this.freeEndDate;
	}

    /**
     * Sets free end date.
     *
     * @param freeEndDate the free end date
     */
    public void setFreeEndDate(String freeEndDate) {
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
    public List<EcoDisRenthousepayTypeList> getPayTypeList() {
		return this.payTypeList;
	}

    /**
     * Sets pay type list.
     *
     * @param payTypeList the pay type list
     */
    public void setPayTypeList(List<EcoDisRenthousepayTypeList> payTypeList) {
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
    public Long getRoomCode() {
		return this.roomCode;
	}

    /**
     * Sets room code.
     *
     * @param roomCode the room code
     */
    public void setRoomCode(Long roomCode) {
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
     * Gets room face.
     *
     * @return the room face
     */
    public Long getRoomFace() {
		return this.roomFace;
	}

    /**
     * Sets room face.
     *
     * @param roomFace the room face
     */
    public void setRoomFace(Long roomFace) {
		this.roomFace = roomFace;
	}

    /**
     * Gets room name.
     *
     * @return the room name
     */
    public String getRoomName() {
		return this.roomName;
	}

    /**
     * Sets room name.
     *
     * @param roomName the room name
     */
    public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

    /**
     * Gets room num.
     *
     * @return the room num
     */
    public String getRoomNum() {
		return this.roomNum;
	}

    /**
     * Sets room num.
     *
     * @param roomNum the room num
     */
    public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
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
    public String getTotalFloorCount() {
		return this.totalFloorCount;
	}

    /**
     * Sets total floor count.
     *
     * @param totalFloorCount the total floor count
     */
    public void setTotalFloorCount(String totalFloorCount) {
		this.totalFloorCount = totalFloorCount;
	}

}
