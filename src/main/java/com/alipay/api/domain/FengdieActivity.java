package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凤蝶H5应用详情信息
 *
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:11
 */
public class FengdieActivity extends AlipayObject {

	private static final long serialVersionUID = 5284461489424425341L;

	/**
	 * H5应用的唯一id，调用alipay.marketing.tool.fengdie.activity.create接口时自动生成
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 应用是否已在线，在H5编辑器中点击发布按钮或者过了有效期会修改状态。如：true：在线，在设置的有效期内 ；false：已下线，超过了设置的有效期范围
	 */
	@ApiField("is_online")
	private Boolean isOnline;

	/**
	 * 创建的H5应用的名称，调用alipay.marketing.tool.fengdie.activity.create接口时作为参数传入，默认自动生成。最终显示在H5生成的URL上。URL规则为 "域名/p/f/${name}/index.html"
	 */
	@ApiField("name")
	private String name;

	/**
	 * appid所属支付宝账号昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * H5应用下线时间，在H5编辑器中修改
	 */
	@ApiField("offline_time")
	private Date offlineTime;

	/**
	 * 唤起H5编辑器时默认展示的表单数据
	 */
	@ApiListField("page")
	@ApiField("fengdie_activity_page")
	private List<FengdieActivityPage> page;

	/**
	 * H5应用最近一次发布时间，在H5编辑器中点击发布按钮时会修改
	 */
	@ApiField("publish_time")
	private Date publishTime;

	/**
	 * H5应用被编辑的状态，如：OPEN：编辑中；COMPLETE：已完成；PRERELEASED：预览页面生成成功；PRERELEASE_FAIL：预览页面生成失败；RELEASED：已发布；RELEASE_FAIL：发布失败。在H5编辑器中点击保存、编辑完成、发布按钮时会触发。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 创建H5应用所使用的模板包唯一id
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * H5应用的标题，在唤起的H5编辑器中输入
	 */
	@ApiField("title")
	private String title;

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
     * Gets is online.
     *
     * @return the is online
     */
    public Boolean getIsOnline() {
		return this.isOnline;
	}

    /**
     * Sets is online.
     *
     * @param isOnline the is online
     */
    public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
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
     * Gets nick name.
     *
     * @return the nick name
     */
    public String getNickName() {
		return this.nickName;
	}

    /**
     * Sets nick name.
     *
     * @param nickName the nick name
     */
    public void setNickName(String nickName) {
		this.nickName = nickName;
	}

    /**
     * Gets offline time.
     *
     * @return the offline time
     */
    public Date getOfflineTime() {
		return this.offlineTime;
	}

    /**
     * Sets offline time.
     *
     * @param offlineTime the offline time
     */
    public void setOfflineTime(Date offlineTime) {
		this.offlineTime = offlineTime;
	}

    /**
     * Gets page.
     *
     * @return the page
     */
    public List<FengdieActivityPage> getPage() {
		return this.page;
	}

    /**
     * Sets page.
     *
     * @param page the page
     */
    public void setPage(List<FengdieActivityPage> page) {
		this.page = page;
	}

    /**
     * Gets publish time.
     *
     * @return the publish time
     */
    public Date getPublishTime() {
		return this.publishTime;
	}

    /**
     * Sets publish time.
     *
     * @param publishTime the publish time
     */
    public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
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
     * Gets template id.
     *
     * @return the template id
     */
    public Long getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(Long templateId) {
		this.templateId = templateId;
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
