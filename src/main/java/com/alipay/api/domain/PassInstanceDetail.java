package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡券信息详情
 *
 * @author auto create
 * @since 1.0, 2018-01-31 22:13:25
 */
public class PassInstanceDetail extends AlipayObject {

	private static final long serialVersionUID = 1895881643163666336L;

	/**
	 * 业务动态参数列表
	 */
	@ApiListField("biz_param_list")
	@ApiField("biz_param_key_value")
	private List<BizParamKeyValue> bizParamList;

	/**
	 * 所属商户PID/APPID（发放渠道ID）
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 卡券实例创建时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 有效期-结束时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 删除标记，是否已被用户删除
	 */
	@ApiField("is_deleted")
	private Boolean isDeleted;

	/**
	 * logo图片的ID或链接，模板创建时在模板JSON文本中指定
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 卡券展示标题
	 */
	@ApiField("logo_text")
	private String logoText;

	/**
	 * 最后修改时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("modify_time")
	private String modifyTime;

	/**
	 * 卡券实例id，对应调卡券发放alipay.pass.instance.add接口返回的passId
	 */
	@ApiField("pass_id")
	private String passId;

	/**
	 * 产品业务类型，模板创建时在模板JSON文本中指定
	 */
	@ApiField("product")
	private String product;

	/**
	 * 卡券单据号
由商户发券时指定的卡券唯一凭证号，卡券JSON模板中fileInfo->serialNumber字段对应的值
	 */
	@ApiField("serial_number")
	private String serialNumber;

	/**
	 * 有效期-开始时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 卡券状态：
CAN_USE：可使用；
EXPIRED：已过期；
USED：已使用（已核销）；
CLOSED：已失效；
	 */
	@ApiField("status")
	private String status;

	/**
	 * 图片/海报的图片ID或链接，模板创建时在模板JSON文本中指定
	 */
	@ApiField("strip")
	private String strip;

	/**
	 * 模板ID（编号）
	 */
	@ApiField("tpl_id")
	private String tplId;

	/**
	 * 模板类型，模板创建时在模板JSON文本中指定
	 */
	@ApiField("type")
	private String type;

	/**
	 * 所属用户user_id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets biz param list.
     *
     * @return the biz param list
     */
    public List<BizParamKeyValue> getBizParamList() {
		return this.bizParamList;
	}

    /**
     * Sets biz param list.
     *
     * @param bizParamList the biz param list
     */
    public void setBizParamList(List<BizParamKeyValue> bizParamList) {
		this.bizParamList = bizParamList;
	}

    /**
     * Gets channel id.
     *
     * @return the channel id
     */
    public String getChannelId() {
		return this.channelId;
	}

    /**
     * Sets channel id.
     *
     * @param channelId the channel id
     */
    public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public String getCreateTime() {
		return this.createTime;
	}

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(String createTime) {
		this.createTime = createTime;
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
     * Gets is deleted.
     *
     * @return the is deleted
     */
    public Boolean getIsDeleted() {
		return this.isDeleted;
	}

    /**
     * Sets is deleted.
     *
     * @param isDeleted the is deleted
     */
    public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

    /**
     * Gets logo.
     *
     * @return the logo
     */
    public String getLogo() {
		return this.logo;
	}

    /**
     * Sets logo.
     *
     * @param logo the logo
     */
    public void setLogo(String logo) {
		this.logo = logo;
	}

    /**
     * Gets logo text.
     *
     * @return the logo text
     */
    public String getLogoText() {
		return this.logoText;
	}

    /**
     * Sets logo text.
     *
     * @param logoText the logo text
     */
    public void setLogoText(String logoText) {
		this.logoText = logoText;
	}

    /**
     * Gets modify time.
     *
     * @return the modify time
     */
    public String getModifyTime() {
		return this.modifyTime;
	}

    /**
     * Sets modify time.
     *
     * @param modifyTime the modify time
     */
    public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

    /**
     * Gets pass id.
     *
     * @return the pass id
     */
    public String getPassId() {
		return this.passId;
	}

    /**
     * Sets pass id.
     *
     * @param passId the pass id
     */
    public void setPassId(String passId) {
		this.passId = passId;
	}

    /**
     * Gets product.
     *
     * @return the product
     */
    public String getProduct() {
		return this.product;
	}

    /**
     * Sets product.
     *
     * @param product the product
     */
    public void setProduct(String product) {
		this.product = product;
	}

    /**
     * Gets serial number.
     *
     * @return the serial number
     */
    public String getSerialNumber() {
		return this.serialNumber;
	}

    /**
     * Sets serial number.
     *
     * @param serialNumber the serial number
     */
    public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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
     * Gets strip.
     *
     * @return the strip
     */
    public String getStrip() {
		return this.strip;
	}

    /**
     * Sets strip.
     *
     * @param strip the strip
     */
    public void setStrip(String strip) {
		this.strip = strip;
	}

    /**
     * Gets tpl id.
     *
     * @return the tpl id
     */
    public String getTplId() {
		return this.tplId;
	}

    /**
     * Sets tpl id.
     *
     * @param tplId the tpl id
     */
    public void setTplId(String tplId) {
		this.tplId = tplId;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
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
