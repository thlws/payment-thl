package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业社区业主信息
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:19:02
 */
public class CplifeResidentInfo extends AlipayObject {

	private static final long serialVersionUID = 8453445729767262495L;

	/**
	 * 业主关联的房产在支付宝平台中的唯一标识。(该属性和property_entity_id两个至少需要填写一项，如果两项都填写则以entity_id为准.)
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 业主身份证号的MD5结果
	 */
	@ApiField("idcard_no")
	private String idcardNo;

	/**
	 * 用户的真实姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 业主关联的房产在物业系统中的唯一标识。(该属性和entity_id两个至少需要填写一项，如果两项都填写则以entity_id为准.)
	 */
	@ApiField("out_entity_id")
	private String outEntityId;

	/**
	 * 物业系统中小区住户的唯一ID标识.
	 */
	@ApiField("out_resident_id")
	private String outResidentId;

	/**
	 * 用户对房产的关系类型。业主:1；家人:2；租客:3
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets entity id.
     *
     * @return the entity id
     */
    public String getEntityId() {
		return this.entityId;
	}

    /**
     * Sets entity id.
     *
     * @param entityId the entity id
     */
    public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

    /**
     * Gets idcard no.
     *
     * @return the idcard no
     */
    public String getIdcardNo() {
		return this.idcardNo;
	}

    /**
     * Sets idcard no.
     *
     * @param idcardNo the idcard no
     */
    public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
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
     * Gets out entity id.
     *
     * @return the out entity id
     */
    public String getOutEntityId() {
		return this.outEntityId;
	}

    /**
     * Sets out entity id.
     *
     * @param outEntityId the out entity id
     */
    public void setOutEntityId(String outEntityId) {
		this.outEntityId = outEntityId;
	}

    /**
     * Gets out resident id.
     *
     * @return the out resident id
     */
    public String getOutResidentId() {
		return this.outResidentId;
	}

    /**
     * Sets out resident id.
     *
     * @param outResidentId the out resident id
     */
    public void setOutResidentId(String outResidentId) {
		this.outResidentId = outResidentId;
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

}
