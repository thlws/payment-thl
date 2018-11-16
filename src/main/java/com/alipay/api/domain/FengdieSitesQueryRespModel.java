package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云凤蝶站点查询返回值
 *
 * @author auto create
 * @since 1.0, 2018-05-23 17:46:50
 */
public class FengdieSitesQueryRespModel extends AlipayObject {

	private static final long serialVersionUID = 1366387221599432248L;

	/**
	 * 云凤蝶模板的最近修改日期
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 云凤蝶模板ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 云凤蝶模板是否上线的状态
	 */
	@ApiField("is_online")
	private Boolean isOnline;

	/**
	 * 云凤蝶模板的下线日期
	 */
	@ApiField("offline_time")
	private String offlineTime;

	/**
	 * 云凤蝶模板的负责人
	 */
	@ApiField("owner")
	private FengdieSitesOwner owner;

	/**
	 * 云凤蝶模板中所包含的页面
	 */
	@ApiListField("pages")
	@ApiField("fengdie_sites_page_model")
	private List<FengdieSitesPageModel> pages;

	/**
	 * 云凤蝶模板的当前状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 云凤蝶模板的名称
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 云凤蝶模板的版本号
	 */
	@ApiField("template_version")
	private String templateVersion;

	/**
	 * 云凤蝶模板的标题
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public String getGmtModified() {
		return this.gmtModified;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
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
     * Gets offline time.
     *
     * @return the offline time
     */
    public String getOfflineTime() {
		return this.offlineTime;
	}

    /**
     * Sets offline time.
     *
     * @param offlineTime the offline time
     */
    public void setOfflineTime(String offlineTime) {
		this.offlineTime = offlineTime;
	}

    /**
     * Gets owner.
     *
     * @return the owner
     */
    public FengdieSitesOwner getOwner() {
		return this.owner;
	}

    /**
     * Sets owner.
     *
     * @param owner the owner
     */
    public void setOwner(FengdieSitesOwner owner) {
		this.owner = owner;
	}

    /**
     * Gets pages.
     *
     * @return the pages
     */
    public List<FengdieSitesPageModel> getPages() {
		return this.pages;
	}

    /**
     * Sets pages.
     *
     * @param pages the pages
     */
    public void setPages(List<FengdieSitesPageModel> pages) {
		this.pages = pages;
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
     * Gets template name.
     *
     * @return the template name
     */
    public String getTemplateName() {
		return this.templateName;
	}

    /**
     * Sets template name.
     *
     * @param templateName the template name
     */
    public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

    /**
     * Gets template version.
     *
     * @return the template version
     */
    public String getTemplateVersion() {
		return this.templateVersion;
	}

    /**
     * Sets template version.
     *
     * @param templateVersion the template version
     */
    public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
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
