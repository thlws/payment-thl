package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业融资数据采集平台对外的数据提交接口
 *
 * @author auto create
 * @since 1.0, 2017-08-15 09:11:01
 */
public class AlipayCreditCreditriskDataPutModel extends AlipayObject {

	private static final long serialVersionUID = 5221868482895772282L;

	/**
	 * 数据类别,ISV注册成为网商银行的会员，达成数据合作服务，约定数据模型，由网商分配给ISV的数据模型的类别
	 */
	@ApiField("category")
	private String category;

	/**
	 * 外部机构编码(ISV注册成为网商银行的会员，ISV在网商的会员ID)
	 */
	@ApiField("dataorgid")
	private String dataorgid;

	/**
	 * 数据提供者,ISV注册成为网商银行的会员，达成数据合作服务，约定数据模型，由网商分配给ISV的机构代号
	 */
	@ApiField("dataprovider")
	private String dataprovider;

	/**
	 * 实体编码(ISV客户的支付宝数字ID)
	 */
	@ApiField("entitycode")
	private String entitycode;

	/**
	 * 实体名(ISV客户的支付宝登录号)
	 */
	@ApiField("entityname")
	private String entityname;

	/**
	 * 实体类型(固定为ALIPAY)
	 */
	@ApiField("entitytype")
	private String entitytype;

	/**
	 * Json格式,数据内容,ISV注册成为网商银行的会员，达成数据合作服务，约定json串字段和内容,ISV将数据给到网商，网商按照约定解析Json内容
	 */
	@ApiField("objectcontent")
	private String objectcontent;

    /**
     * Gets category.
     *
     * @return the category
     */
    public String getCategory() {
		return this.category;
	}

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
		this.category = category;
	}

    /**
     * Gets dataorgid.
     *
     * @return the dataorgid
     */
    public String getDataorgid() {
		return this.dataorgid;
	}

    /**
     * Sets dataorgid.
     *
     * @param dataorgid the dataorgid
     */
    public void setDataorgid(String dataorgid) {
		this.dataorgid = dataorgid;
	}

    /**
     * Gets dataprovider.
     *
     * @return the dataprovider
     */
    public String getDataprovider() {
		return this.dataprovider;
	}

    /**
     * Sets dataprovider.
     *
     * @param dataprovider the dataprovider
     */
    public void setDataprovider(String dataprovider) {
		this.dataprovider = dataprovider;
	}

    /**
     * Gets entitycode.
     *
     * @return the entitycode
     */
    public String getEntitycode() {
		return this.entitycode;
	}

    /**
     * Sets entitycode.
     *
     * @param entitycode the entitycode
     */
    public void setEntitycode(String entitycode) {
		this.entitycode = entitycode;
	}

    /**
     * Gets entityname.
     *
     * @return the entityname
     */
    public String getEntityname() {
		return this.entityname;
	}

    /**
     * Sets entityname.
     *
     * @param entityname the entityname
     */
    public void setEntityname(String entityname) {
		this.entityname = entityname;
	}

    /**
     * Gets entitytype.
     *
     * @return the entitytype
     */
    public String getEntitytype() {
		return this.entitytype;
	}

    /**
     * Sets entitytype.
     *
     * @param entitytype the entitytype
     */
    public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

    /**
     * Gets objectcontent.
     *
     * @return the objectcontent
     */
    public String getObjectcontent() {
		return this.objectcontent;
	}

    /**
     * Sets objectcontent.
     *
     * @param objectcontent the objectcontent
     */
    public void setObjectcontent(String objectcontent) {
		this.objectcontent = objectcontent;
	}

}
