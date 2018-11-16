package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁微客任务视图
 *
 * @author auto create
 * @since 1.0, 2017-04-25 14:22:41
 */
public class WeikeTaskView extends AlipayObject {

	private static final long serialVersionUID = 8356143454552716393L;

	/**
	 * 任务视图描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 蚂蚁微客对当前任务视图编号
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 任务视图图片链接
	 */
	@ApiField("img")
	private String img;

	/**
	 * 任务视图名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 任务视图对应的任务薪资
	 */
	@ApiField("salary")
	private String salary;

	/**
	 * 当前任务视图剩余任务数
	 */
	@ApiField("task_count")
	private Long taskCount;

	/**
	 * 点击任务视图后唤起微客对应页面的链接
	 */
	@ApiField("url")
	private String url;

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
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
		this.id = id;
	}

    /**
     * Gets img.
     *
     * @return the img
     */
    public String getImg() {
		return this.img;
	}

    /**
     * Sets img.
     *
     * @param img the img
     */
    public void setImg(String img) {
		this.img = img;
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
     * Gets salary.
     *
     * @return the salary
     */
    public String getSalary() {
		return this.salary;
	}

    /**
     * Sets salary.
     *
     * @param salary the salary
     */
    public void setSalary(String salary) {
		this.salary = salary;
	}

    /**
     * Gets task count.
     *
     * @return the task count
     */
    public Long getTaskCount() {
		return this.taskCount;
	}

    /**
     * Sets task count.
     *
     * @param taskCount the task count
     */
    public void setTaskCount(Long taskCount) {
		this.taskCount = taskCount;
	}

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
		return this.url;
	}

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
		this.url = url;
	}

}
