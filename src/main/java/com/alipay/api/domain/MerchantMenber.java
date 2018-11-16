package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户会员
 *
 * @author auto create
 * @since 1.0, 2017-06-07 13:29:46
 */
public class MerchantMenber extends AlipayObject {

	private static final long serialVersionUID = 8379969388712929376L;

	/**
	 * 生日 yyyy-MM-dd
	 */
	@ApiField("birth")
	private String birth;

	/**
	 * 手机号
	 */
	@ApiField("cell")
	private String cell;

	/**
	 * 性别（男：MALE；女：FEMALE）
	 */
	@ApiField("gende")
	private String gende;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets birth.
     *
     * @return the birth
     */
    public String getBirth() {
		return this.birth;
	}

    /**
     * Sets birth.
     *
     * @param birth the birth
     */
    public void setBirth(String birth) {
		this.birth = birth;
	}

    /**
     * Gets cell.
     *
     * @return the cell
     */
    public String getCell() {
		return this.cell;
	}

    /**
     * Sets cell.
     *
     * @param cell the cell
     */
    public void setCell(String cell) {
		this.cell = cell;
	}

    /**
     * Gets gende.
     *
     * @return the gende
     */
    public String getGende() {
		return this.gende;
	}

    /**
     * Sets gende.
     *
     * @param gende the gende
     */
    public void setGende(String gende) {
		this.gende = gende;
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

}
