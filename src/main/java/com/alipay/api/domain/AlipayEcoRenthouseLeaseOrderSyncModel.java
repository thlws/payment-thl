package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租约同步
 *
 * @author auto create
 * @since 1.0, 2018-01-12 10:57:19
 */
public class AlipayEcoRenthouseLeaseOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5327891626351456389L;

	/**
	 * 预览合同二进制流	预览合同html的Base64字符串
	 */
	@ApiField("attach_file")
	private String attachFile;

	/**
	 * 租约开始时间格式 YYYY-MM-dd
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 定金信息
	 */
	@ApiField("book_info")
	private AlipayEcoRenthouseBookInfo bookInfo;

	/**
	 * 证件编号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 证件类型	不传默认是0
0-身份证；	
1-护照；	暂时只支持身份证
2-军人身份证；	
3-港澳居民来往内地通行证；	
4-台湾同胞来往内地通行证；	
5-临时身份证；	
6-户口簿；	
7-警官证；	
8-外国人永久居住证
	 */
	@ApiField("card_type")
	private Long cardType;

	/**
	 * 租约结束时间格式 YYYY-MM-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 房源类型
1:分散式
2:集中式
	 */
	@ApiField("flats_tag")
	private Long flatsTag;

	/**
	 * 押金金额
	 */
	@ApiField("foregift_amount")
	private String foregiftAmount;

	/**
	 * 0:不免押金 1:免押金 默认 0（不免押金）
	 */
	@ApiField("free_deposit")
	private Long freeDeposit;

	/**
	 * 家具清单
1-床
2-床垫
3-床头柜
4-衣柜
5-桌子
6-椅子
7-窗帘
8-台灯
9-电视
10-电视柜
11-遥控器
12-空调
13-抽油烟机
14-燃气灶
15-冰箱
16-微波炉
17-餐桌
18-餐椅
19-洗衣机
20-烘干机
21-沙发
22-热水器
	 */
	@ApiField("furniture_items")
	private String furnitureItems;

	/**
	 * 通过"文件上传"接口返回的租约相关图片url路径。租约照片可录入0~10张,目前仅支持jpg、png、jpeg格式
	 */
	@ApiField("images")
	private String images;

	/**
	 * KA租约业务号
	 */
	@ApiField("lease_code")
	private String leaseCode;

	/**
	 * 租约创建时间,格式yyyy-MM-dd HH:mm:ss
不传时默认系统时间
	 */
	@ApiField("lease_create_time")
	private String leaseCreateTime;

	/**
	 * 租约状态
0-未确认
1-已确认
2-已退房
3-已撤销
	 */
	@ApiField("lease_status")
	private Long leaseStatus;

	/**
	 * 1-电子合约(默认)  2-纸质合约
	 */
	@ApiField("lease_type")
	private Long leaseType;

	/**
	 * 续租原KA租约业务号（也就是第一期的lease_code）
	 */
	@ApiField("original_lease_code")
	private String originalLeaseCode;

	/**
	 * 其他费用描述
	 */
	@ApiField("other_fee_desc")
	private String otherFeeDesc;

	/**
	 * 租金付款方式
1-付一；
2-付二；
3-付三；
4-付四；
5-付五；
6-付六；
7-付七；
8-付八；
9-付九；
10-付十；
11-付十一；
12-付十二；
	 */
	@ApiField("pay_type")
	private Long payType;

	/**
	 * 信用减免金额
	 */
	@ApiField("rebate_amount")
	private String rebateAmount;

	/**
	 * 描述
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 0-不是续租(默认值)  1-是续租
	 */
	@ApiField("renew_lease")
	private Long renewLease;

	/**
	 * 第几期续租
	 */
	@ApiField("renew_num")
	private Long renewNum;

	/**
	 * 收租日描述
	 */
	@ApiField("rent_day_desc")
	private String rentDayDesc;

	/**
	 * "租金包含相关费用 1-水费；
2-电费；
3-煤气费；
4-有线电视费；
5-网络宽带费；
6-物业管理费；
7-室内设施维修费（人为使用不当除外）；
8-保洁费；
9-暖气费；"
	 */
	@ApiListField("rent_include_fee_desc")
	@ApiField("string")
	private List<String> rentIncludeFeeDesc;

	/**
	 * 1-男   2-女
	 */
	@ApiField("renter_gender")
	private String renterGender;

	/**
	 * 用户姓名
	 */
	@ApiField("renter_name")
	private String renterName;

	/**
	 * 用户手机号
	 */
	@ApiField("renter_phone")
	private String renterPhone;

	/**
	 * 房源编号
flatsTag为1,则代表单编号 2,代表房型编号
	 */
	@ApiField("room_code")
	private String roomCode;

	/**
	 * 房间号	
集中式的时候必填
	 */
	@ApiField("room_num")
	private String roomNum;

	/**
	 * 租金金额	比如 2500 2500.5 3000.05等
	 */
	@ApiField("sale_amount")
	private String saleAmount;

    /**
     * Gets attach file.
     *
     * @return the attach file
     */
    public String getAttachFile() {
		return this.attachFile;
	}

    /**
     * Sets attach file.
     *
     * @param attachFile the attach file
     */
    public void setAttachFile(String attachFile) {
		this.attachFile = attachFile;
	}

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
     * Gets book info.
     *
     * @return the book info
     */
    public AlipayEcoRenthouseBookInfo getBookInfo() {
		return this.bookInfo;
	}

    /**
     * Sets book info.
     *
     * @param bookInfo the book info
     */
    public void setBookInfo(AlipayEcoRenthouseBookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}

    /**
     * Gets card no.
     *
     * @return the card no
     */
    public String getCardNo() {
		return this.cardNo;
	}

    /**
     * Sets card no.
     *
     * @param cardNo the card no
     */
    public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

    /**
     * Gets card type.
     *
     * @return the card type
     */
    public Long getCardType() {
		return this.cardType;
	}

    /**
     * Sets card type.
     *
     * @param cardType the card type
     */
    public void setCardType(Long cardType) {
		this.cardType = cardType;
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
     * Gets flats tag.
     *
     * @return the flats tag
     */
    public Long getFlatsTag() {
		return this.flatsTag;
	}

    /**
     * Sets flats tag.
     *
     * @param flatsTag the flats tag
     */
    public void setFlatsTag(Long flatsTag) {
		this.flatsTag = flatsTag;
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
     * Gets free deposit.
     *
     * @return the free deposit
     */
    public Long getFreeDeposit() {
		return this.freeDeposit;
	}

    /**
     * Sets free deposit.
     *
     * @param freeDeposit the free deposit
     */
    public void setFreeDeposit(Long freeDeposit) {
		this.freeDeposit = freeDeposit;
	}

    /**
     * Gets furniture items.
     *
     * @return the furniture items
     */
    public String getFurnitureItems() {
		return this.furnitureItems;
	}

    /**
     * Sets furniture items.
     *
     * @param furnitureItems the furniture items
     */
    public void setFurnitureItems(String furnitureItems) {
		this.furnitureItems = furnitureItems;
	}

    /**
     * Gets images.
     *
     * @return the images
     */
    public String getImages() {
		return this.images;
	}

    /**
     * Sets images.
     *
     * @param images the images
     */
    public void setImages(String images) {
		this.images = images;
	}

    /**
     * Gets lease code.
     *
     * @return the lease code
     */
    public String getLeaseCode() {
		return this.leaseCode;
	}

    /**
     * Sets lease code.
     *
     * @param leaseCode the lease code
     */
    public void setLeaseCode(String leaseCode) {
		this.leaseCode = leaseCode;
	}

    /**
     * Gets lease create time.
     *
     * @return the lease create time
     */
    public String getLeaseCreateTime() {
		return this.leaseCreateTime;
	}

    /**
     * Sets lease create time.
     *
     * @param leaseCreateTime the lease create time
     */
    public void setLeaseCreateTime(String leaseCreateTime) {
		this.leaseCreateTime = leaseCreateTime;
	}

    /**
     * Gets lease status.
     *
     * @return the lease status
     */
    public Long getLeaseStatus() {
		return this.leaseStatus;
	}

    /**
     * Sets lease status.
     *
     * @param leaseStatus the lease status
     */
    public void setLeaseStatus(Long leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

    /**
     * Gets lease type.
     *
     * @return the lease type
     */
    public Long getLeaseType() {
		return this.leaseType;
	}

    /**
     * Sets lease type.
     *
     * @param leaseType the lease type
     */
    public void setLeaseType(Long leaseType) {
		this.leaseType = leaseType;
	}

    /**
     * Gets original lease code.
     *
     * @return the original lease code
     */
    public String getOriginalLeaseCode() {
		return this.originalLeaseCode;
	}

    /**
     * Sets original lease code.
     *
     * @param originalLeaseCode the original lease code
     */
    public void setOriginalLeaseCode(String originalLeaseCode) {
		this.originalLeaseCode = originalLeaseCode;
	}

    /**
     * Gets other fee desc.
     *
     * @return the other fee desc
     */
    public String getOtherFeeDesc() {
		return this.otherFeeDesc;
	}

    /**
     * Sets other fee desc.
     *
     * @param otherFeeDesc the other fee desc
     */
    public void setOtherFeeDesc(String otherFeeDesc) {
		this.otherFeeDesc = otherFeeDesc;
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
     * Gets rebate amount.
     *
     * @return the rebate amount
     */
    public String getRebateAmount() {
		return this.rebateAmount;
	}

    /**
     * Sets rebate amount.
     *
     * @param rebateAmount the rebate amount
     */
    public void setRebateAmount(String rebateAmount) {
		this.rebateAmount = rebateAmount;
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
     * Gets renew lease.
     *
     * @return the renew lease
     */
    public Long getRenewLease() {
		return this.renewLease;
	}

    /**
     * Sets renew lease.
     *
     * @param renewLease the renew lease
     */
    public void setRenewLease(Long renewLease) {
		this.renewLease = renewLease;
	}

    /**
     * Gets renew num.
     *
     * @return the renew num
     */
    public Long getRenewNum() {
		return this.renewNum;
	}

    /**
     * Sets renew num.
     *
     * @param renewNum the renew num
     */
    public void setRenewNum(Long renewNum) {
		this.renewNum = renewNum;
	}

    /**
     * Gets rent day desc.
     *
     * @return the rent day desc
     */
    public String getRentDayDesc() {
		return this.rentDayDesc;
	}

    /**
     * Sets rent day desc.
     *
     * @param rentDayDesc the rent day desc
     */
    public void setRentDayDesc(String rentDayDesc) {
		this.rentDayDesc = rentDayDesc;
	}

    /**
     * Gets rent include fee desc.
     *
     * @return the rent include fee desc
     */
    public List<String> getRentIncludeFeeDesc() {
		return this.rentIncludeFeeDesc;
	}

    /**
     * Sets rent include fee desc.
     *
     * @param rentIncludeFeeDesc the rent include fee desc
     */
    public void setRentIncludeFeeDesc(List<String> rentIncludeFeeDesc) {
		this.rentIncludeFeeDesc = rentIncludeFeeDesc;
	}

    /**
     * Gets renter gender.
     *
     * @return the renter gender
     */
    public String getRenterGender() {
		return this.renterGender;
	}

    /**
     * Sets renter gender.
     *
     * @param renterGender the renter gender
     */
    public void setRenterGender(String renterGender) {
		this.renterGender = renterGender;
	}

    /**
     * Gets renter name.
     *
     * @return the renter name
     */
    public String getRenterName() {
		return this.renterName;
	}

    /**
     * Sets renter name.
     *
     * @param renterName the renter name
     */
    public void setRenterName(String renterName) {
		this.renterName = renterName;
	}

    /**
     * Gets renter phone.
     *
     * @return the renter phone
     */
    public String getRenterPhone() {
		return this.renterPhone;
	}

    /**
     * Sets renter phone.
     *
     * @param renterPhone the renter phone
     */
    public void setRenterPhone(String renterPhone) {
		this.renterPhone = renterPhone;
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
     * Gets sale amount.
     *
     * @return the sale amount
     */
    public String getSaleAmount() {
		return this.saleAmount;
	}

    /**
     * Sets sale amount.
     *
     * @param saleAmount the sale amount
     */
    public void setSaleAmount(String saleAmount) {
		this.saleAmount = saleAmount;
	}

}
