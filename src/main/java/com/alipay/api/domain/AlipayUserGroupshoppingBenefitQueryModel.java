package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝&淘宝拼团成团成功后查询发奖
 *
 * @author auto create
 * @since 1.0, 2018-09-12 16:51:20
 */
public class AlipayUserGroupshoppingBenefitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1895452631443819289L;

	/**
	 * 支付宝淘宝拼团的组团id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 拼团是否混合出资
	 */
	@ApiField("is_platform_invest")
	private Boolean isPlatformInvest;

	/**
	 * 淘宝支付宝拼团的商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 拼团原始价格
	 */
	@ApiField("original_prize")
	private String originalPrize;

	/**
	 * 拼团的价格
	 */
	@ApiField("pin_prize")
	private String pinPrize;

	/**
	 * 1表示拼团中；2表示拼团成功；3表示拼团失败
	 */
	@ApiField("pin_status")
	private String pinStatus;

	/**
	 * DETAIL_PAGE拼团详情页，FINISH_PAGE拼团成功页
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 当前已参团的用户id
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

    /**
     * Gets group id.
     *
     * @return the group id
     */
    public String getGroupId() {
		return this.groupId;
	}

    /**
     * Sets group id.
     *
     * @param groupId the group id
     */
    public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

    /**
     * Gets is platform invest.
     *
     * @return the is platform invest
     */
    public Boolean getIsPlatformInvest() {
		return this.isPlatformInvest;
	}

    /**
     * Sets is platform invest.
     *
     * @param isPlatformInvest the is platform invest
     */
    public void setIsPlatformInvest(Boolean isPlatformInvest) {
		this.isPlatformInvest = isPlatformInvest;
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
     * Gets original prize.
     *
     * @return the original prize
     */
    public String getOriginalPrize() {
		return this.originalPrize;
	}

    /**
     * Sets original prize.
     *
     * @param originalPrize the original prize
     */
    public void setOriginalPrize(String originalPrize) {
		this.originalPrize = originalPrize;
	}

    /**
     * Gets pin prize.
     *
     * @return the pin prize
     */
    public String getPinPrize() {
		return this.pinPrize;
	}

    /**
     * Sets pin prize.
     *
     * @param pinPrize the pin prize
     */
    public void setPinPrize(String pinPrize) {
		this.pinPrize = pinPrize;
	}

    /**
     * Gets pin status.
     *
     * @return the pin status
     */
    public String getPinStatus() {
		return this.pinStatus;
	}

    /**
     * Sets pin status.
     *
     * @param pinStatus the pin status
     */
    public void setPinStatus(String pinStatus) {
		this.pinStatus = pinStatus;
	}

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public String getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(String scene) {
		this.scene = scene;
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

    /**
     * Gets user id list.
     *
     * @return the user id list
     */
    public List<String> getUserIdList() {
		return this.userIdList;
	}

    /**
     * Sets user id list.
     *
     * @param userIdList the user id list
     */
    public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
