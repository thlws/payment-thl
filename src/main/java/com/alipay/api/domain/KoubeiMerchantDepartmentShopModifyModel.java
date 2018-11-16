package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 部门门店关系调整
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:29:50
 */
public class KoubeiMerchantDepartmentShopModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5378883818564737452L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 需要调整的部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 部门类型，5为非叶子节点部门即商户创建的部门；6为叶子节点部门即门店，门店在业务上被当成是类型为6的部门
	 */
	@ApiField("dept_type")
	private String deptType;

	/**
	 * 商户调整部门，门店关系时当前部门需要新增的门店列表，包括门店id和门店名称
	 */
	@ApiListField("shop_list_to_add")
	@ApiField("simple_shop_model")
	private List<SimpleShopModel> shopListToAdd;

	/**
	 * 商户调整部门，门店关联关系，需要解除关系的门店列表，包括门店id和门店名称
	 */
	@ApiListField("shop_list_to_remove")
	@ApiField("simple_shop_model")
	private List<SimpleShopModel> shopListToRemove;

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
		return this.authCode;
	}

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

    /**
     * Gets dept id.
     *
     * @return the dept id
     */
    public String getDeptId() {
		return this.deptId;
	}

    /**
     * Sets dept id.
     *
     * @param deptId the dept id
     */
    public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

    /**
     * Gets dept type.
     *
     * @return the dept type
     */
    public String getDeptType() {
		return this.deptType;
	}

    /**
     * Sets dept type.
     *
     * @param deptType the dept type
     */
    public void setDeptType(String deptType) {
		this.deptType = deptType;
	}

    /**
     * Gets shop list to add.
     *
     * @return the shop list to add
     */
    public List<SimpleShopModel> getShopListToAdd() {
		return this.shopListToAdd;
	}

    /**
     * Sets shop list to add.
     *
     * @param shopListToAdd the shop list to add
     */
    public void setShopListToAdd(List<SimpleShopModel> shopListToAdd) {
		this.shopListToAdd = shopListToAdd;
	}

    /**
     * Gets shop list to remove.
     *
     * @return the shop list to remove
     */
    public List<SimpleShopModel> getShopListToRemove() {
		return this.shopListToRemove;
	}

    /**
     * Sets shop list to remove.
     *
     * @param shopListToRemove the shop list to remove
     */
    public void setShopListToRemove(List<SimpleShopModel> shopListToRemove) {
		this.shopListToRemove = shopListToRemove;
	}

}
