package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凤蝶H5应用申请SPM
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:18:07
 */
public class AlipayMarketingDataAntlogmngActivitypagespmCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6167191784369999349L;

	/**
	 * 活动Id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 负责人的工号
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * spma位
	 */
	@ApiField("spma")
	private String spma;

	/**
	 * 页面的spmb值code
	 */
	@ApiField("spmb")
	private String spmb;

	/**
	 * 名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 凤蝶页面的url
	 */
	@ApiField("url")
	private String url;

    /**
     * Gets activity id.
     *
     * @return the activity id
     */
    public String getActivityId() {
		return this.activityId;
	}

    /**
     * Sets activity id.
     *
     * @param activityId the activity id
     */
    public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

    /**
     * Gets owner.
     *
     * @return the owner
     */
    public String getOwner() {
		return this.owner;
	}

    /**
     * Sets owner.
     *
     * @param owner the owner
     */
    public void setOwner(String owner) {
		this.owner = owner;
	}

    /**
     * Gets spma.
     *
     * @return the spma
     */
    public String getSpma() {
		return this.spma;
	}

    /**
     * Sets spma.
     *
     * @param spma the spma
     */
    public void setSpma(String spma) {
		this.spma = spma;
	}

    /**
     * Gets spmb.
     *
     * @return the spmb
     */
    public String getSpmb() {
		return this.spmb;
	}

    /**
     * Sets spmb.
     *
     * @param spmb the spmb
     */
    public void setSpmb(String spmb) {
		this.spmb = spmb;
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
