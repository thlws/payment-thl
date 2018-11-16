package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品库加料模型
 *
 * @author auto create
 * @since 1.0, 2018-08-27 16:32:51
 */
public class KbdishMaterialInfo extends AlipayObject {

	private static final long serialVersionUID = 4831675135152873184L;

	/**
	 * 加价金额，最小加价金额0
	 */
	@ApiField("add_price")
	private String addPrice;

	/**
	 * 创建人，在新增时必传
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 加料id，加料的唯一标识。
新增时该项不用传，修改删除时必传。
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 口碑的加料图片id
	 */
	@ApiField("material_img")
	private String materialImg;

	/**
	 * 加料的名称
	 */
	@ApiField("material_name")
	private String materialName;

	/**
	 * SHOP/PID。代表加料类型是商户或者门店。
	 */
	@ApiField("material_type")
	private String materialType;

	/**
	 * 表示单个菜品加料最多可以加料的份数
	 */
	@ApiField("max_num")
	private String maxNum;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 公共字段，根据materialType的类型，这里填入商户id或者口碑门店id。
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 修改人，在新增和修改，删除时必传
	 */
	@ApiField("update_user")
	private String updateUser;

    /**
     * Gets add price.
     *
     * @return the add price
     */
    public String getAddPrice() {
		return this.addPrice;
	}

    /**
     * Sets add price.
     *
     * @param addPrice the add price
     */
    public void setAddPrice(String addPrice) {
		this.addPrice = addPrice;
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
     * Gets material id.
     *
     * @return the material id
     */
    public String getMaterialId() {
		return this.materialId;
	}

    /**
     * Sets material id.
     *
     * @param materialId the material id
     */
    public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

    /**
     * Gets material img.
     *
     * @return the material img
     */
    public String getMaterialImg() {
		return this.materialImg;
	}

    /**
     * Sets material img.
     *
     * @param materialImg the material img
     */
    public void setMaterialImg(String materialImg) {
		this.materialImg = materialImg;
	}

    /**
     * Gets material name.
     *
     * @return the material name
     */
    public String getMaterialName() {
		return this.materialName;
	}

    /**
     * Sets material name.
     *
     * @param materialName the material name
     */
    public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

    /**
     * Gets material type.
     *
     * @return the material type
     */
    public String getMaterialType() {
		return this.materialType;
	}

    /**
     * Sets material type.
     *
     * @param materialType the material type
     */
    public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

    /**
     * Gets max num.
     *
     * @return the max num
     */
    public String getMaxNum() {
		return this.maxNum;
	}

    /**
     * Sets max num.
     *
     * @param maxNum the max num
     */
    public void setMaxNum(String maxNum) {
		this.maxNum = maxNum;
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
     * Gets public id.
     *
     * @return the public id
     */
    public String getPublicId() {
		return this.publicId;
	}

    /**
     * Sets public id.
     *
     * @param publicId the public id
     */
    public void setPublicId(String publicId) {
		this.publicId = publicId;
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
