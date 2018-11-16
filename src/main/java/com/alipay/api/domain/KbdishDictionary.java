package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品数据字典模型
 *
 * @author auto create
 * @since 1.0, 2018-08-03 17:45:25
 */
public class KbdishDictionary extends AlipayObject {

	private static final long serialVersionUID = 5513961689549917146L;

	/**
	 * 商家门店的操作小二,创建数据的人
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 字典的数据id
	 */
	@ApiField("dictionary_id")
	private String dictionaryId;

	/**
	 * 字典的扩展json，根据不同的biz_type,设置商家的自定义字典表key以及value。如果字典类型为catetory,  key为cateSort，cateType，level,parentCatetoryId（level传数字，cateType为dish或cook） ;如果字典类型为spec, key为specSort.。注意：如果是字符串拼接的方式，转移符\要替换为\\\ 。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户的支付宝user_id. 商户授权后,isv能获得,这个是给isv点单用的必须要要明确的id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 字典名称. 商家自定义的字符串
	 */
	@ApiField("name")
	private String name;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商户门店的操作小二,修改数据的人
	 */
	@ApiField("update_user")
	private String updateUser;

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
     * Gets dictionary id.
     *
     * @return the dictionary id
     */
    public String getDictionaryId() {
		return this.dictionaryId;
	}

    /**
     * Sets dictionary id.
     *
     * @param dictionaryId the dictionary id
     */
    public void setDictionaryId(String dictionaryId) {
		this.dictionaryId = dictionaryId;
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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
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
