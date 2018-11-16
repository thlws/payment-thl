package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户卡信息
 *
 * @author auto create
 * @since 1.0, 2017-08-16 14:49:19
 */
public class MerchantCard extends AlipayObject {

	private static final long serialVersionUID = 8253255818476454593L;

	/**
	 * 资金卡余额，单位：元，精确到小数点后两位。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 支付宝业务卡号
说明：
1、开卡成功后返回该参数，需要保存留用；
2、开卡/更新/删卡/查询卡接口请求中不需要传该参数；
	 */
	@ApiField("biz_card_no")
	private String bizCardNo;

	/**
	 * 商户外部会员卡卡号
说明：
1、会员卡开卡接口，如果卡类型为外部会员卡，请求中则必须提供该参数；
2、更新、查询、删除等接口，请求中则不需要提供该参数值；
	 */
	@ApiField("external_card_no")
	private String externalCardNo;

	/**
	 * 卡面展示图片的图片ID，通过接口（alipay.offline.material.image.upload）上传图片

这里预期展示的是个人照片；
图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；
图片尺寸为230*295px，可等比放大；
	 */
	@ApiField("front_image_id")
	private String frontImageId;

	/**
	 * 卡面文案列表，1项对应1行文案，最多只能传入4行文案；
单行文案展现分为左右两部分，左边对应label字段，右边对应value；
形如： 学院    新闻学院
	 */
	@ApiListField("front_text_list")
	@ApiField("card_front_text_d_t_o")
	private List<CardFrontTextDTO> frontTextList;

	/**
	 * 会员卡等级（由商户自定义，并可以在卡模板创建时，定义等级信息）
	 */
	@ApiField("level")
	private String level;

	/**
	 * 商户动态码回传信息：
只用于当write_off_type核销类型为mdbarcode或mdqrcode时，商户调用卡更新接口回传动态码。
	 */
	@ApiField("mdcode_info")
	private MdCodeInfoDTO mdcodeInfo;

	/**
	 * 会员卡开卡时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("open_date")
	private Date openDate;

	/**
	 * 会员卡积分，积分必须为数字型（可为浮点型，带2位小数点）
	 */
	@ApiField("point")
	private String point;

	/**
	 * 会员卡更换不同的卡模板（该参数仅用在会员卡更新接口中）
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 会员卡有效期
	 */
	@ApiField("valid_date")
	private String validDate;

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public String getBalance() {
		return this.balance;
	}

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(String balance) {
		this.balance = balance;
	}

    /**
     * Gets biz card no.
     *
     * @return the biz card no
     */
    public String getBizCardNo() {
		return this.bizCardNo;
	}

    /**
     * Sets biz card no.
     *
     * @param bizCardNo the biz card no
     */
    public void setBizCardNo(String bizCardNo) {
		this.bizCardNo = bizCardNo;
	}

    /**
     * Gets external card no.
     *
     * @return the external card no
     */
    public String getExternalCardNo() {
		return this.externalCardNo;
	}

    /**
     * Sets external card no.
     *
     * @param externalCardNo the external card no
     */
    public void setExternalCardNo(String externalCardNo) {
		this.externalCardNo = externalCardNo;
	}

    /**
     * Gets front image id.
     *
     * @return the front image id
     */
    public String getFrontImageId() {
		return this.frontImageId;
	}

    /**
     * Sets front image id.
     *
     * @param frontImageId the front image id
     */
    public void setFrontImageId(String frontImageId) {
		this.frontImageId = frontImageId;
	}

    /**
     * Gets front text list.
     *
     * @return the front text list
     */
    public List<CardFrontTextDTO> getFrontTextList() {
		return this.frontTextList;
	}

    /**
     * Sets front text list.
     *
     * @param frontTextList the front text list
     */
    public void setFrontTextList(List<CardFrontTextDTO> frontTextList) {
		this.frontTextList = frontTextList;
	}

    /**
     * Gets level.
     *
     * @return the level
     */
    public String getLevel() {
		return this.level;
	}

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(String level) {
		this.level = level;
	}

    /**
     * Gets mdcode info.
     *
     * @return the mdcode info
     */
    public MdCodeInfoDTO getMdcodeInfo() {
		return this.mdcodeInfo;
	}

    /**
     * Sets mdcode info.
     *
     * @param mdcodeInfo the mdcode info
     */
    public void setMdcodeInfo(MdCodeInfoDTO mdcodeInfo) {
		this.mdcodeInfo = mdcodeInfo;
	}

    /**
     * Gets open date.
     *
     * @return the open date
     */
    public Date getOpenDate() {
		return this.openDate;
	}

    /**
     * Sets open date.
     *
     * @param openDate the open date
     */
    public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

    /**
     * Gets point.
     *
     * @return the point
     */
    public String getPoint() {
		return this.point;
	}

    /**
     * Sets point.
     *
     * @param point the point
     */
    public void setPoint(String point) {
		this.point = point;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

    /**
     * Gets valid date.
     *
     * @return the valid date
     */
    public String getValidDate() {
		return this.validDate;
	}

    /**
     * Sets valid date.
     *
     * @param validDate the valid date
     */
    public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

}
