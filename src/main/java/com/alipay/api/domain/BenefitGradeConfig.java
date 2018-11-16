package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益的等级配置信息
 *
 * @author auto create
 * @since 1.0, 2017-06-15 15:43:39
 */
public class BenefitGradeConfig extends AlipayObject {

	private static final long serialVersionUID = 2361917649117183868L;

	/**
	 * 权益背景图片地址，若没有，可以先mock一个地址进行填写
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/**
	 * 该等级下权益的介绍
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 用户等级，差异化时可填primary、golden、platinum、diamond，非差异化时可填common
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * 权益关联的活动页面
	 */
	@ApiField("page_url")
	private String pageUrl;

	/**
	 * 当前等级兑换权益所需要消耗的积分
	 */
	@ApiField("point")
	private Long point;

	/**
	 * 该等级兑换权益时，消耗的积分需要乘以配置的这个折扣，进行优惠
	 */
	@ApiField("point_discount")
	private String pointDiscount;

    /**
     * Gets background url.
     *
     * @return the background url
     */
    public String getBackgroundUrl() {
		return this.backgroundUrl;
	}

    /**
     * Sets background url.
     *
     * @param backgroundUrl the background url
     */
    public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}

    /**
     * Gets detail.
     *
     * @return the detail
     */
    public String getDetail() {
		return this.detail;
	}

    /**
     * Sets detail.
     *
     * @param detail the detail
     */
    public void setDetail(String detail) {
		this.detail = detail;
	}

    /**
     * Gets grade.
     *
     * @return the grade
     */
    public String getGrade() {
		return this.grade;
	}

    /**
     * Sets grade.
     *
     * @param grade the grade
     */
    public void setGrade(String grade) {
		this.grade = grade;
	}

    /**
     * Gets page url.
     *
     * @return the page url
     */
    public String getPageUrl() {
		return this.pageUrl;
	}

    /**
     * Sets page url.
     *
     * @param pageUrl the page url
     */
    public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

    /**
     * Gets point.
     *
     * @return the point
     */
    public Long getPoint() {
		return this.point;
	}

    /**
     * Sets point.
     *
     * @param point the point
     */
    public void setPoint(Long point) {
		this.point = point;
	}

    /**
     * Gets point discount.
     *
     * @return the point discount
     */
    public String getPointDiscount() {
		return this.pointDiscount;
	}

    /**
     * Sets point discount.
     *
     * @param pointDiscount the point discount
     */
    public void setPointDiscount(String pointDiscount) {
		this.pointDiscount = pointDiscount;
	}

}
