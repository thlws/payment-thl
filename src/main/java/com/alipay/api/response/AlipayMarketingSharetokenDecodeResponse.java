package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.sharetoken.decode response.
 *
 * @author auto create
 * @since 1.0, 2018-06-14 11:35:05
 */
public class AlipayMarketingSharetokenDecodeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2622136885685926864L;

	/** 
	 * 第一个按钮名称
	 */
	@ApiField("btn_one_name")
	private String btnOneName;

	/** 
	 * 第一个按钮链接
	 */
	@ApiField("btn_one_schema")
	private String btnOneSchema;

	/** 
	 * 第二个按钮名称
	 */
	@ApiField("btn_two_name")
	private String btnTwoName;

	/** 
	 * 第二个按钮链接
	 */
	@ApiField("btn_two_schema")
	private String btnTwoSchema;

	/** 
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * icon地址
	 */
	@ApiField("icon")
	private String icon;

	/** 
	 * 标题
	 */
	@ApiField("title")
	private String title;

    /**
     * Sets btn one name.
     *
     * @param btnOneName the btn one name
     */
    public void setBtnOneName(String btnOneName) {
		this.btnOneName = btnOneName;
	}

    /**
     * Gets btn one name.
     *
     * @return the btn one name
     */
    public String getBtnOneName( ) {
		return this.btnOneName;
	}

    /**
     * Sets btn one schema.
     *
     * @param btnOneSchema the btn one schema
     */
    public void setBtnOneSchema(String btnOneSchema) {
		this.btnOneSchema = btnOneSchema;
	}

    /**
     * Gets btn one schema.
     *
     * @return the btn one schema
     */
    public String getBtnOneSchema( ) {
		return this.btnOneSchema;
	}

    /**
     * Sets btn two name.
     *
     * @param btnTwoName the btn two name
     */
    public void setBtnTwoName(String btnTwoName) {
		this.btnTwoName = btnTwoName;
	}

    /**
     * Gets btn two name.
     *
     * @return the btn two name
     */
    public String getBtnTwoName( ) {
		return this.btnTwoName;
	}

    /**
     * Sets btn two schema.
     *
     * @param btnTwoSchema the btn two schema
     */
    public void setBtnTwoSchema(String btnTwoSchema) {
		this.btnTwoSchema = btnTwoSchema;
	}

    /**
     * Gets btn two schema.
     *
     * @return the btn two schema
     */
    public String getBtnTwoSchema( ) {
		return this.btnTwoSchema;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc( ) {
		return this.desc;
	}

    /**
     * Sets icon.
     *
     * @param icon the icon
     */
    public void setIcon(String icon) {
		this.icon = icon;
	}

    /**
     * Gets icon.
     *
     * @return the icon
     */
    public String getIcon( ) {
		return this.icon;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle( ) {
		return this.title;
	}

}
