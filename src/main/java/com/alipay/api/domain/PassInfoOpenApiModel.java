package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡券信息
 *
 * @author auto create
 * @since 1.0, 2017-11-30 10:29:10
 */
public class PassInfoOpenApiModel extends AlipayObject {

	private static final long serialVersionUID = 2415116781441148823L;

	/**
	 * 凭证信息
	 */
	@ApiField("data_info")
	private String dataInfo;

	/**
	 * 有效期结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 券创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 卡券第一行文字
	 */
	@ApiField("logo_text")
	private String logoText;

	/**
	 * 商家名称
	 */
	@ApiField("mechant_name")
	private String mechantName;

	/**
	 * 券ID
	 */
	@ApiField("pass_id")
	private String passId;

	/**
	 * 卡券第二行文字
	 */
	@ApiField("second_logo_text")
	private String secondLogoText;

	/**
	 * 可用门店信息
	 */
	@ApiListField("shop_id_list")
	@ApiField("string")
	private List<String> shopIdList;

	/**
	 * 有效期开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 券状态,"can_use", "可使用";"used", "已使用";"expired", "已过期";"closed", "已失效"
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets data info.
     *
     * @return the data info
     */
    public String getDataInfo() {
		return this.dataInfo;
	}

    /**
     * Sets data info.
     *
     * @param dataInfo the data info
     */
    public void setDataInfo(String dataInfo) {
		this.dataInfo = dataInfo;
	}

    /**
     * Gets end date.
     *
     * @return the end date
     */
    public Date getEndDate() {
		return this.endDate;
	}

    /**
     * Sets end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public Date getGmtCreate() {
		return this.gmtCreate;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
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
     * Gets mechant name.
     *
     * @return the mechant name
     */
    public String getMechantName() {
		return this.mechantName;
	}

    /**
     * Sets mechant name.
     *
     * @param mechantName the mechant name
     */
    public void setMechantName(String mechantName) {
		this.mechantName = mechantName;
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
     * Gets second logo text.
     *
     * @return the second logo text
     */
    public String getSecondLogoText() {
		return this.secondLogoText;
	}

    /**
     * Sets second logo text.
     *
     * @param secondLogoText the second logo text
     */
    public void setSecondLogoText(String secondLogoText) {
		this.secondLogoText = secondLogoText;
	}

    /**
     * Gets shop id list.
     *
     * @return the shop id list
     */
    public List<String> getShopIdList() {
		return this.shopIdList;
	}

    /**
     * Sets shop id list.
     *
     * @param shopIdList the shop id list
     */
    public void setShopIdList(List<String> shopIdList) {
		this.shopIdList = shopIdList;
	}

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public Date getStartDate() {
		return this.startDate;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(Date startDate) {
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

}
