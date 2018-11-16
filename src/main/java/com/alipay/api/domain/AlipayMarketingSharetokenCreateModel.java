package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝吱口令发放接口
 *
 * @author auto create
 * @since 1.0, 2018-06-14 11:34:21
 */
public class AlipayMarketingSharetokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6199275141763383884L;

	/**
	 * 业务标识，类似于业务主键，诸如pid、uid、门店id
	 */
	@ApiField("biz_linked_id")
	private String bizLinkedId;

	/**
	 * 吱口令的业务类型，新增业务请联系吱口令PD和开发分配
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 展示在吱口令解码面板上的左下方按钮，一般用作取消操作
	 */
	@ApiField("btn_left")
	private String btnLeft;

	/**
	 * 吱口令解码面板上左下方按钮的连接。一般不建议传值，默认行为是关闭吱口令面板
	 */
	@ApiField("btn_left_href")
	private String btnLeftHref;

	/**
	 * 吱口令解码面板上的右下方按钮文案
	 */
	@ApiField("btn_right")
	private String btnRight;

	/**
	 * 吱口令解码面板上右下方按钮的链接、一般是活动页面或业务跳转地址
	 */
	@ApiField("btn_right_href")
	private String btnRightHref;

	/**
	 * 展示在吱口令解码的面板上的描述文案
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 展示在吱口令解码面板上的图标。建议传入cdn的地址。
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 启用时间，如果为空，则默认给接口调用时候系统的当前时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 吱口令的有效期
	 */
	@ApiField("timeout")
	private Long timeout;

	/**
	 * 展示在吱口令解码的面板上的标题字段
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets biz linked id.
     *
     * @return the biz linked id
     */
    public String getBizLinkedId() {
		return this.bizLinkedId;
	}

    /**
     * Sets biz linked id.
     *
     * @param bizLinkedId the biz linked id
     */
    public void setBizLinkedId(String bizLinkedId) {
		this.bizLinkedId = bizLinkedId;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets btn left.
     *
     * @return the btn left
     */
    public String getBtnLeft() {
		return this.btnLeft;
	}

    /**
     * Sets btn left.
     *
     * @param btnLeft the btn left
     */
    public void setBtnLeft(String btnLeft) {
		this.btnLeft = btnLeft;
	}

    /**
     * Gets btn left href.
     *
     * @return the btn left href
     */
    public String getBtnLeftHref() {
		return this.btnLeftHref;
	}

    /**
     * Sets btn left href.
     *
     * @param btnLeftHref the btn left href
     */
    public void setBtnLeftHref(String btnLeftHref) {
		this.btnLeftHref = btnLeftHref;
	}

    /**
     * Gets btn right.
     *
     * @return the btn right
     */
    public String getBtnRight() {
		return this.btnRight;
	}

    /**
     * Sets btn right.
     *
     * @param btnRight the btn right
     */
    public void setBtnRight(String btnRight) {
		this.btnRight = btnRight;
	}

    /**
     * Gets btn right href.
     *
     * @return the btn right href
     */
    public String getBtnRightHref() {
		return this.btnRightHref;
	}

    /**
     * Sets btn right href.
     *
     * @param btnRightHref the btn right href
     */
    public void setBtnRightHref(String btnRightHref) {
		this.btnRightHref = btnRightHref;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
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
     * Gets icon.
     *
     * @return the icon
     */
    public String getIcon() {
		return this.icon;
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
     * Gets timeout.
     *
     * @return the timeout
     */
    public Long getTimeout() {
		return this.timeout;
	}

    /**
     * Sets timeout.
     *
     * @param timeout the timeout
     */
    public void setTimeout(Long timeout) {
		this.timeout = timeout;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

}
